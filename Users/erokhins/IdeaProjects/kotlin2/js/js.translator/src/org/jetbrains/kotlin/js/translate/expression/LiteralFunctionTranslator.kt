'AbstractTranslator' @ [43:64] ==> protected/*protected and package*/ constructor AbstractTranslator(@NotNull context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.general.AbstractTranslator[JavaClassConstructorDescriptor]

'context' @ [43:83] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.<init>[ValueParameterDescriptorImpl]

'declaration' @ [45:28] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'finalElement' @ [45:40] ==> public val PsiElement.finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[PropertyDescriptorImpl]

'context' @ [46:31] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator[JavaMethodDescriptor]

'getFunctionDescriptor' @ [47:26] ==> @NotNull public open fun getFunctionDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtDeclarationWithBody): FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'invokingContext' @ [47:48] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'bindingContext' @ [47:64] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'declaration' @ [47:82] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'invokingContext' @ [49:22] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getFunctionObject' @ [49:38] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [49:56] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'invokingContext' @ [51:31] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'newFunctionBodyWithUsageTracker' @ [52:18] ==> @NotNull public open fun newFunctionBodyWithUsageTracker(@NotNull `fun`: JsFunction, @NotNull descriptor: MemberDescriptor): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'lambda' @ [52:50] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'descriptor' @ [52:58] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'translateAndAliasParameters' @ [53:18] ==> public fun TranslationContext.translateAndAliasParameters(descriptor: FunctionDescriptor, targetList: MutableList<JsParameter>): TranslationContext defined in org.jetbrains.kotlin.js.translate.expression[SimpleFunctionDescriptorImpl]

'descriptor' @ [53:46] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [53:58] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'parameters' @ [53:65] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'descriptor' @ [55:9] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'valueParameters' @ [55:20] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [55:36] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [56:17] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'lambda' @ [57:17] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'body' @ [57:24] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [57:29] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [57:40] ==> public abstract fun add(element: (JsStatement..JsStatement?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [57:44] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate.<anonymous>[ValueParameterDescriptorImpl]

'translate' @ [57:47] ==> public final fun ValueParameterDescriptorImpl.WithDestructuringDeclaration.translate(context: TranslationContext): JsVars defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator[SimpleFunctionDescriptorImpl]

'functionContext' @ [57:57] ==> val functionContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [61:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'body' @ [61:16] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [61:21] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'setDefaultValueForArguments' @ [61:35] ==> @NotNull public open fun setDefaultValueForArguments(@NotNull descriptor: FunctionDescriptor, @NotNull functionBodyContext: TranslationContext): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.translate.utils.FunctionBodyTranslator[JavaMethodDescriptor]

'descriptor' @ [61:63] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'functionContext' @ [61:75] ==> val functionContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [62:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'body' @ [62:16] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [62:21] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'translateFunctionBody' @ [62:35] ==> @NotNull public open fun translateFunctionBody(@NotNull descriptor: FunctionDescriptor, @NotNull declarationWithBody: KtDeclarationWithBody, @NotNull functionBodyContext: TranslationContext): JsBlock defined in org.jetbrains.kotlin.js.translate.utils.FunctionBodyTranslator[JavaMethodDescriptor]

'descriptor' @ [62:57] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'declaration' @ [62:69] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'functionContext' @ [62:82] ==> val functionContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [63:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'functionDescriptor' @ [63:16] ==> public var JsFunction.functionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'descriptor' @ [63:37] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [64:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'source' @ [64:16] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'finalElement' @ [64:25] ==> val finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'functionContext' @ [66:23] ==> val functionContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'usageTracker' @ [66:39] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'tracker' @ [68:13] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'hasCapturedExceptContaining' @ [68:21] ==> public fun UsageTracker.hasCapturedExceptContaining(): Boolean defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'simpleReturnFunction' @ [69:33] ==> @NotNull public open fun simpleReturnFunction(@NotNull functionScope: JsScope, @NotNull returnExpression: JsExpression): JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'invokingContext' @ [69:54] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'scope' @ [69:70] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'lambda' @ [69:79] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'source' @ [69:86] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'declaration' @ [69:93] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'lambdaCreator' @ [70:13] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'name' @ [70:27] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'invokingContext' @ [70:34] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getInnerNameForDescriptor' @ [70:50] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [70:76] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambdaCreator' @ [71:13] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'isLocal' @ [71:27] ==> public var JsFunction.isLocal: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'descriptor' @ [72:17] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'tracker' @ [72:31] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'capturedDescriptors' @ [72:39] ==> public final val capturedDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'!' @ [72:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [72:63] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'isCoroutineLambda' @ [72:74] ==> public val DeclarationDescriptor.isCoroutineLambda: Boolean defined in org.jetbrains.kotlin.js.descriptorUtils[DeserializedPropertyDescriptor]

'lambda' @ [73:17] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'name' @ [73:24] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'tracker' @ [73:31] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getNameForCapturedDescriptor' @ [73:39] ==> public fun UsageTracker.getNameForCapturedDescriptor(descriptor: DeclarationDescriptor): JsName? defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [73:68] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambdaCreator' @ [75:13] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'name' @ [75:27] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'staticRef' @ [75:32] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'lambdaCreator' @ [75:44] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambdaCreator' @ [76:13] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'fillCoroutineMetadata' @ [76:27] ==> public final fun JsFunction.fillCoroutineMetadata(context: TranslationContext, descriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator[SimpleFunctionDescriptorImpl]

'invokingContext' @ [76:49] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'descriptor' @ [76:66] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambdaCreator' @ [77:13] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'source' @ [77:27] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'declaration' @ [77:36] ==> value-parameter declaration: KtDeclarationWithBody defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'lambdaCreator' @ [78:20] ==> val lambdaCreator: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'withCapturedParameters' @ [78:34] ==> public fun JsFunction.withCapturedParameters(descriptor: CallableMemberDescriptor, context: TranslationContext, invokingContext: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [78:57] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'functionContext' @ [78:69] ==> val functionContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'invokingContext' @ [78:86] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [81:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'name' @ [81:16] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'invokingContext' @ [81:23] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getInnerNameForDescriptor' @ [81:39] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [81:65] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'descriptor' @ [82:13] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'tracker' @ [82:27] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'capturedDescriptors' @ [82:35] ==> public final val capturedDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'tracker' @ [83:32] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getNameForCapturedDescriptor' @ [83:40] ==> public fun UsageTracker.getNameForCapturedDescriptor(descriptor: DeclarationDescriptor): JsName? defined in org.jetbrains.kotlin.js.translate.context in file UsageTracker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [83:69] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'invokingContext' @ [84:30] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getInnerNameForDescriptor' @ [84:46] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [84:72] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'NameReplacingVisitor' @ [85:36] ==> public constructor NameReplacingVisitor(replaceMap: Map<JsName, JsExpression>) defined in org.jetbrains.kotlin.js.inline.util.rewriters.NameReplacingVisitor[ClassConstructorDescriptorImpl]

'mapOf' @ [85:57] ==> public fun <K, V> mapOf(pair: Pair<JsName, JsNameRef>): Map<JsName, JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsNameRef

'capturedName' @ [85:63] ==> val capturedName: JsName defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'pureFqn' @ [85:90] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'globalName' @ [85:98] ==> val globalName: JsName defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'replacingVisitor' @ [86:13] ==> val replacingVisitor: NameReplacingVisitor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'accept' @ [86:30] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsFunction..JsFunction?)): (JsFunction..JsFunction?) defined in org.jetbrains.kotlin.js.inline.util.rewriters.NameReplacingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsFunction

'lambda' @ [86:37] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [89:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'isLocal' @ [89:16] ==> public var JsFunction.isLocal: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'invokingContext' @ [91:9] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'addDeclarationStatement' @ [91:25] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'lambda' @ [91:49] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'makeStmt' @ [91:56] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'lambda' @ [92:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'fillCoroutineMetadata' @ [92:16] ==> public final fun JsFunction.fillCoroutineMetadata(context: TranslationContext, descriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator[SimpleFunctionDescriptorImpl]

'invokingContext' @ [92:38] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'descriptor' @ [92:55] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [93:9] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'name' @ [93:16] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'staticRef' @ [93:21] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'lambda' @ [93:33] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'getReferenceToLambda' @ [94:16] ==> private fun getReferenceToLambda(context: TranslationContext, descriptor: CallableMemberDescriptor, name: JsName): JsExpression defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'invokingContext' @ [94:37] ==> val invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'descriptor' @ [94:54] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'lambda' @ [94:66] ==> val lambda: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'name' @ [94:73] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'!' @ [98:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [98:14] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'isSuspend' @ [98:25] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'fillCoroutineMetadata' @ [100:9] ==> public fun JsFunction.fillCoroutineMetadata(context: TranslationContext, descriptor: FunctionDescriptor, hasController: Boolean): Unit defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'context' @ [100:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'descriptor' @ [100:40] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'descriptor' @ [100:68] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [100:79] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'?:' @ [105:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDestructuringDeclaration?, right: KtDestructuringDeclaration): KtDestructuringDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDestructuringDeclaration

'DescriptorToSourceUtils' @ [105:18] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [105:42] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'this' @ [105:66] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ReceiverParameterDescriptorImpl]

'destructuringDeclaration' @ [105:90] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'error' @ [106:20] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [106:69] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ReceiverParameterDescriptorImpl]

'translateAsValueReference' @ [108:48] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'this' @ [108:74] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ReceiverParameterDescriptorImpl]

'context' @ [108:80] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'translate' @ [109:51] ==> @NotNull public open fun translate(@NotNull multiDeclaration: KtDestructuringDeclaration, @NotNull multiObjectExpr: JsExpression, @NotNull context: TranslationContext): JsVars defined in org.jetbrains.kotlin.js.translate.expression.DestructuringDeclarationTranslator[JavaMethodDescriptor]

'destructuringDeclaration' @ [109:61] ==> val destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'parameterRef' @ [109:87] ==> val parameterRef: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[LocalVariableDescriptor]

'context' @ [109:101] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.LiteralFunctionTranslator.translate[ValueParameterDescriptorImpl]

'context' @ [118:5] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'addDeclarationStatement' @ [118:13] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'makeStmt' @ [118:37] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'getReferenceToLambda' @ [119:15] ==> private fun getReferenceToLambda(context: TranslationContext, descriptor: CallableMemberDescriptor, name: JsName): JsExpression defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'invokingContext' @ [119:36] ==> value-parameter invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'descriptor' @ [119:53] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'name' @ [119:65] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'JsInvocation' @ [120:22] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'ref' @ [120:35] ==> val ref: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'apply' @ [120:40] ==> @InlineOnly public inline fun <T> JsInvocation.apply(block: JsInvocation.() -> Unit): JsInvocation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsInvocation

'sideEffects' @ [120:48] ==> public var HasMetadata.sideEffects: SideEffectKind defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'PURE' @ [120:77] ==> enum entry PURE defined in org.jetbrains.kotlin.js.backend.ast.metadata.SideEffectKind[FakeCallableDescriptorForObject]

'invocation' @ [122:31] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'arguments' @ [122:42] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'this' @ [123:30] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ReceiverParameterDescriptorImpl]

'parameters' @ [123:35] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'context' @ [125:19] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'usageTracker' @ [125:27] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'component1' @ [127:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<DeclarationDescriptor, JsName>.component1(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> JsName

'component2' @ [127:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<DeclarationDescriptor, JsName>.component2(): JsName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> JsName

'tracker' @ [127:40] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'capturedDescriptorToJsName' @ [127:48] ==> public final val capturedDescriptorToJsName: Map<DeclarationDescriptor, JsName> defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'capturedDescriptor' @ [128:13] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'tracker' @ [128:35] ==> val tracker: UsageTracker defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'containingDescriptor' @ [128:43] ==> public final val containingDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[PropertyDescriptorImpl]

'!' @ [128:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'capturedDescriptor' @ [128:68] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'isCoroutineLambda' @ [128:87] ==> public val DeclarationDescriptor.isCoroutineLambda: Boolean defined in org.jetbrains.kotlin.js.descriptorUtils[DeserializedPropertyDescriptor]

'invokingContext' @ [130:27] ==> value-parameter invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'getArgumentForClosureConstructor' @ [130:43] ==> @NotNull public open fun getArgumentForClosureConstructor(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'capturedDescriptor' @ [130:76] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'listOf' @ [131:30] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'capturedRef' @ [131:37] ==> val capturedRef: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'listOf' @ [132:32] ==> public fun <T> listOf(element: JsParameter): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsParameter

'JsParameter' @ [132:39] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'name' @ [132:51] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'capturedDescriptor' @ [134:13] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'capturedDescriptor' @ [134:62] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'isReified' @ [134:81] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'additionalArgs' @ [136:13] ==> var additionalArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'listOf' @ [136:30] ==> public fun <T> listOf(element: JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef

'invokingContext' @ [136:37] ==> value-parameter invokingContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [136:53] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'capturedDescriptor' @ [136:74] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'makeRef' @ [136:94] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'additionalArgs' @ [136:107] ==> var additionalArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'additionalParams' @ [137:13] ==> var additionalParams: List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'listOf' @ [137:32] ==> public fun <T> listOf(element: JsParameter): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsParameter

'JsParameter' @ [137:39] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'context' @ [137:51] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [137:59] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'capturedDescriptor' @ [137:80] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'additionalParams' @ [137:104] ==> var additionalParams: List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'capturedDescriptor' @ [140:13] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'isLocalInlineDeclaration' @ [140:57] ==> private fun isLocalInlineDeclaration(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'capturedDescriptor' @ [140:82] ==> val capturedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'capturedRef' @ [141:28] ==> val capturedRef: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'aliasRef' @ [142:33] ==> val aliasRef: JsNameRef? defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'getStaticRef' @ [142:43] ==> private fun HasName.getStaticRef(): JsNode? defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'localFunAlias' @ [144:17] ==> val localFunAlias: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'component1' @ [145:22] ==> public final operator fun component1(): List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.CapturedArgsParams[SimpleFunctionDescriptorImpl]

'component2' @ [145:28] ==> public final operator fun component2(): List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.CapturedArgsParams[SimpleFunctionDescriptorImpl]

'moveCapturedLocalInside' @ [145:38] ==> private fun moveCapturedLocalInside(capturingFunction: JsFunction, capturedName: JsName, localFunAlias: JsExpression): CapturedArgsParams defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'this' @ [145:62] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[ReceiverParameterDescriptorImpl]

'name' @ [145:68] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'localFunAlias' @ [145:74] ==> val localFunAlias: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'additionalArgs' @ [146:17] ==> var additionalArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'args' @ [146:34] ==> val args: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'additionalParams' @ [147:17] ==> var additionalParams: List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'params' @ [147:36] ==> val params: List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'functionParameters' @ [151:9] ==> val functionParameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>) defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'addAll' @ [151:28] ==> public abstract fun addAll(elements: Collection<(JsParameter..JsParameter?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'additionalParams' @ [151:35] ==> var additionalParams: List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'invocationArguments' @ [152:9] ==> val invocationArguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'addAll' @ [152:29] ==> public abstract fun addAll(elements: Collection<(JsExpression..JsExpression?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'additionalArgs' @ [152:36] ==> var additionalArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'invocation' @ [155:12] ==> val invocation: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.withCapturedParameters[LocalVariableDescriptor]

'if (context.isPublicInlineFunction) {
        val fqn = context.getQualifiedReference(descriptor)
        if (fqn is JsNameRef) {
            fqn.name?.let { it.staticRef = name.staticRef }
        }
        fqn
    }
    else {
        JsAstUtils.pureFqn(name, null)
    }' @ [159:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'context' @ [159:16] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[ValueParameterDescriptorImpl]

'isPublicInlineFunction' @ [159:24] ==> public final val TranslationContext.isPublicInlineFunction: Boolean[MyPropertyDescriptor]

'context' @ [160:19] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[ValueParameterDescriptorImpl]

'getQualifiedReference' @ [160:27] ==> @NotNull public open fun getQualifiedReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [160:49] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[ValueParameterDescriptorImpl]

'fqn' @ [161:13] ==> val fqn: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[LocalVariableDescriptor]

'fqn' @ [162:13] ==> val fqn: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[LocalVariableDescriptor]

'name' @ [162:17] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'let' @ [162:23] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Unit

'it' @ [162:29] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda.<anonymous>[ValueParameterDescriptorImpl]

'staticRef' @ [162:32] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'name' @ [162:44] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[ValueParameterDescriptorImpl]

'staticRef' @ [162:49] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'fqn' @ [164:9] ==> val fqn: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[LocalVariableDescriptor]

'pureFqn' @ [167:20] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'name' @ [167:28] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.translate.expression.getReferenceToLambda[ValueParameterDescriptorImpl]

'listOf' @ [171:75] ==> @InlineOnly public inline fun <T> listOf(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'listOf' @ [171:121] ==> @InlineOnly public inline fun <T> listOf(): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsParameter

'when (localFunAlias) {
        is JsNameRef -> {
            /** Local inline function does not capture anything, so just move alias inside */
            declareAliasInsideFunction(capturingFunction, capturedName, localFunAlias)
            CapturedArgsParams()
        }
        is JsInvocation ->
            moveCapturedLocalInside(capturingFunction, capturedName, localFunAlias)
        else ->
            throw AssertionError("Local function reference has wrong alias $localFunAlias")
    }' @ [184:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CapturedArgsParams, entry1: CapturedArgsParams, entry2: CapturedArgsParams): CapturedArgsParams[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CapturedArgsParams

'localFunAlias' @ [184:11] ==> value-parameter localFunAlias: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'declareAliasInsideFunction' @ [187:13] ==> private fun declareAliasInsideFunction(function: JsFunction, name: JsName, alias: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'capturingFunction' @ [187:40] ==> value-parameter capturingFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'capturedName' @ [187:59] ==> value-parameter capturedName: JsName defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'localFunAlias' @ [187:73] ==> value-parameter localFunAlias: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'CapturedArgsParams' @ [188:13] ==> public constructor CapturedArgsParams(arguments: List<JsExpression> = ..., parameters: List<JsParameter> = ...) defined in org.jetbrains.kotlin.js.translate.expression.CapturedArgsParams[ClassConstructorDescriptorImpl]

'moveCapturedLocalInside' @ [191:13] ==> private fun moveCapturedLocalInside(capturingFunction: JsFunction, capturedName: JsName, localFunAlias: JsInvocation): CapturedArgsParams defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'capturingFunction' @ [191:37] ==> value-parameter capturingFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'capturedName' @ [191:56] ==> value-parameter capturedName: JsName defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'localFunAlias' @ [191:70] ==> value-parameter localFunAlias: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'AssertionError' @ [193:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'localFunAlias' @ [193:77] ==> value-parameter localFunAlias: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'localFunAlias' @ [215:24] ==> value-parameter localFunAlias: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'arguments' @ [215:38] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'getTemporaryNamesInScope' @ [217:22] ==> private fun getTemporaryNamesInScope(suggested: List<JsExpression>): List<JsName> defined in org.jetbrains.kotlin.js.translate.expression[SimpleFunctionDescriptorImpl]

'capturedArgs' @ [217:47] ==> val capturedArgs: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'freshNames' @ [219:30] ==> val freshNames: List<JsName> defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'map' @ [219:41] ==> public inline fun <T, R> Iterable<JsName>.map(transform: (JsName) -> JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> JsNameRef

'JsName' @ [219:45] ==> public/*package*/ constructor JsName(@NotNull p0: String, p1: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaClassConstructorDescriptor]

'JsInvocation' @ [220:17] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'localFunAlias' @ [220:30] ==> value-parameter localFunAlias: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'qualifier' @ [220:44] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'aliasCallArguments' @ [220:55] ==> val aliasCallArguments: List<JsNameRef> defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'declareAliasInsideFunction' @ [221:5] ==> private fun declareAliasInsideFunction(function: JsFunction, name: JsName, alias: JsExpression): Unit defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'capturingFunction' @ [221:32] ==> value-parameter capturingFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'capturedName' @ [221:51] ==> value-parameter capturedName: JsName defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[ValueParameterDescriptorImpl]

'alias' @ [221:65] ==> val alias: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'freshNames' @ [223:30] ==> val freshNames: List<JsName> defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'map' @ [223:41] ==> public inline fun <T, R> Iterable<JsName>.map(transform: (JsName) -> JsParameter): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> JsParameter

'CapturedArgsParams' @ [224:12] ==> public constructor CapturedArgsParams(arguments: List<JsExpression> = ..., parameters: List<JsParameter> = ...) defined in org.jetbrains.kotlin.js.translate.expression.CapturedArgsParams[ClassConstructorDescriptorImpl]

'capturedArgs' @ [224:31] ==> val capturedArgs: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'capturedParameters' @ [224:45] ==> val capturedParameters: List<JsParameter> defined in org.jetbrains.kotlin.js.translate.expression.moveCapturedLocalInside[LocalVariableDescriptor]

'name' @ [228:5] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.translate.expression.declareAliasInsideFunction[ValueParameterDescriptorImpl]

'staticRef' @ [228:10] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'alias' @ [228:22] ==> value-parameter alias: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.declareAliasInsideFunction[ValueParameterDescriptorImpl]

'function' @ [229:5] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.declareAliasInsideFunction[ValueParameterDescriptorImpl]

'getInnerFunction' @ [229:14] ==> public fun JsFunction.getInnerFunction(): JsFunction? defined in org.jetbrains.kotlin.js.inline.util in file functionUtils.kt[SimpleFunctionDescriptorImpl]

'addDeclaration' @ [229:34] ==> private fun JsFunction.addDeclaration(name: JsName, value: JsExpression?): Unit defined in org.jetbrains.kotlin.js.translate.expression in file LiteralFunctionTranslator.kt[SimpleFunctionDescriptorImpl]

'name' @ [229:49] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.translate.expression.declareAliasInsideFunction[ValueParameterDescriptorImpl]

'alias' @ [229:55] ==> value-parameter alias: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.declareAliasInsideFunction[ValueParameterDescriptorImpl]

'arrayListOf' @ [233:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<JsName> /* = ArrayList<JsName> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'suggested' @ [235:24] ==> value-parameter suggested: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[ValueParameterDescriptorImpl]

'suggestion' @ [236:13] ==> val suggestion: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[LocalVariableDescriptor]

'AssertionError' @ [237:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'suggestion' @ [240:21] ==> val suggestion: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[LocalVariableDescriptor]

'ident' @ [240:32] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'declareTemporaryName' @ [241:28] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'ident' @ [241:49] ==> val ident: String defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[LocalVariableDescriptor]

'freshNames' @ [242:9] ==> val freshNames: ArrayList<JsName> /* = ArrayList<JsName> */ defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[LocalVariableDescriptor]

'add' @ [242:20] ==> public open fun add(element: JsName): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'name' @ [242:24] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[LocalVariableDescriptor]

'freshNames' @ [245:12] ==> val freshNames: ArrayList<JsName> /* = ArrayList<JsName> */ defined in org.jetbrains.kotlin.js.translate.expression.getTemporaryNamesInScope[LocalVariableDescriptor]

'newVar' @ [249:34] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'name' @ [249:41] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.translate.expression.addDeclaration[ValueParameterDescriptorImpl]

'value' @ [249:47] ==> value-parameter value: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.addDeclaration[ValueParameterDescriptorImpl]

'this' @ [250:5] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.addDeclaration[ReceiverParameterDescriptorImpl]

'body' @ [250:10] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [250:15] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [250:26] ==> public abstract fun add(index: Int, element: (JsStatement..JsStatement?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'declaration' @ [250:33] ==> val declaration: JsVars defined in org.jetbrains.kotlin.js.translate.expression.addDeclaration[LocalVariableDescriptor]

'this' @ [254:12] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.getStaticRef[ReceiverParameterDescriptorImpl]

'name' @ [254:17] ==> public final var HasName.name: (JsName..JsName?)[MyPropertyDescriptor]

'staticRef' @ [254:23] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'descriptor' @ [258:12] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.expression.isLocalInlineDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [259:15] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.expression.isLocalInlineDeclaration[ValueParameterDescriptorImpl]

'getVisibility' @ [259:26] ==> @NotNull public abstract fun getVisibility(): Visibility defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'LOCAL' @ [259:58] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isInline' @ [260:26] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [260:35] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.expression.isLocalInlineDeclaration[ValueParameterDescriptorImpl]

