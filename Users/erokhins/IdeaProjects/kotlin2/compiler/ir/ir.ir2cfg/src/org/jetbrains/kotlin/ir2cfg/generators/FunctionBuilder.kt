'mutableMapOf' @ [30:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<IrStatement, BasicBlockBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrStatement
    <V> -> BasicBlockBuilder

'mutableListOf' @ [34:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<BasicBlock> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicBlock

'mutableMapOf' @ [36:39] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<IrStatement, BlockConnectorBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrStatement
    <V> -> BlockConnectorBuilder

'GeneralBlockBuilder' @ [39:22] ==> public constructor GeneralBlockBuilder(incoming: BlockConnectorBuilder?) defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralBlockBuilder[ClassConstructorDescriptorImpl]

'after' @ [39:42] ==> value-parameter after: BlockConnectorBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.createBlockBuilder[ValueParameterDescriptorImpl]

'currentBlockBuilder' @ [40:9] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'result' @ [40:31] ==> val result: GeneralBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.createBlockBuilder[LocalVariableDescriptor]

'result' @ [41:16] ==> val result: GeneralBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.createBlockBuilder[LocalVariableDescriptor]

'blockBuilderMap' @ [45:9] ==> private final val blockBuilderMap: MutableMap<IrStatement, BasicBlockBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'remove' @ [45:25] ==> @InlineOnly public inline fun <@OnlyInputTypes K, V> MutableMap<out IrStatement?, BasicBlockBuilder>.remove(key: IrStatement?): BasicBlockBuilder? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> IrStatement?
    <V> -> BasicBlockBuilder

'last' @ [45:32] ==> public abstract val last: IrStatement? defined in org.jetbrains.kotlin.ir2cfg.builders.BasicBlockBuilder[PropertyDescriptorImpl]

'add' @ [46:9] ==> public abstract fun add(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.builders.BasicBlockBuilder[SimpleFunctionDescriptorImpl]

'element' @ [46:13] ==> value-parameter element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.shiftTo[ValueParameterDescriptorImpl]

'blockBuilderMap' @ [47:9] ==> private final val blockBuilderMap: MutableMap<IrStatement, BasicBlockBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'element' @ [47:25] ==> value-parameter element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.shiftTo[ValueParameterDescriptorImpl]

'this' @ [47:36] ==> <this> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.shiftTo[ReceiverParameterDescriptorImpl]

'currentBlockBuilder' @ [51:28] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'createBlockBuilder' @ [51:51] ==> private final fun createBlockBuilder(after: BlockConnectorBuilder?): BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'connectorBuilderMap' @ [51:70] ==> private final val connectorBuilderMap: MutableMap<IrStatement, BlockConnectorBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'element' @ [51:90] ==> value-parameter element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.add[ValueParameterDescriptorImpl]

'blockBuilder' @ [52:9] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.add[LocalVariableDescriptor]

'shiftTo' @ [52:22] ==> private final fun BasicBlockBuilder.shiftTo(element: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'element' @ [52:30] ==> value-parameter element: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.add[ValueParameterDescriptorImpl]

'blockBuilderMap' @ [56:28] ==> private final val blockBuilderMap: MutableMap<IrStatement, BasicBlockBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'to' @ [56:44] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.move[ValueParameterDescriptorImpl]

'connectorBuilderMap' @ [57:31] ==> private final val connectorBuilderMap: MutableMap<IrStatement, BlockConnectorBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'to' @ [57:51] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.move[ValueParameterDescriptorImpl]

'let' @ [57:56] ==> @InlineOnly public inline fun <T, R> BlockConnectorBuilder.let(block: (BlockConnectorBuilder) -> BasicBlockBuilder): BasicBlockBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BlockConnectorBuilder
    <R> -> BasicBlockBuilder

'createBlockBuilder' @ [57:62] ==> private final fun createBlockBuilder(after: BlockConnectorBuilder?): BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'it' @ [57:81] ==> value-parameter it: BlockConnectorBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.move.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [58:37] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'currentBlockBuilder' @ [59:9] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'blockBuilder' @ [59:31] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.move[LocalVariableDescriptor]

'currentBlockBuilder' @ [63:28] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'AssertionError' @ [64:37] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'blockBuilder' @ [65:21] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'build' @ [65:34] ==> public abstract fun build(): BasicBlock defined in org.jetbrains.kotlin.ir2cfg.builders.BasicBlockBuilder[SimpleFunctionDescriptorImpl]

'blocks' @ [66:9] ==> private final val blocks: MutableList<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'add' @ [66:16] ==> public abstract fun add(element: BasicBlock): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'block' @ [66:20] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'blockBuilderMap' @ [67:9] ==> private final val blockBuilderMap: MutableMap<IrStatement, BasicBlockBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'values' @ [67:25] ==> public abstract val values: MutableCollection<BasicBlockBuilder> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'remove' @ [67:32] ==> public abstract fun remove(element: BasicBlockBuilder): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'blockBuilder' @ [67:39] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'currentBlockBuilder' @ [68:9] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'connectorBuilderMap' @ [69:36] ==> private final val connectorBuilderMap: MutableMap<IrStatement, BlockConnectorBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'to' @ [69:56] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'GeneralConnectorBuilder' @ [69:63] ==> public constructor GeneralConnectorBuilder(element: IrStatement) defined in org.jetbrains.kotlin.ir2cfg.generators.GeneralConnectorBuilder[ClassConstructorDescriptorImpl]

'to' @ [69:87] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'nextConnectorBuilder' @ [70:9] ==> val nextConnectorBuilder: BlockConnectorBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'addPrevious' @ [70:30] ==> public abstract fun addPrevious(basicBlock: BasicBlock): Unit defined in org.jetbrains.kotlin.ir2cfg.builders.BlockConnectorBuilder[SimpleFunctionDescriptorImpl]

'block' @ [70:42] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'blockBuilder' @ [71:40] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'incoming' @ [71:53] ==> public abstract val incoming: BlockConnectorBuilder? defined in org.jetbrains.kotlin.ir2cfg.builders.BasicBlockBuilder[PropertyDescriptorImpl]

'previousConnectorBuilder' @ [72:9] ==> val previousConnectorBuilder: BlockConnectorBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'addNext' @ [72:35] ==> public abstract fun addNext(basicBlock: BasicBlock): Unit defined in org.jetbrains.kotlin.ir2cfg.builders.BlockConnectorBuilder[SimpleFunctionDescriptorImpl]

'block' @ [72:43] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'connectorBuilderMap' @ [73:9] ==> private final val connectorBuilderMap: MutableMap<IrStatement, BlockConnectorBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'to' @ [73:29] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'nextConnectorBuilder' @ [73:35] ==> val nextConnectorBuilder: BlockConnectorBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'move' @ [74:9] ==> public open fun move(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'to' @ [74:14] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'currentBlockBuilder' @ [78:9] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'blockBuilderMap' @ [78:31] ==> private final val blockBuilderMap: MutableMap<IrStatement, BasicBlockBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'from' @ [78:47] ==> value-parameter from: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'currentBlockBuilder' @ [79:13] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'connectorBuilderMap' @ [80:32] ==> private final val connectorBuilderMap: MutableMap<IrStatement, BlockConnectorBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'from' @ [80:52] ==> value-parameter from: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'let' @ [80:59] ==> @InlineOnly public inline fun <T, R> BlockConnectorBuilder.let(block: (BlockConnectorBuilder) -> BasicBlockBuilder): BasicBlockBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BlockConnectorBuilder
    <R> -> BasicBlockBuilder

'createBlockBuilder' @ [80:65] ==> private final fun createBlockBuilder(after: BlockConnectorBuilder?): BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'it' @ [80:84] ==> value-parameter it: BlockConnectorBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [81:41] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'currentBlockBuilder' @ [82:13] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'blockBuilder' @ [82:35] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[LocalVariableDescriptor]

'jump' @ [84:9] ==> public open fun jump(to: IrStatement): Unit defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[SimpleFunctionDescriptorImpl]

'to' @ [84:14] ==> value-parameter to: IrStatement defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.jump[ValueParameterDescriptorImpl]

'blockBuilderMap' @ [88:30] ==> private final val blockBuilderMap: MutableMap<IrStatement, BasicBlockBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'values' @ [88:46] ==> public abstract val values: MutableCollection<BasicBlockBuilder> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'currentBlockBuilder' @ [89:17] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'blockBuilder' @ [89:40] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'currentBlockBuilder' @ [90:17] ==> private final var currentBlockBuilder: BasicBlockBuilder? defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'blockBuilder' @ [92:25] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'build' @ [92:38] ==> public abstract fun build(): BasicBlock defined in org.jetbrains.kotlin.ir2cfg.builders.BasicBlockBuilder[SimpleFunctionDescriptorImpl]

'blocks' @ [93:13] ==> private final val blocks: MutableList<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'add' @ [93:20] ==> public abstract fun add(element: BasicBlock): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'block' @ [93:24] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'blockBuilder' @ [94:13] ==> val blockBuilder: BasicBlockBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'incoming' @ [94:26] ==> public abstract val incoming: BlockConnectorBuilder? defined in org.jetbrains.kotlin.ir2cfg.builders.BasicBlockBuilder[PropertyDescriptorImpl]

'addNext' @ [94:36] ==> public abstract fun addNext(basicBlock: BasicBlock): Unit defined in org.jetbrains.kotlin.ir2cfg.builders.BlockConnectorBuilder[SimpleFunctionDescriptorImpl]

'block' @ [94:44] ==> val block: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'mutableListOf' @ [96:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<BlockConnector> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BlockConnector

'connectorBuilderMap' @ [97:34] ==> private final val connectorBuilderMap: MutableMap<IrStatement, BlockConnectorBuilder> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'values' @ [97:54] ==> public abstract val values: MutableCollection<BlockConnectorBuilder> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'connectors' @ [98:13] ==> val connectors: MutableList<BlockConnector> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'add' @ [98:24] ==> public abstract fun add(element: BlockConnector): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'connectorBuilder' @ [98:28] ==> val connectorBuilder: BlockConnectorBuilder defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'build' @ [98:45] ==> public abstract fun build(): BlockConnector defined in org.jetbrains.kotlin.ir2cfg.builders.BlockConnectorBuilder[SimpleFunctionDescriptorImpl]

'connectors' @ [100:27] ==> val connectors: MutableList<BlockConnector> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'connector' @ [101:30] ==> val connector: BlockConnector defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'previousBlocks' @ [101:40] ==> public abstract val previousBlocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.BlockConnector[PropertyDescriptorImpl]

'previous' @ [102:18] ==> val previous: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'outgoing' @ [102:48] ==> public open var outgoing: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.generators.BasicBlockImpl[PropertyDescriptorImpl]

'connector' @ [102:59] ==> val connector: BlockConnector defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'connector' @ [104:26] ==> val connector: BlockConnector defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'nextBlocks' @ [104:36] ==> public abstract val nextBlocks: List<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.graph.BlockConnector[PropertyDescriptorImpl]

'next' @ [105:18] ==> val next: BasicBlock defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'incoming' @ [105:44] ==> public open var incoming: BlockConnector? defined in org.jetbrains.kotlin.ir2cfg.generators.BasicBlockImpl[PropertyDescriptorImpl]

'connector' @ [105:55] ==> val connector: BlockConnector defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

'ControlFlowGraphImpl' @ [108:16] ==> public constructor ControlFlowGraphImpl(function: IrFunction, blocks: List<BasicBlock>, connectors: List<BlockConnector>) defined in org.jetbrains.kotlin.ir2cfg.generators.ControlFlowGraphImpl[ClassConstructorDescriptorImpl]

'function' @ [108:37] ==> public final val function: IrFunction defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'blocks' @ [108:47] ==> private final val blocks: MutableList<BasicBlock> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder[PropertyDescriptorImpl]

'connectors' @ [108:55] ==> val connectors: MutableList<BlockConnector> defined in org.jetbrains.kotlin.ir2cfg.generators.FunctionBuilder.build[LocalVariableDescriptor]

