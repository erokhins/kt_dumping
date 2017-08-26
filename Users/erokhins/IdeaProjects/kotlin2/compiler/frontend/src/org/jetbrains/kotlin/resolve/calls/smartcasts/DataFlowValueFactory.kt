'JvmStatic' @ [55:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'createDataFlowValue' @ [60:9] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [60:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'type' @ [60:41] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'resolutionContext' @ [60:47] ==> value-parameter resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'trace' @ [60:65] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [60:71] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolutionContext' @ [60:87] ==> value-parameter resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'scope' @ [60:105] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [60:111] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'when(expression) {
        is KtBlockExpression, is KtIfExpression, is KtWhenExpression -> true
        is KtBinaryExpression -> expression.operationToken === KtTokens.ELVIS
        is KtParenthesizedExpression -> {
            val deparenthesized = KtPsiUtil.deparenthesize(expression)
            deparenthesized != null && isComplexExpression(deparenthesized)
        }
        else -> false
    }' @ [62:74] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'expression' @ [62:79] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isComplexExpression[ValueParameterDescriptorImpl]

'expression' @ [64:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isComplexExpression[ValueParameterDescriptorImpl]

'operationToken' @ [64:45] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [64:73] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'deparenthesize' @ [66:45] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [66:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isComplexExpression[ValueParameterDescriptorImpl]

'deparenthesized' @ [67:13] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isComplexExpression[LocalVariableDescriptor]

'isComplexExpression' @ [67:40] ==> private final fun isComplexExpression(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'deparenthesized' @ [67:60] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isComplexExpression[LocalVariableDescriptor]

'JvmStatic' @ [72:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'expression' @ [79:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'expression' @ [80:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'node' @ [80:28] ==> public final val KtConstantExpression.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [80:33] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'NULL' @ [80:61] ==> public final val NULL: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'DataFlowValue' @ [81:24] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[FakeCallableDescriptorForObject]

'nullValue' @ [81:38] ==> @JvmStatic public final fun nullValue(builtIns: KotlinBuiltIns): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Companion[SimpleFunctionDescriptorImpl]

'containingDeclarationOrModule' @ [81:48] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'builtIns' @ [81:78] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'type' @ [84:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'isError' @ [84:18] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'DataFlowValue' @ [84:34] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[FakeCallableDescriptorForObject]

'ERROR' @ [84:48] ==> @JvmField public final val ERROR: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Companion[PropertyDescriptorImpl]

'isNullableNothing' @ [85:13] ==> public open fun isNullableNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [85:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'DataFlowValue' @ [86:20] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[FakeCallableDescriptorForObject]

'nullValue' @ [86:34] ==> @JvmStatic public final fun nullValue(builtIns: KotlinBuiltIns): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Companion[SimpleFunctionDescriptorImpl]

'containingDeclarationOrModule' @ [86:44] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'builtIns' @ [86:74] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'isExclExclExpression' @ [89:35] ==> public open fun isExclExclExpression(@Nullable expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'deparenthesize' @ [89:66] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [89:81] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'DataFlowValue' @ [95:20] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'ExpressionIdentifierInfo' @ [95:34] ==> public constructor ExpressionIdentifierInfo(expression: KtExpression, stableComplex: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[ClassConstructorDescriptorImpl]

'expression' @ [95:59] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'type' @ [96:34] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'NOT_NULL' @ [97:46] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[FakeCallableDescriptorForObject]

'isComplexExpression' @ [100:13] ==> private final fun isComplexExpression(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [100:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'createDataFlowValueForComplexExpression' @ [101:20] ==> private final fun createDataFlowValueForComplexExpression(expression: KtExpression, type: KotlinType): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [101:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'type' @ [101:72] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'getIdForStableIdentifier' @ [104:22] ==> private final fun getIdForStableIdentifier(expression: KtExpression?, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [104:47] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'bindingContext' @ [104:59] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [104:75] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'DataFlowValue' @ [105:16] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'if (result === IdentifierInfo.NO) ExpressionIdentifierInfo(expression) else result' @ [105:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdentifierInfo, elseBranch: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IdentifierInfo

'result' @ [105:34] ==> val result: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[LocalVariableDescriptor]

'IdentifierInfo' @ [105:45] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'NO' @ [105:60] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'ExpressionIdentifierInfo' @ [105:64] ==> public constructor ExpressionIdentifierInfo(expression: KtExpression, stableComplex: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[ClassConstructorDescriptorImpl]

'expression' @ [105:89] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'result' @ [105:106] ==> val result: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[LocalVariableDescriptor]

'type' @ [105:114] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'JvmStatic' @ [108:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DataFlowValue' @ [109:73] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'Receiver' @ [109:102] ==> public constructor Receiver(value: ReceiverValue) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Receiver[ClassConstructorDescriptorImpl]

'receiver' @ [109:111] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForStableReceiver[ValueParameterDescriptorImpl]

'receiver' @ [109:122] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForStableReceiver[ValueParameterDescriptorImpl]

'type' @ [109:131] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'JvmStatic' @ [111:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'createDataFlowValue' @ [115:9] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverValue' @ [115:29] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'resolutionContext' @ [115:44] ==> value-parameter resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'trace' @ [115:62] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [115:68] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolutionContext' @ [115:84] ==> value-parameter resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'scope' @ [115:102] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [115:108] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'JvmStatic' @ [117:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (receiverValue) {
        is TransientReceiver, is ImplicitReceiver -> createDataFlowValueForStableReceiver(receiverValue)
        is ExpressionReceiver -> createDataFlowValue(receiverValue.expression,
                                                     receiverValue.getType(),
                                                     bindingContext,
                                                     containingDeclarationOrModule)
        else -> throw UnsupportedOperationException("Unsupported receiver value: " + receiverValue::class.java.name)
    }' @ [122:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DataFlowValue, entry1: DataFlowValue, entry2: DataFlowValue): DataFlowValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DataFlowValue

'receiverValue' @ [122:15] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'createDataFlowValueForStableReceiver' @ [123:54] ==> @JvmStatic public final fun createDataFlowValueForStableReceiver(receiver: ReceiverValue): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverValue' @ [123:91] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'createDataFlowValue' @ [124:34] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverValue' @ [124:54] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'expression' @ [124:68] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'receiverValue' @ [125:54] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'getType' @ [125:68] ==> @NotNull public abstract fun getType(): KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValue[JavaMethodDescriptor]

'bindingContext' @ [126:54] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [127:54] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [128:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [128:53] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [128:86] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValue[ValueParameterDescriptorImpl]

'java' @ [128:107] ==> public val <T> KClass<out ReceiverValue>.java: Class<out ReceiverValue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out ReceiverValue)

'name' @ [128:112] ==> public final val <T : (Any..Any?)> Class<out ReceiverValue>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out ReceiverValue)

'JvmStatic' @ [131:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DataFlowValue' @ [137:9] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'Variable' @ [137:38] ==> public constructor Variable(variable: VariableDescriptor, kind: DataFlowValue.Kind, bound: DataFlowValue?) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Variable[ClassConstructorDescriptorImpl]

'variableDescriptor' @ [137:47] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'variableKind' @ [138:47] ==> private final fun variableKind(variableDescriptor: VariableDescriptor, usageModule: ModuleDescriptor?, bindingContext: BindingContext, accessElement: KtElement): DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [138:60] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'usageContainingModule' @ [138:80] ==> value-parameter usageContainingModule: ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [139:60] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'property' @ [139:76] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [140:47] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'BOUND_INITIALIZER_VALUE' @ [140:62] ==> public final val BOUND_INITIALIZER_VALUE: (WritableSlice<(VariableDescriptor..VariableDescriptor?), (DataFlowValue..DataFlowValue?)>..WritableSlice<(VariableDescriptor..VariableDescriptor?), (DataFlowValue..DataFlowValue?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDescriptor' @ [140:87] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'variableDescriptor' @ [141:38] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForProperty[ValueParameterDescriptorImpl]

'type' @ [141:57] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'DataFlowValue' @ [146:9] ==> public constructor DataFlowValue(identifierInfo: IdentifierInfo, type: KotlinType, immanentNullability: Nullability = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[ClassConstructorDescriptorImpl]

'ExpressionIdentifierInfo' @ [146:23] ==> public constructor ExpressionIdentifierInfo(expression: KtExpression, stableComplex: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[ClassConstructorDescriptorImpl]

'expression' @ [146:48] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForComplexExpression[ValueParameterDescriptorImpl]

'type' @ [146:83] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.createDataFlowValueForComplexExpression[ValueParameterDescriptorImpl]

'argumentInfo' @ [150:55] ==> public final val argumentInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.PostfixIdentifierInfo[PropertyDescriptorImpl]

'kind' @ [150:68] ==> public open val kind: DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[PropertyDescriptorImpl]

'argumentInfo' @ [152:37] ==> public final val argumentInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.PostfixIdentifierInfo[PropertyDescriptorImpl]

'op' @ [152:51] ==> public final val op: KtToken defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.PostfixIdentifierInfo[PropertyDescriptorImpl]

'if (stableComplex) STABLE_COMPLEX_EXPRESSION else OTHER' @ [157:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowValue.Kind, elseBranch: DataFlowValue.Kind): DataFlowValue.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Kind

'stableComplex' @ [157:33] ==> value-parameter stableComplex: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo.<init>[ValueParameterDescriptorImpl]

'STABLE_COMPLEX_EXPRESSION' @ [157:48] ==> enum entry STABLE_COMPLEX_EXPRESSION defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'OTHER' @ [157:79] ==> enum entry OTHER defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'other' @ [159:44] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo.equals[ValueParameterDescriptorImpl]

'expression' @ [159:81] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[PropertyDescriptorImpl]

'other' @ [159:95] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo.equals[ValueParameterDescriptorImpl]

'expression' @ [159:101] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[PropertyDescriptorImpl]

'expression' @ [161:35] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[PropertyDescriptorImpl]

'hashCode' @ [161:46] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [163:35] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.ExpressionIdentifierInfo[PropertyDescriptorImpl]

'text' @ [163:46] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'if (argumentInfo == IdentifierInfo.NO) {
                IdentifierInfo.NO
            }
            else {
                PostfixIdentifierInfo(argumentInfo, op)
            }' @ [167:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdentifierInfo, elseBranch: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IdentifierInfo

'argumentInfo' @ [167:17] ==> value-parameter argumentInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.postfix[ValueParameterDescriptorImpl]

'NO' @ [167:48] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'NO' @ [168:32] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'PostfixIdentifierInfo' @ [171:17] ==> public constructor PostfixIdentifierInfo(argumentInfo: IdentifierInfo, op: KtToken) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.PostfixIdentifierInfo[ClassConstructorDescriptorImpl]

'argumentInfo' @ [171:39] ==> value-parameter argumentInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.postfix[ValueParameterDescriptorImpl]

'op' @ [171:53] ==> value-parameter op: KtToken defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.postfix[ValueParameterDescriptorImpl]

'expression' @ [179:13] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'deparenthesize' @ [180:45] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [180:60] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'expression' @ [181:17] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'deparenthesized' @ [181:32] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'getIdForStableIdentifier' @ [182:24] ==> private final fun getIdForStableIdentifier(expression: KtExpression?, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'deparenthesized' @ [182:49] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'bindingContext' @ [182:66] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [182:82] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'when (expression) {
            is KtQualifiedExpression -> {
                val receiverExpression = expression.receiverExpression
                val selectorExpression = expression.selectorExpression
                val receiverInfo = getIdForStableIdentifier(receiverExpression, bindingContext, containingDeclarationOrModule)
                val selectorInfo = getIdForStableIdentifier(selectorExpression, bindingContext, containingDeclarationOrModule)

                IdentifierInfo.qualified(receiverInfo, bindingContext.getType(receiverExpression),
                                         selectorInfo, expression.operationSign === KtTokens.SAFE_ACCESS)
            }
            is KtBinaryExpressionWithTypeRHS -> {
                val subjectExpression = expression.left
                val targetTypeReference = expression.right
                val operationToken = expression.operationReference.getReferencedNameElementType()
                if (operationToken == KtTokens.IS_KEYWORD || operationToken == KtTokens.AS_KEYWORD) {
                    IdentifierInfo.NO
                }
                else {
                    IdentifierInfo.SafeCast(getIdForStableIdentifier(subjectExpression, bindingContext, containingDeclarationOrModule),
                                            bindingContext.getType(subjectExpression),
                                            bindingContext[BindingContext.TYPE, targetTypeReference])
                }
            }
            is KtSimpleNameExpression ->
                getIdForSimpleNameExpression(expression, bindingContext, containingDeclarationOrModule)
            is KtThisExpression -> {
                val declarationDescriptor = bindingContext.get(REFERENCE_TARGET, expression.instanceReference)
                getIdForThisReceiver(declarationDescriptor)
            }
            is KtPostfixExpression -> {
                val operationType = expression.operationReference.getReferencedNameElementType()
                if (operationType === KtTokens.PLUSPLUS || operationType === KtTokens.MINUSMINUS) {
                    postfix(getIdForStableIdentifier(expression.baseExpression, bindingContext, containingDeclarationOrModule),
                            operationType)
                }
                else {
                    IdentifierInfo.NO
                }
            }
            else -> IdentifierInfo.NO
        }' @ [185:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IdentifierInfo, entry1: IdentifierInfo, entry2: IdentifierInfo, entry3: IdentifierInfo, entry4: IdentifierInfo, entry5: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IdentifierInfo

'expression' @ [185:22] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'expression' @ [187:42] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'receiverExpression' @ [187:53] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [188:42] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'selectorExpression' @ [188:53] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'getIdForStableIdentifier' @ [189:36] ==> private final fun getIdForStableIdentifier(expression: KtExpression?, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [189:61] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'bindingContext' @ [189:81] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [189:97] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'getIdForStableIdentifier' @ [190:36] ==> private final fun getIdForStableIdentifier(expression: KtExpression?, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [190:61] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'bindingContext' @ [190:81] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [190:97] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'qualified' @ [192:32] ==> public final fun qualified(receiverInfo: IdentifierInfo, receiverType: KotlinType?, selectorInfo: IdentifierInfo, safe: Boolean): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Companion[SimpleFunctionDescriptorImpl]

'receiverInfo' @ [192:42] ==> val receiverInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'bindingContext' @ [192:56] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'getType' @ [192:71] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'receiverExpression' @ [192:79] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'selectorInfo' @ [193:42] ==> val selectorInfo: IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'expression' @ [193:56] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'operationSign' @ [193:67] ==> public open val operationSign: KtSingleValueToken defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'SAFE_ACCESS' @ [193:94] ==> public final val SAFE_ACCESS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [196:41] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'left' @ [196:52] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'expression' @ [197:43] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'right' @ [197:54] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'expression' @ [198:38] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'operationReference' @ [198:49] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [198:68] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'if (operationToken == KtTokens.IS_KEYWORD || operationToken == KtTokens.AS_KEYWORD) {
                    IdentifierInfo.NO
                }
                else {
                    IdentifierInfo.SafeCast(getIdForStableIdentifier(subjectExpression, bindingContext, containingDeclarationOrModule),
                                            bindingContext.getType(subjectExpression),
                                            bindingContext[BindingContext.TYPE, targetTypeReference])
                }' @ [199:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdentifierInfo, elseBranch: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IdentifierInfo

'operationToken' @ [199:21] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'IS_KEYWORD' @ [199:48] ==> public final val IS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationToken' @ [199:62] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'AS_KEYWORD' @ [199:89] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NO' @ [200:36] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'SafeCast' @ [203:36] ==> public constructor SafeCast(subjectInfo: IdentifierInfo, subjectType: KotlinType?, targetType: KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.SafeCast[ClassConstructorDescriptorImpl]

'getIdForStableIdentifier' @ [203:45] ==> private final fun getIdForStableIdentifier(expression: KtExpression?, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'subjectExpression' @ [203:70] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'bindingContext' @ [203:89] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [203:105] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'bindingContext' @ [204:45] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'getType' @ [204:60] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'subjectExpression' @ [204:68] ==> val subjectExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'bindingContext' @ [205:45] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'TYPE' @ [205:75] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetTypeReference' @ [205:81] ==> val targetTypeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'getIdForSimpleNameExpression' @ [209:17] ==> private final fun getIdForSimpleNameExpression(simpleNameExpression: KtSimpleNameExpression, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [209:46] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'bindingContext' @ [209:58] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [209:74] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'bindingContext' @ [211:45] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'get' @ [211:60] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [211:64] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [211:82] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'instanceReference' @ [211:93] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'getIdForThisReceiver' @ [212:17] ==> private final fun getIdForThisReceiver(descriptorOfThisReceiver: DeclarationDescriptor?): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [212:38] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'expression' @ [215:37] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'operationReference' @ [215:48] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [215:67] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'if (operationType === KtTokens.PLUSPLUS || operationType === KtTokens.MINUSMINUS) {
                    postfix(getIdForStableIdentifier(expression.baseExpression, bindingContext, containingDeclarationOrModule),
                            operationType)
                }
                else {
                    IdentifierInfo.NO
                }' @ [216:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdentifierInfo, elseBranch: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IdentifierInfo

'operationType' @ [216:21] ==> val operationType: IElementType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'PLUSPLUS' @ [216:48] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationType' @ [216:60] ==> val operationType: IElementType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'MINUSMINUS' @ [216:87] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'postfix' @ [217:21] ==> private final fun postfix(argumentInfo: IdentifierInfo, op: KtToken): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'getIdForStableIdentifier' @ [217:29] ==> private final fun getIdForStableIdentifier(expression: KtExpression?, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [217:54] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'baseExpression' @ [217:65] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'bindingContext' @ [217:81] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [217:97] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[ValueParameterDescriptorImpl]

'operationType' @ [218:29] ==> val operationType: IElementType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForStableIdentifier[LocalVariableDescriptor]

'NO' @ [221:36] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'NO' @ [224:36] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'bindingContext' @ [233:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'get' @ [233:52] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [233:56] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'simpleNameExpression' @ [233:74] ==> value-parameter simpleNameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'when (declarationDescriptor) {
            is VariableDescriptor -> {
                val resolvedCall = simpleNameExpression.getResolvedCall(bindingContext)

                // todo uncomment assert
                // KT-4113
                // for now it fails for resolving 'invoke' convention, return it after 'invoke' algorithm changes
                // assert resolvedCall != null : "Cannot create right identifier info if the resolved call is not known yet for
                val usageModuleDescriptor = DescriptorUtils.getContainingModuleOrNull(containingDeclarationOrModule)
                val selectorInfo = IdentifierInfo.Variable(declarationDescriptor,
                                                           variableKind(declarationDescriptor, usageModuleDescriptor,
                                                                        bindingContext, simpleNameExpression),
                                                           bindingContext[BOUND_INITIALIZER_VALUE, declarationDescriptor])

                val implicitReceiver = resolvedCall?.dispatchReceiver
                if (implicitReceiver == null) {
                    selectorInfo
                }
                else {
                    val receiverInfo = getIdForImplicitReceiver(implicitReceiver, simpleNameExpression)

                    if (receiverInfo == null) {
                        selectorInfo
                    }
                    else {
                        IdentifierInfo.qualified(receiverInfo, implicitReceiver.type,
                                                 selectorInfo, resolvedCall.call.isSafeCall())
                    }
                }
            }
            is PackageViewDescriptor, is ClassDescriptor -> IdentifierInfo.PackageOrClass(declarationDescriptor)
            else -> IdentifierInfo.NO
        }' @ [234:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IdentifierInfo, entry1: IdentifierInfo, entry2: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IdentifierInfo

'declarationDescriptor' @ [234:22] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'simpleNameExpression' @ [236:36] ==> value-parameter simpleNameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [236:57] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [236:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'getContainingModuleOrNull' @ [242:61] ==> @Nullable public open fun getContainingModuleOrNull(@NotNull p0: DeclarationDescriptor): ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclarationOrModule' @ [242:87] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'IdentifierInfo' @ [243:36] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'Variable' @ [243:51] ==> public constructor Variable(variable: VariableDescriptor, kind: DataFlowValue.Kind, bound: DataFlowValue?) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Variable[ClassConstructorDescriptorImpl]

'declarationDescriptor' @ [243:60] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'variableKind' @ [244:60] ==> private final fun variableKind(variableDescriptor: VariableDescriptor, usageModule: ModuleDescriptor?, bindingContext: BindingContext, accessElement: KtElement): DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [244:73] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'usageModuleDescriptor' @ [244:96] ==> val usageModuleDescriptor: ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'bindingContext' @ [245:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'simpleNameExpression' @ [245:89] ==> value-parameter simpleNameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [246:60] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'BOUND_INITIALIZER_VALUE' @ [246:75] ==> public final val BOUND_INITIALIZER_VALUE: (WritableSlice<(VariableDescriptor..VariableDescriptor?), (DataFlowValue..DataFlowValue?)>..WritableSlice<(VariableDescriptor..VariableDescriptor?), (DataFlowValue..DataFlowValue?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declarationDescriptor' @ [246:100] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [248:40] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'dispatchReceiver' @ [248:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'if (implicitReceiver == null) {
                    selectorInfo
                }
                else {
                    val receiverInfo = getIdForImplicitReceiver(implicitReceiver, simpleNameExpression)

                    if (receiverInfo == null) {
                        selectorInfo
                    }
                    else {
                        IdentifierInfo.qualified(receiverInfo, implicitReceiver.type,
                                                 selectorInfo, resolvedCall.call.isSafeCall())
                    }
                }' @ [249:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdentifierInfo, elseBranch: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IdentifierInfo

'implicitReceiver' @ [249:21] ==> val implicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'selectorInfo' @ [250:21] ==> val selectorInfo: IdentifierInfo.Variable defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'getIdForImplicitReceiver' @ [253:40] ==> private final fun getIdForImplicitReceiver(receiverValue: ReceiverValue?, expression: KtExpression?): IdentifierInfo? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'implicitReceiver' @ [253:65] ==> val implicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'simpleNameExpression' @ [253:83] ==> value-parameter simpleNameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[ValueParameterDescriptorImpl]

'if (receiverInfo == null) {
                        selectorInfo
                    }
                    else {
                        IdentifierInfo.qualified(receiverInfo, implicitReceiver.type,
                                                 selectorInfo, resolvedCall.call.isSafeCall())
                    }' @ [255:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IdentifierInfo, elseBranch: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IdentifierInfo

'receiverInfo' @ [255:25] ==> val receiverInfo: IdentifierInfo? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'selectorInfo' @ [256:25] ==> val selectorInfo: IdentifierInfo.Variable defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'qualified' @ [259:40] ==> public final fun qualified(receiverInfo: IdentifierInfo, receiverType: KotlinType?, selectorInfo: IdentifierInfo, safe: Boolean): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Companion[SimpleFunctionDescriptorImpl]

'receiverInfo' @ [259:50] ==> val receiverInfo: IdentifierInfo? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'implicitReceiver' @ [259:64] ==> val implicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'type' @ [259:81] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'selectorInfo' @ [260:50] ==> val selectorInfo: IdentifierInfo.Variable defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'resolvedCall' @ [260:64] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'call' @ [260:77] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'isSafeCall' @ [260:82] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'PackageOrClass' @ [264:76] ==> public constructor PackageOrClass(descriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.PackageOrClass[ClassConstructorDescriptorImpl]

'declarationDescriptor' @ [264:91] ==> val declarationDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForSimpleNameExpression[LocalVariableDescriptor]

'NO' @ [265:36] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'when (receiverValue) {
                is ImplicitReceiver -> getIdForThisReceiver(receiverValue.declarationDescriptor)
                is TransientReceiver ->
                    throw AssertionError("Transient receiver is implicit for an explicit expression: $expression. Receiver: $receiverValue")
                else -> null
            }' @ [270:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IdentifierInfo?, entry1: IdentifierInfo?, entry2: IdentifierInfo?): IdentifierInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IdentifierInfo?

'receiverValue' @ [270:19] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForImplicitReceiver[ValueParameterDescriptorImpl]

'getIdForThisReceiver' @ [271:40] ==> private final fun getIdForThisReceiver(descriptorOfThisReceiver: DeclarationDescriptor?): IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverValue' @ [271:61] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForImplicitReceiver[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [271:75] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'AssertionError' @ [273:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expression' @ [273:103] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForImplicitReceiver[ValueParameterDescriptorImpl]

'receiverValue' @ [273:126] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForImplicitReceiver[ValueParameterDescriptorImpl]

'when (descriptorOfThisReceiver) {
        is CallableDescriptor -> {
            val receiverParameter = descriptorOfThisReceiver.extensionReceiverParameter
                                    ?: error("'This' refers to the callable member without a receiver parameter: $descriptorOfThisReceiver")
            IdentifierInfo.Receiver(receiverParameter.value)
        }
        is ClassDescriptor -> IdentifierInfo.Receiver(descriptorOfThisReceiver.thisAsReceiverParameter.value)
        else -> IdentifierInfo.NO
    }' @ [277:90] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IdentifierInfo, entry1: IdentifierInfo, entry2: IdentifierInfo): IdentifierInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IdentifierInfo

'descriptorOfThisReceiver' @ [277:96] ==> value-parameter descriptorOfThisReceiver: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForThisReceiver[ValueParameterDescriptorImpl]

'descriptorOfThisReceiver' @ [279:37] ==> value-parameter descriptorOfThisReceiver: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForThisReceiver[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [279:62] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'error' @ [280:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptorOfThisReceiver' @ [280:115] ==> value-parameter descriptorOfThisReceiver: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForThisReceiver[ValueParameterDescriptorImpl]

'Receiver' @ [281:28] ==> public constructor Receiver(value: ReceiverValue) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Receiver[ClassConstructorDescriptorImpl]

'receiverParameter' @ [281:37] ==> val receiverParameter: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForThisReceiver[LocalVariableDescriptor]

'value' @ [281:55] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'Receiver' @ [283:46] ==> public constructor Receiver(value: ReceiverValue) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo.Receiver[ClassConstructorDescriptorImpl]

'descriptorOfThisReceiver' @ [283:55] ==> value-parameter descriptorOfThisReceiver: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.getIdForThisReceiver[ValueParameterDescriptorImpl]

'thisAsReceiverParameter' @ [283:80] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'value' @ [283:104] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'NO' @ [284:32] ==> public object NO : IdentifierInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.IdentifierInfo[FakeCallableDescriptorForObject]

'ControlFlowInformationProvider' @ [292:22] ==> public companion object defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[FakeCallableDescriptorForObject]

'getElementParentDeclaration' @ [292:53] ==> public final fun getElementParentDeclaration(element: KtElement): KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'accessElement' @ [292:81] ==> value-parameter accessElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosure[ValueParameterDescriptorImpl]

'if (parent != null)
            // Access is at the same declaration: not in closure, lower: in closure
            ControlFlowInformationProvider.getDeclarationDescriptorIncludingConstructors(bindingContext, parent) !=
                    variableContainingDeclaration
        else
            false' @ [293:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'parent' @ [293:20] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosure[LocalVariableDescriptor]

'ControlFlowInformationProvider' @ [295:13] ==> public companion object defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[FakeCallableDescriptorForObject]

'getDeclarationDescriptorIncludingConstructors' @ [295:44] ==> public final fun getDeclarationDescriptorIncludingConstructors(context: BindingContext, declaration: KtDeclaration?): DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [295:90] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosure[ValueParameterDescriptorImpl]

'parent' @ [295:106] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosure[LocalVariableDescriptor]

'variableContainingDeclaration' @ [296:21] ==> value-parameter variableContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosure[ValueParameterDescriptorImpl]

'writers' @ [306:16] ==> value-parameter writers: Set<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures[ValueParameterDescriptorImpl]

'none' @ [306:24] ==> public inline fun <T> Iterable<AssignedVariablesSearcher.Writer>.none(predicate: (AssignedVariablesSearcher.Writer) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Writer

'component1' @ [306:32] ==> public final operator fun component1(): KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer[SimpleFunctionDescriptorImpl]

'component2' @ [306:35] ==> public final operator fun component2(): KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer[SimpleFunctionDescriptorImpl]

'writerDeclaration' @ [307:36] ==> val writerDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures.<anonymous>[LocalVariableDescriptor]

'let' @ [307:55] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> DeclarationDescriptor?

'ControlFlowInformationProvider' @ [308:17] ==> public companion object defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[FakeCallableDescriptorForObject]

'getDeclarationDescriptorIncludingConstructors' @ [308:48] ==> public final fun getDeclarationDescriptorIncludingConstructors(context: BindingContext, declaration: KtDeclaration?): DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [308:94] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures[ValueParameterDescriptorImpl]

'it' @ [308:110] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'writerDeclaration' @ [310:13] ==> val writerDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures.<anonymous>[LocalVariableDescriptor]

'variableContainingDeclaration' @ [310:42] ==> value-parameter variableContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures[ValueParameterDescriptorImpl]

'writerDescriptor' @ [310:75] ==> val writerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasNoWritersInClosures.<anonymous>[LocalVariableDescriptor]

'?:' @ [318:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDeclaration?, right: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDeclaration

'getElementParentDeclaration' @ [318:53] ==> public final fun getElementParentDeclaration(element: KtElement): KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'accessElement' @ [318:81] ==> value-parameter accessElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosureAfterAllWriters[ValueParameterDescriptorImpl]

'writers' @ [319:16] ==> value-parameter writers: Set<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosureAfterAllWriters[ValueParameterDescriptorImpl]

'none' @ [319:24] ==> public inline fun <T> Iterable<AssignedVariablesSearcher.Writer>.none(predicate: (AssignedVariablesSearcher.Writer) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Writer

'component1' @ [319:32] ==> public final operator fun component1(): KtBinaryExpression defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer[SimpleFunctionDescriptorImpl]

'!' @ [319:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'assignment' @ [319:48] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosureAfterAllWriters.<anonymous>[LocalVariableDescriptor]

'before' @ [319:59] ==> public fun PsiElement.before(element: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'parent' @ [319:66] ==> val parent: KtDeclaration defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedInsideClosureAfterAllWriters[LocalVariableDescriptor]

'writers' @ [330:9] ==> value-parameter writers: Set<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters[ValueParameterDescriptorImpl]

'mapNotNull' @ [330:17] ==> public inline fun <T, R : Any> Iterable<AssignedVariablesSearcher.Writer>.mapNotNull(transform: (AssignedVariablesSearcher.Writer) -> KtDeclaration?): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Writer
    <R : Any> -> KtDeclaration

'it' @ [330:30] ==> value-parameter it: AssignedVariablesSearcher.Writer defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [330:33] ==> public final val declaration: KtDeclaration? defined in org.jetbrains.kotlin.types.expressions.AssignedVariablesSearcher.Writer[PropertyDescriptorImpl]

'forEach' @ [330:47] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'ControlFlowInformationProvider' @ [331:36] ==> public companion object defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[FakeCallableDescriptorForObject]

'getDeclarationDescriptorIncludingConstructors' @ [331:67] ==> public final fun getDeclarationDescriptorIncludingConstructors(context: BindingContext, declaration: KtDeclaration?): DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [332:21] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters[ValueParameterDescriptorImpl]

'writerDeclaration' @ [332:37] ==> value-parameter writerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters.<anonymous>[ValueParameterDescriptorImpl]

'variableContainingDeclaration' @ [334:17] ==> value-parameter variableContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters[ValueParameterDescriptorImpl]

'writerDescriptor' @ [334:50] ==> val writerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters.<anonymous>[LocalVariableDescriptor]

'!' @ [334:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'accessElement' @ [334:71] ==> value-parameter accessElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters[ValueParameterDescriptorImpl]

'before' @ [334:85] ==> public fun PsiElement.before(element: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'writerDeclaration' @ [334:92] ==> value-parameter writerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isAccessedBeforeAllClosureWriters.<anonymous>[ValueParameterDescriptorImpl]

'propertyDescriptor' @ [343:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'isVar' @ [343:32] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'MUTABLE_PROPERTY' @ [343:46] ==> enum entry MUTABLE_PROPERTY defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'propertyDescriptor' @ [344:13] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'isOverridable' @ [344:32] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'PROPERTY_WITH_GETTER' @ [344:54] ==> enum entry PROPERTY_WITH_GETTER defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'!' @ [345:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasDefaultGetter' @ [345:14] ==> private final fun hasDefaultGetter(propertyDescriptor: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [345:31] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'PROPERTY_WITH_GETTER' @ [345:59] ==> enum entry PROPERTY_WITH_GETTER defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'!' @ [346:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invisibleFromOtherModules' @ [346:14] ==> private final fun invisibleFromOtherModules(descriptor: DeclarationDescriptorWithVisibility): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'propertyDescriptor' @ [346:40] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'getContainingModule' @ [347:53] ==> @NotNull public open fun getContainingModule(@NotNull p0: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'propertyDescriptor' @ [347:73] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'usageModule' @ [348:17] ==> value-parameter usageModule: ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'usageModule' @ [348:40] ==> value-parameter usageModule: ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[ValueParameterDescriptorImpl]

'declarationModule' @ [348:55] ==> val declarationModule: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.propertyKind[LocalVariableDescriptor]

'ALIEN_PUBLIC_PROPERTY' @ [349:24] ==> enum entry ALIEN_PUBLIC_PROPERTY defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'STABLE_VALUE' @ [352:16] ==> enum entry STABLE_VALUE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'variableDescriptor' @ [361:13] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'propertyKind' @ [362:20] ==> private final fun propertyKind(propertyDescriptor: PropertyDescriptor, usageModule: ModuleDescriptor?): DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [362:33] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'usageModule' @ [362:53] ==> value-parameter usageModule: ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'variableDescriptor' @ [364:13] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'variableDescriptor' @ [364:63] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'OTHER' @ [364:114] ==> enum entry OTHER defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'!' @ [365:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [365:14] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'isVar' @ [365:33] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'STABLE_VALUE' @ [365:47] ==> enum entry STABLE_VALUE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'variableDescriptor' @ [366:13] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'MUTABLE_PROPERTY' @ [366:68] ==> enum entry MUTABLE_PROPERTY defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'?:' @ [369:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PreliminaryDeclarationVisitor?, right: PreliminaryDeclarationVisitor): PreliminaryDeclarationVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PreliminaryDeclarationVisitor

'getVisitorByVariable' @ [369:64] ==> public final fun getVisitorByVariable(variableDescriptor: VariableDescriptor, bindingContext: BindingContext): PreliminaryDeclarationVisitor? defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [369:85] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'bindingContext' @ [369:105] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'CAPTURED_VARIABLE' @ [371:44] ==> enum entry CAPTURED_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'preliminaryVisitor' @ [375:23] ==> val preliminaryVisitor: PreliminaryDeclarationVisitor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'writers' @ [375:42] ==> public open fun writers(variableDescriptor: VariableDescriptor): MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [375:50] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'writers' @ [376:13] ==> val writers: MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'isEmpty' @ [376:21] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'STABLE_VARIABLE' @ [376:39] ==> enum entry STABLE_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'variableDescriptor' @ [379:45] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'containingDeclaration' @ [379:64] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isAccessedInsideClosure' @ [380:13] ==> private final fun isAccessedInsideClosure(variableContainingDeclaration: DeclarationDescriptor, bindingContext: BindingContext, accessElement: KtElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'variableContainingDeclaration' @ [380:37] ==> val variableContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'bindingContext' @ [380:68] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'accessElement' @ [380:84] ==> value-parameter accessElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'if (preliminaryVisitor.languageVersionSettings.supportsFeature(LanguageFeature.CapturedInClosureSmartCasts) &&
                       hasNoWritersInClosures(variableContainingDeclaration, writers, bindingContext) &&
                       isAccessedInsideClosureAfterAllWriters(writers, accessElement)) {
                STABLE_VARIABLE
            }
            else {
                CAPTURED_VARIABLE
            }' @ [382:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowValue.Kind, elseBranch: DataFlowValue.Kind): DataFlowValue.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Kind

'preliminaryVisitor' @ [382:24] ==> val preliminaryVisitor: PreliminaryDeclarationVisitor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'languageVersionSettings' @ [382:43] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[PropertyDescriptorImpl]

'supportsFeature' @ [382:67] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'CapturedInClosureSmartCasts' @ [382:99] ==> enum entry CapturedInClosureSmartCasts defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'hasNoWritersInClosures' @ [383:24] ==> private final fun hasNoWritersInClosures(variableContainingDeclaration: DeclarationDescriptor, writers: Set<AssignedVariablesSearcher.Writer>, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'variableContainingDeclaration' @ [383:47] ==> val variableContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'writers' @ [383:78] ==> val writers: MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'bindingContext' @ [383:87] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'isAccessedInsideClosureAfterAllWriters' @ [384:24] ==> private final fun isAccessedInsideClosureAfterAllWriters(writers: Set<AssignedVariablesSearcher.Writer>, accessElement: KtElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'writers' @ [384:63] ==> val writers: MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'accessElement' @ [384:72] ==> value-parameter accessElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'STABLE_VARIABLE' @ [385:17] ==> enum entry STABLE_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'CAPTURED_VARIABLE' @ [388:17] ==> enum entry CAPTURED_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'if (isAccessedBeforeAllClosureWriters(variableContainingDeclaration, writers, bindingContext, accessElement))
            STABLE_VARIABLE
        else
            CAPTURED_VARIABLE' @ [393:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowValue.Kind, elseBranch: DataFlowValue.Kind): DataFlowValue.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Kind

'isAccessedBeforeAllClosureWriters' @ [393:20] ==> private final fun isAccessedBeforeAllClosureWriters(variableContainingDeclaration: DeclarationDescriptor, writers: Set<AssignedVariablesSearcher.Writer>, bindingContext: BindingContext, accessElement: KtElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'variableContainingDeclaration' @ [393:54] ==> val variableContainingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'writers' @ [393:85] ==> val writers: MutableSet<AssignedVariablesSearcher.Writer> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[LocalVariableDescriptor]

'bindingContext' @ [393:94] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'accessElement' @ [393:110] ==> value-parameter accessElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.variableKind[ValueParameterDescriptorImpl]

'STABLE_VARIABLE' @ [394:13] ==> enum entry STABLE_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'CAPTURED_VARIABLE' @ [396:13] ==> enum entry CAPTURED_VARIABLE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'variableDescriptor' @ [421:13] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isStableValue[ValueParameterDescriptorImpl]

'isVar' @ [421:32] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'variableDescriptor' @ [422:16] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isStableValue[ValueParameterDescriptorImpl]

'propertyKind' @ [422:61] ==> private final fun propertyKind(propertyDescriptor: PropertyDescriptor, usageModule: ModuleDescriptor?): DataFlowValue.Kind defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [422:74] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isStableValue[ValueParameterDescriptorImpl]

'usageModule' @ [422:94] ==> value-parameter usageModule: ModuleDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.isStableValue[ValueParameterDescriptorImpl]

'STABLE_VALUE' @ [422:111] ==> enum entry STABLE_VALUE defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Kind[FakeCallableDescriptorForObject]

'INVISIBLE_FROM_OTHER_MODULES' @ [426:26] ==> public final val INVISIBLE_FROM_OTHER_MODULES: (MutableSet<(Visibility..Visibility?)>..Set<(Visibility..Visibility?)>?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'contains' @ [426:55] ==> public abstract fun contains(element: (Visibility..Visibility?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [426:64] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.invisibleFromOtherModules[ValueParameterDescriptorImpl]

'visibility' @ [426:75] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'descriptor' @ [428:37] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.invisibleFromOtherModules[ValueParameterDescriptorImpl]

'containingDeclaration' @ [428:48] ==> public final val DeclarationDescriptorWithVisibility.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'containingDeclaration' @ [429:16] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.invisibleFromOtherModules[LocalVariableDescriptor]

'invisibleFromOtherModules' @ [429:80] ==> private final fun invisibleFromOtherModules(descriptor: DeclarationDescriptorWithVisibility): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [429:106] ==> val containingDeclaration: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.invisibleFromOtherModules[LocalVariableDescriptor]

'propertyDescriptor' @ [433:22] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasDefaultGetter[ValueParameterDescriptorImpl]

'getter' @ [433:41] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'getter' @ [434:16] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasDefaultGetter[LocalVariableDescriptor]

'getter' @ [434:34] ==> val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory.hasDefaultGetter[LocalVariableDescriptor]

'isDefault' @ [434:41] ==> public final val PropertyGetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

