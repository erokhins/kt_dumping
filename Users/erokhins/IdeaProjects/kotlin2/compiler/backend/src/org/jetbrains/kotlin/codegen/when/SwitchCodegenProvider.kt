'this' @ [39:43] ==> private constructor SwitchCodegenProvider(bindingContext: BindingContext, shouldInlineConstVals: Boolean, codegen: ExpressionCodegen?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[ClassConstructorDescriptorImpl]

'state' @ [39:48] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [39:54] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'state' @ [39:70] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.<init>[ValueParameterDescriptorImpl]

'shouldInlineConstVals' @ [39:76] ==> public final val shouldInlineConstVals: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'this' @ [40:47] ==> private constructor SwitchCodegenProvider(bindingContext: BindingContext, shouldInlineConstVals: Boolean, codegen: ExpressionCodegen?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[ClassConstructorDescriptorImpl]

'codegen' @ [40:52] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [40:60] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'codegen' @ [40:76] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.<init>[ValueParameterDescriptorImpl]

'state' @ [40:84] ==> public final val ExpressionCodegen.state: GenerationState[MyPropertyDescriptor]

'shouldInlineConstVals' @ [40:90] ==> public final val shouldInlineConstVals: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'codegen' @ [40:113] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.<init>[ValueParameterDescriptorImpl]

'expression' @ [43:13] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying[ValueParameterDescriptorImpl]

'entries' @ [43:24] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'all' @ [43:32] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.all(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'entry' @ [44:17] ==> value-parameter entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying.<anonymous>[ValueParameterDescriptorImpl]

'conditions' @ [44:23] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'all' @ [44:34] ==> public inline fun <T> Array<out (KtWhenCondition..KtWhenCondition?)>.all(predicate: ((KtWhenCondition..KtWhenCondition?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'condition' @ [45:25] ==> value-parameter condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'condition' @ [46:45] ==> value-parameter condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [46:55] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'?:' @ [47:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ConstantValue<*>?, right: ConstantValue<*>): ConstantValue<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ConstantValue<*>

'getCompileTimeConstant' @ [47:54] ==> @Nullable public open fun getCompileTimeConstant(@NotNull expression: KtExpression, @NotNull bindingContext: BindingContext, shouldInlineConstVals: Boolean): ConstantValue<*>? defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'patternExpression' @ [47:77] ==> val patternExpression: KtExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying.<anonymous>.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [47:96] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[PropertyDescriptorImpl]

'shouldInlineConstVals' @ [47:112] ==> private final val shouldInlineConstVals: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[PropertyDescriptorImpl]

'predicate' @ [48:21] ==> value-parameter predicate: (ConstantValue<*>) -> Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying[ValueParameterDescriptorImpl]

'invoke' @ [48:31] ==> public abstract operator fun invoke(p1: ConstantValue<*>): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'constant' @ [48:38] ==> val constant: ConstantValue<*> defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.checkAllItemsAreConstantsSatisfying.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [53:13] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ConstantValue<*>?

'apply' @ [53:44] ==> @InlineOnly public inline fun <T> ArrayList<ConstantValue<*>?>.apply(block: ArrayList<ConstantValue<*>?>.() -> Unit): ArrayList<ConstantValue<*>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<ConstantValue<*>?>

'expression' @ [54:31] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.getAllConstants[ValueParameterDescriptorImpl]

'entries' @ [54:42] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'addConstantsFromConditions' @ [55:21] ==> private final fun ArrayList<ConstantValue<*>?>.addConstantsFromConditions(entry: KtWhenEntry): Unit defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'entry' @ [55:48] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.getAllConstants.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [60:13] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ConstantValue<*>?

'apply' @ [60:44] ==> @InlineOnly public inline fun <T> ArrayList<ConstantValue<*>?>.apply(block: ArrayList<ConstantValue<*>?>.() -> Unit): ArrayList<ConstantValue<*>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<ConstantValue<*>?>

'addConstantsFromConditions' @ [61:17] ==> private final fun ArrayList<ConstantValue<*>?>.addConstantsFromConditions(entry: KtWhenEntry): Unit defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'entry' @ [61:44] ==> value-parameter entry: KtWhenEntry defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.getConstantsFromEntry[ValueParameterDescriptorImpl]

'entry' @ [65:27] ==> value-parameter entry: KtWhenEntry defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.addConstantsFromConditions[ValueParameterDescriptorImpl]

'conditions' @ [65:33] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'condition' @ [66:17] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.addConstantsFromConditions[LocalVariableDescriptor]

'condition' @ [67:37] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.addConstantsFromConditions[LocalVariableDescriptor]

'expression' @ [67:47] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'AssertionError' @ [67:67] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'add' @ [68:13] ==> public open fun add(element: ConstantValue<*>?): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getCompileTimeConstant' @ [68:35] ==> @Nullable public open fun getCompileTimeConstant(@NotNull expression: KtExpression, @NotNull bindingContext: BindingContext, shouldInlineConstVals: Boolean): ConstantValue<*>? defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'patternExpression' @ [68:58] ==> val patternExpression: KtExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.addConstantsFromConditions[LocalVariableDescriptor]

'bindingContext' @ [68:77] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[PropertyDescriptorImpl]

'shouldInlineConstVals' @ [68:93] ==> private final val shouldInlineConstVals: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[PropertyDescriptorImpl]

'codegen' @ [77:23] ==> private final val codegen: ExpressionCodegen? defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[PropertyDescriptorImpl]

'AssertionError' @ [77:40] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'!' @ [79:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isThereConstantEntriesButNulls' @ [79:14] ==> private final fun isThereConstantEntriesButNulls(expression: KtWhenExpression): Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'expression' @ [79:45] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'codegen' @ [83:27] ==> val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'expressionType' @ [83:35] ==> @NotNull public open fun expressionType(@Nullable expression: KtExpression?): Type defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'expression' @ [83:50] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'subjectExpression' @ [83:61] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'codegen' @ [85:23] ==> val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'bindingContext' @ [85:31] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [85:46] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (WhenByEnumsMapping..WhenByEnumsMapping?)>..ReadOnlySlice<(KtWhenExpression..KtWhenExpression?), (WhenByEnumsMapping..WhenByEnumsMapping?)>?), p1: (KtWhenExpression..KtWhenExpression?)): WhenByEnumsMapping? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtWhenExpression..org.jetbrains.kotlin.psi.KtWhenExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.codegen.`when`.WhenByEnumsMapping..org.jetbrains.kotlin.codegen.`when`.WhenByEnumsMapping?)

'MAPPING_FOR_WHEN_BY_ENUM' @ [85:65] ==> public final val MAPPING_FOR_WHEN_BY_ENUM: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (WhenByEnumsMapping..WhenByEnumsMapping?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (WhenByEnumsMapping..WhenByEnumsMapping?)>?) defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaPropertyDescriptor]

'expression' @ [85:91] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'when {
            mapping != null ->
                EnumSwitchCodegen(expression, isStatement, isExhaustive, codegen, mapping)
            isIntegralConstantsSwitch(expression, subjectType) ->
                IntegralConstantsSwitchCodegen(expression, isStatement, isExhaustive, codegen)
            isStringConstantsSwitch(expression, subjectType) ->
                StringSwitchCodegen(expression, isStatement, isExhaustive, codegen)
            else -> null
        }' @ [87:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SwitchCodegen?, entry1: SwitchCodegen?, entry2: SwitchCodegen?, entry3: SwitchCodegen?): SwitchCodegen?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SwitchCodegen?

'mapping' @ [88:13] ==> val mapping: WhenByEnumsMapping? defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'EnumSwitchCodegen' @ [89:17] ==> public constructor EnumSwitchCodegen(@NotNull expression: KtWhenExpression, isStatement: Boolean, isExhaustive: Boolean, @NotNull codegen: ExpressionCodegen, @NotNull mapping: WhenByEnumsMapping) defined in org.jetbrains.kotlin.codegen.`when`.EnumSwitchCodegen[JavaClassConstructorDescriptor]

'expression' @ [89:35] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'isStatement' @ [89:47] ==> value-parameter isStatement: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'isExhaustive' @ [89:60] ==> value-parameter isExhaustive: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'codegen' @ [89:74] ==> val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'mapping' @ [89:83] ==> val mapping: WhenByEnumsMapping? defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'isIntegralConstantsSwitch' @ [90:13] ==> private final fun isIntegralConstantsSwitch(expression: KtWhenExpression, subjectType: Type): Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'expression' @ [90:39] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'subjectType' @ [90:51] ==> val subjectType: Type defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'IntegralConstantsSwitchCodegen' @ [91:17] ==> public constructor IntegralConstantsSwitchCodegen(@NotNull expression: KtWhenExpression, isStatement: Boolean, isExhaustive: Boolean, @NotNull codegen: ExpressionCodegen) defined in org.jetbrains.kotlin.codegen.`when`.IntegralConstantsSwitchCodegen[JavaClassConstructorDescriptor]

'expression' @ [91:48] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'isStatement' @ [91:60] ==> value-parameter isStatement: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'isExhaustive' @ [91:73] ==> value-parameter isExhaustive: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'codegen' @ [91:87] ==> val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'isStringConstantsSwitch' @ [92:13] ==> private final fun isStringConstantsSwitch(expression: KtWhenExpression, subjectType: Type): Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'expression' @ [92:37] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'subjectType' @ [92:49] ==> val subjectType: Type defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'StringSwitchCodegen' @ [93:17] ==> public constructor StringSwitchCodegen(@NotNull expression: KtWhenExpression, isStatement: Boolean, isExhaustive: Boolean, @NotNull codegen: ExpressionCodegen) defined in org.jetbrains.kotlin.codegen.`when`.StringSwitchCodegen[JavaClassConstructorDescriptor]

'expression' @ [93:37] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'isStatement' @ [93:49] ==> value-parameter isStatement: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'isExhaustive' @ [93:62] ==> value-parameter isExhaustive: Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[ValueParameterDescriptorImpl]

'codegen' @ [93:76] ==> val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.buildAppropriateSwitchCodegenIfPossible[LocalVariableDescriptor]

'getAllConstants' @ [100:13] ==> public final fun getAllConstants(expression: KtWhenExpression): Iterable<ConstantValue<*>?> defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'expression' @ [100:29] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isThereConstantEntriesButNulls[ValueParameterDescriptorImpl]

'any' @ [100:41] ==> public inline fun <T> Iterable<ConstantValue<*>?>.any(predicate: (ConstantValue<*>?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>?

'it' @ [100:47] ==> value-parameter it: ConstantValue<*>? defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isThereConstantEntriesButNulls.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [100:61] ==> value-parameter it: ConstantValue<*>? defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isThereConstantEntriesButNulls.<anonymous>[ValueParameterDescriptorImpl]

'isIntPrimitive' @ [103:21] ==> public open fun isIntPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'subjectType' @ [103:36] ==> value-parameter subjectType: Type defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isIntegralConstantsSwitch[ValueParameterDescriptorImpl]

'checkAllItemsAreConstantsSatisfying' @ [104:13] ==> public final fun checkAllItemsAreConstantsSatisfying(expression: KtWhenExpression, predicate: (ConstantValue<*>) -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'expression' @ [104:49] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isIntegralConstantsSwitch[ValueParameterDescriptorImpl]

'it' @ [104:63] ==> value-parameter it: ConstantValue<*> defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isIntegralConstantsSwitch.<anonymous>[ValueParameterDescriptorImpl]

'subjectType' @ [107:13] ==> value-parameter subjectType: Type defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isStringConstantsSwitch[ValueParameterDescriptorImpl]

'className' @ [107:25] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'String' @ [107:38] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [107:52] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'name' @ [107:57] ==> public final val <T : (Any..Any?)> Class<String>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'checkAllItemsAreConstantsSatisfying' @ [108:13] ==> public final fun checkAllItemsAreConstantsSatisfying(expression: KtWhenExpression, predicate: (ConstantValue<*>) -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider[SimpleFunctionDescriptorImpl]

'expression' @ [108:49] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isStringConstantsSwitch[ValueParameterDescriptorImpl]

'it' @ [108:63] ==> value-parameter it: ConstantValue<*> defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isStringConstantsSwitch.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [108:84] ==> value-parameter it: ConstantValue<*> defined in org.jetbrains.kotlin.codegen.`when`.SwitchCodegenProvider.isStringConstantsSwitch.<anonymous>[ValueParameterDescriptorImpl]

