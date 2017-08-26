'when (this) {
    is MergeCfgElement -> "$this"
    else -> dump()
}' @ [26:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [26:41] ==> <this> defined in org.jetbrains.kotlin.ir2cfg.util.cfgDump[ReceiverParameterDescriptorImpl]

'this' @ [27:29] ==> <this> defined in org.jetbrains.kotlin.ir2cfg.util.cfgDump[ReceiverParameterDescriptorImpl]

'dump' @ [28:13] ==> public fun IrElement.dump(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [31:46] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'component1' @ [32:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [32:18] ==> public final operator fun component2(): IrStatement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'elements' @ [32:30] ==> public abstract val elements: List<IrStatement> defined in org.jetbrains.kotlin.ir2cfg.graph.BasicBlock[PropertyDescriptorImpl]

'withIndex' @ [32:39] ==> public fun <T> Iterable<IrStatement>.withIndex(): Iterable<IndexedValue<IrStatement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'builder' @ [33:9] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'append' @ [33:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'indent' @ [33:24] ==> value-parameter indent: String = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'builder' @ [34:9] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'append' @ [34:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'String' @ [34:24] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [34:31] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [34:46] ==> val index: Int defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'element' @ [35:20] ==> val element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'cfgDump' @ [35:28] ==> private fun IrElement.cfgDump(): String defined in org.jetbrains.kotlin.ir2cfg.util[SimpleFunctionDescriptorImpl]

'builder' @ [36:9] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'appendln' @ [36:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dump' @ [36:26] ==> val dump: String defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'lines' @ [36:31] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'first' @ [36:39] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'builder' @ [38:12] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'toString' @ [38:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'StringBuilder' @ [41:50] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'builder' @ [42:5] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'append' @ [42:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'indent' @ [42:20] ==> value-parameter indent: String = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'element' @ [43:16] ==> public abstract val element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.graph.BlockConnector[PropertyDescriptorImpl]

'cfgDump' @ [43:24] ==> private fun IrElement.cfgDump(): String defined in org.jetbrains.kotlin.ir2cfg.util[SimpleFunctionDescriptorImpl]

'builder' @ [44:5] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'appendln' @ [44:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dump' @ [44:22] ==> val dump: String defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'lines' @ [44:27] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'first' @ [44:35] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'builder' @ [45:12] ==> value-parameter builder: StringBuilder /* = StringBuilder */ = ... defined in org.jetbrains.kotlin.ir2cfg.util.dump[ValueParameterDescriptorImpl]

'toString' @ [45:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'hashMapOf' @ [49:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<BlockConnector, Int> /* = HashMap<BlockConnector, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> BlockConnector
    <V> -> Int

'component1' @ [50:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [50:18] ==> public final operator fun component2(): BlockConnector defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'connectors' @ [50:32] ==> public abstract val connectors: List<BlockConnector> defined in org.jetbrains.kotlin.ir2cfg.graph.ControlFlowGraph[PropertyDescriptorImpl]

'withIndex' @ [50:43] ==> public fun <T> Iterable<BlockConnector>.withIndex(): Iterable<IndexedValue<BlockConnector>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BlockConnector

'connectorIndex' @ [51:9] ==> val connectorIndex: HashMap<BlockConnector, Int> /* = HashMap<BlockConnector, Int> */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'connector' @ [51:24] ==> val connector: BlockConnector defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'index' @ [51:37] ==> val index: Int defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'hashMapOf' @ [53:22] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<BasicBlock, Int> /* = HashMap<BasicBlock, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> BasicBlock
    <V> -> Int

'component1' @ [54:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [54:18] ==> public final operator fun component2(): BasicBlock defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'blocks' @ [54:28] ==> public abstract val blocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.ControlFlowGraph[PropertyDescriptorImpl]

'withIndex' @ [54:35] ==> public fun <T> Iterable<BasicBlock>.withIndex(): Iterable<IndexedValue<BasicBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'blockIndex' @ [55:9] ==> val blockIndex: HashMap<BasicBlock, Int> /* = HashMap<BasicBlock, Int> */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'block' @ [55:20] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'index' @ [55:29] ==> val index: Int defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'StringBuilder' @ [57:19] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'component1' @ [58:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [58:18] ==> public final operator fun component2(): BasicBlock defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'blocks' @ [58:28] ==> public abstract val blocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.ControlFlowGraph[PropertyDescriptorImpl]

'withIndex' @ [58:35] ==> public fun <T> Iterable<BasicBlock>.withIndex(): Iterable<IndexedValue<BasicBlock>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'builder' @ [59:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'appendln' @ [59:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [59:31] ==> val index: Int defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'block' @ [60:24] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'incoming' @ [60:30] ==> public abstract val incoming: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.graph.BasicBlock[PropertyDescriptorImpl]

'incoming' @ [61:13] ==> val incoming: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'builder' @ [62:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'appendln' @ [62:21] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'incoming' @ [62:30] ==> val incoming: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'previousBlocks' @ [62:39] ==> public abstract val previousBlocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.BlockConnector[PropertyDescriptorImpl]

'joinToString' @ [62:54] ==> public fun <T> Iterable<BasicBlock>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((BasicBlock) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'blockIndex' @ [62:97] ==> val blockIndex: HashMap<BasicBlock, Int> /* = HashMap<BasicBlock, Int> */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'it' @ [62:108] ==> value-parameter it: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.util.dump.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [62:112] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'incoming' @ [63:13] ==> val incoming: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'dump' @ [63:22] ==> public fun BlockConnector.dump(builder: StringBuilder /* = StringBuilder */ = ..., indent: String = ...): String defined in org.jetbrains.kotlin.ir2cfg.util[SimpleFunctionDescriptorImpl]

'builder' @ [63:27] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'builder' @ [65:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'appendln' @ [65:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'block' @ [66:9] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'dump' @ [66:15] ==> public fun BasicBlock.dump(builder: StringBuilder /* = StringBuilder */ = ..., indent: String = ...): String defined in org.jetbrains.kotlin.ir2cfg.util[SimpleFunctionDescriptorImpl]

'builder' @ [66:20] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'block' @ [67:24] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'outgoing' @ [67:30] ==> public abstract val outgoing: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.graph.BasicBlock[PropertyDescriptorImpl]

'outgoing' @ [68:13] ==> val outgoing: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'if (outgoing.nextBlocks.isEmpty()) {
                builder.appendln("OUTGOING -> NONE")
            }
            else {
                builder.appendln(outgoing.nextBlocks.joinToString(prefix = "OUTGOING -> BB ") { blockIndex[it].toString() })
            }' @ [69:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StringBuilder /* = StringBuilder */, elseBranch: StringBuilder /* = StringBuilder */): StringBuilder /* = StringBuilder */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StringBuilder

'outgoing' @ [69:17] ==> val outgoing: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'nextBlocks' @ [69:26] ==> public abstract val nextBlocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.BlockConnector[PropertyDescriptorImpl]

'isEmpty' @ [69:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'builder' @ [70:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'appendln' @ [70:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'builder' @ [73:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'appendln' @ [73:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'outgoing' @ [73:34] ==> val outgoing: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'nextBlocks' @ [73:43] ==> public abstract val nextBlocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.BlockConnector[PropertyDescriptorImpl]

'joinToString' @ [73:54] ==> public fun <T> Iterable<BasicBlock>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((BasicBlock) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'blockIndex' @ [73:97] ==> val blockIndex: HashMap<BasicBlock, Int> /* = HashMap<BasicBlock, Int> */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'it' @ [73:108] ==> value-parameter it: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.util.dump.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [73:112] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outgoing' @ [75:13] ==> val outgoing: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'dump' @ [75:22] ==> public fun BlockConnector.dump(builder: StringBuilder /* = StringBuilder */ = ..., indent: String = ...): String defined in org.jetbrains.kotlin.ir2cfg.util[SimpleFunctionDescriptorImpl]

'builder' @ [75:27] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'builder' @ [78:12] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.ir2cfg.util.dump[LocalVariableDescriptor]

'toString' @ [78:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

