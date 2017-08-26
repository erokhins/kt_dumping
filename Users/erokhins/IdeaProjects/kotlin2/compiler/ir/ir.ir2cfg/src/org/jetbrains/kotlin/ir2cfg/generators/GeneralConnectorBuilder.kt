'linkedSetOf' @ [25:24] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'linkedSetOf' @ [27:28] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'next' @ [30:9] ==> private final val next: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'add' @ [30:14] ==> public open fun add(element: BasicBlock): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'basicBlock' @ [30:18] ==> value-parameter basicBlock: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder.addNext[ValueParameterDescriptorImpl]

'previous' @ [34:9] ==> private final val previous: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'add' @ [34:18] ==> public open fun add(element: BasicBlock): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'basicBlock' @ [34:22] ==> value-parameter basicBlock: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder.addPrevious[ValueParameterDescriptorImpl]

'when {
        next.size <= 1 -> JoinBlockConnector(previous.toList(), element, next.firstOrNull())
        previous.size == 1 -> SplitBlockConnector(previous.single(), element, next.toList())
        else -> throw AssertionError("Connector should have either exactly one previous block or no more than one next block, " +
                                     "actual previous = ${previous.size}, next = ${next.size}")
    }' @ [37:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BlockConnector, entry1: BlockConnector, entry2: BlockConnector): BlockConnector[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BlockConnector

'next' @ [38:9] ==> private final val next: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'size' @ [38:14] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'JoinBlockConnector' @ [38:27] ==> public constructor JoinBlockConnector(previousBlocks: List<BasicBlock>, element: IrStatement, next: BasicBlock?) defined in org.jetbrains.kotlin.ir2cfg.generators.JoinBlockConnector[ClassConstructorDescriptorImpl]

'previous' @ [38:46] ==> private final val previous: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'toList' @ [38:55] ==> public fun <T> Iterable<BasicBlock>.toList(): List<BasicBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'element' @ [38:65] ==> private final val element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'next' @ [38:74] ==> private final val next: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'firstOrNull' @ [38:79] ==> public fun <T> Iterable<BasicBlock>.firstOrNull(): BasicBlock? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'previous' @ [39:9] ==> private final val previous: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'size' @ [39:18] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'SplitBlockConnector' @ [39:31] ==> public constructor SplitBlockConnector(previous: BasicBlock, element: IrStatement, nextBlocks: List<BasicBlock>) defined in org.jetbrains.kotlin.ir2cfg.generators.SplitBlockConnector[ClassConstructorDescriptorImpl]

'previous' @ [39:51] ==> private final val previous: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'single' @ [39:60] ==> public fun <T> Iterable<BasicBlock>.single(): BasicBlock defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'element' @ [39:70] ==> private final val element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'next' @ [39:79] ==> private final val next: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'toList' @ [39:84] ==> public fun <T> Iterable<BasicBlock>.toList(): List<BasicBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'AssertionError' @ [40:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [40:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'previous' @ [41:59] ==> private final val previous: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'size' @ [41:68] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'next' @ [41:84] ==> private final val next: LinkedHashSet<BasicBlock> /* = LinkedHashSet<BasicBlock> */ defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[PropertyDescriptorImpl]

'size' @ [41:89] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

