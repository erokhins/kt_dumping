'function' @ [30:33] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'getInnerFunction' @ [30:42] ==> public fun JsFunction.getInnerFunction(): JsFunction? defined in org.jetbrains.kotlin.js.inline.util in file functionUtils.kt[SimpleFunctionDescriptorImpl]

'innerFunction' @ [31:36] ==> private final val innerFunction: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'function' @ [31:53] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'functionWithBody' @ [32:24] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'body' @ [32:41] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'function' @ [33:35] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'collectLocalVariables' @ [33:44] ==> public fun JsFunction.collectLocalVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'functionWithBody' @ [33:70] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'collectLocalVariables' @ [33:87] ==> public fun JsFunction.collectLocalVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'functionWithBody' @ [34:35] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [34:52] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'last' @ [34:63] ==> public fun <T> List<(JsParameter..JsParameter?)>.last(): (JsParameter..JsParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'name' @ [34:70] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'toMutableSet' @ [34:76] ==> public fun <T> Iterable<JsName>.toMutableSet(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'declareTemporaryName' @ [35:37] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'name' @ [35:72] ==> value-parameter name: String? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.<init>[ValueParameterDescriptorImpl]

'CoroutineTransformationContext' @ [38:23] ==> public constructor CoroutineTransformationContext(scope: JsScope, function: JsFunction) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[ClassConstructorDescriptorImpl]

'function' @ [38:54] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'scope' @ [38:63] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'function' @ [38:70] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'CoroutineBodyTransformer' @ [39:31] ==> public constructor CoroutineBodyTransformer(context: CoroutineTransformationContext) defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[ClassConstructorDescriptorImpl]

'context' @ [39:56] ==> val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'bodyTransformer' @ [40:9] ==> val bodyTransformer: CoroutineBodyTransformer defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'preProcess' @ [40:25] ==> public final fun preProcess(node: JsNode): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'body' @ [40:36] ==> private final val body: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'body' @ [41:9] ==> private final val body: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'statements' @ [41:14] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'forEach' @ [41:25] ==> @HidesMembers public inline fun <T> Iterable<(JsStatement..JsStatement?)>.forEach(action: ((JsStatement..JsStatement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'it' @ [41:35] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [41:38] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'bodyTransformer' @ [41:45] ==> val bodyTransformer: CoroutineBodyTransformer defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'bodyTransformer' @ [42:31] ==> val bodyTransformer: CoroutineBodyTransformer defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'postProcess' @ [42:47] ==> public final fun postProcess(): List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBodyTransformer[SimpleFunctionDescriptorImpl]

'coroutineBlocks' @ [43:37] ==> val coroutineBlocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'indexOf' @ [43:53] ==> public abstract fun indexOf(element: CoroutineBlock): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'context' @ [43:61] ==> val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'globalCatchBlock' @ [43:69] ==> public final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'coroutineBlocks' @ [45:9] ==> val coroutineBlocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'forEach' @ [45:25] ==> @HidesMembers public inline fun <T> Iterable<CoroutineBlock>.forEach(action: (CoroutineBlock) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'it' @ [45:35] ==> value-parameter it: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform.<anonymous>[ValueParameterDescriptorImpl]

'jsBlock' @ [45:38] ==> public final val jsBlock: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'collectAdditionalLocalVariables' @ [45:46] ==> private final fun JsBlock.collectAdditionalLocalVariables(): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'coroutineBlocks' @ [46:9] ==> val coroutineBlocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'forEach' @ [46:25] ==> @HidesMembers public inline fun <T> Iterable<CoroutineBlock>.forEach(action: (CoroutineBlock) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'it' @ [46:35] ==> value-parameter it: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform.<anonymous>[ValueParameterDescriptorImpl]

'jsBlock' @ [46:38] ==> public final val jsBlock: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'replaceLocalVariables' @ [46:46] ==> public fun JsBlock.replaceLocalVariables(context: CoroutineTransformationContext, localVariables: Set<JsName>): Unit defined in org.jetbrains.kotlin.js.coroutine[SimpleFunctionDescriptorImpl]

'context' @ [46:68] ==> val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'localVariables' @ [46:77] ==> private final val localVariables: MutableSet<JsName> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'mutableListOf' @ [48:36] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'generateDoResume' @ [49:9] ==> private final fun generateDoResume(coroutineBlocks: List<CoroutineBlock>, context: CoroutineTransformationContext, statements: MutableList<JsStatement>): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'coroutineBlocks' @ [49:26] ==> val coroutineBlocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'context' @ [49:43] ==> val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'additionalStatements' @ [49:52] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'generateContinuationConstructor' @ [50:9] ==> private final fun generateContinuationConstructor(context: CoroutineTransformationContext, statements: MutableList<JsStatement>, globalCatchBlockIndex: Int): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [50:41] ==> val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'additionalStatements' @ [50:50] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'globalCatchBlockIndex' @ [50:72] ==> val globalCatchBlockIndex: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'generateCoroutineInstantiation' @ [52:9] ==> private final fun generateCoroutineInstantiation(context: CoroutineTransformationContext): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [52:40] ==> val context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'additionalStatements' @ [54:16] ==> val additionalStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.transform[LocalVariableDescriptor]

'context' @ [62:26] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'metadata' @ [62:34] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'psiElement' @ [62:43] ==> public final val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsFunction' @ [64:27] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'function' @ [64:38] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'scope' @ [64:47] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'parent' @ [64:53] ==> public final val JsFunctionScope.parent: (JsScope..JsScope?)[MyPropertyDescriptor]

'JsBlock' @ [64:61] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'constructor' @ [65:9] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'source' @ [65:21] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'psiElement' @ [65:30] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'finalElement' @ [65:42] ==> public val PsiElement.finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[PropertyDescriptorImpl]

'constructor' @ [66:9] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'name' @ [66:21] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'className' @ [66:28] ==> private final val className: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'context' @ [67:13] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'metadata' @ [67:21] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'hasReceiver' @ [67:30] ==> public final val hasReceiver: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'constructor' @ [68:13] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'parameters' @ [68:25] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [68:39] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'context' @ [68:51] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'receiverFieldName' @ [68:59] ==> public final val receiverFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'function' @ [70:26] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [70:35] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'innerFunction' @ [70:48] ==> private final val innerFunction: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [70:63] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'orEmpty' @ [70:74] ==> @InlineOnly public inline fun <T> List<(JsParameter..JsParameter?)>?.orEmpty(): List<(JsParameter..JsParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'constructor' @ [71:9] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'parameters' @ [71:21] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'parameters' @ [71:35] ==> val parameters: List<(JsParameter..JsParameter?)> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'map' @ [71:46] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsParameter): List<JsParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsParameter

'JsParameter' @ [71:52] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'it' @ [71:64] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [71:67] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'parameters' @ [72:29] ==> val parameters: List<(JsParameter..JsParameter?)> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'lastOrNull' @ [72:40] ==> public fun <T> List<(JsParameter..JsParameter?)>.lastOrNull(): JsParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'name' @ [72:54] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'if (context.metadata.hasController) {
            JsScope.declareTemporaryName("controller").apply {
                constructor.parameters.add(constructor.parameters.lastIndex, JsParameter(this))
            }
        }
        else {
            null
        }' @ [74:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName?, elseBranch: JsName?): JsName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName?

'context' @ [74:34] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'metadata' @ [74:42] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'hasController' @ [74:51] ==> public final val hasController: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'declareTemporaryName' @ [75:21] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'apply' @ [75:56] ==> @InlineOnly public inline fun <T> JsName.apply(block: (JsName).() -> Unit): JsName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'constructor' @ [76:17] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'parameters' @ [76:29] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [76:40] ==> public abstract fun add(index: Int, element: (JsParameter..JsParameter?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'constructor' @ [76:44] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'parameters' @ [76:56] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'lastIndex' @ [76:67] ==> public val <T> List<(JsParameter..JsParameter?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'JsParameter' @ [76:78] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'this' @ [76:90] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[ReceiverParameterDescriptorImpl]

'lastParameter' @ [83:30] ==> val lastParameter: JsName? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'makeRef' @ [83:46] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'function' @ [84:31] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [84:40] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'map' @ [84:51] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsName): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsName

'it' @ [84:57] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [84:60] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'innerFunction' @ [84:69] ==> private final val innerFunction: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [84:84] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'map' @ [84:96] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsName): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsName

'it' @ [84:102] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [84:105] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'orEmpty' @ [84:112] ==> @InlineOnly public inline fun <T> List<JsName>?.orEmpty(): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'toSet' @ [84:123] ==> public fun <T> Iterable<JsName>.toSet(): Set<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'constructor' @ [86:9] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'body' @ [86:21] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [86:26] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'run' @ [86:37] ==> @InlineOnly public inline fun <T, R> (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>).run(block: ((MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>..kotlin.collections.List<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>)
    <R> -> Unit

'context' @ [87:29] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'metadata' @ [87:37] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'baseClassRef' @ [87:46] ==> public final val baseClassRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'deepCopy' @ [87:59] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [88:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[ReceiverParameterDescriptorImpl]

'JsInvocation' @ [88:21] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'getFunctionCallRef' @ [88:40] ==> @NotNull public open fun getFunctionCallRef(@NotNull functionExpression: JsExpression): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'baseClass' @ [88:59] ==> val baseClass: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[LocalVariableDescriptor]

'JsThisRef' @ [88:71] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'interceptorRef' @ [88:84] ==> val interceptorRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'source' @ [88:100] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'psiElement' @ [88:107] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'makeStmt' @ [88:119] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'controllerName' @ [89:17] ==> val controllerName: JsName? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'assignToField' @ [90:17] ==> private final fun MutableList<JsStatement>.assignToField(fieldName: JsName, value: JsExpression, psiElement: PsiElement?): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [90:31] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'controllerFieldName' @ [90:39] ==> public final val controllerFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'controllerName' @ [90:60] ==> val controllerName: JsName? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'makeRef' @ [90:75] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'psiElement' @ [90:86] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'assignToField' @ [92:13] ==> private final fun MutableList<JsStatement>.assignToField(fieldName: JsName, value: JsExpression, psiElement: PsiElement?): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [92:27] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'metadata' @ [92:35] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'exceptionStateName' @ [92:44] ==> public final val exceptionStateName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsIntLiteral' @ [92:64] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'globalCatchBlockIndex' @ [92:77] ==> value-parameter globalCatchBlockIndex: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'psiElement' @ [92:101] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'context' @ [93:17] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'metadata' @ [93:25] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'hasReceiver' @ [93:34] ==> public final val hasReceiver: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'assignToField' @ [94:17] ==> private final fun MutableList<JsStatement>.assignToField(fieldName: JsName, value: JsExpression, psiElement: PsiElement?): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [94:31] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'receiverFieldName' @ [94:39] ==> public final val receiverFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'context' @ [94:58] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'receiverFieldName' @ [94:66] ==> public final val receiverFieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'makeRef' @ [94:84] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'psiElement' @ [94:95] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'localVariables' @ [96:35] ==> private final val localVariables: MutableSet<JsName> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'if (localVariable !in parameterNames) Namer.getUndefinedExpression() else localVariable.makeRef()' @ [97:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'localVariable' @ [97:33] ==> val localVariable: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[LocalVariableDescriptor]

'parameterNames' @ [97:51] ==> val parameterNames: Set<JsName> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'getUndefinedExpression' @ [97:73] ==> @NotNull public open fun getUndefinedExpression(): JsExpression defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'localVariable' @ [97:103] ==> val localVariable: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[LocalVariableDescriptor]

'makeRef' @ [97:117] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'assignToField' @ [98:17] ==> private final fun MutableList<JsStatement>.assignToField(fieldName: JsName, value: JsExpression, psiElement: PsiElement?): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [98:31] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'getFieldName' @ [98:39] ==> public final fun getFieldName(variableName: JsName): JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[SimpleFunctionDescriptorImpl]

'localVariable' @ [98:52] ==> val localVariable: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[LocalVariableDescriptor]

'value' @ [98:68] ==> val value: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor.<anonymous>[LocalVariableDescriptor]

'psiElement' @ [98:75] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'statements' @ [102:9] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[ValueParameterDescriptorImpl]

'addAll' @ [102:20] ==> public abstract fun addAll(index: Int, elements: Collection<JsStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'listOf' @ [102:30] ==> public fun <T> listOf(vararg elements: JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'constructor' @ [102:37] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'makeStmt' @ [102:49] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'generateCoroutineMetadata' @ [102:61] ==> private final fun generateCoroutineMetadata(constructorName: JsName): JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'constructor' @ [102:87] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'name' @ [102:99] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'generateCoroutinePrototype' @ [103:17] ==> private final fun generateCoroutinePrototype(constructorName: JsName): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'constructor' @ [103:44] ==> val constructor: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateContinuationConstructor[LocalVariableDescriptor]

'name' @ [103:56] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'prototypeOf' @ [107:36] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [107:48] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'constructorName' @ [107:58] ==> value-parameter constructorName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[ValueParameterDescriptorImpl]

'createObjectWithPrototypeFrom' @ [109:31] ==> @NotNull public open fun createObjectWithPrototypeFrom(@NotNull referenceToClass: JsExpression): JsInvocation defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'function' @ [109:61] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'coroutineMetadata' @ [109:70] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'baseClassRef' @ [109:90] ==> public final val baseClassRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'deepCopy' @ [109:103] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'assignment' @ [110:42] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'prototype' @ [110:53] ==> val prototype: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[LocalVariableDescriptor]

'baseClass' @ [110:64] ==> val baseClass: JsInvocation defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[LocalVariableDescriptor]

'assignment' @ [111:44] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [111:55] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'prototype' @ [111:80] ==> val prototype: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[LocalVariableDescriptor]

'deepCopy' @ [111:90] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'JsNameRef' @ [111:103] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'constructorName' @ [111:113] ==> value-parameter constructorName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[ValueParameterDescriptorImpl]

'listOf' @ [112:16] ==> public fun <T> listOf(vararg elements: JsStatement): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'assignPrototype' @ [112:23] ==> val assignPrototype: JsBinaryOperation defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[LocalVariableDescriptor]

'makeStmt' @ [112:39] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'assignConstructor' @ [112:51] ==> val assignConstructor: JsBinaryOperation defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutinePrototype[LocalVariableDescriptor]

'makeStmt' @ [112:69] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'function' @ [116:31] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'coroutineMetadata' @ [116:40] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'baseClassRef' @ [116:60] ==> public final val baseClassRef: JsExpression defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'deepCopy' @ [116:73] ==> @NotNull public abstract fun deepCopy(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'JsObjectLiteral' @ [118:30] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'apply' @ [118:52] ==> @InlineOnly public inline fun <T> JsObjectLiteral.apply(block: JsObjectLiteral.() -> Unit): JsObjectLiteral defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsObjectLiteral

'propertyInitializers' @ [119:13] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [120:21] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [120:43] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA_CLASS_KIND' @ [120:59] ==> public const final val METADATA_CLASS_KIND: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'JsNameRef' @ [121:43] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'CLASS_KIND_CLASS' @ [121:59] ==> public const final val CLASS_KIND_CLASS: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'JsNameRef' @ [121:77] ==> public constructor JsNameRef(@NotNull p0: String, @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'CLASS_KIND_ENUM' @ [121:93] ==> public const final val CLASS_KIND_ENUM: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'KOTLIN_NAME' @ [121:116] ==> public const final val KOTLIN_NAME: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'propertyInitializers' @ [122:13] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [122:37] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [122:59] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA_SIMPLE_NAME' @ [122:75] ==> public const final val METADATA_SIMPLE_NAME: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'JsNullLiteral' @ [122:98] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'propertyInitializers' @ [123:13] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'JsPropertyInitializer' @ [123:37] ==> public constructor JsPropertyInitializer(@NotNull p0: JsExpression, @NotNull p1: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsPropertyInitializer[JavaClassConstructorDescriptor]

'JsNameRef' @ [123:59] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA_SUPERTYPES' @ [123:75] ==> public const final val METADATA_SUPERTYPES: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'JsArrayLiteral' @ [123:97] ==> public constructor JsArrayLiteral(p0: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaClassConstructorDescriptor]

'listOf' @ [123:112] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'baseClassRefRef' @ [123:119] ==> val baseClassRefRef: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineMetadata[LocalVariableDescriptor]

'assignment' @ [126:27] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [126:38] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'METADATA' @ [126:54] ==> public const final val METADATA: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'constructorName' @ [126:64] ==> value-parameter constructorName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineMetadata[ValueParameterDescriptorImpl]

'makeRef' @ [126:80] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'metadataObject' @ [126:92] ==> val metadataObject: JsObjectLiteral defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineMetadata[LocalVariableDescriptor]

'makeStmt' @ [126:108] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'JsFunction' @ [134:30] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: JsBlock, @NotNull p2: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'function' @ [134:41] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'scope' @ [134:50] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'parent' @ [134:56] ==> public final val JsFunctionScope.parent: (JsScope..JsScope?)[MyPropertyDescriptor]

'JsBlock' @ [134:64] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'resumeFunction' @ [135:9] ==> val resumeFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[LocalVariableDescriptor]

'source' @ [135:24] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'context' @ [135:33] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[ValueParameterDescriptorImpl]

'metadata' @ [135:41] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'psiElement' @ [135:50] ==> public final val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'finalElement' @ [135:62] ==> public val PsiElement.finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[PropertyDescriptorImpl]

'generateCoroutineBody' @ [137:29] ==> private final fun generateCoroutineBody(context: CoroutineTransformationContext, blocks: List<CoroutineBlock>): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'context' @ [137:51] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[ValueParameterDescriptorImpl]

'coroutineBlocks' @ [137:60] ==> value-parameter coroutineBlocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[ValueParameterDescriptorImpl]

'functionWithBody' @ [138:9] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'body' @ [138:26] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [138:31] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'clear' @ [138:42] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'resumeFunction' @ [140:9] ==> val resumeFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[LocalVariableDescriptor]

'body' @ [140:24] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [140:29] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'apply' @ [140:40] ==> @InlineOnly public inline fun <T> (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>).apply(block: ((MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)).() -> Unit): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>..kotlin.collections.List<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>)

'this' @ [141:13] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume.<anonymous>[ReceiverParameterDescriptorImpl]

'coroutineBody' @ [141:21] ==> val coroutineBody: List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[LocalVariableDescriptor]

'context' @ [144:26] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[ValueParameterDescriptorImpl]

'metadata' @ [144:34] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'doResumeName' @ [144:43] ==> public final val doResumeName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'statements' @ [145:9] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[ValueParameterDescriptorImpl]

'apply' @ [145:20] ==> @InlineOnly public inline fun <T> MutableList<JsStatement>.apply(block: MutableList<JsStatement>.() -> Unit): MutableList<JsStatement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<JsStatement>

'assignToPrototype' @ [146:13] ==> private final fun MutableList<JsStatement>.assignToPrototype(fieldName: JsName, value: JsExpression): Unit defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'resumeName' @ [146:31] ==> val resumeName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[LocalVariableDescriptor]

'resumeFunction' @ [146:43] ==> val resumeFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[LocalVariableDescriptor]

'FunctionPostProcessor' @ [149:9] ==> public constructor FunctionPostProcessor(root: JsFunction) defined in org.jetbrains.kotlin.js.inline.clean.FunctionPostProcessor[ClassConstructorDescriptorImpl]

'resumeFunction' @ [149:31] ==> val resumeFunction: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateDoResume[LocalVariableDescriptor]

'apply' @ [149:47] ==> public final fun apply(): Unit defined in org.jetbrains.kotlin.js.inline.clean.FunctionPostProcessor[SimpleFunctionDescriptorImpl]

'context' @ [153:26] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[ValueParameterDescriptorImpl]

'metadata' @ [153:34] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'psiElement' @ [153:43] ==> public final val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsNew' @ [154:29] ==> public constructor JsNew(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNew[JavaClassConstructorDescriptor]

'className' @ [154:35] ==> private final val className: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'makeRef' @ [154:45] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'apply' @ [154:56] ==> @InlineOnly public inline fun <T> JsNew.apply(block: JsNew.() -> Unit): JsNew defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNew

'source' @ [154:64] ==> public final var JsNew.source: (Any..Any?)[MyPropertyDescriptor]

'psiElement' @ [154:73] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'context' @ [155:13] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[ValueParameterDescriptorImpl]

'metadata' @ [155:21] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'hasReceiver' @ [155:30] ==> public final val hasReceiver: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'instantiation' @ [156:13] ==> val instantiation: JsNew defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'arguments' @ [156:27] ==> public final val JsNew.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'JsThisRef' @ [156:40] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'function' @ [158:26] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [158:35] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'innerFunction' @ [158:48] ==> private final val innerFunction: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [158:63] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'orEmpty' @ [158:74] ==> @InlineOnly public inline fun <T> List<(JsParameter..JsParameter?)>?.orEmpty(): List<(JsParameter..JsParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'instantiation' @ [159:9] ==> val instantiation: JsNew defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'arguments' @ [159:23] ==> public final val JsNew.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'parameters' @ [159:36] ==> val parameters: List<(JsParameter..JsParameter?)> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'dropLast' @ [159:47] ==> public fun <T> List<(JsParameter..JsParameter?)>.dropLast(n: Int): List<(JsParameter..JsParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'map' @ [159:59] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsNameRef): List<JsNameRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsNameRef

'it' @ [159:65] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [159:68] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'makeRef' @ [159:73] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'function' @ [161:13] ==> private final val function: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'coroutineMetadata' @ [161:22] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'hasController' @ [161:42] ==> public final val hasController: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'instantiation' @ [162:13] ==> val instantiation: JsNew defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'arguments' @ [162:27] ==> public final val JsNew.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'JsThisRef' @ [162:40] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'instantiation' @ [165:9] ==> val instantiation: JsNew defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'arguments' @ [165:23] ==> public final val JsNew.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'parameters' @ [165:36] ==> val parameters: List<(JsParameter..JsParameter?)> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'last' @ [165:47] ==> public fun <T> List<(JsParameter..JsParameter?)>.last(): (JsParameter..JsParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'name' @ [165:54] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'makeRef' @ [165:59] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'declareTemporaryName' @ [167:37] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'functionWithBody' @ [168:9] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'parameters' @ [168:26] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [168:40] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'suspendedName' @ [168:52] ==> val suspendedName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'declareTemporaryName' @ [170:36] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'functionWithBody' @ [171:9] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'body' @ [171:26] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [171:31] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'newVar' @ [171:56] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'instanceName' @ [171:63] ==> val instanceName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'instantiation' @ [171:77] ==> val instantiation: JsNew defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'JsReturn' @ [173:28] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'JsInvocation' @ [173:37] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'JsNameRef' @ [173:50] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [173:60] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[ValueParameterDescriptorImpl]

'metadata' @ [173:68] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'doResumeName' @ [173:77] ==> public final val doResumeName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'instanceName' @ [173:91] ==> val instanceName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'makeRef' @ [173:104] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsNullLiteral' @ [173:116] ==> public constructor JsNullLiteral() defined in org.jetbrains.kotlin.js.backend.ast.JsNullLiteral[JavaClassConstructorDescriptor]

'source' @ [174:46] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'psiElement' @ [174:53] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'functionWithBody' @ [176:9] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'body' @ [176:26] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [176:31] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsIf' @ [176:45] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement, @Nullable p2: JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'suspendedName' @ [177:17] ==> val suspendedName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'makeRef' @ [177:31] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'source' @ [177:41] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'psiElement' @ [177:48] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'JsReturn' @ [178:17] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'instanceName' @ [178:26] ==> val instanceName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'makeRef' @ [178:39] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'source' @ [178:49] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'psiElement' @ [178:56] ==> val psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'invokeResume' @ [179:17] ==> val invokeResume: JsReturn defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineInstantiation[LocalVariableDescriptor]

'blocks' @ [186:34] ==> value-parameter blocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'indexOf' @ [186:41] ==> public abstract fun indexOf(element: CoroutineBlock): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'context' @ [186:49] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'globalCatchBlock' @ [186:57] ==> public final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'JsNameRef' @ [187:24] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [187:34] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'metadata' @ [187:42] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'stateName' @ [187:51] ==> public final val stateName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsThisRef' @ [187:62] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'equality' @ [189:44] ==> @NotNull public open fun equality(@NotNull arg1: JsExpression, @NotNull arg2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'stateRef' @ [189:53] ==> val stateRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'JsIntLiteral' @ [189:63] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'indexOfGlobalCatch' @ [189:76] ==> val indexOfGlobalCatch: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'JsCatch' @ [190:21] ==> public constructor JsCatch(p0: (JsScope..JsScope?), @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsCatch[JavaClassConstructorDescriptor]

'functionWithBody' @ [190:29] ==> private final val functionWithBody: JsFunction defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'scope' @ [190:46] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'JsBlock' @ [191:37] ==> public constructor JsBlock(vararg p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'assignment' @ [192:28] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'stateRef' @ [192:39] ==> val stateRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'deepCopy' @ [192:48] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'JsNameRef' @ [192:60] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [192:70] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'metadata' @ [192:78] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'exceptionStateName' @ [192:87] ==> public final val exceptionStateName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsThisRef' @ [192:107] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'makeStmt' @ [192:121] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'assignment' @ [193:28] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [193:39] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [193:49] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'metadata' @ [193:57] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'exceptionName' @ [193:66] ==> public final val exceptionName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsThisRef' @ [193:81] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'catch' @ [194:39] ==> val catch: JsCatch defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'parameter' @ [194:45] ==> public final val JsCatch.parameter: (JsParameter..JsParameter?)[MyPropertyDescriptor]

'name' @ [194:55] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'makeRef' @ [194:60] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'makeStmt' @ [194:71] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'catch' @ [196:9] ==> val catch: JsCatch defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'body' @ [196:15] ==> public final var JsCatch.body: (JsBlock..JsBlock?)[MyPropertyDescriptor]

'JsBlock' @ [196:22] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'JsIf' @ [196:30] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement, @Nullable p2: JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'isFromGlobalCatch' @ [196:35] ==> val isFromGlobalCatch: JsBinaryOperation defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'JsThrow' @ [196:54] ==> public constructor JsThrow(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsThrow[JavaClassConstructorDescriptor]

'catch' @ [196:62] ==> val catch: JsCatch defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'parameter' @ [196:68] ==> public final val JsCatch.parameter: (JsParameter..JsParameter?)[MyPropertyDescriptor]

'name' @ [196:78] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'makeRef' @ [196:83] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'continueWithException' @ [196:95] ==> val continueWithException: JsBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'JsNameRef' @ [198:30] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [198:40] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'metadata' @ [198:48] ==> public final val metadata: CoroutineMetadata defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'exceptionName' @ [198:57] ==> public final val exceptionName: JsName defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedPropertyDescriptor]

'JsThisRef' @ [198:72] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'context' @ [199:9] ==> value-parameter context: CoroutineTransformationContext defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'globalCatchBlock' @ [199:17] ==> public final val globalCatchBlock: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformationContext[PropertyDescriptorImpl]

'statements' @ [199:34] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'JsThrow' @ [199:48] ==> public constructor JsThrow(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsThrow[JavaClassConstructorDescriptor]

'throwResultRef' @ [199:56] ==> val throwResultRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'blocks' @ [201:21] ==> value-parameter blocks: List<CoroutineBlock> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[ValueParameterDescriptorImpl]

'withIndex' @ [201:28] ==> public fun <T> Iterable<CoroutineBlock>.withIndex(): Iterable<IndexedValue<CoroutineBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoroutineBlock

'map' @ [201:40] ==> public inline fun <T, R> Iterable<IndexedValue<CoroutineBlock>>.map(transform: (IndexedValue<CoroutineBlock>) -> JsCase): List<JsCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<CoroutineBlock>
    <R> -> JsCase

'component1' @ [201:47] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [201:54] ==> public final operator fun component2(): CoroutineBlock defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'JsCase' @ [202:13] ==> public constructor JsCase() defined in org.jetbrains.kotlin.js.backend.ast.JsCase[JavaClassConstructorDescriptor]

'apply' @ [202:22] ==> @InlineOnly public inline fun <T> JsCase.apply(block: JsCase.() -> Unit): JsCase defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsCase

'caseExpression' @ [203:17] ==> public final var JsCase.caseExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsIntLiteral' @ [203:34] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'index' @ [203:47] ==> val index: Int defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody.<anonymous>[LocalVariableDescriptor]

'statements' @ [204:17] ==> public final val JsCase.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'block' @ [204:31] ==> val block: CoroutineBlock defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody.<anonymous>[LocalVariableDescriptor]

'statements' @ [204:37] ==> public final val statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineBlock[PropertyDescriptorImpl]

'JsSwitch' @ [207:31] ==> public constructor JsSwitch(p0: (JsExpression..JsExpression?), p1: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsSwitch[JavaClassConstructorDescriptor]

'stateRef' @ [207:40] ==> val stateRef: JsNameRef defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'deepCopy' @ [207:49] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'cases' @ [207:61] ==> val cases: List<JsCase> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'JsDoWhile' @ [208:20] ==> public constructor JsDoWhile(p0: (JsExpression..JsExpression?), p1: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsDoWhile[JavaClassConstructorDescriptor]

'JsBooleanLiteral' @ [208:30] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'JsTry' @ [208:54] ==> public constructor JsTry(p0: (JsBlock..JsBlock?), @Nullable p1: JsCatch?, @Nullable p2: JsBlock?) defined in org.jetbrains.kotlin.js.backend.ast.JsTry[JavaClassConstructorDescriptor]

'JsBlock' @ [208:60] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'switchStatement' @ [208:68] ==> val switchStatement: JsSwitch defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'catch' @ [208:86] ==> val catch: JsCatch defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'listOf' @ [210:16] ==> public fun <T> listOf(element: JsDoWhile): List<JsDoWhile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsDoWhile

'loop' @ [210:23] ==> val loop: JsDoWhile defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.generateCoroutineBody[LocalVariableDescriptor]

'accept' @ [214:9] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [214:25] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'super' @ [216:17] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.collectAdditionalLocalVariables.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [216:23] ==> public open fun visit(x: JsVars.JsVar): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [216:29] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.collectAdditionalLocalVariables.<no name provided>.visit[ValueParameterDescriptorImpl]

'localVariables' @ [217:17] ==> private final val localVariables: MutableSet<JsName> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'x' @ [217:35] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.collectAdditionalLocalVariables.<no name provided>.visit[ValueParameterDescriptorImpl]

'name' @ [217:37] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'this' @ [223:9] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToField[ReceiverParameterDescriptorImpl]

'assignment' @ [223:28] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [223:39] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'fieldName' @ [223:49] ==> value-parameter fieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToField[ValueParameterDescriptorImpl]

'JsThisRef' @ [223:60] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'value' @ [223:74] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToField[ValueParameterDescriptorImpl]

'source' @ [223:81] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'psiElement' @ [223:88] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToField[ValueParameterDescriptorImpl]

'makeStmt' @ [223:100] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [227:9] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToPrototype[ReceiverParameterDescriptorImpl]

'assignment' @ [227:28] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [227:39] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'fieldName' @ [227:49] ==> value-parameter fieldName: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToPrototype[ValueParameterDescriptorImpl]

'prototypeOf' @ [227:71] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'className' @ [227:83] ==> private final val className: JsName defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[PropertyDescriptorImpl]

'makeRef' @ [227:93] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'value' @ [227:106] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer.assignToPrototype[ValueParameterDescriptorImpl]

'makeStmt' @ [227:113] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

