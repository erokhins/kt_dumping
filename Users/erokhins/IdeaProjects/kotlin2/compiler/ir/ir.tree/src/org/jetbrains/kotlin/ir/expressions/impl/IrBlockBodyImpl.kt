'IrElementBase' @ [26:59] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'startOffset' @ [26:73] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [26:86] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [27:84] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [27:89] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [27:102] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [28:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[LazyClassReceiverParameterDescriptor]

'statements' @ [28:14] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[PropertyDescriptorImpl]

'addAll' @ [28:25] ==> public abstract fun addAll(elements: Collection<IrStatement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [28:32] ==> value-parameter statements: List<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [31:57] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrStatement

'visitor' @ [34:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.accept[ValueParameterDescriptorImpl]

'visitBlockBody' @ [34:24] ==> public open fun visitBlockBody(body: IrBlockBody, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [34:39] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[LazyClassReceiverParameterDescriptor]

'data' @ [34:45] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.accept[ValueParameterDescriptorImpl]

'statements' @ [38:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[PropertyDescriptorImpl]

'forEach' @ [38:20] ==> @HidesMembers public inline fun <T> Iterable<IrStatement>.forEach(action: (IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'it' @ [38:30] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [38:33] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [38:40] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [38:49] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.acceptChildren[ValueParameterDescriptorImpl]

'statements' @ [42:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [42:20] ==> public inline fun <T> Iterable<IrStatement>.forEachIndexed(action: (index: Int, IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'statements' @ [43:13] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[PropertyDescriptorImpl]

'i' @ [43:24] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irStatement' @ [43:29] ==> value-parameter irStatement: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [43:41] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [43:51] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [43:64] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl.transformChildren[ValueParameterDescriptorImpl]

