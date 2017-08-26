'scopeTower' @ [47:52] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[PropertyDescriptorImpl]

'location' @ [47:63] ==> public abstract val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'SmartList' @ [55:27] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ResolutionDiagnostic

'diagnostics' @ [56:9] ==> val diagnostics: SmartList<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'addIfNotNull' @ [56:21] ==> public fun <T : Any> MutableCollection<(ResolutionDiagnostic..ResolutionDiagnostic?)>.addIfNotNull(t: ResolutionDiagnostic?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.resolve.calls.tower.ResolutionDiagnostic..org.jetbrains.kotlin.resolve.calls.tower.ResolutionDiagnostic?)

'specialError' @ [56:34] ==> value-parameter specialError: ResolutionDiagnostic? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'if (ErrorUtils.isError(descriptor)) {
            diagnostics.add(ErrorDescriptorDiagnostic)
        }
        else {
            if (descriptor.hasLowPriorityInOverloadResolution()) diagnostics.add(LowPriorityDescriptorDiagnostic)
            if (dispatchReceiverSmartCastType != null) diagnostics.add(UsedSmartCastForDispatchReceiver(dispatchReceiverSmartCastType))

            if (!USE_NEW_INFERENCE) {
                val shouldSkipVisibilityCheck = scopeTower.isDebuggerContext
                if (!shouldSkipVisibilityCheck) {
                    Visibilities.findInvisibleMember(
                            getReceiverValueWithSmartCast(dispatchReceiver?.receiverValue, dispatchReceiverSmartCastType),
                            descriptor,
                            scopeTower.lexicalScope.ownerDescriptor
                    )?.let { diagnostics.add(VisibilityError(it)) }
                }
            }
        }' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'isError' @ [58:24] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [58:32] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'diagnostics' @ [59:13] ==> val diagnostics: SmartList<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'add' @ [59:25] ==> public open fun add(element: (ResolutionDiagnostic..ResolutionDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'ErrorDescriptorDiagnostic' @ [59:29] ==> public object ErrorDescriptorDiagnostic : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower in file ImplicitScopeTower.kt[FakeCallableDescriptorForObject]

'descriptor' @ [62:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'hasLowPriorityInOverloadResolution' @ [62:28] ==> public fun CallableDescriptor.hasLowPriorityInOverloadResolution(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [62:66] ==> val diagnostics: SmartList<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'add' @ [62:78] ==> public open fun add(element: (ResolutionDiagnostic..ResolutionDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'LowPriorityDescriptorDiagnostic' @ [62:82] ==> public object LowPriorityDescriptorDiagnostic : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower in file ImplicitScopeTower.kt[FakeCallableDescriptorForObject]

'dispatchReceiverSmartCastType' @ [63:17] ==> value-parameter dispatchReceiverSmartCastType: KotlinType? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'diagnostics' @ [63:56] ==> val diagnostics: SmartList<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'add' @ [63:68] ==> public open fun add(element: (ResolutionDiagnostic..ResolutionDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'UsedSmartCastForDispatchReceiver' @ [63:72] ==> public constructor UsedSmartCastForDispatchReceiver(smartCastType: KotlinType) defined in org.jetbrains.kotlin.resolve.calls.tower.UsedSmartCastForDispatchReceiver[ClassConstructorDescriptorImpl]

'dispatchReceiverSmartCastType' @ [63:105] ==> value-parameter dispatchReceiverSmartCastType: KotlinType? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'!' @ [65:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'USE_NEW_INFERENCE' @ [65:18] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls in file KotlinResolutionConfiguration.kt[PropertyDescriptorImpl]

'scopeTower' @ [66:49] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[PropertyDescriptorImpl]

'isDebuggerContext' @ [66:60] ==> public abstract val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'!' @ [67:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldSkipVisibilityCheck' @ [67:22] ==> val shouldSkipVisibilityCheck: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'findInvisibleMember' @ [68:34] ==> @Nullable public open fun findInvisibleMember(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'getReceiverValueWithSmartCast' @ [69:29] ==> public fun getReceiverValueWithSmartCast(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [69:59] ==> value-parameter dispatchReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'receiverValue' @ [69:77] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'dispatchReceiverSmartCastType' @ [69:92] ==> value-parameter dispatchReceiverSmartCastType: KotlinType? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [70:29] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'scopeTower' @ [71:29] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[PropertyDescriptorImpl]

'lexicalScope' @ [71:40] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'ownerDescriptor' @ [71:53] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'let' @ [72:24] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptorWithVisibility.let(block: (DeclarationDescriptorWithVisibility) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorWithVisibility
    <R> -> Boolean

'diagnostics' @ [72:30] ==> val diagnostics: SmartList<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'add' @ [72:42] ==> public open fun add(element: (ResolutionDiagnostic..ResolutionDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'VisibilityError' @ [72:46] ==> public constructor VisibilityError(invisibleMember: DeclarationDescriptorWithVisibility) defined in org.jetbrains.kotlin.resolve.calls.tower.VisibilityError[ClassConstructorDescriptorImpl]

'it' @ [72:62] ==> value-parameter it: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'CandidateWithBoundDispatchReceiverImpl' @ [76:16] ==> public constructor CandidateWithBoundDispatchReceiverImpl(dispatchReceiver: ReceiverValueWithSmartCastInfo?, descriptor: CallableDescriptor, diagnostics: List<ResolutionDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiverImpl[ClassConstructorDescriptorImpl]

'dispatchReceiver' @ [76:55] ==> value-parameter dispatchReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [76:73] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[ValueParameterDescriptorImpl]

'diagnostics' @ [76:85] ==> val diagnostics: SmartList<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel.createCandidateDescriptor[LocalVariableDescriptor]

'AbstractScopeTowerLevel' @ [86:4] ==> public constructor AbstractScopeTowerLevel(scopeTower: ImplicitScopeTower) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [86:28] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.<init>[ValueParameterDescriptorImpl]

'scopeTower' @ [88:35] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.<init>[ValueParameterDescriptorImpl]

'syntheticScopes' @ [88:46] ==> public abstract val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'ArrayList' @ [93:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CandidateWithBoundDispatchReceiver

'dispatchReceiver' @ [94:29] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'receiverValue' @ [94:46] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'receiverValue' @ [95:9] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'type' @ [95:23] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [95:28] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'invoke' @ [95:40] ==> public abstract operator fun ResolutionScope.invoke(p2: KotlinType?): Collection<CallableDescriptor> defined in kotlin.Function2[FunctionInvokeDescriptor]

'receiverValue' @ [95:51] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'type' @ [95:65] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'mapTo' @ [95:71] ==> public inline fun <T, R, C : MutableCollection<in CandidateWithBoundDispatchReceiver>> Iterable<CallableDescriptor>.mapTo(destination: ArrayList<CandidateWithBoundDispatchReceiver>, transform: (CallableDescriptor) -> CandidateWithBoundDispatchReceiver): ArrayList<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver
    <C : MutableCollection<in R>> -> ArrayList<CandidateWithBoundDispatchReceiver>

'result' @ [95:77] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'createCandidateDescriptor' @ [96:13] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [96:39] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [96:43] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'if (dispatchReceiver.isStable) null else UnstableSmartCastDiagnostic' @ [99:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnstableSmartCastDiagnostic?, elseBranch: UnstableSmartCastDiagnostic?): UnstableSmartCastDiagnostic?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnstableSmartCastDiagnostic?

'dispatchReceiver' @ [99:33] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'isStable' @ [99:50] ==> public final val isStable: Boolean defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'UnstableSmartCastDiagnostic' @ [99:70] ==> public object UnstableSmartCastDiagnostic : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower in file ImplicitScopeTower.kt[FakeCallableDescriptorForObject]

'if (unstableError != null) ArrayList<CandidateWithBoundDispatchReceiver>(0) else null' @ [100:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArrayList<CandidateWithBoundDispatchReceiver>?, elseBranch: ArrayList<CandidateWithBoundDispatchReceiver>?): ArrayList<CandidateWithBoundDispatchReceiver>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ArrayList<CandidateWithBoundDispatchReceiver>?

'unstableError' @ [100:38] ==> val unstableError: UnstableSmartCastDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'ArrayList' @ [100:61] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CandidateWithBoundDispatchReceiver

'dispatchReceiver' @ [102:30] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'possibleTypes' @ [102:47] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'possibleType' @ [103:13] ==> val possibleType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'memberScope' @ [103:26] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'invoke' @ [103:38] ==> public abstract operator fun ResolutionScope.invoke(p2: KotlinType?): Collection<CallableDescriptor> defined in kotlin.Function2[FunctionInvokeDescriptor]

'possibleType' @ [103:49] ==> val possibleType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'mapTo' @ [103:63] ==> public inline fun <T, R, C : MutableCollection<in CandidateWithBoundDispatchReceiver>> Iterable<CallableDescriptor>.mapTo(destination: ArrayList<CandidateWithBoundDispatchReceiver>, transform: (CallableDescriptor) -> CandidateWithBoundDispatchReceiver): ArrayList<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver
    <C : MutableCollection<in R>> -> ArrayList<CandidateWithBoundDispatchReceiver>

'unstableCandidates' @ [103:69] ==> val unstableCandidates: ArrayList<CandidateWithBoundDispatchReceiver>? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'result' @ [103:91] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'createCandidateDescriptor' @ [104:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [105:25] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [106:25] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'smartCastReceiver' @ [106:42] ==> private final fun ReceiverValueWithSmartCastInfo.smartCastReceiver(targetType: KotlinType): ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'possibleType' @ [106:60] ==> val possibleType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'unstableError' @ [107:25] ==> val unstableError: UnstableSmartCastDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'possibleType' @ [107:72] ==> val possibleType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'dispatchReceiver' @ [112:13] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'possibleTypes' @ [112:30] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'isNotEmpty' @ [112:44] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'if (unstableCandidates == null) {
                result.retainAll(result.selectMostSpecificInEachOverridableGroup { descriptor.approximateCapturedTypes() })
            }
            else {
                result.addAll(unstableCandidates.selectMostSpecificInEachOverridableGroup { descriptor.approximateCapturedTypes() })
            }' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'unstableCandidates' @ [113:17] ==> val unstableCandidates: ArrayList<CandidateWithBoundDispatchReceiver>? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'result' @ [114:17] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'retainAll' @ [114:24] ==> public open fun retainAll(elements: Collection<CandidateWithBoundDispatchReceiver>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'result' @ [114:34] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'selectMostSpecificInEachOverridableGroup' @ [114:41] ==> public fun <H : Any> Collection<CandidateWithBoundDispatchReceiver>.selectMostSpecificInEachOverridableGroup(descriptorByHandle: (CandidateWithBoundDispatchReceiver).() -> CallableDescriptor): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <H : Any> -> CandidateWithBoundDispatchReceiver

'descriptor' @ [114:84] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'approximateCapturedTypes' @ [114:95] ==> private final fun CallableDescriptor.approximateCapturedTypes(): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'result' @ [117:17] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'addAll' @ [117:24] ==> public open fun addAll(elements: Collection<CandidateWithBoundDispatchReceiver>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'unstableCandidates' @ [117:31] ==> val unstableCandidates: ArrayList<CandidateWithBoundDispatchReceiver>? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'selectMostSpecificInEachOverridableGroup' @ [117:50] ==> public fun <H : Any> Collection<CandidateWithBoundDispatchReceiver>.selectMostSpecificInEachOverridableGroup(descriptorByHandle: (CandidateWithBoundDispatchReceiver).() -> CallableDescriptor): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <H : Any> -> CandidateWithBoundDispatchReceiver

'descriptor' @ [117:93] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'approximateCapturedTypes' @ [117:104] ==> private final fun CallableDescriptor.approximateCapturedTypes(): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'receiverValue' @ [121:13] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'type' @ [121:27] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'isDynamic' @ [121:32] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'scopeTower' @ [122:13] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'dynamicScope' @ [122:24] ==> public abstract val dynamicScope: MemberScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'invoke' @ [122:37] ==> public abstract operator fun ResolutionScope.invoke(p2: KotlinType?): Collection<CallableDescriptor> defined in kotlin.Function2[FunctionInvokeDescriptor]

'mapTo' @ [122:54] ==> public inline fun <T, R, C : MutableCollection<in CandidateWithBoundDispatchReceiver>> Iterable<CallableDescriptor>.mapTo(destination: ArrayList<CandidateWithBoundDispatchReceiver>, transform: (CallableDescriptor) -> CandidateWithBoundDispatchReceiver): ArrayList<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver
    <C : MutableCollection<in R>> -> ArrayList<CandidateWithBoundDispatchReceiver>

'result' @ [122:60] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'createCandidateDescriptor' @ [123:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [123:43] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [123:47] ==> public final val dispatchReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'DynamicDescriptorDiagnostic' @ [123:65] ==> public object DynamicDescriptorDiagnostic : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower in file ImplicitScopeTower.kt[FakeCallableDescriptorForObject]

'result' @ [127:16] ==> val result: ArrayList<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers[LocalVariableDescriptor]

'!' @ [137:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'USE_NEW_INFERENCE' @ [137:14] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls in file KotlinResolutionConfiguration.kt[PropertyDescriptorImpl]

'this' @ [137:40] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes[ReceiverParameterDescriptorImpl]

'TypeApproximator' @ [139:28] ==> public constructor TypeApproximator() defined in org.jetbrains.kotlin.types.TypeApproximator[ClassConstructorDescriptorImpl]

'TypeSubstitution' @ [140:44] ==> public constructor TypeSubstitution() defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedClassConstructorDescriptor]

'when (position) {
                Variance.INVARIANT -> null
                Variance.OUT_VARIANCE -> approximator.approximateToSuperType(topLevelType.unwrap(), TypeApproximatorConfiguration.CapturedTypesApproximation)
                Variance.IN_VARIANCE -> approximator.approximateToSubType(topLevelType.unwrap(), TypeApproximatorConfiguration.CapturedTypesApproximation)
            }' @ [142:94] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType?, entry1: UnwrappedType?, entry2: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType?

'position' @ [142:100] ==> value-parameter position: Variance defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes.<no name provided>.prepareTopLevelType[ValueParameterDescriptorImpl]

'INVARIANT' @ [143:26] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [144:26] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'approximator' @ [144:42] ==> val approximator: TypeApproximator defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes[LocalVariableDescriptor]

'approximateToSuperType' @ [144:55] ==> public final fun approximateToSuperType(type: UnwrappedType, conf: TypeApproximatorConfiguration): UnwrappedType? defined in org.jetbrains.kotlin.types.TypeApproximator[SimpleFunctionDescriptorImpl]

'topLevelType' @ [144:78] ==> value-parameter topLevelType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes.<no name provided>.prepareTopLevelType[ValueParameterDescriptorImpl]

'unwrap' @ [144:91] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'CapturedTypesApproximation' @ [144:131] ==> public object CapturedTypesApproximation : TypeApproximatorConfiguration.AbstractCapturedTypesApproximation defined in org.jetbrains.kotlin.types.TypeApproximatorConfiguration[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [145:26] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'approximator' @ [145:41] ==> val approximator: TypeApproximator defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes[LocalVariableDescriptor]

'approximateToSubType' @ [145:54] ==> public final fun approximateToSubType(type: UnwrappedType, conf: TypeApproximatorConfiguration): UnwrappedType? defined in org.jetbrains.kotlin.types.TypeApproximator[SimpleFunctionDescriptorImpl]

'topLevelType' @ [145:75] ==> value-parameter topLevelType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes.<no name provided>.prepareTopLevelType[ValueParameterDescriptorImpl]

'unwrap' @ [145:88] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'CapturedTypesApproximation' @ [145:128] ==> public object CapturedTypesApproximation : TypeApproximatorConfiguration.AbstractCapturedTypesApproximation defined in org.jetbrains.kotlin.types.TypeApproximatorConfiguration[FakeCallableDescriptorForObject]

'topLevelType' @ [146:18] ==> value-parameter topLevelType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes.<no name provided>.prepareTopLevelType[ValueParameterDescriptorImpl]

'substitute' @ [148:16] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'create' @ [148:43] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'wrappedSubstitution' @ [148:50] ==> val wrappedSubstitution: <no name provided> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.approximateCapturedTypes[LocalVariableDescriptor]

'receiverValue' @ [152:13] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'this' @ [152:61] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.smartCastReceiver[ReceiverParameterDescriptorImpl]

'CastImplicitClassReceiver' @ [154:32] ==> public constructor CastImplicitClassReceiver(originalDescriptor: ClassDescriptor, targetType: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.CastImplicitClassReceiver[DeserializedClassConstructorDescriptor]

'receiverValue' @ [154:58] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'classDescriptor' @ [154:72] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'targetType' @ [154:89] ==> value-parameter targetType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.smartCastReceiver[ValueParameterDescriptorImpl]

'ReceiverValueWithSmartCastInfo' @ [155:16] ==> public constructor ReceiverValueWithSmartCastInfo(receiverValue: ReceiverValue, possibleTypes: Set<KotlinType>, isStable: Boolean) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[ClassConstructorDescriptorImpl]

'newReceiverValue' @ [155:47] ==> val newReceiverValue: CastImplicitClassReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.smartCastReceiver[LocalVariableDescriptor]

'possibleTypes' @ [155:65] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'isStable' @ [155:80] ==> public final val isStable: Boolean defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'collectMembers' @ [159:16] ==> private final fun collectMembers(getMembers: ResolutionScope.(KotlinType?) -> Collection<CallableDescriptor>): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'getContributedVariables' @ [159:33] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [159:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getVariables[ValueParameterDescriptorImpl]

'location' @ [159:63] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'emptyList' @ [163:16] ==> public fun <T> emptyList(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'collectMembers' @ [167:16] ==> private final fun collectMembers(getMembers: ResolutionScope.(KotlinType?) -> Collection<CallableDescriptor>): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[SimpleFunctionDescriptorImpl]

'getContributedFunctions' @ [168:13] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [168:37] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'location' @ [168:43] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'it' @ [168:55] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getInnerConstructors' @ [168:58] ==> private fun KotlinType?.getInnerConstructors(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'name' @ [168:79] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'location' @ [168:85] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'syntheticScopes' @ [169:13] ==> private final val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'collectSyntheticMemberFunctions' @ [169:29] ==> public fun SyntheticScopes.collectSyntheticMemberFunctions(receiverTypes: Collection<KotlinType>, name: Name, location: LookupLocation): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'listOfNotNull' @ [169:61] ==> public fun <T : Any> listOfNotNull(element: KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'it' @ [169:75] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [169:80] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'location' @ [169:86] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[PropertyDescriptorImpl]

'AbstractScopeTowerLevel' @ [174:109] ==> public constructor AbstractScopeTowerLevel(scopeTower: ImplicitScopeTower) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [174:133] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.<init>[ValueParameterDescriptorImpl]

'qualifier' @ [175:97] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'staticScope' @ [175:107] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'getContributedVariables' @ [176:14] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [176:38] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.getVariables[ValueParameterDescriptorImpl]

'location' @ [176:44] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'map' @ [176:54] ==> public inline fun <T, R> Iterable<PropertyDescriptor>.map(transform: (PropertyDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [177:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [177:43] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.getVariables.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [180:95] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'staticScope' @ [180:105] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'getContributedObjectVariables' @ [181:14] ==> private fun ResolutionScope.getContributedObjectVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'name' @ [181:44] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.getObjects[ValueParameterDescriptorImpl]

'location' @ [181:50] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'map' @ [181:60] ==> public inline fun <T, R> Iterable<VariableDescriptor>.map(transform: (VariableDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [182:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [182:43] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.getObjects.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [185:97] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'staticScope' @ [185:107] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'getContributedFunctionsAndConstructors' @ [186:14] ==> private fun ResolutionScope.getContributedFunctionsAndConstructors(name: Name, location: LookupLocation, syntheticScopes: SyntheticScopes, scope: ResolutionScope): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'name' @ [186:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'location' @ [187:53] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'scopeTower' @ [188:53] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'syntheticScopes' @ [188:64] ==> public abstract val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'qualifier' @ [189:53] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[PropertyDescriptorImpl]

'staticScope' @ [189:63] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'map' @ [189:76] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.map(transform: (FunctionDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [190:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [190:43] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'AbstractScopeTowerLevel' @ [198:5] ==> public constructor AbstractScopeTowerLevel(scopeTower: ImplicitScopeTower) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [198:29] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.<init>[ValueParameterDescriptorImpl]

'this' @ [200:88] ==> protected constructor ScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, resolutionScope: ResolutionScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [200:93] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.<init>[ValueParameterDescriptorImpl]

'lexicalScope' @ [200:105] ==> value-parameter lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.<init>[ValueParameterDescriptorImpl]

'resolutionScope' @ [203:15] ==> private final val resolutionScope: ResolutionScope defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'getContributedVariables' @ [203:31] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [203:55] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getVariables[ValueParameterDescriptorImpl]

'location' @ [203:61] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'map' @ [203:71] ==> public inline fun <T, R> Iterable<VariableDescriptor>.map(transform: (VariableDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [204:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [204:43] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getVariables.<anonymous>[ValueParameterDescriptorImpl]

'resolutionScope' @ [208:15] ==> private final val resolutionScope: ResolutionScope defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'getContributedObjectVariables' @ [208:31] ==> private fun ResolutionScope.getContributedObjectVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'name' @ [208:61] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getObjects[ValueParameterDescriptorImpl]

'location' @ [208:67] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'map' @ [208:77] ==> public inline fun <T, R> Iterable<VariableDescriptor>.map(transform: (VariableDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [209:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [209:43] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getObjects.<anonymous>[ValueParameterDescriptorImpl]

'resolutionScope' @ [213:15] ==> private final val resolutionScope: ResolutionScope defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'getContributedFunctionsAndConstructors' @ [213:31] ==> private fun ResolutionScope.getContributedFunctionsAndConstructors(name: Name, location: LookupLocation, syntheticScopes: SyntheticScopes, scope: ResolutionScope): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'name' @ [213:70] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'location' @ [214:70] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'scopeTower' @ [215:70] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'syntheticScopes' @ [215:81] ==> public abstract val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'resolutionScope' @ [216:70] ==> private final val resolutionScope: ResolutionScope defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[PropertyDescriptorImpl]

'map' @ [216:87] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.map(transform: (FunctionDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [217:17] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [217:43] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel.getFunctions.<anonymous>[ValueParameterDescriptorImpl]

'ScopeBasedTowerLevel' @ [223:4] ==> protected constructor ScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, resolutionScope: ResolutionScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [223:25] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ImportingScopeBasedTowerLevel.<init>[ValueParameterDescriptorImpl]

'importingScope' @ [223:37] ==> value-parameter importingScope: ImportingScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImportingScopeBasedTowerLevel.<init>[ValueParameterDescriptorImpl]

'AbstractScopeTowerLevel' @ [228:4] ==> public constructor AbstractScopeTowerLevel(scopeTower: ImplicitScopeTower) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [228:28] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel.<init>[ValueParameterDescriptorImpl]

'possibleTypes' @ [230:17] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'receiverValue' @ [230:33] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [230:47] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'extensionReceiver' @ [233:13] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel.getVariables[ValueParameterDescriptorImpl]

'emptyList' @ [233:47] ==> public fun <T> emptyList(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'syntheticScopes' @ [235:16] ==> private final val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel[PropertyDescriptorImpl]

'collectSyntheticExtensionProperties' @ [235:32] ==> public fun SyntheticScopes.collectSyntheticExtensionProperties(receiverTypes: Collection<KotlinType>, name: Name, location: LookupLocation): List<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'extensionReceiver' @ [235:68] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel.getVariables[ValueParameterDescriptorImpl]

'allTypes' @ [235:86] ==> private final val ReceiverValueWithSmartCastInfo.allTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel[PropertyDescriptorImpl]

'name' @ [235:96] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel.getVariables[ValueParameterDescriptorImpl]

'location' @ [235:102] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel[PropertyDescriptorImpl]

'map' @ [235:112] ==> public inline fun <T, R> Iterable<PropertyDescriptor>.map(transform: (PropertyDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [236:13] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [236:39] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel.getVariables.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [243:13] ==> public fun <T> emptyList(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'emptyList' @ [249:13] ==> public fun <T> emptyList(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'AbstractScopeTowerLevel' @ [252:72] ==> public constructor AbstractScopeTowerLevel(scopeTower: ImplicitScopeTower) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [252:96] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.<init>[ValueParameterDescriptorImpl]

'getCandidates' @ [254:15] ==> private final fun getCandidates(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?, collectCandidates: LexicalScope.(Name, LookupLocation) -> Collection<CallableDescriptor>): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [254:29] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getVariables[ValueParameterDescriptorImpl]

'extensionReceiver' @ [254:35] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getVariables[ValueParameterDescriptorImpl]

'emptyList' @ [257:15] ==> public fun <T> emptyList(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'getCandidates' @ [260:15] ==> private final fun getCandidates(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?, collectCandidates: LexicalScope.(Name, LookupLocation) -> Collection<CallableDescriptor>): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [260:29] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'extensionReceiver' @ [260:35] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getFunctions[ValueParameterDescriptorImpl]

'extensionReceiver' @ [267:13] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getCandidates[ValueParameterDescriptorImpl]

'name' @ [267:42] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getCandidates[ValueParameterDescriptorImpl]

'HIDES_MEMBERS_NAME_LIST' @ [267:51] ==> public val HIDES_MEMBERS_NAME_LIST: Set<Name> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'emptyList' @ [267:83] ==> public fun <T> emptyList(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'scopeTower' @ [269:16] ==> protected final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel[PropertyDescriptorImpl]

'lexicalScope' @ [269:27] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'invoke' @ [269:40] ==> public abstract operator fun LexicalScope.invoke(p2: Name, p3: LookupLocation): Collection<CallableDescriptor> defined in kotlin.Function3[FunctionInvokeDescriptor]

'name' @ [269:58] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getCandidates[ValueParameterDescriptorImpl]

'location' @ [269:64] ==> protected final val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel[PropertyDescriptorImpl]

'filter' @ [269:74] ==> public inline fun <T> Iterable<CallableDescriptor>.filter(predicate: (CallableDescriptor) -> Boolean): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'it' @ [270:13] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getCandidates.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [270:16] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [270:54] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getCandidates.<anonymous>[ValueParameterDescriptorImpl]

'hasHidesMembersAnnotation' @ [270:57] ==> public fun CallableDescriptor.hasHidesMembersAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'map' @ [271:11] ==> public inline fun <T, R> Iterable<CallableDescriptor>.map(transform: (CallableDescriptor) -> CandidateWithBoundDispatchReceiver): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CandidateWithBoundDispatchReceiver

'createCandidateDescriptor' @ [272:13] ==> protected final fun createCandidateDescriptor(descriptor: CallableDescriptor, dispatchReceiver: ReceiverValueWithSmartCastInfo?, specialError: ResolutionDiagnostic?, dispatchReceiverSmartCastType: KotlinType?): CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel[SimpleFunctionDescriptorImpl]

'it' @ [272:39] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel.getCandidates.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [278:35] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[ReceiverParameterDescriptorImpl]

'superclass' @ [279:12] ==> var superclass: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[LocalVariableDescriptor]

'superclass' @ [280:9] ==> var superclass: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[LocalVariableDescriptor]

'memberScope' @ [280:20] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedClassifier' @ [280:32] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [280:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[ValueParameterDescriptorImpl]

'location' @ [280:63] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[ValueParameterDescriptorImpl]

'let' @ [280:74] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Nothing

'it' @ [280:87] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses.<anonymous>[ValueParameterDescriptorImpl]

'superclass' @ [281:9] ==> var superclass: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[LocalVariableDescriptor]

'superclass' @ [281:22] ==> var superclass: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassifierFromMeAndSuperclasses[LocalVariableDescriptor]

'getImmediateSuperclassNotAny' @ [281:33] ==> public fun KotlinType.getImmediateSuperclassNotAny(): KotlinType? defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'getClassWithConstructors' @ [287:32] ==> private fun getClassWithConstructors(classifier: ClassifierDescriptor?): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[SimpleFunctionDescriptorImpl]

'this' @ [287:57] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.getInnerConstructors[ReceiverParameterDescriptorImpl]

'getClassifierFromMeAndSuperclasses' @ [287:63] ==> private fun KotlinType.getClassifierFromMeAndSuperclasses(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[SimpleFunctionDescriptorImpl]

'name' @ [287:98] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getInnerConstructors[ValueParameterDescriptorImpl]

'location' @ [287:104] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getInnerConstructors[ValueParameterDescriptorImpl]

'classifierDescriptor' @ [288:12] ==> val classifierDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getInnerConstructors[LocalVariableDescriptor]

'constructors' @ [288:34] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'filter' @ [288:48] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [288:57] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tower.getInnerConstructors.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [288:60] ==> public final val ClassConstructorDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'emptyList' @ [288:99] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'ArrayList' @ [297:18] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'getContributedFunctions' @ [297:48] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [297:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'location' @ [297:78] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [299:22] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [299:47] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'location' @ [299:53] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'when (classifier) {
        is TypeAliasDescriptor -> if (classifier.canHaveCallableConstructors) classifier.constructors else emptyList()
        is ClassDescriptor -> if (classifier.canHaveCallableConstructors) classifier.constructors else emptyList()
        else -> emptyList()
    }' @ [300:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>, entry1: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>, entry2: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>): Collection<(ConstructorDescriptor..ConstructorDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)>

'classifier' @ [300:38] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'if (classifier.canHaveCallableConstructors) classifier.constructors else emptyList()' @ [301:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>, elseBranch: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>): Collection<(ConstructorDescriptor..ConstructorDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)>

'classifier' @ [301:39] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'canHaveCallableConstructors' @ [301:50] ==> private val TypeAliasDescriptor.canHaveCallableConstructors: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[PropertyDescriptorImpl]

'classifier' @ [301:79] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'constructors' @ [301:90] ==> public abstract val constructors: Collection<TypeAliasConstructorDescriptor> defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'emptyList' @ [301:108] ==> public fun <T> emptyList(): List<(ConstructorDescriptor..ConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'if (classifier.canHaveCallableConstructors) classifier.constructors else emptyList()' @ [302:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>, elseBranch: Collection<(ConstructorDescriptor..ConstructorDescriptor?)>): Collection<(ConstructorDescriptor..ConstructorDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)>

'classifier' @ [302:35] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'canHaveCallableConstructors' @ [302:46] ==> private val ClassDescriptor.canHaveCallableConstructors: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[PropertyDescriptorImpl]

'classifier' @ [302:75] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'constructors' @ [302:86] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'emptyList' @ [302:104] ==> public fun <T> emptyList(): List<(ConstructorDescriptor..ConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'emptyList' @ [303:17] ==> public fun <T> emptyList(): List<(ConstructorDescriptor..ConstructorDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'callableConstructors' @ [306:5] ==> val callableConstructors: Collection<(ConstructorDescriptor..ConstructorDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'filterTo' @ [306:26] ==> public inline fun <T, C : MutableCollection<in (ConstructorDescriptor..ConstructorDescriptor?)>> Iterable<(ConstructorDescriptor..ConstructorDescriptor?)>.filterTo(destination: ArrayList<FunctionDescriptor>, predicate: ((ConstructorDescriptor..ConstructorDescriptor?)) -> Boolean): ArrayList<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)
    <C : MutableCollection<in T>> -> ArrayList<FunctionDescriptor>

'result' @ [306:35] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'it' @ [306:45] ==> value-parameter it: (ConstructorDescriptor..ConstructorDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [306:48] ==> public final val ConstructorDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'result' @ [308:5] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'addAll' @ [308:12] ==> public open fun addAll(elements: Collection<FunctionDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'syntheticScopes' @ [308:19] ==> value-parameter syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'collectSyntheticStaticFunctions' @ [308:35] ==> public fun SyntheticScopes.collectSyntheticStaticFunctions(scope: ResolutionScope, name: Name, location: LookupLocation): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'scope' @ [308:67] ==> value-parameter scope: ResolutionScope defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'name' @ [308:74] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'location' @ [308:80] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'result' @ [309:5] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'addAll' @ [309:12] ==> public open fun addAll(elements: Collection<FunctionDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'syntheticScopes' @ [309:19] ==> value-parameter syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'collectSyntheticConstructors' @ [309:35] ==> public fun SyntheticScopes.collectSyntheticConstructors(scope: ResolutionScope, name: Name, location: LookupLocation): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'scope' @ [309:64] ==> value-parameter scope: ResolutionScope defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'name' @ [309:71] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'location' @ [309:77] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[ValueParameterDescriptorImpl]

'result' @ [311:12] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedFunctionsAndConstructors[LocalVariableDescriptor]

'toList' @ [311:19] ==> public fun <T> Iterable<FunctionDescriptor>.toList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'getFakeDescriptorForObject' @ [316:28] ==> public fun getFakeDescriptorForObject(classifier: ClassifierDescriptor?): FakeCallableDescriptorForObject? defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[SimpleFunctionDescriptorImpl]

'getContributedClassifier' @ [316:55] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [316:80] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedObjectVariables[ValueParameterDescriptorImpl]

'location' @ [316:86] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedObjectVariables[ValueParameterDescriptorImpl]

'listOfNotNull' @ [317:12] ==> public fun <T : Any> listOfNotNull(element: FakeCallableDescriptorForObject?): List<FakeCallableDescriptorForObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FakeCallableDescriptorForObject

'objectDescriptor' @ [317:26] ==> val objectDescriptor: FakeCallableDescriptorForObject? defined in org.jetbrains.kotlin.resolve.calls.tower.getContributedObjectVariables[LocalVariableDescriptor]

'when (classifier) {
            is TypeAliasDescriptor ->
                classifier.classDescriptor?.let { classDescriptor ->
                    if (classDescriptor.hasClassValueDescriptor)
                        FakeCallableDescriptorForTypeAliasObject(classifier)
                    else
                        null
                }
            is ClassDescriptor ->
                if (classifier.hasClassValueDescriptor)
                    FakeCallableDescriptorForObject(classifier)
                else
                    null
            else -> null
        }' @ [321:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FakeCallableDescriptorForObject?, entry1: FakeCallableDescriptorForObject?, entry2: FakeCallableDescriptorForObject?): FakeCallableDescriptorForObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FakeCallableDescriptorForObject?

'classifier' @ [321:15] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getFakeDescriptorForObject[ValueParameterDescriptorImpl]

'classifier' @ [323:17] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getFakeDescriptorForObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [323:28] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'let' @ [323:45] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> FakeCallableDescriptorForTypeAliasObject?): FakeCallableDescriptorForTypeAliasObject? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> FakeCallableDescriptorForTypeAliasObject?

'if (classDescriptor.hasClassValueDescriptor)
                        FakeCallableDescriptorForTypeAliasObject(classifier)
                    else
                        null' @ [324:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FakeCallableDescriptorForTypeAliasObject?, elseBranch: FakeCallableDescriptorForTypeAliasObject?): FakeCallableDescriptorForTypeAliasObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FakeCallableDescriptorForTypeAliasObject?

'classDescriptor' @ [324:25] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getFakeDescriptorForObject.<anonymous>[ValueParameterDescriptorImpl]

'hasClassValueDescriptor' @ [324:41] ==> public val ClassDescriptor.hasClassValueDescriptor: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'FakeCallableDescriptorForTypeAliasObject' @ [325:25] ==> public constructor FakeCallableDescriptorForTypeAliasObject(typeAliasDescriptor: TypeAliasDescriptor) defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForTypeAliasObject[ClassConstructorDescriptorImpl]

'classifier' @ [325:66] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getFakeDescriptorForObject[ValueParameterDescriptorImpl]

'if (classifier.hasClassValueDescriptor)
                    FakeCallableDescriptorForObject(classifier)
                else
                    null' @ [330:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FakeCallableDescriptorForObject?, elseBranch: FakeCallableDescriptorForObject?): FakeCallableDescriptorForObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FakeCallableDescriptorForObject?

'classifier' @ [330:21] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getFakeDescriptorForObject[ValueParameterDescriptorImpl]

'hasClassValueDescriptor' @ [330:32] ==> public val ClassDescriptor.hasClassValueDescriptor: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'FakeCallableDescriptorForObject' @ [331:21] ==> public constructor FakeCallableDescriptorForObject(classDescriptor: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[ClassConstructorDescriptorImpl]

'classifier' @ [331:53] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getFakeDescriptorForObject[ValueParameterDescriptorImpl]

'if (classifier !is ClassDescriptor || !classifier.canHaveCallableConstructors)
            null
        else
            classifier' @ [338:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'classifier' @ [338:13] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassWithConstructors[ValueParameterDescriptorImpl]

'!' @ [338:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classifier' @ [338:48] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassWithConstructors[ValueParameterDescriptorImpl]

'canHaveCallableConstructors' @ [338:59] ==> private val ClassDescriptor.canHaveCallableConstructors: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[PropertyDescriptorImpl]

'classifier' @ [341:13] ==> value-parameter classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tower.getClassWithConstructors[ValueParameterDescriptorImpl]

'!' @ [344:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [344:25] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'this' @ [344:33] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.canHaveCallableConstructors[ReceiverParameterDescriptorImpl]

'!' @ [344:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kind' @ [344:43] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [344:48] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [347:13] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'!' @ [347:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [347:52] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'classDescriptor' @ [347:60] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'classDescriptor' @ [347:80] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'canHaveCallableConstructors' @ [347:98] ==> private val ClassDescriptor.canHaveCallableConstructors: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerLevels.kt[PropertyDescriptorImpl]

