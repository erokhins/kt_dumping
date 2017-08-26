'mutableMapOf' @ [32:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsBlock, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsBlock
    <V> -> String

'mutableSetOf' @ [33:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setOf' @ [35:26] ==> @InlineOnly public inline fun <T> setOf(): Set<Context.Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node

'Context' @ [40:23] ==> public constructor Context() defined in org.jetbrains.kotlin.js.dce.Context[ClassConstructorDescriptorImpl]

'collectDefinedNames' @ [42:28] ==> public fun collectDefinedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[DeserializedSimpleFunctionDescriptor]

'root' @ [42:48] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[ValueParameterDescriptorImpl]

'context' @ [43:9] ==> val context: Context defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'addNodesForLocalVars' @ [43:17] ==> public final fun addNodesForLocalVars(names: Collection<JsName>): Unit defined in org.jetbrains.kotlin.js.dce.Context[SimpleFunctionDescriptorImpl]

'topLevelVars' @ [43:38] ==> val topLevelVars: Set<JsName> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'topLevelVars' @ [44:22] ==> val topLevelVars: Set<JsName> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'context' @ [45:13] ==> val context: Context defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'nodes' @ [45:21] ==> public final val nodes: MutableMap<JsName, Context.Node> defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'name' @ [45:27] ==> val name: JsName defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'alias' @ [45:35] ==> public final fun alias(other: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'context' @ [45:41] ==> val context: Context defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'globalScope' @ [45:49] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'member' @ [45:61] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'name' @ [45:68] ==> val name: JsName defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'ident' @ [45:73] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'Analyzer' @ [48:24] ==> public constructor Analyzer(context: Context) defined in org.jetbrains.kotlin.js.dce.Analyzer[ClassConstructorDescriptorImpl]

'context' @ [48:33] ==> val context: Context defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'analyzer' @ [49:9] ==> val analyzer: Analyzer defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'moduleMapping' @ [49:18] ==> public final val moduleMapping: MutableMap<JsStatement, String> defined in org.jetbrains.kotlin.js.dce.Analyzer[PropertyDescriptorImpl]

'moduleMapping' @ [49:35] ==> public final val moduleMapping: MutableMap<JsBlock, String> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'root' @ [50:9] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[ValueParameterDescriptorImpl]

'accept' @ [50:14] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'analyzer' @ [50:21] ==> val analyzer: Analyzer defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'ReachabilityTracker' @ [52:27] ==> public constructor ReachabilityTracker(context: Context, analysisResult: AnalysisResult, logConsumer: (String) -> Unit) defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[ClassConstructorDescriptorImpl]

'context' @ [52:47] ==> val context: Context defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'analyzer' @ [52:56] ==> val analyzer: Analyzer defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'analysisResult' @ [52:65] ==> public final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.Analyzer[PropertyDescriptorImpl]

'logConsumer' @ [52:81] ==> public final val logConsumer: (String) -> Unit defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'root' @ [53:9] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[ValueParameterDescriptorImpl]

'accept' @ [53:14] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'usageFinder' @ [53:21] ==> val usageFinder: ReachabilityTracker defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'reachableNames' @ [55:31] ==> private final val reachableNames: MutableSet<String> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'reachableName' @ [56:24] ==> val reachableName: String defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'split' @ [56:38] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'path' @ [57:24] ==> val path: List<String> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'fold' @ [57:29] ==> public inline fun <T, R> Iterable<String>.fold(initial: Context.Node, operation: (Context.Node, String) -> Context.Node): Context.Node defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Node

'context' @ [57:34] ==> val context: Context defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'globalScope' @ [57:42] ==> public final val globalScope: Context.Node defined in org.jetbrains.kotlin.js.dce.Context[PropertyDescriptorImpl]

'node' @ [57:71] ==> value-parameter node: Context.Node defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [57:76] ==> public final fun member(name: String): Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[SimpleFunctionDescriptorImpl]

'part' @ [57:83] ==> value-parameter part: String defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply.<anonymous>[ValueParameterDescriptorImpl]

'usageFinder' @ [58:13] ==> val usageFinder: ReachabilityTracker defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'reach' @ [58:25] ==> public final fun reach(node: Context.Node): Unit defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[SimpleFunctionDescriptorImpl]

'node' @ [58:31] ==> val node: Context.Node defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'reachableNodes' @ [60:9] ==> public final var reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'usageFinder' @ [60:26] ==> val usageFinder: ReachabilityTracker defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'reachableNodes' @ [60:38] ==> public final val reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.dce.ReachabilityTracker[PropertyDescriptorImpl]

'Eliminator' @ [62:9] ==> public constructor Eliminator(analysisResult: AnalysisResult) defined in org.jetbrains.kotlin.js.dce.Eliminator[ClassConstructorDescriptorImpl]

'analyzer' @ [62:20] ==> val analyzer: Analyzer defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[LocalVariableDescriptor]

'analysisResult' @ [62:29] ==> public final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.Analyzer[PropertyDescriptorImpl]

'accept' @ [62:45] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.dce.Eliminator[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'root' @ [62:52] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.apply[ValueParameterDescriptorImpl]

'JsProgram' @ [71:27] ==> public constructor JsProgram() defined in org.jetbrains.kotlin.js.backend.ast.JsProgram[JavaClassConstructorDescriptor]

'DeadCodeElimination' @ [72:23] ==> public constructor DeadCodeElimination(logConsumer: (String) -> Unit) defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[ClassConstructorDescriptorImpl]

'logConsumer' @ [72:43] ==> value-parameter logConsumer: (String) -> Unit defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[ValueParameterDescriptorImpl]

'inputFiles' @ [74:26] ==> value-parameter inputFiles: Collection<InputFile> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[ValueParameterDescriptorImpl]

'map' @ [74:37] ==> public inline fun <T, R> Iterable<InputFile>.map(transform: (InputFile) -> JsGlobalBlock): List<JsGlobalBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InputFile
    <R> -> JsGlobalBlock

'JsGlobalBlock' @ [75:29] ==> public constructor JsGlobalBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock[JavaClassConstructorDescriptor]

'File' @ [76:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [76:33] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [76:38] ==> public final val path: String defined in org.jetbrains.kotlin.js.dce.InputFile[PropertyDescriptorImpl]

'readText' @ [76:44] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'block' @ [77:17] ==> val block: JsGlobalBlock defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[LocalVariableDescriptor]

'statements' @ [77:23] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'parse' @ [77:37] ==> public fun parse(code: String, reporter: ErrorReporter, scope: JsScope, fileName: String): List<JsStatement> defined in org.jetbrains.kotlin.js.parser[DeserializedSimpleFunctionDescriptor]

'code' @ [77:43] ==> val code: String defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[LocalVariableDescriptor]

'reporter' @ [77:49] ==> private final val reporter: <no name provided> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion[PropertyDescriptorImpl]

'program' @ [77:59] ==> val program: JsProgram defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'scope' @ [77:67] ==> public final val JsProgram.scope: (JsObjectScope..JsObjectScope?)[MyPropertyDescriptor]

'file' @ [77:74] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [77:79] ==> public final val path: String defined in org.jetbrains.kotlin.js.dce.InputFile[PropertyDescriptorImpl]

'file' @ [78:17] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[ValueParameterDescriptorImpl]

'moduleName' @ [78:22] ==> public final val moduleName: String? defined in org.jetbrains.kotlin.js.dce.InputFile[PropertyDescriptorImpl]

'let' @ [78:34] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'dce' @ [78:40] ==> val dce: DeadCodeElimination defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'moduleMapping' @ [78:44] ==> public final val moduleMapping: MutableMap<JsBlock, String> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'block' @ [78:58] ==> val block: JsGlobalBlock defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[LocalVariableDescriptor]

'it' @ [78:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'block' @ [79:17] ==> val block: JsGlobalBlock defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run.<anonymous>[LocalVariableDescriptor]

'program' @ [81:13] ==> val program: JsProgram defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'globalBlock' @ [81:21] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'statements' @ [81:33] ==> public final val JsGlobalBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'blocks' @ [81:47] ==> val blocks: List<JsGlobalBlock> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'program' @ [82:13] ==> val program: JsProgram defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'globalBlock' @ [82:21] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'fixForwardNameReferences' @ [82:33] ==> public fun JsNode.fixForwardNameReferences(): Unit defined in org.jetbrains.kotlin.js.inline.util[DeserializedSimpleFunctionDescriptor]

'dce' @ [84:13] ==> val dce: DeadCodeElimination defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'reachableNames' @ [84:17] ==> private final val reachableNames: MutableSet<String> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'rootReachableNames' @ [84:35] ==> value-parameter rootReachableNames: Set<String> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[ValueParameterDescriptorImpl]

'dce' @ [85:13] ==> val dce: DeadCodeElimination defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'apply' @ [85:17] ==> public final fun apply(root: JsNode): Unit defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[SimpleFunctionDescriptorImpl]

'program' @ [85:23] ==> val program: JsProgram defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'globalBlock' @ [85:31] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'component1' @ [87:19] ==> public final operator fun component1(): InputFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [87:25] ==> public final operator fun component2(): JsGlobalBlock defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'inputFiles' @ [87:35] ==> value-parameter inputFiles: Collection<InputFile> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[ValueParameterDescriptorImpl]

'zip' @ [87:46] ==> public infix fun <T, R> Iterable<InputFile>.zip(other: Iterable<JsGlobalBlock>): List<Pair<InputFile, JsGlobalBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InputFile
    <R> -> JsGlobalBlock

'blocks' @ [87:50] ==> val blocks: List<JsGlobalBlock> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'with' @ [88:17] ==> @InlineOnly public inline fun <T, R> with(receiver: File, block: File.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Unit

'File' @ [88:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [88:27] ==> val file: InputFile defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'outputPath' @ [88:32] ==> public final val outputPath: String defined in org.jetbrains.kotlin.js.dce.InputFile[PropertyDescriptorImpl]

'parentFile' @ [89:21] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [89:32] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'writeText' @ [90:21] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'block' @ [90:31] ==> val block: JsGlobalBlock defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'toString' @ [90:37] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock[JavaMethodDescriptor]

'DeadCodeEliminationResult' @ [94:20] ==> public constructor DeadCodeEliminationResult(reachableNodes: Set<Context.Node>) defined in org.jetbrains.kotlin.js.dce.DeadCodeEliminationResult[ClassConstructorDescriptorImpl]

'dce' @ [94:46] ==> val dce: DeadCodeElimination defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.run[LocalVariableDescriptor]

'reachableNodes' @ [94:50] ==> public final var reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[PropertyDescriptorImpl]

'println' @ [99:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'startPosition' @ [99:38] ==> value-parameter startPosition: CodePosition defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.reporter.<no name provided>.warning[ValueParameterDescriptorImpl]

'line' @ [99:52] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[DeserializedPropertyDescriptor]

'startPosition' @ [99:61] ==> value-parameter startPosition: CodePosition defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.reporter.<no name provided>.warning[ValueParameterDescriptorImpl]

'offset' @ [99:75] ==> public final val offset: Int defined in com.google.gwt.dev.js.rhino.CodePosition[DeserializedPropertyDescriptor]

'message' @ [99:85] ==> value-parameter message: String defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.reporter.<no name provided>.warning[ValueParameterDescriptorImpl]

'println' @ [103:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'startPosition' @ [103:38] ==> value-parameter startPosition: CodePosition defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.reporter.<no name provided>.error[ValueParameterDescriptorImpl]

'line' @ [103:52] ==> public final val line: Int defined in com.google.gwt.dev.js.rhino.CodePosition[DeserializedPropertyDescriptor]

'startPosition' @ [103:61] ==> value-parameter startPosition: CodePosition defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.reporter.<no name provided>.error[ValueParameterDescriptorImpl]

'offset' @ [103:75] ==> public final val offset: Int defined in com.google.gwt.dev.js.rhino.CodePosition[DeserializedPropertyDescriptor]

'message' @ [103:85] ==> value-parameter message: String defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion.reporter.<no name provided>.error[ValueParameterDescriptorImpl]

