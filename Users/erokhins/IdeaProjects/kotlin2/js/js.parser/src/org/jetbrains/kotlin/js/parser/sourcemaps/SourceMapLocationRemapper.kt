'JsNodeFlatListCollector' @ [23:29] ==> public constructor JsNodeFlatListCollector() defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[ClassConstructorDescriptorImpl]

'node' @ [24:9] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.remap[ValueParameterDescriptorImpl]

'accept' @ [24:14] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'listCollector' @ [24:21] ==> val listCollector: SourceMapLocationRemapper.JsNodeFlatListCollector defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.remap[LocalVariableDescriptor]

'applySourceMap' @ [25:9] ==> private final fun applySourceMap(nodes: List<JsNode>): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[SimpleFunctionDescriptorImpl]

'listCollector' @ [25:24] ==> val listCollector: SourceMapLocationRemapper.JsNodeFlatListCollector defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.remap[LocalVariableDescriptor]

'nodeList' @ [25:38] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'node' @ [35:26] ==> value-parameter node: SourceInfoAwareJsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[ValueParameterDescriptorImpl]

'source' @ [35:31] ==> public final var SourceInfoAwareJsNode.source: (Any..Any?)[MyPropertyDescriptor]

'sourceMap' @ [36:25] ==> private final val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[PropertyDescriptorImpl]

'groups' @ [36:35] ==> public final val groups: MutableList<SourceMapGroup> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMap[PropertyDescriptorImpl]

'getOrElse' @ [36:42] ==> @InlineOnly public inline fun <T> List<SourceMapGroup>.getOrElse(index: Int, defaultValue: (Int) -> SourceMapGroup): SourceMapGroup defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapGroup

'source' @ [36:52] ==> val source: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'startLine' @ [36:59] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'lastGroup' @ [38:17] ==> var lastGroup: SourceMapGroup? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'group' @ [38:30] ==> val group: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'lastGroup' @ [39:21] ==> var lastGroup: SourceMapGroup? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'lastGroup' @ [40:42] ==> var lastGroup: SourceMapGroup? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'segments' @ [40:54] ==> public final val segments: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[PropertyDescriptorImpl]

'drop' @ [40:63] ==> public fun <T> Iterable<SourceMapSegment>.drop(n: Int): List<SourceMapSegment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapSegment

'lastSegmentIndex' @ [40:68] ==> var lastSegmentIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'toMutableList' @ [40:86] ==> public fun <T> Collection<SourceMapSegment>.toMutableList(): MutableList<SourceMapSegment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapSegment

'lastGroupIndex' @ [41:25] ==> var lastGroupIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'source' @ [41:46] ==> val source: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'startLine' @ [41:53] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'segmentsToSkip' @ [42:25] ==> val segmentsToSkip: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'sourceMap' @ [42:43] ==> private final val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[PropertyDescriptorImpl]

'groups' @ [42:53] ==> public final val groups: MutableList<SourceMapGroup> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMap[PropertyDescriptorImpl]

'subList' @ [42:60] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<SourceMapGroup> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'lastGroupIndex' @ [42:69] ==> var lastGroupIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'source' @ [42:90] ==> val source: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'startLine' @ [42:97] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'flatMap' @ [42:108] ==> public inline fun <T, R> Iterable<SourceMapGroup>.flatMap(transform: (SourceMapGroup) -> Iterable<SourceMapSegment>): List<SourceMapSegment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapGroup
    <R> -> SourceMapSegment

'it' @ [42:118] ==> value-parameter it: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment.<anonymous>[ValueParameterDescriptorImpl]

'segments' @ [42:121] ==> public final val segments: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[PropertyDescriptorImpl]

'segmentsToSkip' @ [45:21] ==> val segmentsToSkip: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'lastOrNull' @ [45:36] ==> public fun <T> List<SourceMapSegment>.lastOrNull(): SourceMapSegment? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapSegment

'let' @ [45:50] ==> @InlineOnly public inline fun <T, R> SourceMapSegment.let(block: (SourceMapSegment) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceMapSegment
    <R> -> Unit

'lastSegment' @ [45:56] ==> var lastSegment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'it' @ [45:70] ==> value-parameter it: SourceMapSegment defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment.<anonymous>[ValueParameterDescriptorImpl]

'lastGroup' @ [47:17] ==> var lastGroup: SourceMapGroup? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'group' @ [47:29] ==> val group: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'lastGroupIndex' @ [48:17] ==> var lastGroupIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'source' @ [48:34] ==> val source: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'startLine' @ [48:41] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'lastSegmentIndex' @ [49:17] ==> var lastSegmentIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'lastSegmentIndex' @ [52:20] ==> var lastSegmentIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'group' @ [52:39] ==> val group: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'segments' @ [52:45] ==> public final val segments: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[PropertyDescriptorImpl]

'size' @ [52:54] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'group' @ [53:31] ==> val group: SourceMapGroup defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'segments' @ [53:37] ==> public final val segments: MutableList<SourceMapSegment> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapGroup[PropertyDescriptorImpl]

'lastSegmentIndex' @ [53:46] ==> var lastSegmentIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'segment' @ [54:21] ==> val segment: SourceMapSegment defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'generatedColumnNumber' @ [54:29] ==> public final val generatedColumnNumber: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[PropertyDescriptorImpl]

'source' @ [54:53] ==> val source: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'startChar' @ [54:60] ==> public open val startChar: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'lastSegment' @ [56:17] ==> var lastSegment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'segment' @ [56:31] ==> val segment: SourceMapSegment defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap.findCorrespondingSegment[LocalVariableDescriptor]

'lastSegmentIndex' @ [57:17] ==> var lastSegmentIndex: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'lastSegment' @ [60:20] ==> var lastSegment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'nodes' @ [64:25] ==> value-parameter nodes: List<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[ValueParameterDescriptorImpl]

'asSequence' @ [64:31] ==> public fun <T> Iterable<JsNode>.asSequence(): Sequence<JsNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'filterIsInstance' @ [64:44] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<SourceInfoAwareJsNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SourceInfoAwareJsNode

'findCorrespondingSegment' @ [65:27] ==> local final fun findCorrespondingSegment(node: SourceInfoAwareJsNode): SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[SimpleFunctionDescriptorImpl]

'node' @ [65:52] ==> val node: SourceInfoAwareJsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'segment' @ [66:34] ==> val segment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'sourceFileName' @ [66:43] ==> public final val sourceFileName: String? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[PropertyDescriptorImpl]

'node' @ [67:13] ==> val node: SourceInfoAwareJsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'source' @ [67:18] ==> public final var SourceInfoAwareJsNode.source: (Any..Any?)[MyPropertyDescriptor]

'if (sourceFileName != null) {
                val location = JsLocation(segment.sourceFileName, segment.sourceLineNumber, segment.sourceColumnNumber)
                JsLocationWithEmbeddedSource(location, sourceMap) { sourceMap.sourceContentResolver(segment.sourceFileName) }
            }
            else {
                null
            }' @ [67:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsLocationWithEmbeddedSource?, elseBranch: JsLocationWithEmbeddedSource?): JsLocationWithEmbeddedSource?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsLocationWithEmbeddedSource?

'sourceFileName' @ [67:31] ==> val sourceFileName: String? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'JsLocation' @ [68:32] ==> public constructor JsLocation(file: String, startLine: Int, startChar: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedClassConstructorDescriptor]

'segment' @ [68:43] ==> val segment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'sourceFileName' @ [68:51] ==> public final val sourceFileName: String? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[PropertyDescriptorImpl]

'segment' @ [68:67] ==> val segment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'sourceLineNumber' @ [68:75] ==> public final val sourceLineNumber: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[PropertyDescriptorImpl]

'segment' @ [68:93] ==> val segment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'sourceColumnNumber' @ [68:101] ==> public final val sourceColumnNumber: Int defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[PropertyDescriptorImpl]

'JsLocationWithEmbeddedSource' @ [69:17] ==> public constructor JsLocationWithEmbeddedSource(location: JsLocation, identityObject: Any?, sourceProvider: () -> Reader?) defined in org.jetbrains.kotlin.js.backend.ast.JsLocationWithEmbeddedSource[DeserializedClassConstructorDescriptor]

'location' @ [69:46] ==> val location: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'sourceMap' @ [69:56] ==> private final val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[PropertyDescriptorImpl]

'sourceMap' @ [69:69] ==> private final val sourceMap: SourceMap defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper[PropertyDescriptorImpl]

'invoke' @ [69:79] ==> public abstract operator fun invoke(p1: String): Reader? defined in kotlin.Function1[FunctionInvokeDescriptor]

'segment' @ [69:101] ==> val segment: SourceMapSegment? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.applySourceMap[LocalVariableDescriptor]

'sourceFileName' @ [69:109] ==> public final val sourceFileName: String? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapSegment[PropertyDescriptorImpl]

'RecursiveJsVisitor' @ [77:46] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableListOf' @ [78:24] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'nodeList' @ [81:13] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'x' @ [81:25] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitDoWhile[ValueParameterDescriptorImpl]

'accept' @ [82:13] ==> public open fun <T : JsNode?> accept(node: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'x' @ [82:20] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitDoWhile[ValueParameterDescriptorImpl]

'body' @ [82:22] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [83:13] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [83:20] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitDoWhile[ValueParameterDescriptorImpl]

'condition' @ [83:22] ==> public final var JsDoWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'handleNode' @ [86:68] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'x' @ [86:79] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitBinaryExpression[ValueParameterDescriptorImpl]

'x' @ [86:82] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitBinaryExpression[ValueParameterDescriptorImpl]

'arg1' @ [86:84] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'x' @ [86:90] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitBinaryExpression[ValueParameterDescriptorImpl]

'arg2' @ [86:92] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'handleNode' @ [88:59] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'x' @ [88:70] ==> value-parameter x: JsConditional defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitConditional[ValueParameterDescriptorImpl]

'x' @ [88:73] ==> value-parameter x: JsConditional defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitConditional[ValueParameterDescriptorImpl]

'testExpression' @ [88:75] ==> public final var JsConditional.testExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'x' @ [88:91] ==> value-parameter x: JsConditional defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitConditional[ValueParameterDescriptorImpl]

'thenExpression' @ [88:93] ==> public final var JsConditional.thenExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'x' @ [88:109] ==> value-parameter x: JsConditional defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitConditional[ValueParameterDescriptorImpl]

'elseExpression' @ [88:111] ==> public final var JsConditional.elseExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'handleNode' @ [90:59] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'x' @ [90:70] ==> value-parameter x: JsArrayAccess defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitArrayAccess[ValueParameterDescriptorImpl]

'x' @ [90:73] ==> value-parameter x: JsArrayAccess defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitArrayAccess[ValueParameterDescriptorImpl]

'arrayExpression' @ [90:75] ==> public final var JsArrayAccess.arrayExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'x' @ [90:92] ==> value-parameter x: JsArrayAccess defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitArrayAccess[ValueParameterDescriptorImpl]

'indexExpression' @ [90:94] ==> public final var JsArrayAccess.indexExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'handleNode' @ [92:54] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'x' @ [92:65] ==> value-parameter x: JsArrayLiteral defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitArray[ValueParameterDescriptorImpl]

'x' @ [92:69] ==> value-parameter x: JsArrayLiteral defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitArray[ValueParameterDescriptorImpl]

'expressions' @ [92:71] ==> public final val JsArrayLiteral.expressions: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'toTypedArray' @ [92:83] ==> public inline fun <reified T> Collection<(JsExpression..JsExpression?)>.toTypedArray(): Array<(JsExpression..JsExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'handleNode' @ [94:67] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'x' @ [94:78] ==> value-parameter x: JsPrefixOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitPrefixOperation[ValueParameterDescriptorImpl]

'x' @ [94:81] ==> value-parameter x: JsPrefixOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitPrefixOperation[ValueParameterDescriptorImpl]

'arg' @ [94:83] ==> public final var JsPrefixOperation.arg: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'handleNode' @ [96:69] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'x' @ [96:80] ==> value-parameter x: JsPostfixOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitPostfixOperation[ValueParameterDescriptorImpl]

'x' @ [96:83] ==> value-parameter x: JsPostfixOperation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitPostfixOperation[ValueParameterDescriptorImpl]

'arg' @ [96:85] ==> public final var JsPostfixOperation.arg: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'handleNode' @ [98:57] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'nameRef' @ [98:68] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitNameRef[ValueParameterDescriptorImpl]

'nameRef' @ [98:77] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitNameRef[ValueParameterDescriptorImpl]

'qualifier' @ [98:85] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'handleNode' @ [101:17] ==> private final fun handleNode(node: JsNode, vararg children: JsNode?): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'invocation' @ [101:28] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitInvocation[ValueParameterDescriptorImpl]

'invocation' @ [101:40] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitInvocation[ValueParameterDescriptorImpl]

'qualifier' @ [101:51] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'invocation' @ [101:63] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitInvocation[ValueParameterDescriptorImpl]

'arguments' @ [101:74] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'toTypedArray' @ [101:84] ==> public inline fun <reified T> Collection<(JsExpression..JsExpression?)>.toTypedArray(): Array<(JsExpression..JsExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'x' @ [104:13] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitFunction[ValueParameterDescriptorImpl]

'parameters' @ [104:15] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'forEach' @ [104:26] ==> @HidesMembers public inline fun <T> Iterable<(JsParameter..JsParameter?)>.forEach(action: ((JsParameter..JsParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'accept' @ [104:36] ==> public open fun <T : JsNode?> accept(node: (JsParameter..JsParameter?)): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)

'it' @ [104:43] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [105:13] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitFunction[ValueParameterDescriptorImpl]

'body' @ [105:15] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [105:20] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'forEach' @ [105:31] ==> @HidesMembers public inline fun <T> Iterable<(JsStatement..JsStatement?)>.forEach(action: ((JsStatement..JsStatement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'accept' @ [105:41] ==> public open fun <T : JsNode?> accept(node: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'it' @ [105:48] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'nodeList' @ [106:13] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'x' @ [106:25] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitFunction[ValueParameterDescriptorImpl]

'nodeList' @ [110:13] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'node' @ [110:25] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitElement[ValueParameterDescriptorImpl]

'node' @ [111:13] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [111:18] ==> public abstract fun acceptChildren(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'this' @ [111:33] ==> <this> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[LazyClassReceiverParameterDescriptor]

'children' @ [115:35] ==> value-parameter vararg children: JsNode? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[ValueParameterDescriptorImpl]

'mapNotNull' @ [115:44] ==> public inline fun <T, R : Any> Array<out JsNode?>.mapNotNull(transform: (JsNode?) -> JsNode?): List<JsNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode?
    <R : Any> -> JsNode

'it' @ [115:57] ==> value-parameter it: JsNode? defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode.<anonymous>[ValueParameterDescriptorImpl]

'if (nonNullChildren.isEmpty()) {
                nodeList += node
            }
            else {
                val firstChild = nonNullChildren.first()
                if (node.isNotBefore(firstChild)) {
                    accept(firstChild)
                    nodeList += node
                    nonNullChildren.drop(1).forEach { accept(it) }
                }
                else {
                    nodeList += node
                    nonNullChildren.forEach { accept(it) }
                }
            }' @ [117:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nonNullChildren' @ [117:17] ==> val nonNullChildren: List<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[LocalVariableDescriptor]

'isEmpty' @ [117:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'nodeList' @ [118:17] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'node' @ [118:29] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[ValueParameterDescriptorImpl]

'nonNullChildren' @ [121:34] ==> val nonNullChildren: List<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[LocalVariableDescriptor]

'first' @ [121:50] ==> public fun <T> List<JsNode>.first(): JsNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'if (node.isNotBefore(firstChild)) {
                    accept(firstChild)
                    nodeList += node
                    nonNullChildren.drop(1).forEach { accept(it) }
                }
                else {
                    nodeList += node
                    nonNullChildren.forEach { accept(it) }
                }' @ [122:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'node' @ [122:21] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[ValueParameterDescriptorImpl]

'isNotBefore' @ [122:26] ==> private final fun JsNode.isNotBefore(other: JsNode): Boolean defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[SimpleFunctionDescriptorImpl]

'firstChild' @ [122:38] ==> val firstChild: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[LocalVariableDescriptor]

'accept' @ [123:21] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'firstChild' @ [123:28] ==> val firstChild: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[LocalVariableDescriptor]

'nodeList' @ [124:21] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'node' @ [124:33] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[ValueParameterDescriptorImpl]

'nonNullChildren' @ [125:21] ==> val nonNullChildren: List<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[LocalVariableDescriptor]

'drop' @ [125:37] ==> public fun <T> Iterable<JsNode>.drop(n: Int): List<JsNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'forEach' @ [125:45] ==> @HidesMembers public inline fun <T> Iterable<JsNode>.forEach(action: (JsNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'accept' @ [125:55] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'it' @ [125:62] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode.<anonymous>[ValueParameterDescriptorImpl]

'nodeList' @ [128:21] ==> public final val nodeList: MutableList<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[PropertyDescriptorImpl]

'node' @ [128:33] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[ValueParameterDescriptorImpl]

'nonNullChildren' @ [129:21] ==> val nonNullChildren: List<JsNode> defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode[LocalVariableDescriptor]

'forEach' @ [129:37] ==> @HidesMembers public inline fun <T> Iterable<JsNode>.forEach(action: (JsNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'accept' @ [129:47] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'it' @ [129:54] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.handleNode.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [135:26] ==> public final var JsNode.source: (Any..Any?)[MyPropertyDescriptor]

'other' @ [136:27] ==> value-parameter other: JsNode defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[ValueParameterDescriptorImpl]

'source' @ [136:33] ==> public final var JsNode.source: (Any..Any?)[MyPropertyDescriptor]

'first' @ [137:17] ==> val first: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'file' @ [137:23] ==> public open val file: String defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'second' @ [137:31] ==> val second: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'file' @ [137:38] ==> public open val file: String defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'first' @ [138:20] ==> val first: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'startLine' @ [138:26] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'second' @ [138:38] ==> val second: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'startLine' @ [138:45] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'first' @ [138:59] ==> val first: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'startLine' @ [138:65] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'second' @ [138:78] ==> val second: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'startLine' @ [138:85] ==> public open val startLine: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'first' @ [138:98] ==> val first: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'startChar' @ [138:104] ==> public open val startChar: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

'second' @ [138:117] ==> val second: JsLocation defined in org.jetbrains.kotlin.js.parser.sourcemaps.SourceMapLocationRemapper.JsNodeFlatListCollector.isNotBefore[LocalVariableDescriptor]

'startChar' @ [138:124] ==> public open val startChar: Int defined in org.jetbrains.kotlin.js.backend.ast.JsLocation[DeserializedPropertyDescriptor]

