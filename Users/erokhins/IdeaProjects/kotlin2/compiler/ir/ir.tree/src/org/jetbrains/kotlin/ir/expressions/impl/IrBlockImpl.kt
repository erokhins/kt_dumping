'IrContainerExpressionBase' @ [32:9] ==> public constructor IrContainerExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [32:35] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [32:48] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [32:59] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [32:65] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [34:13] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [34:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [34:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [34:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [34:48] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [35:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[LazyClassReceiverParameterDescriptor]

'statements' @ [35:14] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[PropertyDescriptorImpl]

'addAll' @ [35:25] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [35:32] ==> value-parameter statements: List<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.<init>[ValueParameterDescriptorImpl]

'visitor' @ [39:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept[ValueParameterDescriptorImpl]

'visitBlock' @ [39:21] ==> public open fun visitBlock(expression: IrBlock, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [39:32] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[LazyClassReceiverParameterDescriptor]

'data' @ [39:38] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept[ValueParameterDescriptorImpl]

'statement' @ [43:9] ==> value-parameter statement: IrStatement? defined in org.jetbrains.kotlin.ir.expressions.impl.addIfNotNull[ValueParameterDescriptorImpl]

'statements' @ [43:28] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[PropertyDescriptorImpl]

'add' @ [43:39] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statement' @ [43:43] ==> value-parameter statement: IrStatement? defined in org.jetbrains.kotlin.ir.expressions.impl.addIfNotNull[ValueParameterDescriptorImpl]

'if (statement is IrBlock) {
        statements.addAll(statement.statements)
    }
    else {
        statements.add(statement)
    }' @ [47:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'statement' @ [47:9] ==> value-parameter statement: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.inlineStatement[ValueParameterDescriptorImpl]

'statements' @ [48:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[PropertyDescriptorImpl]

'addAll' @ [48:20] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statement' @ [48:27] ==> value-parameter statement: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.inlineStatement[ValueParameterDescriptorImpl]

'statements' @ [48:37] ==> public abstract val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.IrBlock[PropertyDescriptorImpl]

'statements' @ [51:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[PropertyDescriptorImpl]

'add' @ [51:20] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statement' @ [51:24] ==> value-parameter statement: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.inlineStatement[ValueParameterDescriptorImpl]

'IrContainerExpressionBase' @ [58:7] ==> public constructor IrContainerExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [58:33] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [58:46] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [58:57] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [58:63] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [59:31] ==> public open val symbol: IrReturnableBlockSymbol defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'descriptor' @ [59:38] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrReturnableBlockSymbol[PropertyDescriptorImpl]

'this' @ [63:13] ==> public constructor IrReturnableBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrReturnableBlockSymbol, origin: IrStatementOrigin? = ..., sourceFileName: String = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [63:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [63:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [63:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [63:48] ==> value-parameter symbol: IrReturnableBlockSymbol defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [63:56] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'sourceFileName' @ [63:64] ==> value-parameter sourceFileName: String = ... defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [64:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[LazyClassReceiverParameterDescriptor]

'statements' @ [64:14] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'addAll' @ [64:25] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [64:32] ==> value-parameter statements: List<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [69:13] ==> public constructor IrReturnableBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, symbol: IrReturnableBlockSymbol, origin: IrStatementOrigin? = ..., sourceFileName: String = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [69:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [69:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [69:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'IrReturnableBlockSymbolImpl' @ [69:48] ==> public constructor IrReturnableBlockSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrReturnableBlockSymbolImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [69:76] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [69:89] ==> value-parameter origin: IrStatementOrigin? = ... defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'sourceFileName' @ [69:97] ==> value-parameter sourceFileName: String = ... defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [73:13] ==> public constructor IrReturnableBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, descriptor: FunctionDescriptor, origin: IrStatementOrigin? = ..., sourceFileName: String = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [73:18] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [73:31] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [73:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'descriptor' @ [73:48] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [73:60] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'sourceFileName' @ [73:68] ==> value-parameter sourceFileName: String = ... defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [74:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[LazyClassReceiverParameterDescriptor]

'statements' @ [74:14] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'addAll' @ [74:25] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [74:32] ==> value-parameter statements: List<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.<init>[ValueParameterDescriptorImpl]

'symbol' @ [78:9] ==> public open val symbol: IrReturnableBlockSymbol defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'bind' @ [78:16] ==> public abstract fun bind(owner: IrReturnableBlock): Unit defined in org.jetbrains.kotlin.ir.symbols.IrReturnableBlockSymbol[SimpleFunctionDescriptorImpl]

'this' @ [78:21] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[LazyClassReceiverParameterDescriptor]

'visitor' @ [82:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.accept[ValueParameterDescriptorImpl]

'visitBlock' @ [82:21] ==> public open fun visitBlock(expression: IrBlock, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [82:32] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[LazyClassReceiverParameterDescriptor]

'data' @ [82:38] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.accept[ValueParameterDescriptorImpl]

'statements' @ [85:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'forEach' @ [85:20] ==> @HidesMembers public inline fun <T> Iterable<IrStatement>.forEach(action: (IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'it' @ [85:30] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [85:33] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [85:40] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [85:49] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.acceptChildren[ValueParameterDescriptorImpl]

'statements' @ [89:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [89:20] ==> public inline fun <T> Iterable<IrStatement>.forEachIndexed(action: (index: Int, IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'statements' @ [90:13] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl[PropertyDescriptorImpl]

'i' @ [90:24] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irStatement' @ [90:29] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [90:41] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [90:51] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [90:64] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnableBlockImpl.transformChildren[ValueParameterDescriptorImpl]

