'getDescriptorForReferenceExpression' @ [47:39] ==> @Nullable public open fun getDescriptorForReferenceExpression(@NotNull context: BindingContext, @NotNull reference: KtReferenceExpression): DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [47:75] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'bindingContext' @ [47:83] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'expression' @ [47:101] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'callableReference' @ [47:112] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'expression' @ [49:24] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'receiverExpression' @ [49:35] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'let' @ [49:55] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> JsExpression?): JsExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> JsExpression?

'if (context.bindingContext().get(BindingContext.DOUBLE_COLON_LHS, r) is DoubleColonLHS.Expression &&
                descriptor is CallableMemberDescriptor &&
                descriptor.dispatchReceiverParameter ?: descriptor.extensionReceiverParameter != null
            ) {
                val block = JsBlock()
                val e = Translation.translateAsExpression(r, context, block)
                if (!block.isEmpty) {
                    context.addStatementsToCurrentBlockFrom(block)
                }
                e
            }
            else {
                null
            }' @ [50:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'context' @ [50:17] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'bindingContext' @ [50:25] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'get' @ [50:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), p1: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.DoubleColonLHS..org.jetbrains.kotlin.types.expressions.DoubleColonLHS?)

'DOUBLE_COLON_LHS' @ [50:61] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'r' @ [50:79] ==> value-parameter r: KtExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [51:17] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'descriptor' @ [52:17] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [52:28] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [52:57] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'extensionReceiverParameter' @ [52:68] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'JsBlock' @ [54:29] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'translateAsExpression' @ [55:37] ==> @NotNull public open fun translateAsExpression(@NotNull expression: KtExpression, @NotNull context: TranslationContext, @NotNull block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'r' @ [55:59] ==> value-parameter r: KtExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [55:62] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'block' @ [55:71] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[LocalVariableDescriptor]

'!' @ [56:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'block' @ [56:22] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [56:28] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'context' @ [57:21] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'addStatementsToCurrentBlockFrom' @ [57:29] ==> public open fun addStatementsToCurrentBlockFrom(@NotNull block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'block' @ [57:61] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[LocalVariableDescriptor]

'e' @ [59:17] ==> val e: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [64:15] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'let' @ [64:59] ==> @InlineOnly public inline fun <T, R> PropertyImportedFromObject.let(block: (PropertyImportedFromObject) -> JsExpression): JsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyImportedFromObject
    <R> -> JsExpression

'translateAsValueReference' @ [65:33] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'it' @ [65:59] ==> value-parameter it: PropertyImportedFromObject defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'containingObject' @ [65:62] ==> public final val containingObject: ClassDescriptor defined in org.jetbrains.kotlin.resolve.PropertyImportedFromObject[DeserializedPropertyDescriptor]

'context' @ [65:80] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'when (descriptor) {
            is PropertyDescriptor ->
                translateForProperty(descriptor, context, expression, receiver)
            is FunctionDescriptor ->
                translateForFunction(descriptor, context, expression, receiver)
            else ->
                throw IllegalArgumentException("Expected property or function: $descriptor, expression=${expression.text}")
        }' @ [68:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'descriptor' @ [68:22] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'translateForProperty' @ [70:17] ==> private final fun translateForProperty(descriptor: PropertyDescriptor, context: TranslationContext, expression: KtCallableReferenceExpression, receiver: JsExpression?): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'descriptor' @ [70:38] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'context' @ [70:50] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'expression' @ [70:59] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'receiver' @ [70:71] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'translateForFunction' @ [72:17] ==> private final fun translateForFunction(descriptor: FunctionDescriptor, context: TranslationContext, expression: KtCallableReferenceExpression, receiver: JsExpression?): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'descriptor' @ [72:38] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'context' @ [72:50] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'expression' @ [72:59] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'receiver' @ [72:71] ==> val receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'IllegalArgumentException' @ [74:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [74:81] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[LocalVariableDescriptor]

'expression' @ [74:106] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translate[ValueParameterDescriptorImpl]

'text' @ [74:117] ==> public final val KtCallableReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'expression' @ [84:32] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'callableReference' @ [84:43] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getFunctionResolvedCallWithAssert' @ [84:61] ==> public fun KtExpression.getFunctionResolvedCallWithAssert(context: BindingContext): ResolvedCall<out FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [84:95] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'bindingContext' @ [84:103] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'CodegenUtil' @ [85:30] ==> public object CodegenUtil defined in org.jetbrains.kotlin.backend.common[FakeCallableDescriptorForObject]

'constructFakeFunctionCall' @ [85:42] ==> @JvmStatic public final fun constructFakeFunctionCall(project: Project, referencedFunction: FunctionDescriptor): KtCallExpression defined in org.jetbrains.kotlin.backend.common.CodegenUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [85:68] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'project' @ [85:79] ==> public final val KtCallableReferenceExpression.project: Project[MyPropertyDescriptor]

'descriptor' @ [85:88] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'makeCall' @ [87:34] ==> @NotNull public open fun makeCall(p0: (KtElement..KtElement?), @Nullable p1: Receiver?, @Nullable p2: ASTNode?, p3: (KtExpression..KtExpression?), p4: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>?)): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'fakeExpression' @ [87:43] ==> val fakeExpression: KtCallExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'fakeExpression' @ [87:71] ==> val fakeExpression: KtCallExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'fakeExpression' @ [87:87] ==> val fakeExpression: KtCallExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'valueArguments' @ [87:102] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'DelegatingResolvedCall<FunctionDescriptor>' @ [88:41] ==> public constructor DelegatingResolvedCall<D : (CallableDescriptor..CallableDescriptor?)>(@NotNull p0: ResolvedCall<out (FunctionDescriptor..FunctionDescriptor?)>) defined in org.jetbrains.kotlin.resolve.calls.model.DelegatingResolvedCall[JavaClassConstructorDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'realResolvedCall' @ [88:84] ==> val realResolvedCall: ResolvedCall<out FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'fakeCall' @ [89:37] ==> val fakeCall: Call defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'valueArguments' @ [89:46] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'map' @ [89:61] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> ExpressionValueArgument): List<ExpressionValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> ExpressionValueArgument

'ExpressionValueArgument' @ [89:67] ==> public constructor ExpressionValueArgument(@Nullable p0: ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionValueArgument[JavaClassConstructorDescriptor]

'valueArgumentList' @ [90:36] ==> public final val valueArgumentList: List<ExpressionValueArgument> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction.<no name provided>[PropertyDescriptorImpl]

'withIndex' @ [90:54] ==> public fun <T> Iterable<ExpressionValueArgument>.withIndex(): Iterable<IndexedValue<ExpressionValueArgument>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpressionValueArgument

'associate' @ [90:66] ==> public inline fun <T, K, V> Iterable<IndexedValue<ExpressionValueArgument>>.associate(transform: (IndexedValue<ExpressionValueArgument>) -> Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), ExpressionValueArgument>): Map<(ValueParameterDescriptor..ValueParameterDescriptor?), ExpressionValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<ExpressionValueArgument>
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> ExpressionValueArgument

'component1' @ [90:79] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [90:86] ==> public final operator fun component2(): ExpressionValueArgument defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [90:94] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [90:105] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'index' @ [90:121] ==> val index: Int defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction.<no name provided>.valueArgumentMap.<anonymous>[LocalVariableDescriptor]

'arg' @ [90:131] ==> val arg: ExpressionValueArgument defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction.<no name provided>.valueArgumentMap.<anonymous>[LocalVariableDescriptor]

'fakeCall' @ [92:38] ==> val fakeCall: Call defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'valueArgumentList' @ [94:84] ==> public final val valueArgumentList: List<ExpressionValueArgument> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction.<no name provided>[PropertyDescriptorImpl]

'valueArgumentMap' @ [96:102] ==> public final val valueArgumentMap: Map<(ValueParameterDescriptor..ValueParameterDescriptor?), ExpressionValueArgument> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction.<no name provided>[PropertyDescriptorImpl]

'JsFunction' @ [99:24] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [99:35] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'scope' @ [99:43] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsBlock' @ [99:52] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'function' @ [100:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'source' @ [100:18] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [100:27] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'if (descriptor.dispatchReceiverParameter != null || descriptor.extensionReceiverParameter != null) {
            val paramName = JsScope.declareTemporaryName(Namer.getReceiverParameterName())
            function.parameters += JsParameter(paramName)
            paramName.makeRef()
        }
        else {
            null
        }' @ [101:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsNameRef?, elseBranch: JsNameRef?): JsNameRef?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsNameRef?

'descriptor' @ [101:33] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [101:44] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [101:81] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [101:92] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'declareTemporaryName' @ [102:37] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'getReceiverParameterName' @ [102:64] ==> @NotNull public open fun getReceiverParameterName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'function' @ [103:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'parameters' @ [103:22] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [103:36] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'paramName' @ [103:48] ==> val paramName: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'paramName' @ [104:13] ==> val paramName: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'makeRef' @ [104:23] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'mutableMapOf' @ [110:23] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<KtExpression, JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtExpression
    <V> -> JsExpression

'component1' @ [111:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [111:22] ==> public final operator fun component2(): (ValueArgument..ValueArgument?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'fakeCall' @ [111:35] ==> val fakeCall: Call defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'valueArguments' @ [111:44] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'withIndex' @ [111:59] ==> public fun <T> Iterable<(ValueArgument..ValueArgument?)>.withIndex(): Iterable<IndexedValue<(ValueArgument..ValueArgument?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'declareTemporaryName' @ [112:37] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'descriptor' @ [112:58] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [112:69] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'index' @ [112:85] ==> val index: Int defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'name' @ [112:92] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [112:97] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'function' @ [113:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'parameters' @ [113:22] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [113:36] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'paramName' @ [113:48] ==> val paramName: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'aliases' @ [114:13] ==> val aliases: MutableMap<KtExpression, JsExpression> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'valueArg' @ [114:21] ==> val valueArg: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'getArgumentExpression' @ [114:30] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'paramName' @ [114:59] ==> val paramName: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'makeRef' @ [114:69] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'context' @ [116:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'innerBlock' @ [116:39] ==> @NotNull public open fun innerBlock(@NotNull block: JsBlock): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'function' @ [116:50] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'body' @ [116:59] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'innerContextWithAliasesForExpressions' @ [116:65] ==> @NotNull public open fun innerContextWithAliasesForExpressions(@NotNull aliases: (MutableMap<(KtExpression..KtExpression?), (JsExpression..JsExpression?)>..Map<(KtExpression..KtExpression?), (JsExpression..JsExpression?)>)): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'aliases' @ [116:103] ==> val aliases: MutableMap<KtExpression, JsExpression> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'CallTranslator' @ [117:26] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translate' @ [117:41] ==> @JvmOverloads @JvmStatic public final fun translate(context: TranslationContext, resolvedCall: ResolvedCall<out FunctionDescriptor>, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'functionContext' @ [117:51] ==> val functionContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'fakeResolvedCall' @ [117:68] ==> val fakeResolvedCall: <no name provided> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'receiverParam' @ [117:86] ==> val receiverParam: JsNameRef? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'function' @ [118:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'body' @ [118:18] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [118:23] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsReturn' @ [118:37] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'invocation' @ [118:46] ==> val invocation: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'bindIfNecessary' @ [120:30] ==> private final fun bindIfNecessary(function: JsFunction, receiver: JsExpression?): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'function' @ [120:46] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'receiver' @ [120:56] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'wrapFunctionCallableRef' @ [121:16] ==> private final fun wrapFunctionCallableRef(name: String, function: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'expression' @ [121:40] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[ValueParameterDescriptorImpl]

'callableReference' @ [121:51] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedName' @ [121:69] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'rawCallableRef' @ [121:90] ==> val rawCallableRef: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForFunction[LocalVariableDescriptor]

'expression' @ [130:20] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'callableReference' @ [130:31] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getPropertyResolvedCallWithAssert' @ [130:49] ==> public fun KtExpression.getPropertyResolvedCallWithAssert(context: BindingContext): ResolvedCall<out PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [130:83] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'bindingContext' @ [130:91] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'translateForPropertyAccessor' @ [132:22] ==> private final fun translateForPropertyAccessor(call: ResolvedCall<out PropertyDescriptor>, expression: KtExpression, descriptor: PropertyDescriptor, context: TranslationContext, receiver: JsExpression?, isSetter: Boolean, translator: (TranslationContext, ResolvedCall<out PropertyDescriptor>, JsExpression, JsExpression?) -> JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'call' @ [132:51] ==> val call: ResolvedCall<out PropertyDescriptor> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[LocalVariableDescriptor]

'expression' @ [132:57] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'descriptor' @ [132:69] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'context' @ [132:81] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'receiver' @ [132:90] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'CallTranslator' @ [133:13] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translateGet' @ [133:28] ==> public final fun translateGet(context: TranslationContext, resolvedCall: ResolvedCall<out VariableDescriptor>, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'context' @ [133:41] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [133:50] ==> value-parameter call: ResolvedCall<out PropertyDescriptor> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty.<anonymous>[ValueParameterDescriptorImpl]

'receiverParam' @ [133:56] ==> value-parameter receiverParam: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty.<anonymous>[ValueParameterDescriptorImpl]

'if (isSetterVisible(descriptor, context)) {
            translateForPropertyAccessor(call, expression, descriptor, context, receiver, true, CallTranslator::translateSet)
        }
        else {
            null
        }' @ [136:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'isSetterVisible' @ [136:26] ==> private final fun isSetterVisible(descriptor: PropertyDescriptor, context: TranslationContext): Boolean defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'descriptor' @ [136:42] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'context' @ [136:54] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'translateForPropertyAccessor' @ [137:13] ==> private final fun translateForPropertyAccessor(call: ResolvedCall<out PropertyDescriptor>, expression: KtExpression, descriptor: PropertyDescriptor, context: TranslationContext, receiver: JsExpression?, isSetter: Boolean, translator: (TranslationContext, ResolvedCall<out PropertyDescriptor>, JsExpression, JsExpression?) -> JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'call' @ [137:42] ==> val call: ResolvedCall<out PropertyDescriptor> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[LocalVariableDescriptor]

'expression' @ [137:48] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'descriptor' @ [137:60] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'context' @ [137:72] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'receiver' @ [137:81] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'CallTranslator' @ [137:97] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translateSet' @ [137:113] ==> public final fun translateSet(context: TranslationContext, resolvedCall: ResolvedCall<out VariableDescriptor>, value: JsExpression, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'wrapPropertyCallableRef' @ [143:16] ==> private final fun wrapPropertyCallableRef(receiver: JsExpression?, descriptor: PropertyDescriptor, name: String, getter: JsExpression, setter: JsExpression?): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'receiver' @ [143:40] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'descriptor' @ [143:50] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'expression' @ [143:62] ==> value-parameter expression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[ValueParameterDescriptorImpl]

'callableReference' @ [143:73] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedName' @ [143:91] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'getter' @ [143:112] ==> val getter: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[LocalVariableDescriptor]

'setter' @ [143:120] ==> val setter: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForProperty[LocalVariableDescriptor]

'descriptor' @ [147:22] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible[ValueParameterDescriptorImpl]

'setter' @ [147:33] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [148:13] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible[LocalVariableDescriptor]

'visibility' @ [148:20] ==> public final val PropertySetterDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [148:47] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'context' @ [149:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible[ValueParameterDescriptorImpl]

'classDescriptor' @ [149:39] ==> public final val TranslationContext.classDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'generateSequence' @ [151:28] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: DeclarationDescriptor?, nextFunction: (DeclarationDescriptor) -> DeclarationDescriptor?): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'classDescriptor' @ [151:68] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible[LocalVariableDescriptor]

'it' @ [151:87] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [151:90] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'filterIsInstance' @ [152:18] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<ClassDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'descriptor' @ [153:16] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible[ValueParameterDescriptorImpl]

'containingDeclaration' @ [153:27] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'outerClasses' @ [153:52] ==> val outerClasses: Sequence<ClassDescriptor> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.isSetterVisible[LocalVariableDescriptor]

'JsFunction' @ [165:32] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [165:43] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'scope' @ [165:51] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsBlock' @ [165:60] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'accessorFunction' @ [166:9] ==> val accessorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'source' @ [166:26] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [166:35] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'finalElement' @ [166:46] ==> public val PsiElement.finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[PropertyDescriptorImpl]

'context' @ [167:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'innerBlock' @ [167:39] ==> @NotNull public open fun innerBlock(@NotNull block: JsBlock): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'accessorFunction' @ [167:50] ==> val accessorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'body' @ [167:67] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'if (descriptor.dispatchReceiverParameter != null || descriptor.extensionReceiverParameter != null) {
            val name = JsScope.declareTemporaryName(Namer.getReceiverParameterName())
            accessorFunction.parameters += JsParameter(name)
            name.makeRef()
        }
        else {
            null
        }' @ [168:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsNameRef?, elseBranch: JsNameRef?): JsNameRef?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsNameRef?

'descriptor' @ [168:33] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [168:44] ==> public final val PropertyDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [168:81] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [168:92] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'declareTemporaryName' @ [169:32] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'getReceiverParameterName' @ [169:59] ==> @NotNull public open fun getReceiverParameterName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'accessorFunction' @ [170:13] ==> val accessorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'parameters' @ [170:30] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [170:44] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'name' @ [170:56] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'name' @ [171:13] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'makeRef' @ [171:18] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'if (isSetter) {
            val name = JsScope.declareTemporaryName("value")
            accessorFunction.parameters += JsParameter(name)
            name.makeRef()
        }
        else {
            JsNullLiteral()
        }' @ [177:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isSetter' @ [177:30] ==> value-parameter isSetter: Boolean defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'declareTemporaryName' @ [178:32] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'accessorFunction' @ [179:13] ==> val accessorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'parameters' @ [179:30] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [179:44] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'name' @ [179:56] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'name' @ [180:13] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'makeRef' @ [180:18] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsNullLiteral' @ [183:13] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'invoke' @ [186:30] ==> public abstract operator fun invoke(p1: TranslationContext, p2: ResolvedCall<out PropertyDescriptor>, p3: JsExpression, p4: JsExpression?): JsExpression defined in kotlin.Function4[FunctionInvokeDescriptor]

'accessorContext' @ [186:41] ==> val accessorContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'call' @ [186:58] ==> value-parameter call: ResolvedCall<out PropertyDescriptor> defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'valueParam' @ [186:64] ==> val valueParam: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'receiverParam' @ [186:76] ==> val receiverParam: JsNameRef? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'accessorFunction' @ [187:9] ==> val accessorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'body' @ [187:26] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [187:31] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'if (isSetter) accessorResult.makeStmt() else JsReturn(accessorResult)' @ [187:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement, elseBranch: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement

'isSetter' @ [187:49] ==> value-parameter isSetter: Boolean defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'accessorResult' @ [187:59] ==> val accessorResult: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'makeStmt' @ [187:74] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'JsReturn' @ [187:90] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'accessorResult' @ [187:99] ==> val accessorResult: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'bindIfNecessary' @ [188:16] ==> private final fun bindIfNecessary(function: JsFunction, receiver: JsExpression?): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator[SimpleFunctionDescriptorImpl]

'accessorFunction' @ [188:32] ==> val accessorFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[LocalVariableDescriptor]

'receiver' @ [188:50] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.translateForPropertyAccessor[ValueParameterDescriptorImpl]

'if (receiver != null) {
            JsInvocation(JsNameRef("bind", function), JsNullLiteral(), receiver)
        }
        else {
            function
        }' @ [192:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'receiver' @ [192:20] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.bindIfNecessary[ValueParameterDescriptorImpl]

'JsInvocation' @ [193:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'JsNameRef' @ [193:26] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'function' @ [193:44] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.bindIfNecessary[ValueParameterDescriptorImpl]

'JsNullLiteral' @ [193:55] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'receiver' @ [193:72] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.bindIfNecessary[ValueParameterDescriptorImpl]

'function' @ [196:13] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.bindIfNecessary[ValueParameterDescriptorImpl]

'if (descriptor.containingDeclaration is ClassDescriptor || descriptor.extensionReceiverParameter != null) 1 else 0' @ [207:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'descriptor' @ [207:28] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'containingDeclaration' @ [207:39] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [207:83] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [207:94] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiver' @ [208:13] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'argCount' @ [209:13] ==> var argCount: Int defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'JsStringLiteral' @ [211:27] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'name' @ [211:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'JsIntLiteral' @ [212:31] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'argCount' @ [212:44] ==> var argCount: Int defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'JsNameRef' @ [213:25] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'PROPERTY_CALLABLE_REF' @ [213:41] ==> @NotNull public const final val PROPERTY_CALLABLE_REF: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'kotlinObject' @ [213:70] ==> @NotNull public open fun kotlinObject(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'JsInvocation' @ [214:26] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'invokeFun' @ [214:39] ==> val invokeFun: JsNameRef defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'nameLiteral' @ [214:50] ==> val nameLiteral: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'argCountLiteral' @ [214:63] ==> val argCountLiteral: JsIntLiteral defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'getter' @ [214:80] ==> value-parameter getter: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'setter' @ [215:13] ==> value-parameter setter: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'invocation' @ [216:13] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'arguments' @ [216:24] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'setter' @ [216:37] ==> value-parameter setter: JsExpression? defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[ValueParameterDescriptorImpl]

'invocation' @ [218:16] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapPropertyCallableRef[LocalVariableDescriptor]

'JsStringLiteral' @ [225:27] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'name' @ [225:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[ValueParameterDescriptorImpl]

'FUNCTION_CALLABLE_REF' @ [226:32] ==> @NotNull public const final val FUNCTION_CALLABLE_REF: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'JsNameRef' @ [227:25] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'invokeName' @ [227:35] ==> val invokeName: String defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

'kotlinObject' @ [227:53] ==> @NotNull public open fun kotlinObject(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'invokeFun' @ [228:9] ==> val invokeFun: JsNameRef defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

'sideEffects' @ [228:19] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [228:48] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'JsInvocation' @ [229:26] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'invokeFun' @ [229:39] ==> val invokeFun: JsNameRef defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

'nameLiteral' @ [229:50] ==> val nameLiteral: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

'function' @ [229:63] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[ValueParameterDescriptorImpl]

'invocation' @ [230:9] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

'isCallableReference' @ [230:20] ==> public var JsInvocation.isCallableReference: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'invocation' @ [231:9] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

'sideEffects' @ [231:20] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [231:49] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'invocation' @ [232:16] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.reference.CallableReferenceTranslator.wrapFunctionCallableRef[LocalVariableDescriptor]

