'Inject' @ [80:5] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'this' @ [82:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[LazyClassReceiverParameterDescriptor]

'expressionTypingServices' @ [82:14] ==> private final lateinit var expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'expressionTypingServices' @ [82:41] ==> value-parameter expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.setExpressionTypingServices[ValueParameterDescriptorImpl]

'callResolver' @ [91:23] ==> private final val callResolver: CallResolver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'resolveFunctionCall' @ [91:36] ==> @NotNull public open fun resolveFunctionCall(@NotNull context: BasicCallResolutionContext): OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'create' @ [91:83] ==> @NotNull public open fun create(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull call: Call, @NotNull checkArguments: CheckArgumentTypesMode, @Nullable dataFlowInfoForArguments: MutableDataFlowInfoForArguments?): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [92:17] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[ValueParameterDescriptorImpl]

'call' @ [92:26] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[ValueParameterDescriptorImpl]

'checkArguments' @ [92:32] ==> value-parameter checkArguments: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[ValueParameterDescriptorImpl]

'DataFlowInfoForArgumentsImpl' @ [92:48] ==> public constructor DataFlowInfoForArgumentsImpl(@NotNull initialInfo: DataFlowInfo, @NotNull call: Call) defined in org.jetbrains.kotlin.resolve.calls.model.DataFlowInfoForArgumentsImpl[JavaClassConstructorDescriptor]

'initialDataFlowInfoForArguments' @ [92:77] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[ValueParameterDescriptorImpl]

'call' @ [92:110] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[ValueParameterDescriptorImpl]

'if (!results.isNothing) Pair(true, OverloadResolutionResultsUtil.getResultingCall(results, context.contextDependency))
        else Pair(false, null)' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Boolean, ResolvedCall<FunctionDescriptor>?>, elseBranch: Pair<Boolean, ResolvedCall<FunctionDescriptor>?>): Pair<Boolean, ResolvedCall<FunctionDescriptor>?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Boolean, ResolvedCall<FunctionDescriptor>?>

'!' @ [93:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'results' @ [93:21] ==> val results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[LocalVariableDescriptor]

'isNothing' @ [93:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>.isNothing: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'Pair' @ [93:40] ==> public constructor Pair<out A, out B>(first: Boolean, second: ResolvedCall<FunctionDescriptor>?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> ResolvedCall<FunctionDescriptor>?

'getResultingCall' @ [93:81] ==> @Nullable public open fun <D : (CallableDescriptor..CallableDescriptor?)> getResultingCall(@NotNull results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>, @NotNull contextDependency: ContextDependency): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'results' @ [93:98] ==> val results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[LocalVariableDescriptor]

'context' @ [93:107] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction[ValueParameterDescriptorImpl]

'contextDependency' @ [93:115] ==> @NotNull public final val contextDependency: ContextDependency defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'Pair' @ [94:14] ==> public constructor Pair<out A, out B>(first: Boolean, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Nothing?

'create' @ [101:59] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [102:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'nameExpression' @ [102:76] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'makePropertyCall' @ [103:30] ==> @NotNull public open fun makePropertyCall(@Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, @NotNull nameExpression: KtSimpleNameExpression): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'receiver' @ [103:47] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'callOperationNode' @ [103:57] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'nameExpression' @ [103:76] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'create' @ [104:61] ==> @NotNull public open fun create(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull call: Call, @NotNull checkArguments: CheckArgumentTypesMode): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [105:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [105:25] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForVariable' @ [105:46] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'call' @ [106:17] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [106:46] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'callResolver' @ [107:32] ==> private final val callResolver: CallResolver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'resolveSimpleProperty' @ [107:45] ==> @NotNull public open fun resolveSimpleProperty(@NotNull context: BasicCallResolutionContext): OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'contextForVariable' @ [107:67] ==> val contextForVariable: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'isLHSOfDot' @ [110:36] ==> public open fun isLHSOfDot(@NotNull expression: KtExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'nameExpression' @ [110:47] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[ValueParameterDescriptorImpl]

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolutionResult' @ [111:14] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'isNothing' @ [111:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.isNothing: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'resolutionResult' @ [111:44] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'resultCode' @ [111:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'CANDIDATES_WITH_WRONG_RECEIVER' @ [111:75] ==> enum entry CANDIDATES_WITH_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'isLHSOfDot' @ [112:31] ==> val isLHSOfDot: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'resolutionResult' @ [113:31] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'isSingleResult' @ [113:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'resolutionResult' @ [114:31] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'resultingDescriptor' @ [114:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.resultingDescriptor: (VariableDescriptor..VariableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'!' @ [115:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isQualifier' @ [115:18] ==> val isQualifier: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'temporaryForVariable' @ [116:17] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'commit' @ [116:38] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'Pair' @ [117:24] ==> public constructor Pair<out A, out B>(first: Boolean, second: KotlinType?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> KotlinType?

'if (resolutionResult.isSingleResult) resolutionResult.resultingDescriptor.returnType else null' @ [117:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'resolutionResult' @ [117:39] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'isSingleResult' @ [117:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'resolutionResult' @ [117:72] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'resultingDescriptor' @ [117:89] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.resultingDescriptor: (VariableDescriptor..VariableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'returnType' @ [117:109] ==> public final val VariableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'temporaryForVariable' @ [121:9] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'commit' @ [121:30] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'Pair' @ [122:16] ==> public constructor Pair<out A, out B>(first: Boolean, second: KotlinType?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> KotlinType?

'!' @ [122:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolutionResult' @ [122:22] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'isNothing' @ [122:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.isNothing: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'if (resolutionResult.isSingleResult) resolutionResult.resultingDescriptor.returnType else null' @ [123:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'resolutionResult' @ [123:25] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'isSingleResult' @ [123:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'resolutionResult' @ [123:58] ==> val resolutionResult: OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getVariableType[LocalVariableDescriptor]

'resultingDescriptor' @ [123:75] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)>.resultingDescriptor: (VariableDescriptor..VariableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'returnType' @ [123:95] ==> public final val VariableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'getSimpleNameExpressionTypeInfo' @ [129:9] ==> private final fun getSimpleNameExpressionTypeInfo(nameExpression: KtSimpleNameExpression, receiver: Receiver?, callOperationNode: ASTNode?, context: ExpressionTypingContext, initialDataFlowInfoForArguments: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'nameExpression' @ [129:41] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [129:57] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'callOperationNode' @ [129:67] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [129:86] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [129:95] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [129:103] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'create' @ [137:59] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [138:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'nameExpression' @ [138:58] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'component1' @ [139:14] ==> public final operator fun component1(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [139:26] ==> public final operator fun component2(): KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getVariableType' @ [139:34] ==> private final fun getVariableType(nameExpression: KtSimpleNameExpression, receiver: Receiver?, callOperationNode: ASTNode?, context: ExpressionTypingContext): Pair<Boolean, KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'nameExpression' @ [139:50] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [139:66] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'callOperationNode' @ [139:76] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [140:50] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [140:58] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForVariable' @ [140:79] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'notNothing' @ [142:13] ==> val notNothing: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'temporaryForVariable' @ [143:13] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'commit' @ [143:34] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'createTypeInfo' @ [144:20] ==> public fun createTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'type' @ [144:35] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'initialDataFlowInfoForArguments' @ [144:41] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'makeCall' @ [147:30] ==> @NotNull public open fun makeCall(callElement: (KtElement..KtElement?), @Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, calleeExpression: (KtExpression..KtExpression?), arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>?)): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'nameExpression' @ [147:39] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [147:55] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'callOperationNode' @ [147:65] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'nameExpression' @ [147:84] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'emptyList' @ [147:100] ==> public fun <T> emptyList(): List<(ValueArgument..ValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'create' @ [148:59] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [149:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'nameExpression' @ [149:58] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [150:26] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [150:34] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForFunction' @ [150:55] ==> val temporaryForFunction: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'component1' @ [151:14] ==> public final operator fun component1(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [151:29] ==> public final operator fun component2(): ResolvedCall<FunctionDescriptor>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getResolvedCallForFunction' @ [151:45] ==> private final fun getResolvedCallForFunction(call: Call, context: ResolutionContext<*>, checkArguments: CheckArgumentTypesMode, initialDataFlowInfoForArguments: DataFlowInfo): Pair<Boolean, ResolvedCall<FunctionDescriptor>?> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'call' @ [152:17] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'newContext' @ [152:23] ==> val newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [152:58] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'initialDataFlowInfoForArguments' @ [152:81] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'resolveResult' @ [153:13] ==> val resolveResult: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'resolvedCall' @ [154:38] ==> val resolvedCall: ResolvedCall<FunctionDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'resultingDescriptor' @ [154:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'functionDescriptor' @ [155:17] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'temporaryForFunction' @ [156:17] ==> val temporaryForFunction: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'commit' @ [156:38] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'functionDescriptor' @ [157:42] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'functionDescriptor' @ [157:72] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'valueParameters' @ [157:91] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [157:107] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'context' @ [158:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [158:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [158:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'FUNCTION_CALL_EXPECTED' @ [158:38] ==> public final val FUNCTION_CALL_EXPECTED: (DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (Boolean..Boolean?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [158:61] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: KtExpression, @NotNull b: Boolean): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'nameExpression' @ [158:64] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'nameExpression' @ [158:80] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'hasValueParameters' @ [158:96] ==> val hasValueParameters: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'createTypeInfo' @ [159:24] ==> public fun createTypeInfo(type: KotlinType?, context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [159:39] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'returnType' @ [159:59] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'context' @ [159:71] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'create' @ [163:60] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [163:67] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'nameExpression' @ [163:109] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [164:35] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [164:43] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForQualifier' @ [164:64] ==> val temporaryForQualifier: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'qualifiedExpressionResolver' @ [165:9] ==> private final val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'resolveNameExpressionAsQualifierForDiagnostics' @ [165:37] ==> public final fun resolveNameExpressionAsQualifierForDiagnostics(expression: KtSimpleNameExpression, receiver: Receiver?, context: ExpressionTypingContext): Qualifier? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[SimpleFunctionDescriptorImpl]

'nameExpression' @ [165:84] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [165:100] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'contextForQualifier' @ [165:110] ==> val contextForQualifier: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'let' @ [165:132] ==> @InlineOnly public inline fun <T, R> Qualifier.let(block: (Qualifier) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Qualifier
    <R> -> Unit

'resolveQualifierAsStandaloneExpression' @ [166:13] ==> public fun resolveQualifierAsStandaloneExpression(qualifier: Qualifier, context: ExpressionTypingContext): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve in file QualifiedExpressionResolveUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [166:52] ==> value-parameter it: Qualifier defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo.<anonymous>[ValueParameterDescriptorImpl]

'contextForQualifier' @ [166:56] ==> val contextForQualifier: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'temporaryForQualifier' @ [167:13] ==> val temporaryForQualifier: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'commit' @ [167:35] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'temporaryForVariable' @ [168:14] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[LocalVariableDescriptor]

'commit' @ [168:35] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'noTypeInfo' @ [169:16] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [169:27] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo[ValueParameterDescriptorImpl]

'getCallExpressionTypeInfoWithoutFinalTypeCheck' @ [176:24] ==> private final fun getCallExpressionTypeInfoWithoutFinalTypeCheck(callExpression: KtCallExpression, receiver: Receiver?, callOperationNode: ASTNode?, context: ExpressionTypingContext, initialDataFlowInfoForArguments: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'callExpression' @ [177:17] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [177:33] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'callOperationNode' @ [177:43] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [177:62] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [177:71] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [177:79] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'context' @ [178:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'contextDependency' @ [178:21] ==> @NotNull public final val contextDependency: ContextDependency defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'INDEPENDENT' @ [178:42] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'dataFlowAnalyzer' @ [179:13] ==> private final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'checkType' @ [179:30] ==> @Nullable public open fun checkType(@Nullable expressionType: KotlinType?, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'typeInfo' @ [179:40] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[LocalVariableDescriptor]

'type' @ [179:49] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'callExpression' @ [179:55] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'context' @ [179:71] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[ValueParameterDescriptorImpl]

'typeInfo' @ [181:16] ==> val typeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo[LocalVariableDescriptor]

'makeCall' @ [193:30] ==> @NotNull public open fun makeCall(@Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, @NotNull callElement: KtCallElement): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'receiver' @ [193:39] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'callOperationNode' @ [193:49] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'callExpression' @ [193:68] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'create' @ [195:59] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [196:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'callExpression' @ [196:63] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'component1' @ [197:14] ==> public final operator fun component1(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [197:29] ==> public final operator fun component2(): ResolvedCall<FunctionDescriptor>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getResolvedCallForFunction' @ [197:45] ==> private final fun getResolvedCallForFunction(call: Call, context: ResolutionContext<*>, checkArguments: CheckArgumentTypesMode, initialDataFlowInfoForArguments: DataFlowInfo): Pair<Boolean, ResolvedCall<FunctionDescriptor>?> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'call' @ [198:17] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'context' @ [199:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [199:25] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForFunction' @ [199:46] ==> val temporaryForFunction: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [200:40] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'initialDataFlowInfoForArguments' @ [201:17] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'resolveResult' @ [202:13] ==> val resolveResult: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'resolvedCall' @ [203:38] ==> val resolvedCall: ResolvedCall<FunctionDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'resultingDescriptor' @ [203:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'temporaryForFunction' @ [204:13] ==> val temporaryForFunction: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'commit' @ [204:34] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'callExpression' @ [205:17] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'valueArgumentList' @ [205:32] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'callExpression' @ [205:61] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'lambdaArguments' @ [205:76] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [205:92] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [207:42] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'functionDescriptor' @ [207:72] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'valueParameters' @ [207:91] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [207:107] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'context' @ [208:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [208:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [208:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'FUNCTION_CALL_EXPECTED' @ [208:38] ==> public final val FUNCTION_CALL_EXPECTED: (DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (Boolean..Boolean?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [208:61] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: KtExpression, @NotNull b: Boolean): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'callExpression' @ [208:64] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'callExpression' @ [208:80] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'hasValueParameters' @ [208:96] ==> val hasValueParameters: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'functionDescriptor' @ [210:17] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'noTypeInfo' @ [211:24] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [211:35] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'functionDescriptor' @ [213:17] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'functionDescriptor' @ [214:40] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'constructedClass' @ [214:59] ==> public final val ConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'isAnnotationClass' @ [215:37] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'constructedClass' @ [215:55] ==> val constructedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'!' @ [215:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canInstantiateAnnotationClass' @ [215:77] ==> private final fun canInstantiateAnnotationClass(expression: KtCallExpression, trace: BindingTrace): Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'callExpression' @ [215:107] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'context' @ [215:123] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [215:131] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'context' @ [216:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [216:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [216:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ANNOTATION_CLASS_CONSTRUCTOR_CALL' @ [216:42] ==> public final val ANNOTATION_CLASS_CONSTRUCTOR_CALL: (DiagnosticFactory0<(KtCallExpression..KtCallExpression?)>..DiagnosticFactory0<(KtCallExpression..KtCallExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [216:76] ==> @NotNull public open fun on(@NotNull element: KtCallExpression): SimpleDiagnostic<(KtCallExpression..KtCallExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'callExpression' @ [216:79] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'isEnumClass' @ [218:37] ==> public open fun isEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'constructedClass' @ [218:49] ==> val constructedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'context' @ [219:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [219:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [219:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ENUM_CLASS_CONSTRUCTOR_CALL' @ [219:42] ==> public final val ENUM_CLASS_CONSTRUCTOR_CALL: (DiagnosticFactory0<(KtCallExpression..KtCallExpression?)>..DiagnosticFactory0<(KtCallExpression..KtCallExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [219:70] ==> @NotNull public open fun on(@NotNull element: KtCallExpression): SimpleDiagnostic<(KtCallExpression..KtCallExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'callExpression' @ [219:73] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'isSealedClass' @ [221:37] ==> public open fun isSealedClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'constructedClass' @ [221:51] ==> val constructedClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'context' @ [222:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [222:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [222:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SEALED_CLASS_CONSTRUCTOR_CALL' @ [222:42] ==> public final val SEALED_CLASS_CONSTRUCTOR_CALL: (DiagnosticFactory0<(KtCallExpression..KtCallExpression?)>..DiagnosticFactory0<(KtCallExpression..KtCallExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [222:72] ==> @NotNull public open fun on(@NotNull element: KtCallExpression): SimpleDiagnostic<(KtCallExpression..KtCallExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'callExpression' @ [222:75] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'functionDescriptor' @ [226:24] ==> val functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'returnType' @ [226:43] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'callExpression' @ [228:29] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'valueArguments' @ [228:44] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'resolvedCall' @ [229:34] ==> val resolvedCall: ResolvedCall<FunctionDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'dataFlowInfoForArguments' @ [229:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.dataFlowInfoForArguments: DataFlowInfoForArguments[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'resultInfo' @ [229:72] ==> public final val DataFlowInfoForArguments.resultInfo: DataFlowInfo[MyPropertyDescriptor]

'resultFlowInfo' @ [230:32] ==> val resultFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'arguments' @ [232:30] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'context' @ [233:35] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [233:43] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'get' @ [233:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..ReadOnlySlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?), key: (KtExpression..KtExpression?)): KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> KotlinTypeInfo

'EXPRESSION_TYPE_INFO' @ [233:68] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'argument' @ [233:90] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'getArgumentExpression' @ [233:99] ==> @Override @Nullable @IfNotParsed public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argTypeInfo' @ [234:21] ==> val argTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'argTypeInfo' @ [234:44] ==> val argTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'jumpOutPossible' @ [234:56] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpOutPossible' @ [235:21] ==> var jumpOutPossible: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'jumpFlowInfo' @ [236:21] ==> var jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'argTypeInfo' @ [236:36] ==> val argTypeInfo: KotlinTypeInfo? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'jumpFlowInfo' @ [236:48] ==> public final val jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'createTypeInfo' @ [240:20] ==> public fun createTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpPossible: Boolean, jumpFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'type' @ [240:35] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'resultFlowInfo' @ [240:41] ==> val resultFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'jumpOutPossible' @ [240:57] ==> var jumpOutPossible: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'jumpFlowInfo' @ [240:74] ==> var jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'callExpression' @ [243:32] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'calleeExpression' @ [243:47] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpression' @ [244:13] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'callExpression' @ [244:59] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'typeArgumentList' @ [244:74] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'create' @ [245:63] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [246:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'callExpression' @ [246:81] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'component1' @ [247:18] ==> public final operator fun component1(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [247:30] ==> public final operator fun component2(): KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getVariableType' @ [247:38] ==> private final fun getVariableType(nameExpression: KtSimpleNameExpression, receiver: Receiver?, callOperationNode: ASTNode?, context: ExpressionTypingContext): Pair<Boolean, KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'calleeExpression' @ [247:54] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'receiver' @ [247:72] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'callOperationNode' @ [247:82] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'context' @ [248:54] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [248:62] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForVariable' @ [248:83] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'temporaryForVariable' @ [249:29] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'trace' @ [249:50] ==> public final val trace: (TemporaryBindingTrace..TemporaryBindingTrace?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaPropertyDescriptor]

'get' @ [249:56] ==> public open fun <K, V> get(slice: ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>, key: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V> -> (org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier..org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier?)

'QUALIFIER' @ [249:75] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'calleeExpression' @ [249:86] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'notNothing' @ [250:17] ==> val notNothing: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'qualifier' @ [250:32] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'qualifier' @ [250:53] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'callExpression' @ [253:17] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'getResolvedCall' @ [253:32] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'temporaryForVariable' @ [253:48] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'trace' @ [253:69] ==> public final val trace: (TemporaryBindingTrace..TemporaryBindingTrace?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaPropertyDescriptor]

'bindingContext' @ [253:75] ==> public final val TemporaryBindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'let' @ [253:91] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out CallableDescriptor>?.let(block: (ResolvedCall<out CallableDescriptor>?) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>?
    <R> -> Unit?

'it' @ [254:22] ==> value-parameter it: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck.<anonymous>[ValueParameterDescriptorImpl]

'addStatus' @ [254:48] ==> @Override public open fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]

'OTHER_ERROR' @ [254:75] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'temporaryForVariable' @ [257:17] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'commit' @ [257:38] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [258:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'trace' @ [258:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [258:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'FUNCTION_EXPECTED' @ [258:38] ==> public final val FUNCTION_EXPECTED: (DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [258:56] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: KtExpression, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'calleeExpression' @ [258:59] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'calleeExpression' @ [258:77] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'type' @ [259:59] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'createErrorType' @ [259:78] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'argumentTypeResolver' @ [260:17] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'analyzeArgumentsAndRecordTypes' @ [260:38] ==> public open fun analyzeArgumentsAndRecordTypes(@NotNull context: CallResolutionContext<*>, @NotNull resolveArgumentsMode: ResolveArgumentsMode): Unit defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'create' @ [261:52] ==> @NotNull public open fun create(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull call: Call, @NotNull checkArguments: CheckArgumentTypesMode, @Nullable dataFlowInfoForArguments: MutableDataFlowInfoForArguments?): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [262:33] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'call' @ [262:42] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [262:71] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'DataFlowInfoForArgumentsImpl' @ [263:33] ==> public constructor DataFlowInfoForArgumentsImpl(@NotNull initialInfo: DataFlowInfo, @NotNull call: Call) defined in org.jetbrains.kotlin.resolve.calls.model.DataFlowInfoForArgumentsImpl[JavaClassConstructorDescriptor]

'initialDataFlowInfoForArguments' @ [263:62] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'call' @ [263:95] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'RESOLVE_FUNCTION_ARGUMENTS' @ [265:46] ==> enum entry RESOLVE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'noTypeInfo' @ [267:24] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [267:35] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'temporaryForFunction' @ [270:9] ==> val temporaryForFunction: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[LocalVariableDescriptor]

'commit' @ [270:30] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'noTypeInfo' @ [271:16] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [271:27] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck[ValueParameterDescriptorImpl]

'qualifiedExpressionResolver' @ [275:13] ==> private final val qualifiedExpressionResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'resolveQualifierInExpressionAndUnroll' @ [275:41] ==> public final fun resolveQualifierInExpressionAndUnroll(expression: KtQualifiedExpression, context: ExpressionTypingContext, isValue: (KtSimpleNameExpression) -> Boolean): List<CallExpressionElement> defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[SimpleFunctionDescriptorImpl]

'this' @ [275:79] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain[ReceiverParameterDescriptorImpl]

'context' @ [275:85] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain[ValueParameterDescriptorImpl]

'resolveSimpleName' @ [277:40] ==> private final fun resolveSimpleName(context: ExpressionTypingContext, expression: KtSimpleNameExpression): OverloadResolutionResults<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'context' @ [277:58] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain[ValueParameterDescriptorImpl]

'nameExpression' @ [277:67] ==> value-parameter nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain.<anonymous>[ValueParameterDescriptorImpl]

'if (resolutionResult.isSingleResult && resolutionResult.resultingDescriptor is FakeCallableDescriptorForObject) {
                    false
                }
                else when (resolutionResult.resultCode) {
                    NAME_NOT_FOUND, CANDIDATES_WITH_WRONG_RECEIVER -> false
                    else -> !USE_NEW_INFERENCE || resolutionResult.isSuccess
                }' @ [279:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'resolutionResult' @ [279:21] ==> val resolutionResult: OverloadResolutionResults<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain.<anonymous>[LocalVariableDescriptor]

'isSingleResult' @ [279:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<VariableDescriptor>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'resolutionResult' @ [279:56] ==> val resolutionResult: OverloadResolutionResults<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [279:73] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<VariableDescriptor>.resultingDescriptor: VariableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'when (resolutionResult.resultCode) {
                    NAME_NOT_FOUND, CANDIDATES_WITH_WRONG_RECEIVER -> false
                    else -> !USE_NEW_INFERENCE || resolutionResult.isSuccess
                }' @ [282:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'resolutionResult' @ [282:28] ==> val resolutionResult: OverloadResolutionResults<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain.<anonymous>[LocalVariableDescriptor]

'resultCode' @ [282:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<VariableDescriptor>.resultCode: OverloadResolutionResults.Code[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'NAME_NOT_FOUND' @ [283:21] ==> enum entry NAME_NOT_FOUND defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'CANDIDATES_WITH_WRONG_RECEIVER' @ [283:37] ==> enum entry CANDIDATES_WITH_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults.Code[FakeCallableDescriptorForObject]

'!' @ [284:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'USE_NEW_INFERENCE' @ [284:30] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls[DeserializedPropertyDescriptor]

'resolutionResult' @ [284:51] ==> val resolutionResult: OverloadResolutionResults<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.elementChain.<anonymous>[LocalVariableDescriptor]

'isSuccess' @ [284:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<VariableDescriptor>.isSuccess: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'create' @ [291:59] ==> public open fun create(context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?), debugName: (String..String?), expression: (KtExpression..KtExpression?)): (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.context.TemporaryTraceAndCache[JavaMethodDescriptor]

'context' @ [291:66] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[ValueParameterDescriptorImpl]

'expression' @ [291:125] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[ValueParameterDescriptorImpl]

'makePropertyCall' @ [292:30] ==> @NotNull public open fun makePropertyCall(@Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, @NotNull nameExpression: KtSimpleNameExpression): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'expression' @ [292:59] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[ValueParameterDescriptorImpl]

'create' @ [293:61] ==> @NotNull public open fun create(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull call: Call, @NotNull checkArguments: CheckArgumentTypesMode): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [294:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[ValueParameterDescriptorImpl]

'replaceTraceAndCache' @ [294:25] ==> @NotNull public open fun replaceTraceAndCache(@NotNull traceAndCache: TemporaryTraceAndCache): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'temporaryForVariable' @ [294:46] ==> val temporaryForVariable: (TemporaryTraceAndCache..TemporaryTraceAndCache?) defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[LocalVariableDescriptor]

'call' @ [294:69] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[LocalVariableDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [294:98] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'callResolver' @ [296:16] ==> private final val callResolver: CallResolver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'resolveSimpleProperty' @ [296:29] ==> @NotNull public open fun resolveSimpleProperty(@NotNull context: BasicCallResolutionContext): OverloadResolutionResults<(VariableDescriptor..VariableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'contextForVariable' @ [296:51] ==> val contextForVariable: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveSimpleName[LocalVariableDescriptor]

'when (selectorExpression) {
        is KtCallExpression -> getCallExpressionTypeInfoWithoutFinalTypeCheck(
                selectorExpression, receiver, callOperationNode, context, initialDataFlowInfoForArguments)
        is KtSimpleNameExpression -> getSimpleNameExpressionTypeInfo(
                selectorExpression, receiver, callOperationNode, context, initialDataFlowInfoForArguments)
        is KtExpression -> {
            expressionTypingServices.getTypeInfo(selectorExpression, context)
            context.trace.report(ILLEGAL_SELECTOR.on(selectorExpression))
            noTypeInfo(context)
        }
        else /*null*/ -> noTypeInfo(context)
    }' @ [305:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinTypeInfo, entry1: KotlinTypeInfo, entry2: KotlinTypeInfo, entry3: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinTypeInfo

'selectorExpression' @ [305:31] ==> value-parameter selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'getCallExpressionTypeInfoWithoutFinalTypeCheck' @ [306:32] ==> private final fun getCallExpressionTypeInfoWithoutFinalTypeCheck(callExpression: KtCallExpression, receiver: Receiver?, callOperationNode: ASTNode?, context: ExpressionTypingContext, initialDataFlowInfoForArguments: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [307:17] ==> value-parameter selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [307:37] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'callOperationNode' @ [307:47] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [307:66] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'initialDataFlowInfoForArguments' @ [307:75] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'getSimpleNameExpressionTypeInfo' @ [308:38] ==> private final fun getSimpleNameExpressionTypeInfo(nameExpression: KtSimpleNameExpression, receiver: Receiver?, callOperationNode: ASTNode?, context: ExpressionTypingContext, initialDataFlowInfoForArguments: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [309:17] ==> value-parameter selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [309:37] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'callOperationNode' @ [309:47] ==> value-parameter callOperationNode: ASTNode? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [309:66] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'initialDataFlowInfoForArguments' @ [309:75] ==> value-parameter initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'expressionTypingServices' @ [311:13] ==> private final lateinit var expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'getTypeInfo' @ [311:38] ==> @NotNull public open fun getTypeInfo(@NotNull expression: KtExpression, @NotNull resolutionContext: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'selectorExpression' @ [311:50] ==> value-parameter selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [311:70] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [312:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [312:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [312:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ILLEGAL_SELECTOR' @ [312:34] ==> public final val ILLEGAL_SELECTOR: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [312:51] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'selectorExpression' @ [312:54] ==> value-parameter selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'noTypeInfo' @ [313:13] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [313:24] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'noTypeInfo' @ [315:26] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [315:37] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [320:47] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [320:55] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'receiver' @ [321:38] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'let' @ [321:67] ==> @InlineOnly public inline fun <T, R> ReceiverValue.let(block: (ReceiverValue) -> DataFlowValue): DataFlowValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> DataFlowValue

'DataFlowValueFactory' @ [321:73] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [321:94] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'it' @ [321:114] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [321:118] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'receiverDataFlowValue' @ [322:33] ==> val receiverDataFlowValue: DataFlowValue? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'initialDataFlowInfoForArguments' @ [323:33] ==> var initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'getStableNullability' @ [323:65] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'receiverDataFlowValue' @ [323:86] ==> val receiverDataFlowValue: DataFlowValue? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'canBeNull' @ [323:109] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'receiverDataFlowValue' @ [324:13] ==> val receiverDataFlowValue: DataFlowValue? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'element' @ [324:46] ==> value-parameter element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'safe' @ [324:54] ==> public final val safe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'if (receiverCanBeNull) {
                initialDataFlowInfoForArguments = initialDataFlowInfoForArguments.disequate(
                        receiverDataFlowValue, DataFlowValue.nullValue(builtIns), languageVersionSettings)
            }
            else if (receiver is ReceiverValue) {
                reportUnnecessarySafeCall(context.trace, receiver.type, element.node, receiver)
            }' @ [326:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiverCanBeNull' @ [326:17] ==> val receiverCanBeNull: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'initialDataFlowInfoForArguments' @ [327:17] ==> var initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'initialDataFlowInfoForArguments' @ [327:51] ==> var initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'disequate' @ [327:83] ==> public abstract fun disequate(a: DataFlowValue, b: DataFlowValue, languageVersionSettings: LanguageVersionSettings): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'receiverDataFlowValue' @ [328:25] ==> val receiverDataFlowValue: DataFlowValue? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'DataFlowValue' @ [328:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[FakeCallableDescriptorForObject]

'nullValue' @ [328:62] ==> @JvmStatic public final fun nullValue(builtIns: KotlinBuiltIns): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue.Companion[SimpleFunctionDescriptorImpl]

'builtIns' @ [328:72] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'languageVersionSettings' @ [328:83] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'receiver' @ [330:22] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'reportUnnecessarySafeCall' @ [331:17] ==> public final fun reportUnnecessarySafeCall(trace: BindingTrace, type: KotlinType, callOperationNode: ASTNode, explicitReceiver: Receiver?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'context' @ [331:43] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [331:51] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'receiver' @ [331:58] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'type' @ [331:67] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'element' @ [331:73] ==> value-parameter element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'node' @ [331:81] ==> public final val node: ASTNode defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'receiver' @ [331:87] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'element' @ [335:24] ==> value-parameter element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'selector' @ [335:32] ==> public final val selector: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'getUnsafeSelectorTypeInfo' @ [336:32] ==> private final fun getUnsafeSelectorTypeInfo(receiver: Receiver, callOperationNode: ASTNode?, selectorExpression: KtExpression?, context: ExpressionTypingContext, initialDataFlowInfoForArguments: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'receiver' @ [336:58] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'element' @ [336:68] ==> value-parameter element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'node' @ [336:76] ==> public final val node: ASTNode defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'selector' @ [336:82] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'context' @ [336:92] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'initialDataFlowInfoForArguments' @ [336:101] ==> var initialDataFlowInfoForArguments: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'receiver' @ [338:13] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'resolveDeferredReceiverInQualifiedExpression' @ [339:13] ==> private final fun resolveDeferredReceiverInQualifiedExpression(qualifier: Qualifier, selectorExpression: KtExpression?, context: ExpressionTypingContext): Unit defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'receiver' @ [339:58] ==> value-parameter receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'selector' @ [339:68] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'context' @ [339:78] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'selectorTypeInfo' @ [342:28] ==> var selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'type' @ [342:45] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'selectorType' @ [343:13] ==> val selectorType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'element' @ [344:17] ==> value-parameter element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'safe' @ [344:25] ==> public final val safe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'receiverCanBeNull' @ [344:33] ==> val receiverCanBeNull: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'selectorTypeInfo' @ [345:17] ==> var selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'selectorTypeInfo' @ [345:36] ==> var selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'replaceType' @ [345:53] ==> public final fun replaceType(type: KotlinType?): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[SimpleFunctionDescriptorImpl]

'makeNullable' @ [345:75] ==> @NotNull public open fun makeNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'selectorType' @ [345:88] ==> val selectorType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'selector' @ [348:17] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'context' @ [349:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [349:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'recordType' @ [349:31] ==> public abstract fun recordType(@NotNull expression: KtExpression, @Nullable type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'selector' @ [349:42] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'selectorTypeInfo' @ [349:52] ==> var selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'type' @ [349:69] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'selectorTypeInfo' @ [352:16] ==> var selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSafeOrUnsafeSelectorTypeInfo[LocalVariableDescriptor]

'checkNestedClassAccess' @ [357:9] ==> private final fun checkNestedClassAccess(expression: KtQualifiedExpression, context: ExpressionTypingContext): Unit defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'qualified' @ [357:32] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [357:43] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'constantExpressionEvaluator' @ [358:21] ==> private final val constantExpressionEvaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'evaluateExpression' @ [358:49] ==> public final fun evaluateExpression(expression: KtExpression, trace: BindingTrace, expectedType: KotlinType? = ...): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[SimpleFunctionDescriptorImpl]

'qualified' @ [358:68] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [358:79] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [358:87] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'context' @ [358:94] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'expectedType' @ [358:102] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'if (value != null && value.isPure) {
            dataFlowAnalyzer.createCompileTimeConstantTypeInfo(value, qualified, context)
        }
        else {
            if (context.contextDependency == INDEPENDENT) {
                dataFlowAnalyzer.checkType(selectorTypeInfo.type, qualified, context)
            }
            selectorTypeInfo
        }' @ [359:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinTypeInfo, elseBranch: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinTypeInfo

'value' @ [359:20] ==> val value: CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[LocalVariableDescriptor]

'value' @ [359:37] ==> val value: CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[LocalVariableDescriptor]

'isPure' @ [359:43] ==> public open val isPure: Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedPropertyDescriptor]

'dataFlowAnalyzer' @ [360:13] ==> private final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'createCompileTimeConstantTypeInfo' @ [360:30] ==> @NotNull public open fun createCompileTimeConstantTypeInfo(@NotNull value: CompileTimeConstant<*>, @NotNull expression: KtExpression, @NotNull context: ExpressionTypingContext): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'value' @ [360:64] ==> val value: CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[LocalVariableDescriptor]

'qualified' @ [360:71] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [360:82] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [363:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'contextDependency' @ [363:25] ==> @NotNull public final val contextDependency: ContextDependency defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'INDEPENDENT' @ [363:46] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'dataFlowAnalyzer' @ [364:17] ==> private final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'checkType' @ [364:34] ==> @Nullable public open fun checkType(@Nullable expressionType: KotlinType?, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'selectorTypeInfo' @ [364:44] ==> value-parameter selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'type' @ [364:61] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'qualified' @ [364:67] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [364:78] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'selectorTypeInfo' @ [366:13] ==> value-parameter selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.checkSelectorTypeInfo[ValueParameterDescriptorImpl]

'context' @ [371:21] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [371:29] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'trace' @ [372:13] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[LocalVariableDescriptor]

'get' @ [372:19] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?), key: (KtExpression..KtExpression?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Boolean

'PROCESSED' @ [372:38] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'qualified' @ [372:49] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [374:13] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[LocalVariableDescriptor]

'record' @ [374:19] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?), key: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression

'PROCESSED' @ [374:41] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'qualified' @ [374:52] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [375:13] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[LocalVariableDescriptor]

'record' @ [375:19] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?), key: (KtExpression..KtExpression?), value: (KotlinTypeInfo..KotlinTypeInfo?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> KotlinTypeInfo

'EXPRESSION_TYPE_INFO' @ [375:41] ==> public final val EXPRESSION_TYPE_INFO: (WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinTypeInfo..KotlinTypeInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'qualified' @ [375:63] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'resultTypeInfo' @ [375:74] ==> value-parameter resultTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'trace' @ [377:13] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[LocalVariableDescriptor]

'recordScope' @ [377:19] ==> public fun BindingTrace.recordScope(scope: LexicalScope, element: KtElement?): Unit defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [377:31] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'scope' @ [377:39] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'qualified' @ [377:46] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'context' @ [378:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'replaceDataFlowInfo' @ [378:21] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'resultTypeInfo' @ [378:41] ==> value-parameter resultTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [378:56] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'recordDataFlowInfo' @ [378:70] ==> public fun <C : ResolutionContext<(ExpressionTypingContext..ExpressionTypingContext?)>> ResolutionContext<(ExpressionTypingContext..ExpressionTypingContext?)>.recordDataFlowInfo(expression: KtExpression?): Unit defined in org.jetbrains.kotlin.resolve.bindingContextUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : ResolutionContext<C>> -> (org.jetbrains.kotlin.types.expressions.ExpressionTypingContext..org.jetbrains.kotlin.types.expressions.ExpressionTypingContext?)

'qualified' @ [378:89] ==> value-parameter qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.recordResultTypeInfo[ValueParameterDescriptorImpl]

'context' @ [388:30] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[ValueParameterDescriptorImpl]

'replaceExpectedType' @ [388:38] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'NO_EXPECTED_TYPE' @ [388:58] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'replaceContextDependency' @ [388:76] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'INDEPENDENT' @ [388:101] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'currentContext' @ [389:21] ==> val currentContext: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'trace' @ [389:36] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'expression' @ [391:28] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[ValueParameterDescriptorImpl]

'elementChain' @ [391:39] ==> private final fun KtQualifiedExpression.elementChain(context: ExpressionTypingContext): List<CallExpressionElement> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'context' @ [391:52] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[ValueParameterDescriptorImpl]

'elementChain' @ [392:29] ==> val elementChain: List<CallExpressionElement> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'first' @ [392:42] ==> public fun <T> List<CallExpressionElement>.first(): CallExpressionElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallExpressionElement

'receiver' @ [392:50] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'when (trace.get(BindingContext.QUALIFIER, firstReceiver)) {
            null -> expressionTypingServices.getTypeInfo(firstReceiver, currentContext)
            else -> KotlinTypeInfo(null, currentContext.dataFlowInfo)
        }' @ [394:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinTypeInfo, entry1: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinTypeInfo

'trace' @ [394:38] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'get' @ [394:44] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?), key: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Qualifier

'QUALIFIER' @ [394:63] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'firstReceiver' @ [394:74] ==> val firstReceiver: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'expressionTypingServices' @ [395:21] ==> private final lateinit var expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[PropertyDescriptorImpl]

'getTypeInfo' @ [395:46] ==> @NotNull public open fun getTypeInfo(@NotNull expression: KtExpression, @NotNull resolutionContext: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'firstReceiver' @ [395:58] ==> val firstReceiver: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'currentContext' @ [395:73] ==> val currentContext: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'KotlinTypeInfo' @ [396:21] ==> @JvmOverloads public constructor KotlinTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpOutPossible: Boolean = ..., jumpFlowInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'currentContext' @ [396:42] ==> val currentContext: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'dataFlowInfo' @ [396:57] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'receiverTypeInfo' @ [399:30] ==> var receiverTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiverTypeInfo' @ [403:39] ==> var receiverTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'dataFlowInfo' @ [403:56] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'elementChain' @ [405:25] ==> val elementChain: List<CallExpressionElement> defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiverTypeInfo' @ [406:32] ==> var receiverTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'type' @ [406:49] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'createErrorType' @ [406:68] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'+' @ [406:84] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [406:98] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiver' @ [406:106] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'text' @ [406:115] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'trace' @ [408:28] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'get' @ [408:34] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?), key: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Qualifier

'QUALIFIER' @ [408:53] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [408:64] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiver' @ [408:72] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'ExpressionReceiver' @ [409:31] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [409:50] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[SimpleFunctionDescriptorImpl]

'element' @ [409:57] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiver' @ [409:65] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'receiverType' @ [409:75] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'trace' @ [409:89] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'bindingContext' @ [409:95] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'element' @ [411:39] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'qualified' @ [411:47] ==> public final val qualified: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'qualifiedExpression' @ [412:29] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'expression' @ [412:53] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[ValueParameterDescriptorImpl]

'if (lastStage) context else currentContext' @ [414:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExpressionTypingContext, elseBranch: ExpressionTypingContext): ExpressionTypingContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExpressionTypingContext

'lastStage' @ [414:43] ==> val lastStage: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'context' @ [414:54] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[ValueParameterDescriptorImpl]

'currentContext' @ [414:67] ==> val currentContext: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'replaceDataFlowInfo' @ [414:83] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'if (receiver is ReceiverValue && TypeUtils.isNullableType(receiver.type) && !element.safe) {
                        // Call with nullable receiver: take data flow info from branch point
                        branchPointDataFlowInfo
                    }
                    else {
                        // Take data flow info from the current receiver
                        receiverTypeInfo.dataFlowInfo
                    }' @ [415:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DataFlowInfo, elseBranch: DataFlowInfo): DataFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DataFlowInfo

'receiver' @ [415:25] ==> val receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'isNullableType' @ [415:64] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiver' @ [415:79] ==> val receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'type' @ [415:88] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'!' @ [415:97] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [415:98] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'safe' @ [415:106] ==> public final val safe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'branchPointDataFlowInfo' @ [417:25] ==> var branchPointDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiverTypeInfo' @ [421:25] ==> var receiverTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'dataFlowInfo' @ [421:42] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'getSafeOrUnsafeSelectorTypeInfo' @ [425:36] ==> private final fun getSafeOrUnsafeSelectorTypeInfo(receiver: Receiver, element: CallExpressionElement, context: ExpressionTypingContext): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'receiver' @ [425:68] ==> val receiver: Receiver defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'element' @ [425:78] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'contextForSelector' @ [425:87] ==> val contextForSelector: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'allUnsafe' @ [427:13] ==> var allUnsafe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'allUnsafe' @ [427:25] ==> var allUnsafe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'!' @ [427:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [427:39] ==> val element: CallExpressionElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'safe' @ [427:47] ==> public final val safe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionElement[PropertyDescriptorImpl]

'allUnsafe' @ [428:17] ==> var allUnsafe: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'branchPointDataFlowInfo' @ [429:17] ==> var branchPointDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'selectorTypeInfo' @ [429:43] ==> val selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'dataFlowInfo' @ [429:60] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'resultTypeInfo' @ [432:13] ==> var resultTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'checkSelectorTypeInfo' @ [432:30] ==> private final fun checkSelectorTypeInfo(qualified: KtQualifiedExpression, selectorTypeInfo: KotlinTypeInfo, context: ExpressionTypingContext): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'qualifiedExpression' @ [432:52] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'selectorTypeInfo' @ [432:73] ==> val selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'contextForSelector' @ [432:91] ==> val contextForSelector: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'replaceDataFlowInfo' @ [433:30] ==> public final fun replaceDataFlowInfo(dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[SimpleFunctionDescriptorImpl]

'branchPointDataFlowInfo' @ [433:50] ==> var branchPointDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'!' @ [434:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lastStage' @ [434:18] ==> val lastStage: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'recordResultTypeInfo' @ [435:17] ==> private final fun recordResultTypeInfo(qualified: KtQualifiedExpression, resultTypeInfo: KotlinTypeInfo, context: ExpressionTypingContext): Unit defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver[SimpleFunctionDescriptorImpl]

'qualifiedExpression' @ [435:38] ==> val qualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'resultTypeInfo' @ [435:59] ==> var resultTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'contextForSelector' @ [435:75] ==> val contextForSelector: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'receiverTypeInfo' @ [438:13] ==> var receiverTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'selectorTypeInfo' @ [438:32] ==> val selectorTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'resultTypeInfo' @ [440:16] ==> var resultTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo[LocalVariableDescriptor]

'deparenthesize' @ [448:42] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'selectorExpression' @ [448:57] ==> value-parameter selectorExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression[ValueParameterDescriptorImpl]

'getCalleeExpressionIfAny' @ [448:76] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'calleeExpression' @ [449:35] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression[LocalVariableDescriptor]

'let' @ [449:80] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> DeclarationDescriptor?

'context' @ [450:13] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression[ValueParameterDescriptorImpl]

'trace' @ [450:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'get' @ [450:27] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [450:46] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [450:64] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression.<anonymous>[ValueParameterDescriptorImpl]

'resolveQualifierAsReceiverInExpression' @ [453:9] ==> public fun resolveQualifierAsReceiverInExpression(qualifier: Qualifier, selector: DeclarationDescriptor?, context: ExpressionTypingContext): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve in file QualifiedExpressionResolveUtil.kt[SimpleFunctionDescriptorImpl]

'qualifier' @ [453:48] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression[ValueParameterDescriptorImpl]

'selectorDescriptor' @ [453:59] ==> val selectorDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression[LocalVariableDescriptor]

'context' @ [453:79] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.resolveDeferredReceiverInQualifiedExpression[ValueParameterDescriptorImpl]

'getParentOfType' @ [460:51] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out ({KtElement & ASTDelegatePsiElement}..{KtElement & ASTDelegatePsiElement}?)>..Class<out ({KtElement & ASTDelegatePsiElement}..{KtElement & ASTDelegatePsiElement}?)>?)): {KtElement & ASTDelegatePsiElement}? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> {KtElement & ASTDelegatePsiElement}

'expression' @ [460:67] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[ValueParameterDescriptorImpl]

'KtValueArgument' @ [460:79] ==> public constructor KtValueArgument(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaClassConstructorDescriptor]

'java' @ [460:102] ==> public val <T> KClass<KtValueArgument>.java: Class<KtValueArgument> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgument

'java' @ [460:127] ==> public val <T> KClass<KtParameter>.java: Class<KtParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameter

'if (parent is KtValueArgument) {
                if (parent.getParentOfType<KtAnnotationEntry>(true) != null) {
                    return true
                }
                parent = parent.getParentOfType<KtParameter>(true)
                if (parent != null) {
                    return isUnderAnnotationClassDeclaration(trace, parent)
                }
            }
            else if (parent is KtParameter) {
                return isUnderAnnotationClassDeclaration(trace, parent)
            }' @ [461:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parent' @ [461:17] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'parent' @ [462:21] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'getParentOfType' @ [462:28] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'parent' @ [465:17] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'parent' @ [465:26] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'getParentOfType' @ [465:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtParameter? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtParameter

'parent' @ [466:21] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'isUnderAnnotationClassDeclaration' @ [467:28] ==> private final fun isUnderAnnotationClassDeclaration(trace: BindingTrace, parent: PsiElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'trace' @ [467:62] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[ValueParameterDescriptorImpl]

'parent' @ [467:69] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'parent' @ [470:22] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'isUnderAnnotationClassDeclaration' @ [471:24] ==> private final fun isUnderAnnotationClassDeclaration(trace: BindingTrace, parent: PsiElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'trace' @ [471:58] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[ValueParameterDescriptorImpl]

'parent' @ [471:65] ==> var parent: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.canInstantiateAnnotationClass[LocalVariableDescriptor]

'parent' @ [477:17] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.isUnderAnnotationClassDeclaration[ValueParameterDescriptorImpl]

'getParentOfType' @ [477:24] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtClass

'let' @ [477:56] ==> @InlineOnly public inline fun <T, R> KtClass.let(block: (KtClass) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass
    <R> -> Boolean

'isAnnotationClass' @ [478:37] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'trace' @ [478:55] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.isUnderAnnotationClassDeclaration[ValueParameterDescriptorImpl]

'get' @ [478:61] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [478:80] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [478:107] ==> value-parameter it: KtClass defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.isUnderAnnotationClassDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [484:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.reportUnnecessarySafeCall[ValueParameterDescriptorImpl]

'report' @ [484:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'if (explicitReceiver is ExpressionReceiver && explicitReceiver.expression is KtSuperExpression) {
                UNEXPECTED_SAFE_CALL.on(callOperationNode.psi)
            }
            else {
                UNNECESSARY_SAFE_CALL.on(callOperationNode.psi, type)
            }' @ [485:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ParametrizedDiagnostic<(PsiElement..PsiElement?)>, elseBranch: ParametrizedDiagnostic<(PsiElement..PsiElement?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ParametrizedDiagnostic<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'explicitReceiver' @ [485:17] ==> value-parameter explicitReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.reportUnnecessarySafeCall[ValueParameterDescriptorImpl]

'explicitReceiver' @ [485:59] ==> value-parameter explicitReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.reportUnnecessarySafeCall[ValueParameterDescriptorImpl]

'expression' @ [485:76] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'UNEXPECTED_SAFE_CALL' @ [486:17] ==> public final val UNEXPECTED_SAFE_CALL: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [486:38] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'callOperationNode' @ [486:41] ==> value-parameter callOperationNode: ASTNode defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.reportUnnecessarySafeCall[ValueParameterDescriptorImpl]

'psi' @ [486:59] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'UNNECESSARY_SAFE_CALL' @ [489:17] ==> public final val UNNECESSARY_SAFE_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [489:39] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'callOperationNode' @ [489:42] ==> value-parameter callOperationNode: ASTNode defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.reportUnnecessarySafeCall[ValueParameterDescriptorImpl]

'psi' @ [489:60] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'type' @ [489:65] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.reportUnnecessarySafeCall[ValueParameterDescriptorImpl]

'expression' @ [497:38] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[ValueParameterDescriptorImpl]

'selectorExpression' @ [497:49] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'context' @ [502:39] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[ValueParameterDescriptorImpl]

'trace' @ [502:47] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'get' @ [502:53] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?), key: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Qualifier

'QUALIFIER' @ [502:72] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [502:83] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[ValueParameterDescriptorImpl]

'context' @ [503:37] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[ValueParameterDescriptorImpl]

'trace' @ [503:45] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'get' @ [503:51] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..ReadOnlySlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?), key: (KtExpression..KtExpression?)): Qualifier? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> Qualifier

'QUALIFIER' @ [503:70] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [503:81] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[ValueParameterDescriptorImpl]

'receiverExpression' @ [503:92] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'receiverQualifier' @ [505:17] ==> val receiverQualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

'expressionQualifier' @ [505:46] ==> val expressionQualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

'assert' @ [506:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expressionQualifier' @ [506:24] ==> val expressionQualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

'+' @ [506:70] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expressionQualifier' @ [506:142] ==> val expressionQualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

'expressionQualifier' @ [507:35] ==> val expressionQualifier: Qualifier? defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

'descriptor' @ [507:79] ==> public abstract val descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassifierQualifier[PropertyDescriptorImpl]

'context' @ [508:17] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[ValueParameterDescriptorImpl]

'trace' @ [508:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'report' @ [508:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NESTED_CLASS_ACCESSED_VIA_INSTANCE_REFERENCE' @ [508:38] ==> public final val NESTED_CLASS_ACCESSED_VIA_INSTANCE_REFERENCE: (DiagnosticFactory1<(KtExpression..KtExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (ClassifierDescriptorWithTypeParameters..ClassifierDescriptorWithTypeParameters?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [508:83] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: ClassifierDescriptorWithTypeParameters): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'selectorExpression' @ [508:86] ==> val selectorExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

'descriptor' @ [508:106] ==> val descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.Companion.checkNestedClassAccess[LocalVariableDescriptor]

