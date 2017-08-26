'createLineNumberSequence' @ [26:24] ==> private fun createLineNumberSequence(node: MethodNode, classSMAP: SMAP): Sequence<LabelAndMapping> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'node' @ [26:49] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'classSMAP' @ [26:55] ==> public final val classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'map' @ [26:66] ==> public fun <T, R> Sequence<LabelAndMapping>.map(transform: (LabelAndMapping) -> RangeMapping): Sequence<RangeMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LabelAndMapping
    <R> -> RangeMapping

'it' @ [26:72] ==> value-parameter it: LabelAndMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode.sortedRanges.<anonymous>[ValueParameterDescriptorImpl]

'mapper' @ [26:75] ==> public final val mapper: RangeMapping defined in org.jetbrains.kotlin.codegen.inline.LabelAndMapping[PropertyDescriptorImpl]

'distinct' @ [26:84] ==> public fun <T> Sequence<RangeMapping>.distinct(): Sequence<RangeMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'toList' @ [26:95] ==> public fun <T> Sequence<RangeMapping>.toList(): List<RangeMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'sortedWith' @ [26:104] ==> public fun <T> Iterable<RangeMapping>.sortedWith(comparator: Comparator<in RangeMapping> /* = Comparator<in RangeMapping> */): List<RangeMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'RangeMapping' @ [26:115] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'Comparator' @ [26:128] ==> public object Comparator : Comparator<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'SMAPAndMethodNode' @ [28:54] ==> public constructor SMAPAndMethodNode(node: MethodNode, classSMAP: SMAP) defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[ClassConstructorDescriptorImpl]

'newMethodNode' @ [28:72] ==> value-parameter newMethodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode.copyWithNewNode[ValueParameterDescriptorImpl]

'classSMAP' @ [28:87] ==> public final val classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'InsnSequence' @ [32:12] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'node' @ [32:25] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence[ValueParameterDescriptorImpl]

'instructions' @ [32:30] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [32:43] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'filterIsInstance' @ [32:56] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<LineNumberNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LineNumberNode

'map' @ [32:91] ==> public fun <T, R> Sequence<LineNumberNode>.map(transform: (LineNumberNode) -> LabelAndMapping): Sequence<LabelAndMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineNumberNode
    <R> -> LabelAndMapping

'classSMAP' @ [33:21] ==> value-parameter classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence[ValueParameterDescriptorImpl]

'intervals' @ [33:31] ==> public final val intervals: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'binarySearch' @ [33:41] ==> public fun <T> List<RangeMapping>.binarySearch(element: RangeMapping, comparator: Comparator<in RangeMapping> /* = Comparator<in RangeMapping> */, fromIndex: Int = ..., toIndex: Int = ...): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping

'RangeMapping' @ [33:54] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'lineNumber' @ [33:67] ==> value-parameter lineNumber: LineNumberNode defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>[ValueParameterDescriptorImpl]

'line' @ [33:78] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'lineNumber' @ [33:84] ==> value-parameter lineNumber: LineNumberNode defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>[ValueParameterDescriptorImpl]

'line' @ [33:95] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'Comparator' @ [33:105] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((RangeMapping..RangeMapping?), (RangeMapping..RangeMapping?)) -> Int): Comparator<RangeMapping> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> RangeMapping

'if (key.dest in value) 0 else RangeMapping.Comparator.compare(value, key)' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'key' @ [35:17] ==> value-parameter key: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dest' @ [35:21] ==> public final val dest: Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[PropertyDescriptorImpl]

'value' @ [35:29] ==> value-parameter value: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'RangeMapping' @ [35:43] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[FakeCallableDescriptorForObject]

'compare' @ [35:67] ==> public open fun compare(o1: RangeMapping, o2: RangeMapping): Int defined in org.jetbrains.kotlin.codegen.inline.RangeMapping.Comparator[SimpleFunctionDescriptorImpl]

'value' @ [35:75] ==> value-parameter value: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [35:82] ==> value-parameter key: (RangeMapping..RangeMapping?) defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [37:13] ==> val index: Int defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>[LocalVariableDescriptor]

'error' @ [38:13] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'node' @ [38:63] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence[ValueParameterDescriptorImpl]

'name' @ [38:68] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'lineNumber' @ [38:76] ==> value-parameter lineNumber: LineNumberNode defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>[ValueParameterDescriptorImpl]

'line' @ [38:87] ==> public final var line: Int defined in org.jetbrains.org.objectweb.asm.tree.LineNumberNode[JavaPropertyDescriptor]

'LabelAndMapping' @ [40:9] ==> public constructor LabelAndMapping(lineNumberNode: LineNumberNode, mapper: RangeMapping) defined in org.jetbrains.kotlin.codegen.inline.LabelAndMapping[ClassConstructorDescriptorImpl]

'lineNumber' @ [40:25] ==> value-parameter lineNumber: LineNumberNode defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>[ValueParameterDescriptorImpl]

'classSMAP' @ [40:37] ==> value-parameter classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence[ValueParameterDescriptorImpl]

'intervals' @ [40:47] ==> public final val intervals: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'index' @ [40:57] ==> val index: Int defined in org.jetbrains.kotlin.codegen.inline.createLineNumberSequence.<anonymous>[LocalVariableDescriptor]

