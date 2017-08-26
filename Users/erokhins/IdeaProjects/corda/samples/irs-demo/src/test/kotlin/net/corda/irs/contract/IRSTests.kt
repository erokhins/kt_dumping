'when (irsSelect) {
        1 -> {

            val fixedLeg = InterestRateSwap.FixedLeg(
                    fixedRatePayer = MEGA_CORP,
                    notional = 15900000.DOLLARS,
                    paymentFrequency = Frequency.SemiAnnual,
                    effectiveDate = LocalDate.of(2016, 3, 10),
                    effectiveDateAdjustment = null,
                    terminationDate = LocalDate.of(2026, 3, 10),
                    terminationDateAdjustment = null,
                    fixedRate = FixedRate(PercentageRatioUnit("1.677")),
                    dayCountBasisDay = DayCountBasisDay.D30,
                    dayCountBasisYear = DayCountBasisYear.Y360,
                    rollConvention = DateRollConvention.ModifiedFollowing,
                    dayInMonth = 10,
                    paymentRule = PaymentRule.InArrears,
                    paymentDelay = 3,
                    paymentCalendar = BusinessCalendar.getInstance("London", "NewYork"),
                    interestPeriodAdjustment = AccrualAdjustment.Adjusted
            )

            val floatingLeg = InterestRateSwap.FloatingLeg(
                    floatingRatePayer = MINI_CORP,
                    notional = 15900000.DOLLARS,
                    paymentFrequency = Frequency.Quarterly,
                    effectiveDate = LocalDate.of(2016, 3, 10),
                    effectiveDateAdjustment = null,
                    terminationDate = LocalDate.of(2026, 3, 10),
                    terminationDateAdjustment = null,
                    dayCountBasisDay = DayCountBasisDay.D30,
                    dayCountBasisYear = DayCountBasisYear.Y360,
                    rollConvention = DateRollConvention.ModifiedFollowing,
                    fixingRollConvention = DateRollConvention.ModifiedFollowing,
                    dayInMonth = 10,
                    resetDayInMonth = 10,
                    paymentRule = PaymentRule.InArrears,
                    paymentDelay = 3,
                    paymentCalendar = BusinessCalendar.getInstance("London", "NewYork"),
                    interestPeriodAdjustment = AccrualAdjustment.Adjusted,
                    fixingPeriodOffset = 2,
                    resetRule = PaymentRule.InAdvance,
                    fixingsPerPayment = Frequency.Quarterly,
                    fixingCalendar = BusinessCalendar.getInstance("London"),
                    index = "LIBOR",
                    indexSource = "TEL3750",
                    indexTenor = Tenor("3M")
            )

            val calculation = InterestRateSwap.Calculation(

                    // TODO: this seems to fail quite dramatically
                    //expression = "fixedLeg.notional * fixedLeg.fixedRate",

                    // TODO: How I want it to look
                    //expression = "( fixedLeg.notional * (fixedLeg.fixedRate)) - (floatingLeg.notional * (rateSchedule.get(context.getDate('currentDate'))))",

                    // How it's ended up looking, which I think is now broken but it's a WIP.
                    expression = Expression("( fixedLeg.notional.pennies * (fixedLeg.fixedRate.ratioUnit.value)) -" +
                            "(floatingLeg.notional.pennies * (calculation.fixingSchedule.get(context.getDate('currentDate')).rate.ratioUnit.value))"),

                    floatingLegPaymentSchedule = mutableMapOf(),
                    fixedLegPaymentSchedule = mutableMapOf()
            )

            val common = InterestRateSwap.Common(
                    baseCurrency = EUR,
                    eligibleCurrency = EUR,
                    eligibleCreditSupport = "Cash in an Eligible Currency",
                    independentAmounts = Amount(0, EUR),
                    threshold = Amount(0, EUR),
                    minimumTransferAmount = Amount(250000 * 100, EUR),
                    rounding = Amount(10000 * 100, EUR),
                    valuationDateDescription = "Every Local Business Day",
                    notificationTime = "2:00pm London",
                    resolutionTime = "2:00pm London time on the first LocalBusiness Day following the date on which the notice is given ",
                    interestRate = ReferenceRate("T3270", Tenor("6M"), "EONIA"),
                    addressForTransfers = "",
                    exposure = UnknownType(),
                    localBusinessDay = BusinessCalendar.getInstance("London"),
                    tradeID = "trade1",
                    hashLegalDocs = "put hash here",
                    dailyInterestAmount = Expression("(CashAmount * InterestRate ) / (fixedLeg.notional.currency.currencyCode.equals('GBP')) ? 365 : 360")
            )

            InterestRateSwap.State(fixedLeg = fixedLeg, floatingLeg = floatingLeg, calculation = calculation, common = common)
        }
        2 -> {
            // 10y swap, we pay 1.3% fixed 30/360 semi, rec 3m usd libor act/360 Q on 25m notional (mod foll/adj on both sides)
            // I did a mock up start date 10/03/2015 – 10/03/2025 so you have 5 cashflows on float side that have been preset the rest are unknown

            val fixedLeg = InterestRateSwap.FixedLeg(
                    fixedRatePayer = MEGA_CORP,
                    notional = 25000000.DOLLARS,
                    paymentFrequency = Frequency.SemiAnnual,
                    effectiveDate = LocalDate.of(2015, 3, 10),
                    effectiveDateAdjustment = null,
                    terminationDate = LocalDate.of(2025, 3, 10),
                    terminationDateAdjustment = null,
                    fixedRate = FixedRate(PercentageRatioUnit("1.3")),
                    dayCountBasisDay = DayCountBasisDay.D30,
                    dayCountBasisYear = DayCountBasisYear.Y360,
                    rollConvention = DateRollConvention.ModifiedFollowing,
                    dayInMonth = 10,
                    paymentRule = PaymentRule.InArrears,
                    paymentDelay = 0,
                    paymentCalendar = BusinessCalendar.getInstance(),
                    interestPeriodAdjustment = AccrualAdjustment.Adjusted
            )

            val floatingLeg = InterestRateSwap.FloatingLeg(
                    floatingRatePayer = MINI_CORP,
                    notional = 25000000.DOLLARS,
                    paymentFrequency = Frequency.Quarterly,
                    effectiveDate = LocalDate.of(2015, 3, 10),
                    effectiveDateAdjustment = null,
                    terminationDate = LocalDate.of(2025, 3, 10),
                    terminationDateAdjustment = null,
                    dayCountBasisDay = DayCountBasisDay.DActual,
                    dayCountBasisYear = DayCountBasisYear.Y360,
                    rollConvention = DateRollConvention.ModifiedFollowing,
                    fixingRollConvention = DateRollConvention.ModifiedFollowing,
                    dayInMonth = 10,
                    resetDayInMonth = 10,
                    paymentRule = PaymentRule.InArrears,
                    paymentDelay = 0,
                    paymentCalendar = BusinessCalendar.getInstance(),
                    interestPeriodAdjustment = AccrualAdjustment.Adjusted,
                    fixingPeriodOffset = 2,
                    resetRule = PaymentRule.InAdvance,
                    fixingsPerPayment = Frequency.Quarterly,
                    fixingCalendar = BusinessCalendar.getInstance(),
                    index = "USD LIBOR",
                    indexSource = "TEL3750",
                    indexTenor = Tenor("3M")
            )

            val calculation = InterestRateSwap.Calculation(

                    // TODO: this seems to fail quite dramatically
                    //expression = "fixedLeg.notional * fixedLeg.fixedRate",

                    // TODO: How I want it to look
                    //expression = "( fixedLeg.notional * (fixedLeg.fixedRate)) - (floatingLeg.notional * (rateSchedule.get(context.getDate('currentDate'))))",

                    // How it's ended up looking, which I think is now broken but it's a WIP.
                    expression = Expression("( fixedLeg.notional.pennies * (fixedLeg.fixedRate.ratioUnit.value)) -" +
                            "(floatingLeg.notional.pennies * (calculation.fixingSchedule.get(context.getDate('currentDate')).rate.ratioUnit.value))"),

                    floatingLegPaymentSchedule = mutableMapOf(),
                    fixedLegPaymentSchedule = mutableMapOf()
            )

            val common = InterestRateSwap.Common(
                    baseCurrency = EUR,
                    eligibleCurrency = EUR,
                    eligibleCreditSupport = "Cash in an Eligible Currency",
                    independentAmounts = Amount(0, EUR),
                    threshold = Amount(0, EUR),
                    minimumTransferAmount = Amount(250000 * 100, EUR),
                    rounding = Amount(10000 * 100, EUR),
                    valuationDateDescription = "Every Local Business Day",
                    notificationTime = "2:00pm London",
                    resolutionTime = "2:00pm London time on the first LocalBusiness Day following the date on which the notice is given ",
                    interestRate = ReferenceRate("T3270", Tenor("6M"), "EONIA"),
                    addressForTransfers = "",
                    exposure = UnknownType(),
                    localBusinessDay = BusinessCalendar.getInstance("London"),
                    tradeID = "trade2",
                    hashLegalDocs = "put hash here",
                    dailyInterestAmount = Expression("(CashAmount * InterestRate ) / (fixedLeg.notional.currency.currencyCode.equals('GBP')) ? 365 : 360")
            )

            return InterestRateSwap.State(fixedLeg = fixedLeg, floatingLeg = floatingLeg, calculation = calculation, common = common)

        }
        else -> TODO("IRS number $irsSelect not defined")
    }' @ [20:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: InterestRateSwap.State, entry1: InterestRateSwap.State, entry2: InterestRateSwap.State): InterestRateSwap.State[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> State

'irsSelect' @ [20:18] ==> value-parameter irsSelect: Int defined in net.corda.irs.contract.createDummyIRS[ValueParameterDescriptorImpl]

'FixedLeg' @ [23:45] ==> public constructor FixedLeg(fixedRatePayer: AbstractParty, notional: Amount<Currency>, paymentFrequency: Frequency, effectiveDate: LocalDate, effectiveDateAdjustment: DateRollConvention?, terminationDate: LocalDate, terminationDateAdjustment: DateRollConvention?, dayCountBasisDay: DayCountBasisDay, dayCountBasisYear: DayCountBasisYear, dayInMonth: Int, paymentRule: PaymentRule, paymentDelay: Int, paymentCalendar: BusinessCalendar, interestPeriodAdjustment: AccrualAdjustment, fixedRate: FixedRate, rollConvention: DateRollConvention) defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedClassConstructorDescriptor]

'MEGA_CORP' @ [24:38] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DOLLARS' @ [25:41] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'SemiAnnual' @ [26:50] ==> enum entry SemiAnnual defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'of' @ [27:47] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'of' @ [29:49] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'FixedRate' @ [31:33] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'PercentageRatioUnit' @ [31:43] ==> public constructor PercentageRatioUnit(percentageAsString: String) defined in net.corda.irs.contract.PercentageRatioUnit[DeserializedClassConstructorDescriptor]

'D30' @ [32:57] ==> enum entry D30 defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'Y360' @ [33:59] ==> enum entry Y360 defined in net.corda.finance.contracts.DayCountBasisYear[FakeCallableDescriptorForObject]

'ModifiedFollowing' @ [34:57] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'InArrears' @ [36:47] ==> enum entry InArrears defined in net.corda.finance.contracts.PaymentRule[FakeCallableDescriptorForObject]

'getInstance' @ [38:56] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Adjusted' @ [39:66] ==> enum entry Adjusted defined in net.corda.finance.contracts.AccrualAdjustment[FakeCallableDescriptorForObject]

'FloatingLeg' @ [42:48] ==> public constructor FloatingLeg(floatingRatePayer: AbstractParty, notional: Amount<Currency>, paymentFrequency: Frequency, effectiveDate: LocalDate, effectiveDateAdjustment: DateRollConvention?, terminationDate: LocalDate, terminationDateAdjustment: DateRollConvention?, dayCountBasisDay: DayCountBasisDay, dayCountBasisYear: DayCountBasisYear, dayInMonth: Int, paymentRule: PaymentRule, paymentDelay: Int, paymentCalendar: BusinessCalendar, interestPeriodAdjustment: AccrualAdjustment, rollConvention: DateRollConvention, fixingRollConvention: DateRollConvention, resetDayInMonth: Int, fixingPeriodOffset: Int, resetRule: PaymentRule, fixingsPerPayment: Frequency, fixingCalendar: BusinessCalendar, index: String, indexSource: String, indexTenor: Tenor) defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedClassConstructorDescriptor]

'MINI_CORP' @ [43:41] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DOLLARS' @ [44:41] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'Quarterly' @ [45:50] ==> enum entry Quarterly defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'of' @ [46:47] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'of' @ [48:49] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'D30' @ [50:57] ==> enum entry D30 defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'Y360' @ [51:59] ==> enum entry Y360 defined in net.corda.finance.contracts.DayCountBasisYear[FakeCallableDescriptorForObject]

'ModifiedFollowing' @ [52:57] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'ModifiedFollowing' @ [53:63] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'InArrears' @ [56:47] ==> enum entry InArrears defined in net.corda.finance.contracts.PaymentRule[FakeCallableDescriptorForObject]

'getInstance' @ [58:56] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Adjusted' @ [59:66] ==> enum entry Adjusted defined in net.corda.finance.contracts.AccrualAdjustment[FakeCallableDescriptorForObject]

'InAdvance' @ [61:45] ==> enum entry InAdvance defined in net.corda.finance.contracts.PaymentRule[FakeCallableDescriptorForObject]

'Quarterly' @ [62:51] ==> enum entry Quarterly defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'getInstance' @ [63:55] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Tenor' @ [66:34] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'Calculation' @ [69:48] ==> public constructor Calculation(expression: Expression, floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent>, fixedLegPaymentSchedule: Map<LocalDate, FixedRatePaymentEvent>) defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedClassConstructorDescriptor]

'Expression' @ [78:34] ==> public constructor Expression(expr: String) defined in net.corda.finance.contracts.Expression[DeserializedClassConstructorDescriptor]

'+' @ [78:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'mutableMapOf' @ [81:50] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LocalDate, FloatingRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent

'mutableMapOf' @ [82:47] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LocalDate, FixedRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FixedRatePaymentEvent

'Common' @ [85:43] ==> public constructor Common(baseCurrency: Currency, eligibleCurrency: Currency, eligibleCreditSupport: String, independentAmounts: Amount<Currency>, threshold: Amount<Currency>, minimumTransferAmount: Amount<Currency>, rounding: Amount<Currency>, valuationDateDescription: String, notificationTime: String, resolutionTime: String, interestRate: ReferenceRate, addressForTransfers: String, exposure: UnknownType, localBusinessDay: BusinessCalendar, dailyInterestAmount: Expression, tradeID: String, hashLegalDocs: String) defined in net.corda.irs.contract.InterestRateSwap.Common[DeserializedClassConstructorDescriptor]

'EUR' @ [86:36] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'EUR' @ [87:40] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [89:42] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'EUR' @ [89:52] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [90:33] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'EUR' @ [90:43] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [91:45] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'*' @ [91:52] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'EUR' @ [91:66] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [92:32] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'*' @ [92:39] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'EUR' @ [92:52] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'ReferenceRate' @ [96:36] ==> public constructor ReferenceRate(oracle: String, tenor: Tenor, name: String) defined in net.corda.irs.contract.ReferenceRate[DeserializedClassConstructorDescriptor]

'Tenor' @ [96:59] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'UnknownType' @ [98:32] ==> public constructor UnknownType() defined in net.corda.irs.contract.UnknownType[DeserializedClassConstructorDescriptor]

'getInstance' @ [99:57] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Expression' @ [102:43] ==> public constructor Expression(expr: String) defined in net.corda.finance.contracts.Expression[DeserializedClassConstructorDescriptor]

'State' @ [105:30] ==> public constructor State(fixedLeg: InterestRateSwap.FixedLeg, floatingLeg: InterestRateSwap.FloatingLeg, calculation: InterestRateSwap.Calculation, common: InterestRateSwap.Common, linearId: UniqueIdentifier = ...) defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedClassConstructorDescriptor]

'fixedLeg' @ [105:47] ==> val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'floatingLeg' @ [105:71] ==> val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'calculation' @ [105:98] ==> val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'common' @ [105:120] ==> val common: InterestRateSwap.Common defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'FixedLeg' @ [111:45] ==> public constructor FixedLeg(fixedRatePayer: AbstractParty, notional: Amount<Currency>, paymentFrequency: Frequency, effectiveDate: LocalDate, effectiveDateAdjustment: DateRollConvention?, terminationDate: LocalDate, terminationDateAdjustment: DateRollConvention?, dayCountBasisDay: DayCountBasisDay, dayCountBasisYear: DayCountBasisYear, dayInMonth: Int, paymentRule: PaymentRule, paymentDelay: Int, paymentCalendar: BusinessCalendar, interestPeriodAdjustment: AccrualAdjustment, fixedRate: FixedRate, rollConvention: DateRollConvention) defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedClassConstructorDescriptor]

'MEGA_CORP' @ [112:38] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DOLLARS' @ [113:41] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'SemiAnnual' @ [114:50] ==> enum entry SemiAnnual defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'of' @ [115:47] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'of' @ [117:49] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'FixedRate' @ [119:33] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'PercentageRatioUnit' @ [119:43] ==> public constructor PercentageRatioUnit(percentageAsString: String) defined in net.corda.irs.contract.PercentageRatioUnit[DeserializedClassConstructorDescriptor]

'D30' @ [120:57] ==> enum entry D30 defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'Y360' @ [121:59] ==> enum entry Y360 defined in net.corda.finance.contracts.DayCountBasisYear[FakeCallableDescriptorForObject]

'ModifiedFollowing' @ [122:57] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'InArrears' @ [124:47] ==> enum entry InArrears defined in net.corda.finance.contracts.PaymentRule[FakeCallableDescriptorForObject]

'getInstance' @ [126:56] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Adjusted' @ [127:66] ==> enum entry Adjusted defined in net.corda.finance.contracts.AccrualAdjustment[FakeCallableDescriptorForObject]

'FloatingLeg' @ [130:48] ==> public constructor FloatingLeg(floatingRatePayer: AbstractParty, notional: Amount<Currency>, paymentFrequency: Frequency, effectiveDate: LocalDate, effectiveDateAdjustment: DateRollConvention?, terminationDate: LocalDate, terminationDateAdjustment: DateRollConvention?, dayCountBasisDay: DayCountBasisDay, dayCountBasisYear: DayCountBasisYear, dayInMonth: Int, paymentRule: PaymentRule, paymentDelay: Int, paymentCalendar: BusinessCalendar, interestPeriodAdjustment: AccrualAdjustment, rollConvention: DateRollConvention, fixingRollConvention: DateRollConvention, resetDayInMonth: Int, fixingPeriodOffset: Int, resetRule: PaymentRule, fixingsPerPayment: Frequency, fixingCalendar: BusinessCalendar, index: String, indexSource: String, indexTenor: Tenor) defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedClassConstructorDescriptor]

'MINI_CORP' @ [131:41] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DOLLARS' @ [132:41] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'Quarterly' @ [133:50] ==> enum entry Quarterly defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'of' @ [134:47] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'of' @ [136:49] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'DActual' @ [138:57] ==> enum entry DActual defined in net.corda.finance.contracts.DayCountBasisDay[FakeCallableDescriptorForObject]

'Y360' @ [139:59] ==> enum entry Y360 defined in net.corda.finance.contracts.DayCountBasisYear[FakeCallableDescriptorForObject]

'ModifiedFollowing' @ [140:57] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'ModifiedFollowing' @ [141:63] ==> enum entry ModifiedFollowing defined in net.corda.finance.contracts.DateRollConvention[FakeCallableDescriptorForObject]

'InArrears' @ [144:47] ==> enum entry InArrears defined in net.corda.finance.contracts.PaymentRule[FakeCallableDescriptorForObject]

'getInstance' @ [146:56] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Adjusted' @ [147:66] ==> enum entry Adjusted defined in net.corda.finance.contracts.AccrualAdjustment[FakeCallableDescriptorForObject]

'InAdvance' @ [149:45] ==> enum entry InAdvance defined in net.corda.finance.contracts.PaymentRule[FakeCallableDescriptorForObject]

'Quarterly' @ [150:51] ==> enum entry Quarterly defined in net.corda.finance.contracts.Frequency[FakeCallableDescriptorForObject]

'getInstance' @ [151:55] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Tenor' @ [154:34] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'Calculation' @ [157:48] ==> public constructor Calculation(expression: Expression, floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent>, fixedLegPaymentSchedule: Map<LocalDate, FixedRatePaymentEvent>) defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedClassConstructorDescriptor]

'Expression' @ [166:34] ==> public constructor Expression(expr: String) defined in net.corda.finance.contracts.Expression[DeserializedClassConstructorDescriptor]

'+' @ [166:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'mutableMapOf' @ [169:50] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LocalDate, FloatingRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent

'mutableMapOf' @ [170:47] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LocalDate, FixedRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FixedRatePaymentEvent

'Common' @ [173:43] ==> public constructor Common(baseCurrency: Currency, eligibleCurrency: Currency, eligibleCreditSupport: String, independentAmounts: Amount<Currency>, threshold: Amount<Currency>, minimumTransferAmount: Amount<Currency>, rounding: Amount<Currency>, valuationDateDescription: String, notificationTime: String, resolutionTime: String, interestRate: ReferenceRate, addressForTransfers: String, exposure: UnknownType, localBusinessDay: BusinessCalendar, dailyInterestAmount: Expression, tradeID: String, hashLegalDocs: String) defined in net.corda.irs.contract.InterestRateSwap.Common[DeserializedClassConstructorDescriptor]

'EUR' @ [174:36] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'EUR' @ [175:40] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [177:42] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'EUR' @ [177:52] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [178:33] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'EUR' @ [178:43] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [179:45] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'*' @ [179:52] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'EUR' @ [179:66] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Amount' @ [180:32] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'*' @ [180:39] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'EUR' @ [180:52] ==> @field:JvmField public val EUR: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'ReferenceRate' @ [184:36] ==> public constructor ReferenceRate(oracle: String, tenor: Tenor, name: String) defined in net.corda.irs.contract.ReferenceRate[DeserializedClassConstructorDescriptor]

'Tenor' @ [184:59] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'UnknownType' @ [186:32] ==> public constructor UnknownType() defined in net.corda.irs.contract.UnknownType[DeserializedClassConstructorDescriptor]

'getInstance' @ [187:57] ==> public final fun getInstance(vararg calname: String): BusinessCalendar defined in net.corda.finance.contracts.BusinessCalendar.Companion[DeserializedSimpleFunctionDescriptor]

'Expression' @ [190:43] ==> public constructor Expression(expr: String) defined in net.corda.finance.contracts.Expression[DeserializedClassConstructorDescriptor]

'State' @ [193:37] ==> public constructor State(fixedLeg: InterestRateSwap.FixedLeg, floatingLeg: InterestRateSwap.FloatingLeg, calculation: InterestRateSwap.Calculation, common: InterestRateSwap.Common, linearId: UniqueIdentifier = ...) defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedClassConstructorDescriptor]

'fixedLeg' @ [193:54] ==> val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'floatingLeg' @ [193:78] ==> val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'calculation' @ [193:105] ==> val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'common' @ [193:127] ==> val common: InterestRateSwap.Common defined in net.corda.irs.contract.createDummyIRS[LocalVariableDescriptor]

'TODO' @ [196:17] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'irsSelect' @ [196:35] ==> value-parameter irsSelect: Int defined in net.corda.irs.contract.createDummyIRS[ValueParameterDescriptorImpl]

'TestDependencyInjectionBase' @ [200:18] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'MockServices' @ [201:28] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [201:41] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [202:28] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MINI_CORP_KEY' @ [202:41] ==> public val MINI_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [203:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY_KEY' @ [203:39] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'trade' @ [207:9] ==> public final fun trade(): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'verifies' @ [207:17] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [210:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tradegroups' @ [212:9] ==> public final fun tradegroups(): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'verifies' @ [212:23] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'createDummyIRS' @ [219:24] ==> public fun createDummyIRS(irsSelect: Int): InterestRateSwap.State defined in net.corda.irs.contract in file IRSTests.kt[SimpleFunctionDescriptorImpl]

'irsSelect' @ [219:39] ==> value-parameter irsSelect: Int defined in net.corda.irs.contract.IRSTests.generateIRSTxn[ValueParameterDescriptorImpl]

'run' @ [220:40] ==> @InlineOnly public inline fun <T, R> IRSTests.run(block: IRSTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IRSTests
    <R> -> SignedTransaction

'InterestRateSwap' @ [221:23] ==> public constructor InterestRateSwap() defined in net.corda.irs.contract.InterestRateSwap[DeserializedClassConstructorDescriptor]

'generateAgreement' @ [221:42] ==> public final fun generateAgreement(floatingLeg: InterestRateSwap.FloatingLeg, fixedLeg: InterestRateSwap.FixedLeg, calculation: InterestRateSwap.Calculation, common: InterestRateSwap.Common, notary: Party): TransactionBuilder defined in net.corda.irs.contract.InterestRateSwap[DeserializedSimpleFunctionDescriptor]

'dummyIRS' @ [222:32] ==> val dummyIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.generateIRSTxn[LocalVariableDescriptor]

'fixedLeg' @ [222:41] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'dummyIRS' @ [223:35] ==> val dummyIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.generateIRSTxn[LocalVariableDescriptor]

'floatingLeg' @ [223:44] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'dummyIRS' @ [224:35] ==> val dummyIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.generateIRSTxn[LocalVariableDescriptor]

'calculation' @ [224:44] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'dummyIRS' @ [225:30] ==> val dummyIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.generateIRSTxn[LocalVariableDescriptor]

'common' @ [225:39] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [226:30] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [226:44] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'setTimeWindow' @ [227:17] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [227:31] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'seconds' @ [227:48] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'megaCorpServices' @ [229:24] ==> public final val megaCorpServices: MockServices defined in net.corda.irs.contract.IRSTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [229:41] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'gtx' @ [229:64] ==> val gtx: TransactionBuilder defined in net.corda.irs.contract.IRSTests.generateIRSTxn.<anonymous>[LocalVariableDescriptor]

'miniCorpServices' @ [230:24] ==> public final val miniCorpServices: MockServices defined in net.corda.irs.contract.IRSTests[PropertyDescriptorImpl]

'addSignature' @ [230:41] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx1' @ [230:54] ==> val ptx1: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSTxn.<anonymous>[LocalVariableDescriptor]

'notaryServices' @ [231:13] ==> public final val notaryServices: MockServices defined in net.corda.irs.contract.IRSTests[PropertyDescriptorImpl]

'addSignature' @ [231:28] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx2' @ [231:41] ==> val ptx2: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSTxn.<anonymous>[LocalVariableDescriptor]

'genTX' @ [233:16] ==> val genTX: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSTxn[LocalVariableDescriptor]

'Test' @ [239:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [241:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'println' @ [242:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'irs' @ [242:17] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.pprintIRS[LocalVariableDescriptor]

'prettyPrint' @ [242:21] ==> public final fun prettyPrint(): String defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'generateIRSTxn' @ [249:16] ==> public final fun generateIRSTxn(irsSelect: Int): SignedTransaction defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irsSelector' @ [249:31] ==> value-parameter irsSelector: Int = ... defined in net.corda.irs.contract.IRSTests.singleIRS[ValueParameterDescriptorImpl]

'tx' @ [249:44] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputsOfType' @ [249:47] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<InterestRateSwap.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [249:87] ==> public fun <T> List<InterestRateSwap.State>.single(): InterestRateSwap.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'Test' @ [255:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateIRSTxn' @ [258:9] ==> public final fun generateIRSTxn(irsSelect: Int): SignedTransaction defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'Test' @ [264:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [267:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irs' @ [269:30] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'calculation' @ [269:34] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'mapOf' @ [271:23] ==> public fun <K, V> mapOf(vararg pairs: Pair<(LocalDate..LocalDate?), String>): Map<(LocalDate..LocalDate?), String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (java.time.LocalDate..java.time.LocalDate?)
    <V> -> String

'to' @ [271:29] ==> public infix fun <A, B> (LocalDate..LocalDate?).to(that: String): Pair<(LocalDate..LocalDate?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.time.LocalDate..java.time.LocalDate?)
    <B> -> String

'of' @ [271:39] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [272:17] ==> public infix fun <A, B> (LocalDate..LocalDate?).to(that: String): Pair<(LocalDate..LocalDate?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.time.LocalDate..java.time.LocalDate?)
    <B> -> String

'of' @ [272:27] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [273:17] ==> public infix fun <A, B> (LocalDate..LocalDate?).to(that: String): Pair<(LocalDate..LocalDate?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.time.LocalDate..java.time.LocalDate?)
    <B> -> String

'of' @ [273:27] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [274:17] ==> public infix fun <A, B> (LocalDate..LocalDate?).to(that: String): Pair<(LocalDate..LocalDate?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.time.LocalDate..java.time.LocalDate?)
    <B> -> String

'of' @ [274:27] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'to' @ [275:17] ==> public infix fun <A, B> (LocalDate..LocalDate?).to(that: String): Pair<(LocalDate..LocalDate?), String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.time.LocalDate..java.time.LocalDate?)
    <B> -> String

'of' @ [275:27] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'component1' @ [277:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(LocalDate..LocalDate?), String>.component1(): (LocalDate..LocalDate?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (java.time.LocalDate..java.time.LocalDate?)
    <V> -> String

'component2' @ [277:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(LocalDate..LocalDate?), String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (java.time.LocalDate..java.time.LocalDate?)
    <V> -> String

'fixings' @ [277:30] ==> val fixings: Map<(LocalDate..LocalDate?), String> defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'newCalculation' @ [278:13] ==> var newCalculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'newCalculation' @ [278:30] ==> var newCalculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'applyFixing' @ [278:45] ==> public final fun applyFixing(date: LocalDate, newRate: FixedRate): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'key' @ [278:57] ==> val key: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'FixedRate' @ [278:62] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'PercentageRatioUnit' @ [278:72] ==> public constructor PercentageRatioUnit(percentageAsString: String) defined in net.corda.irs.contract.PercentageRatioUnit[DeserializedClassConstructorDescriptor]

'value' @ [278:92] ==> val value: String defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'State' @ [281:39] ==> public constructor State(fixedLeg: InterestRateSwap.FixedLeg, floatingLeg: InterestRateSwap.FloatingLeg, calculation: InterestRateSwap.Calculation, common: InterestRateSwap.Common, linearId: UniqueIdentifier = ...) defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedClassConstructorDescriptor]

'irs' @ [281:45] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'fixedLeg' @ [281:49] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [281:59] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'floatingLeg' @ [281:63] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'newCalculation' @ [281:76] ==> var newCalculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'irs' @ [281:92] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'common' @ [281:96] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'println' @ [282:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [282:17] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`IRS Export test`[LocalVariableDescriptor]

'exportIRSToCSV' @ [282:24] ==> public fun InterestRateSwap.State.exportIRSToCSV(): String defined in net.corda.irs.contract[DeserializedSimpleFunctionDescriptor]

'Test' @ [288:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [290:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'println' @ [291:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'irs' @ [291:17] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`next fixing date`[LocalVariableDescriptor]

'calculation' @ [291:21] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'nextFixingDate' @ [291:33] ==> public final fun nextFixingDate(): LocalDate? defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'Test' @ [297:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MockServices' @ [299:24] ==> public constructor MockServices() defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'generateIRSTxn' @ [300:27] ==> public final fun generateIRSTxn(irsSelect: Int): SignedTransaction defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'previousTXN' @ [301:9] ==> var previousTXN: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'toLedgerTransaction' @ [301:21] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [301:41] ==> val services: MockServices defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'verify' @ [301:51] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [302:9] ==> val services: MockServices defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'recordTransactions' @ [302:18] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'previousTXN' @ [302:37] ==> var previousTXN: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'previousTXN' @ [303:28] ==> var previousTXN: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'tx' @ [303:40] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputsOfType' @ [303:43] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<InterestRateSwap.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [303:83] ==> public fun <T> List<InterestRateSwap.State>.single(): InterestRateSwap.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'currentIRS' @ [306:34] ==> local final fun currentIRS(): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[SimpleFunctionDescriptorImpl]

'nextFixingOf' @ [306:47] ==> public open fun nextFixingOf(): FixOf? defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'run' @ [307:44] ==> @InlineOnly public inline fun <T, R> IRSTests.run(block: IRSTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IRSTests
    <R> -> SignedTransaction

'TransactionBuilder' @ [308:26] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [308:45] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Fix' @ [309:30] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'nextFix' @ [309:34] ==> val nextFix: FixOf defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'percent' @ [309:51] ==> public val String.percent: PercentageRatioUnit defined in net.corda.irs.contract[DeserializedPropertyDescriptor]

'value' @ [309:59] ==> public final val value: BigDecimal defined in net.corda.irs.contract.PercentageRatioUnit[DeserializedPropertyDescriptor]

'InterestRateSwap' @ [310:17] ==> public constructor InterestRateSwap() defined in net.corda.irs.contract.InterestRateSwap[DeserializedClassConstructorDescriptor]

'generateFix' @ [310:36] ==> public final fun generateFix(tx: TransactionBuilder, irs: StateAndRef<InterestRateSwap.State>, fixing: Fix): Unit defined in net.corda.irs.contract.InterestRateSwap[DeserializedSimpleFunctionDescriptor]

'tx' @ [310:48] ==> val tx: TransactionBuilder defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome.<anonymous>[LocalVariableDescriptor]

'previousTXN' @ [310:52] ==> var previousTXN: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'tx' @ [310:64] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [310:67] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<InterestRateSwap.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'fixing' @ [310:78] ==> val fixing: Fix defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome.<anonymous>[LocalVariableDescriptor]

'tx' @ [311:17] ==> val tx: TransactionBuilder defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome.<anonymous>[LocalVariableDescriptor]

'setTimeWindow' @ [311:20] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [311:34] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'seconds' @ [311:51] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'megaCorpServices' @ [312:28] ==> public final val megaCorpServices: MockServices defined in net.corda.irs.contract.IRSTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [312:45] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [312:68] ==> val tx: TransactionBuilder defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome.<anonymous>[LocalVariableDescriptor]

'miniCorpServices' @ [313:28] ==> public final val miniCorpServices: MockServices defined in net.corda.irs.contract.IRSTests[PropertyDescriptorImpl]

'addSignature' @ [313:45] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx1' @ [313:58] ==> val ptx1: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome.<anonymous>[LocalVariableDescriptor]

'notaryServices' @ [314:17] ==> public final val notaryServices: MockServices defined in net.corda.irs.contract.IRSTests[PropertyDescriptorImpl]

'addSignature' @ [314:32] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx2' @ [314:45] ==> val ptx2: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome.<anonymous>[LocalVariableDescriptor]

'fixTX' @ [316:13] ==> val fixTX: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'toLedgerTransaction' @ [316:19] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [316:39] ==> val services: MockServices defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'verify' @ [316:49] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [317:13] ==> val services: MockServices defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'recordTransactions' @ [317:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'fixTX' @ [317:41] ==> val fixTX: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'previousTXN' @ [318:13] ==> var previousTXN: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'fixTX' @ [318:27] ==> val fixTX: SignedTransaction defined in net.corda.irs.contract.IRSTests.generateIRSandFixSome[LocalVariableDescriptor]

'Test' @ [323:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'FixedRate' @ [325:18] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'PercentageRatioUnit' @ [325:28] ==> public constructor PercentageRatioUnit(percentageAsString: String) defined in net.corda.irs.contract.PercentageRatioUnit[DeserializedClassConstructorDescriptor]

'assertEquals' @ [326:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'*' @ [326:25] ==> public operator fun Int.times(other: FixedRate): Int defined in net.corda.irs.contract[DeserializedSimpleFunctionDescriptor]

'r1' @ [326:31] ==> val r1: FixedRate defined in net.corda.irs.contract.IRSTests.`test some rate objects 100 * FixedRate(5%)`[LocalVariableDescriptor]

'Test' @ [329:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [331:24] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'arrayListOf' @ [332:47] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stuffToPrint' @ [351:19] ==> val stuffToPrint: ArrayList<String> defined in net.corda.irs.contract.IRSTests.`expression calculation testing`[LocalVariableDescriptor]

'println' @ [352:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'i' @ [352:21] ==> val i: String defined in net.corda.irs.contract.IRSTests.`expression calculation testing`[LocalVariableDescriptor]

'dummyIRS' @ [353:21] ==> val dummyIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`expression calculation testing`[LocalVariableDescriptor]

'evaluateCalculation' @ [353:30] ==> public final fun evaluateCalculation(businessDate: LocalDate, expression: Expression = ...): Any defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'of' @ [353:60] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'Expression' @ [353:77] ==> public constructor Expression(expr: String) defined in net.corda.finance.contracts.Expression[DeserializedClassConstructorDescriptor]

'i' @ [353:88] ==> val i: String defined in net.corda.irs.contract.IRSTests.`expression calculation testing`[LocalVariableDescriptor]

'println' @ [354:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'z' @ [354:21] ==> val z: Any defined in net.corda.irs.contract.IRSTests.`expression calculation testing`[LocalVariableDescriptor]

'javaClass' @ [354:23] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'println' @ [355:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'z' @ [355:21] ==> val z: Any defined in net.corda.irs.contract.IRSTests.`expression calculation testing`[LocalVariableDescriptor]

'println' @ [356:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'of' @ [367:28] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'BigDecimal' @ [368:18] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'ledger' @ [370:16] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [371:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [372:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'singleIRS' @ [372:48] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'command' @ [373:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [373:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [373:71] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [374:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [374:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [375:17] ==> <this> defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [375:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'transaction' @ [378:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [379:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [380:58] ==> public final inline fun <reified S : ContractState> String.output(): InterestRateSwap.State defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S : ContractState> -> State

'output' @ [381:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'postAgreement' @ [382:21] ==> val postAgreement: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[LocalVariableDescriptor]

'copy' @ [382:35] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'postAgreement' @ [383:29] ==> val postAgreement: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fixedLeg' @ [383:43] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'postAgreement' @ [384:29] ==> val postAgreement: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[LocalVariableDescriptor]

'floatingLeg' @ [384:43] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'postAgreement' @ [385:29] ==> val postAgreement: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[LocalVariableDescriptor]

'calculation' @ [385:43] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'applyFixing' @ [385:55] ==> public final fun applyFixing(date: LocalDate, newRate: FixedRate): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'ld' @ [385:67] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.trade[LocalVariableDescriptor]

'FixedRate' @ [385:71] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'RatioUnit' @ [385:81] ==> public constructor RatioUnit(value: BigDecimal) defined in net.corda.irs.contract.RatioUnit[DeserializedClassConstructorDescriptor]

'bd' @ [385:91] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.trade[LocalVariableDescriptor]

'postAgreement' @ [386:29] ==> val postAgreement: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[LocalVariableDescriptor]

'common' @ [386:43] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'command' @ [389:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ORACLE_PUBKEY' @ [389:25] ==> public val ORACLE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Refix' @ [390:47] ==> public constructor Refix(fix: Fix) defined in net.corda.irs.contract.InterestRateSwap.Commands.Refix[DeserializedClassConstructorDescriptor]

'Fix' @ [390:53] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'FixOf' @ [390:57] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'ld' @ [390:76] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.trade[LocalVariableDescriptor]

'Tenor' @ [390:80] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'bd' @ [390:94] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.trade[LocalVariableDescriptor]

'timeWindow' @ [392:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [392:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [393:17] ==> <this> defined in net.corda.irs.contract.IRSTests.trade.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [393:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [398:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [400:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'transaction' @ [401:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [402:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [402:21] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when there are inbound states for an agreement command`[LocalVariableDescriptor]

'output' @ [403:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [403:44] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when there are inbound states for an agreement command`[LocalVariableDescriptor]

'command' @ [404:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [404:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [404:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [405:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [405:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [406:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when there are inbound states for an agreement command`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [410:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [412:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'mutableMapOf' @ [413:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LocalDate, FixedRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FixedRatePaymentEvent

'transaction' @ [414:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [415:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [416:17] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in fix schedule`[LocalVariableDescriptor]

'copy' @ [416:21] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [416:40] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in fix schedule`[LocalVariableDescriptor]

'calculation' @ [416:44] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [416:56] ==> public final fun copy(expression: Expression = ..., floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> = ..., fixedLegPaymentSchedule: Map<LocalDate, FixedRatePaymentEvent> = ...): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'emptySchedule' @ [416:87] ==> val emptySchedule: MutableMap<LocalDate, FixedRatePaymentEvent> defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in fix schedule`[LocalVariableDescriptor]

'command' @ [418:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [418:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [418:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [419:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [419:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [420:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in fix schedule`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [424:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [426:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'mutableMapOf' @ [427:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LocalDate, FloatingRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent

'transaction' @ [428:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [429:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [430:17] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in floating schedule`[LocalVariableDescriptor]

'copy' @ [430:21] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [430:40] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in floating schedule`[LocalVariableDescriptor]

'calculation' @ [430:44] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [430:56] ==> public final fun copy(expression: Expression = ..., floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> = ..., fixedLegPaymentSchedule: Map<LocalDate, FixedRatePaymentEvent> = ...): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'emptySchedule' @ [430:90] ==> val emptySchedule: MutableMap<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in floating schedule`[LocalVariableDescriptor]

'command' @ [432:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [432:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [432:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [433:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [433:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [434:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure failure occurs when no events in floating schedule`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [438:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [440:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'transaction' @ [441:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [442:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [443:17] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`[LocalVariableDescriptor]

'copy' @ [443:21] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [443:26] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`[LocalVariableDescriptor]

'fixedLeg' @ [443:30] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [443:39] ==> public final fun copy(fixedRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., fixedRate: FixedRate = ...): InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedSimpleFunctionDescriptor]

'irs' @ [443:55] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`[LocalVariableDescriptor]

'fixedLeg' @ [443:59] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'notional' @ [443:68] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedPropertyDescriptor]

'copy' @ [443:77] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Currency = ...): Amount<Currency> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'command' @ [445:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [445:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [445:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [446:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [446:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [447:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [450:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [451:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [452:17] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`[LocalVariableDescriptor]

'copy' @ [452:21] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [452:26] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`[LocalVariableDescriptor]

'fixedLeg' @ [452:30] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [452:39] ==> public final fun copy(fixedRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., fixedRate: FixedRate = ...): InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedSimpleFunctionDescriptor]

'irs' @ [452:55] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`[LocalVariableDescriptor]

'floatingLeg' @ [452:59] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'notional' @ [452:71] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedPropertyDescriptor]

'copy' @ [452:80] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Currency = ...): Amount<Currency> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'command' @ [454:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [454:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [454:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [455:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [455:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [456:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure notionals are non zero`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [460:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [462:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irs' @ [463:27] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure positive rate on fixed leg`[LocalVariableDescriptor]

'copy' @ [463:31] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [463:47] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure positive rate on fixed leg`[LocalVariableDescriptor]

'fixedLeg' @ [463:51] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [463:60] ==> public final fun copy(fixedRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., fixedRate: FixedRate = ...): InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedSimpleFunctionDescriptor]

'FixedRate' @ [463:77] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'PercentageRatioUnit' @ [463:87] ==> public constructor PercentageRatioUnit(percentageAsString: String) defined in net.corda.irs.contract.PercentageRatioUnit[DeserializedClassConstructorDescriptor]

'transaction' @ [464:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [465:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS' @ [466:17] ==> val modifiedIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure positive rate on fixed leg`[LocalVariableDescriptor]

'command' @ [468:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [468:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [468:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [469:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [469:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [470:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure positive rate on fixed leg`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [477:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [479:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irs' @ [480:27] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure same currency notionals`[LocalVariableDescriptor]

'copy' @ [480:31] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [480:47] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure same currency notionals`[LocalVariableDescriptor]

'fixedLeg' @ [480:51] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [480:60] ==> public final fun copy(fixedRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., fixedRate: FixedRate = ...): InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedSimpleFunctionDescriptor]

'Amount' @ [480:76] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'irs' @ [480:83] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure same currency notionals`[LocalVariableDescriptor]

'fixedLeg' @ [480:87] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'notional' @ [480:96] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedPropertyDescriptor]

'quantity' @ [480:105] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'getInstance' @ [480:124] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'transaction' @ [481:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [482:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS' @ [483:17] ==> val modifiedIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure same currency notionals`[LocalVariableDescriptor]

'command' @ [485:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [485:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [485:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [486:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [486:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [487:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure same currency notionals`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [491:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [493:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irs' @ [494:27] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notional amounts are equal`[LocalVariableDescriptor]

'copy' @ [494:31] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [494:47] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notional amounts are equal`[LocalVariableDescriptor]

'fixedLeg' @ [494:51] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [494:60] ==> public final fun copy(fixedRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., fixedRate: FixedRate = ...): InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedSimpleFunctionDescriptor]

'Amount' @ [494:76] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'irs' @ [494:83] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notional amounts are equal`[LocalVariableDescriptor]

'floatingLeg' @ [494:87] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'notional' @ [494:99] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedPropertyDescriptor]

'quantity' @ [494:108] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'irs' @ [494:122] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notional amounts are equal`[LocalVariableDescriptor]

'floatingLeg' @ [494:126] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'notional' @ [494:138] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedPropertyDescriptor]

'token' @ [494:147] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'transaction' @ [495:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [496:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS' @ [497:17] ==> val modifiedIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure notional amounts are equal`[LocalVariableDescriptor]

'command' @ [499:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [499:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [499:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [500:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [500:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [501:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure notional amounts are equal`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [505:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [507:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irs' @ [508:28] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'copy' @ [508:32] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [508:48] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'fixedLeg' @ [508:52] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [508:61] ==> public final fun copy(fixedRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., fixedRate: FixedRate = ...): InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedSimpleFunctionDescriptor]

'irs' @ [508:84] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'fixedLeg' @ [508:88] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'effectiveDate' @ [508:97] ==> public final val effectiveDate: LocalDate defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedPropertyDescriptor]

'minusDays' @ [508:111] ==> public open fun minusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'transaction' @ [509:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [510:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS1' @ [511:17] ==> val modifiedIRS1: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'command' @ [513:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [513:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [513:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [514:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [514:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [515:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`.<anonymous>[ReceiverParameterDescriptorImpl]

'irs' @ [518:28] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'copy' @ [518:32] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [518:51] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'floatingLeg' @ [518:55] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [518:67] ==> public final fun copy(floatingRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., rollConvention: DateRollConvention = ..., fixingRollConvention: DateRollConvention = ..., resetDayInMonth: Int = ..., fixingPeriod: Int = ..., resetRule: PaymentRule = ..., fixingsPerPayment: Frequency = ..., fixingCalendar: BusinessCalendar = ..., index: String = ..., indexSource: String = ..., indexTenor: Tenor = ...): InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedSimpleFunctionDescriptor]

'irs' @ [518:90] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'floatingLeg' @ [518:94] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'effectiveDate' @ [518:106] ==> public final val effectiveDate: LocalDate defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedPropertyDescriptor]

'minusDays' @ [518:120] ==> public open fun minusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'transaction' @ [519:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [520:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS2' @ [521:17] ==> val modifiedIRS2: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`[LocalVariableDescriptor]

'command' @ [523:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [523:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [523:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [524:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [524:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [525:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt1`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [529:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'singleIRS' @ [531:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'irs' @ [533:28] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'copy' @ [533:32] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [533:51] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'floatingLeg' @ [533:55] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [533:67] ==> public final fun copy(floatingRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., rollConvention: DateRollConvention = ..., fixingRollConvention: DateRollConvention = ..., resetDayInMonth: Int = ..., fixingPeriod: Int = ..., resetRule: PaymentRule = ..., fixingsPerPayment: Frequency = ..., fixingCalendar: BusinessCalendar = ..., index: String = ..., indexSource: String = ..., indexTenor: Tenor = ...): InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedSimpleFunctionDescriptor]

'irs' @ [533:90] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'fixedLeg' @ [533:94] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'terminationDate' @ [533:103] ==> public final val terminationDate: LocalDate defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedPropertyDescriptor]

'minusDays' @ [533:119] ==> public open fun minusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'transaction' @ [534:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [535:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS3' @ [536:17] ==> val modifiedIRS3: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'command' @ [538:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [538:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [538:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [539:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [539:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [540:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`.<anonymous>[ReceiverParameterDescriptorImpl]

'irs' @ [544:28] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'copy' @ [544:32] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [544:51] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'floatingLeg' @ [544:55] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [544:67] ==> public final fun copy(floatingRatePayer: AbstractParty = ..., notional: Amount<Currency> = ..., paymentFrequency: Frequency = ..., effectiveDate: LocalDate = ..., effectiveDateAdjustment: DateRollConvention? = ..., terminationDate: LocalDate = ..., terminationDateAdjustment: DateRollConvention? = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., dayInMonth: Int = ..., paymentRule: PaymentRule = ..., paymentDelay: Int = ..., paymentCalendar: BusinessCalendar = ..., interestPeriodAdjustment: AccrualAdjustment = ..., rollConvention: DateRollConvention = ..., fixingRollConvention: DateRollConvention = ..., resetDayInMonth: Int = ..., fixingPeriod: Int = ..., resetRule: PaymentRule = ..., fixingsPerPayment: Frequency = ..., fixingCalendar: BusinessCalendar = ..., index: String = ..., indexSource: String = ..., indexTenor: Tenor = ...): InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedSimpleFunctionDescriptor]

'irs' @ [544:88] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'fixedLeg' @ [544:92] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'effectiveDate' @ [544:101] ==> public final val effectiveDate: LocalDate defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedPropertyDescriptor]

'minusDays' @ [544:115] ==> public open fun minusDays(p0: Long): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'transaction' @ [545:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [546:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'modifiedIRS4' @ [547:17] ==> val modifiedIRS4: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`[LocalVariableDescriptor]

'command' @ [549:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [549:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [549:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [550:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [550:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [551:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`ensure trade date and termination date checks are done pt2`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [556:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'of' @ [558:28] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'BigDecimal' @ [559:18] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'transaction' @ [561:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [562:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'singleIRS' @ [562:44] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'command' @ [563:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [563:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [563:67] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [564:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [564:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [565:13] ==> <this> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [565:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'singleIRS' @ [568:22] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'oldIRS' @ [569:22] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'copy' @ [569:29] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'oldIRS' @ [569:34] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'fixedLeg' @ [569:41] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'oldIRS' @ [570:17] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'floatingLeg' @ [570:24] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'oldIRS' @ [571:17] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [571:24] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'applyFixing' @ [571:36] ==> public final fun applyFixing(date: LocalDate, newRate: FixedRate): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'ld' @ [571:48] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'FixedRate' @ [571:52] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'RatioUnit' @ [571:62] ==> public constructor RatioUnit(value: BigDecimal) defined in net.corda.irs.contract.RatioUnit[DeserializedClassConstructorDescriptor]

'bd' @ [571:72] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'oldIRS' @ [572:17] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'common' @ [572:24] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'transaction' @ [574:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [575:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oldIRS' @ [576:17] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'tweak' @ [581:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [582:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ORACLE_PUBKEY' @ [582:25] ==> public val ORACLE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Refix' @ [583:47] ==> public constructor Refix(fix: Fix) defined in net.corda.irs.contract.InterestRateSwap.Commands.Refix[DeserializedClassConstructorDescriptor]

'Fix' @ [583:53] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'FixOf' @ [583:57] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'ld' @ [583:76] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'Tenor' @ [583:80] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'bd' @ [583:94] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'timeWindow' @ [585:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [585:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [586:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [586:26] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'this' @ [587:17] ==> <this> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [587:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'tweak' @ [591:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [592:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ORACLE_PUBKEY' @ [592:25] ==> public val ORACLE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Refix' @ [592:68] ==> public constructor Refix(fix: Fix) defined in net.corda.irs.contract.InterestRateSwap.Commands.Refix[DeserializedClassConstructorDescriptor]

'Fix' @ [592:74] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'FixOf' @ [592:78] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'ld' @ [592:97] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'Tenor' @ [592:101] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'bd' @ [592:115] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'timeWindow' @ [593:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [593:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [594:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oldIRS' @ [594:26] ==> val oldIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'this' @ [595:17] ==> <this> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [599:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [600:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ORACLE_PUBKEY' @ [600:25] ==> public val ORACLE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Refix' @ [600:68] ==> public constructor Refix(fix: Fix) defined in net.corda.irs.contract.InterestRateSwap.Commands.Refix[DeserializedClassConstructorDescriptor]

'Fix' @ [600:74] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'FixOf' @ [600:78] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'ld' @ [600:97] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'Tenor' @ [600:101] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'bd' @ [600:115] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'timeWindow' @ [601:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [601:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'newIRS' @ [603:37] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [603:44] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'floatingLegPaymentSchedule' @ [603:56] ==> public final val floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedPropertyDescriptor]

'keys' @ [603:83] ==> public abstract val keys: Set<LocalDate> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toList' @ [603:88] ==> public fun <T> Iterable<LocalDate>.toList(): List<LocalDate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalDate

'newIRS' @ [604:39] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [604:46] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'floatingLegPaymentSchedule' @ [604:58] ==> public final val floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedPropertyDescriptor]

'firstResetKey' @ [604:85] ==> val firstResetKey: LocalDate defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'firstResetValue' @ [605:47] ==> val firstResetValue: FloatingRatePaymentEvent? defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'copy' @ [605:65] ==> public final fun copy(date: LocalDate = ..., accrualStartDate: LocalDate = ..., accrualEndDate: LocalDate = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., fixingDate: LocalDate = ..., notional: Amount<Currency> = ..., rate: Rate = ...): FloatingRatePaymentEvent defined in net.corda.irs.contract.FloatingRatePaymentEvent[DeserializedSimpleFunctionDescriptor]

'Amount' @ [605:81] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'firstResetValue' @ [605:88] ==> val firstResetValue: FloatingRatePaymentEvent? defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'notional' @ [605:104] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.FloatingRatePaymentEvent[DeserializedPropertyDescriptor]

'quantity' @ [605:113] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'getInstance' @ [605:132] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'output' @ [607:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [608:21] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'copy' @ [608:28] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [609:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'fixedLeg' @ [609:36] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'newIRS' @ [610:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'floatingLeg' @ [610:36] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'newIRS' @ [611:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [611:36] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [611:48] ==> public final fun copy(expression: Expression = ..., floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> = ..., fixedLegPaymentSchedule: Map<LocalDate, FixedRatePaymentEvent> = ...): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [611:82] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [611:89] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'floatingLegPaymentSchedule' @ [611:101] ==> public final val floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedPropertyDescriptor]

'plus' @ [611:128] ==> public operator fun <K, V> Map<out LocalDate, FloatingRatePaymentEvent>.plus(pair: Pair<LocalDate, FloatingRatePaymentEvent>): Map<LocalDate, FloatingRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent

'Pair' @ [612:37] ==> public constructor Pair<out A, out B>(first: LocalDate, second: FloatingRatePaymentEvent) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LocalDate
    <out B> -> FloatingRatePaymentEvent

'firstResetKey' @ [612:42] ==> val firstResetKey: LocalDate defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'modifiedFirstResetValue' @ [612:57] ==> val modifiedFirstResetValue: FloatingRatePaymentEvent defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newIRS' @ [613:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'common' @ [613:36] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'this' @ [616:17] ==> <this> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [620:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [621:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ORACLE_PUBKEY' @ [621:25] ==> public val ORACLE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Refix' @ [621:68] ==> public constructor Refix(fix: Fix) defined in net.corda.irs.contract.InterestRateSwap.Commands.Refix[DeserializedClassConstructorDescriptor]

'Fix' @ [621:74] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'FixOf' @ [621:78] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'ld' @ [621:97] ==> val ld: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'Tenor' @ [621:101] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'bd' @ [621:115] ==> val bd: BigDecimal defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'timeWindow' @ [622:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [622:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'newIRS' @ [624:35] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [624:42] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'floatingLegPaymentSchedule' @ [624:54] ==> public final val floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedPropertyDescriptor]

'filter' @ [624:81] ==> public inline fun <K, V> Map<out LocalDate, FloatingRatePaymentEvent>.filter(predicate: (Map.Entry<LocalDate, FloatingRatePaymentEvent>) -> Boolean): Map<LocalDate, FloatingRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent

'it' @ [624:90] ==> value-parameter it: Map.Entry<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [624:93] ==> public abstract val value: FloatingRatePaymentEvent defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'rate' @ [624:99] ==> public final val rate: Rate defined in net.corda.irs.contract.FloatingRatePaymentEvent[DeserializedPropertyDescriptor]

'maxBy' @ [624:119] ==> @InlineOnly public inline fun <K, V, R : Comparable<LocalDate>> Map<out LocalDate, FloatingRatePaymentEvent>.maxBy(selector: (Map.Entry<LocalDate, FloatingRatePaymentEvent>) -> LocalDate): Map.Entry<LocalDate, FloatingRatePaymentEvent>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent
    <R : Comparable<R>> -> LocalDate

'it' @ [624:127] ==> value-parameter it: Map.Entry<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [624:130] ==> public abstract val key: LocalDate defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'latestReset' @ [625:48] ==> val latestReset: Map.Entry<LocalDate, FloatingRatePaymentEvent>? defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'value' @ [625:62] ==> public abstract val value: FloatingRatePaymentEvent defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'copy' @ [625:68] ==> public final fun copy(date: LocalDate = ..., accrualStartDate: LocalDate = ..., accrualEndDate: LocalDate = ..., dayCountBasisDay: DayCountBasisDay = ..., dayCountBasisYear: DayCountBasisYear = ..., fixingDate: LocalDate = ..., notional: Amount<Currency> = ..., rate: Rate = ...): FloatingRatePaymentEvent defined in net.corda.irs.contract.FloatingRatePaymentEvent[DeserializedSimpleFunctionDescriptor]

'Amount' @ [625:84] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'latestReset' @ [625:91] ==> val latestReset: Map.Entry<LocalDate, FloatingRatePaymentEvent>? defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'value' @ [625:103] ==> public abstract val value: FloatingRatePaymentEvent defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'notional' @ [625:109] ==> public final val notional: Amount<Currency> defined in net.corda.irs.contract.FloatingRatePaymentEvent[DeserializedPropertyDescriptor]

'quantity' @ [625:118] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'getInstance' @ [625:137] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'output' @ [627:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [628:21] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'copy' @ [628:28] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [629:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'fixedLeg' @ [629:36] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'newIRS' @ [630:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'floatingLeg' @ [630:36] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'newIRS' @ [631:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [631:36] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [631:48] ==> public final fun copy(expression: Expression = ..., floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> = ..., fixedLegPaymentSchedule: Map<LocalDate, FixedRatePaymentEvent> = ...): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'newIRS' @ [631:82] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'calculation' @ [631:89] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'floatingLegPaymentSchedule' @ [631:101] ==> public final val floatingLegPaymentSchedule: Map<LocalDate, FloatingRatePaymentEvent> defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedPropertyDescriptor]

'plus' @ [631:128] ==> public operator fun <K, V> Map<out LocalDate, FloatingRatePaymentEvent>.plus(pair: Pair<LocalDate, FloatingRatePaymentEvent>): Map<LocalDate, FloatingRatePaymentEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalDate
    <V> -> FloatingRatePaymentEvent

'Pair' @ [632:37] ==> public constructor Pair<out A, out B>(first: LocalDate, second: FloatingRatePaymentEvent) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LocalDate
    <out B> -> FloatingRatePaymentEvent

'latestReset' @ [632:42] ==> val latestReset: Map.Entry<LocalDate, FloatingRatePaymentEvent>? defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'key' @ [632:54] ==> public abstract val key: LocalDate defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'modifiedLatestResetValue' @ [632:59] ==> val modifiedLatestResetValue: FloatingRatePaymentEvent defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newIRS' @ [633:29] ==> val newIRS: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.`various fixing tests`[LocalVariableDescriptor]

'common' @ [633:36] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'this' @ [636:17] ==> <this> defined in net.corda.irs.contract.IRSTests.`various fixing tests`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'of' @ [649:29] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'BigDecimal' @ [650:19] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'singleIRS' @ [652:19] ==> public final fun singleIRS(irsSelector: Int = ...): InterestRateSwap.State defined in net.corda.irs.contract.IRSTests[SimpleFunctionDescriptorImpl]

'ledger' @ [654:16] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [655:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [656:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [657:21] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'copy' @ [657:25] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'irs' @ [658:29] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'fixedLeg' @ [658:33] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [659:29] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'floatingLeg' @ [659:33] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [660:29] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'calculation' @ [660:33] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [661:29] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'common' @ [661:33] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [661:40] ==> public final fun copy(baseCurrency: Currency = ..., eligibleCurrency: Currency = ..., eligibleCreditSupport: String = ..., independentAmounts: Amount<Currency> = ..., threshold: Amount<Currency> = ..., minimumTransferAmount: Amount<Currency> = ..., rounding: Amount<Currency> = ..., valuationDateDescription: String = ..., notificationTime: String = ..., resolutionTime: String = ..., interestRate: ReferenceRate = ..., addressForTransfers: String = ..., exposure: UnknownType = ..., localBusinessDay: BusinessCalendar = ..., dailyInterestAmount: Expression = ..., tradeID: String = ..., hashLegalDocs: String = ...): InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.Common[DeserializedSimpleFunctionDescriptor]

'command' @ [664:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [664:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [664:71] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [665:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [665:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [666:17] ==> <this> defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [666:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'transaction' @ [669:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [670:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'irs' @ [671:21] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'copy' @ [671:25] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'UniqueIdentifier' @ [672:40] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'irs' @ [673:40] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'fixedLeg' @ [673:44] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [674:43] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'floatingLeg' @ [674:47] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [675:43] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'calculation' @ [675:47] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'irs' @ [676:38] ==> val irs: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'common' @ [676:42] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [676:49] ==> public final fun copy(baseCurrency: Currency = ..., eligibleCurrency: Currency = ..., eligibleCreditSupport: String = ..., independentAmounts: Amount<Currency> = ..., threshold: Amount<Currency> = ..., minimumTransferAmount: Amount<Currency> = ..., rounding: Amount<Currency> = ..., valuationDateDescription: String = ..., notificationTime: String = ..., resolutionTime: String = ..., interestRate: ReferenceRate = ..., addressForTransfers: String = ..., exposure: UnknownType = ..., localBusinessDay: BusinessCalendar = ..., dailyInterestAmount: Expression = ..., tradeID: String = ..., hashLegalDocs: String = ...): InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.Common[DeserializedSimpleFunctionDescriptor]

'command' @ [679:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [679:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Agree' @ [679:71] ==> public constructor Agree() defined in net.corda.irs.contract.InterestRateSwap.Commands.Agree[DeserializedClassConstructorDescriptor]

'timeWindow' @ [680:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [680:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [681:17] ==> <this> defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [681:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'transaction' @ [684:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [685:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [686:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [687:60] ==> public final inline fun <reified S : ContractState> String.output(): InterestRateSwap.State defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S : ContractState> -> State

'output' @ [688:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'postAgreement1' @ [689:21] ==> val postAgreement1: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'copy' @ [689:36] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'postAgreement1' @ [690:29] ==> val postAgreement1: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fixedLeg' @ [690:44] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'postAgreement1' @ [691:29] ==> val postAgreement1: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'floatingLeg' @ [691:44] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'postAgreement1' @ [692:29] ==> val postAgreement1: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'calculation' @ [692:44] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'applyFixing' @ [692:56] ==> public final fun applyFixing(date: LocalDate, newRate: FixedRate): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'ld1' @ [692:68] ==> val ld1: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'FixedRate' @ [692:73] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'RatioUnit' @ [692:83] ==> public constructor RatioUnit(value: BigDecimal) defined in net.corda.irs.contract.RatioUnit[DeserializedClassConstructorDescriptor]

'bd1' @ [692:93] ==> val bd1: BigDecimal defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'postAgreement1' @ [693:29] ==> val postAgreement1: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'common' @ [693:44] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [693:51] ==> public final fun copy(baseCurrency: Currency = ..., eligibleCurrency: Currency = ..., eligibleCreditSupport: String = ..., independentAmounts: Amount<Currency> = ..., threshold: Amount<Currency> = ..., minimumTransferAmount: Amount<Currency> = ..., rounding: Amount<Currency> = ..., valuationDateDescription: String = ..., notificationTime: String = ..., resolutionTime: String = ..., interestRate: ReferenceRate = ..., addressForTransfers: String = ..., exposure: UnknownType = ..., localBusinessDay: BusinessCalendar = ..., dailyInterestAmount: Expression = ..., tradeID: String = ..., hashLegalDocs: String = ...): InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.Common[DeserializedSimpleFunctionDescriptor]

'output' @ [696:60] ==> public final inline fun <reified S : ContractState> String.output(): InterestRateSwap.State defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S : ContractState> -> State

'output' @ [697:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'postAgreement2' @ [698:21] ==> val postAgreement2: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'copy' @ [698:36] ==> public final fun copy(fixedLeg: InterestRateSwap.FixedLeg = ..., floatingLeg: InterestRateSwap.FloatingLeg = ..., calculation: InterestRateSwap.Calculation = ..., common: InterestRateSwap.Common = ..., linearId: UniqueIdentifier = ...): InterestRateSwap.State defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedSimpleFunctionDescriptor]

'postAgreement2' @ [699:29] ==> val postAgreement2: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fixedLeg' @ [699:44] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'postAgreement2' @ [700:29] ==> val postAgreement2: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'floatingLeg' @ [700:44] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'postAgreement2' @ [701:29] ==> val postAgreement2: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'calculation' @ [701:44] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'applyFixing' @ [701:56] ==> public final fun applyFixing(date: LocalDate, newRate: FixedRate): InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'ld1' @ [701:68] ==> val ld1: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'FixedRate' @ [701:73] ==> public constructor FixedRate(ratioUnit: RatioUnit) defined in net.corda.irs.contract.FixedRate[DeserializedClassConstructorDescriptor]

'RatioUnit' @ [701:83] ==> public constructor RatioUnit(value: BigDecimal) defined in net.corda.irs.contract.RatioUnit[DeserializedClassConstructorDescriptor]

'bd1' @ [701:93] ==> val bd1: BigDecimal defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'postAgreement2' @ [702:29] ==> val postAgreement2: InterestRateSwap.State defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[LocalVariableDescriptor]

'common' @ [702:44] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'copy' @ [702:51] ==> public final fun copy(baseCurrency: Currency = ..., eligibleCurrency: Currency = ..., eligibleCreditSupport: String = ..., independentAmounts: Amount<Currency> = ..., threshold: Amount<Currency> = ..., minimumTransferAmount: Amount<Currency> = ..., rounding: Amount<Currency> = ..., valuationDateDescription: String = ..., notificationTime: String = ..., resolutionTime: String = ..., interestRate: ReferenceRate = ..., addressForTransfers: String = ..., exposure: UnknownType = ..., localBusinessDay: BusinessCalendar = ..., dailyInterestAmount: Expression = ..., tradeID: String = ..., hashLegalDocs: String = ...): InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.Common[DeserializedSimpleFunctionDescriptor]

'command' @ [706:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ORACLE_PUBKEY' @ [706:25] ==> public val ORACLE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Refix' @ [707:47] ==> public constructor Refix(fix: Fix) defined in net.corda.irs.contract.InterestRateSwap.Commands.Refix[DeserializedClassConstructorDescriptor]

'Fix' @ [707:53] ==> public constructor Fix(of: FixOf, value: BigDecimal) defined in net.corda.finance.contracts.Fix[DeserializedClassConstructorDescriptor]

'FixOf' @ [707:57] ==> public constructor FixOf(name: String, forDay: LocalDate, ofTenor: Tenor) defined in net.corda.finance.contracts.FixOf[DeserializedClassConstructorDescriptor]

'ld1' @ [707:76] ==> val ld1: (LocalDate..LocalDate?) defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'Tenor' @ [707:81] ==> public constructor Tenor(name: String) defined in net.corda.finance.contracts.Tenor[DeserializedClassConstructorDescriptor]

'bd1' @ [707:95] ==> val bd1: BigDecimal defined in net.corda.irs.contract.IRSTests.tradegroups[LocalVariableDescriptor]

'timeWindow' @ [709:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [709:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [710:17] ==> <this> defined in net.corda.irs.contract.IRSTests.tradegroups.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [710:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

