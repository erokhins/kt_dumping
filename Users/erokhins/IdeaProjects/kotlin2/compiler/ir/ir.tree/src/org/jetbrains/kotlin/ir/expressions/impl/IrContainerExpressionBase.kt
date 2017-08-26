'IrExpressionBase' @ [29:9] ==> public constructor IrExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [29:26] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [29:39] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.<init>[ValueParameterDescriptorImpl]

'type' @ [29:50] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [30:57] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrStatement

'statements' @ [33:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase[PropertyDescriptorImpl]

'forEach' @ [33:20] ==> @HidesMembers public inline fun <T> Iterable<IrStatement>.forEach(action: (IrStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'it' @ [33:30] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [33:33] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [33:40] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [33:49] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.acceptChildren[ValueParameterDescriptorImpl]

'statements' @ [37:9] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase[PropertyDescriptorImpl]

'transform' @ [37:20] ==> public inline fun <reified T : IrElement> MutableList<IrStatement>.transform(transformation: (IrStatement) -> IrElement): Unit defined in org.jetbrains.kotlin.ir.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : IrElement> -> IrStatement

'it' @ [37:32] ==> value-parameter it: IrStatement defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [37:35] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.IrStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [37:45] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.transformChildren[ValueParameterDescriptorImpl]

'data' @ [37:58] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrContainerExpressionBase.transformChildren[ValueParameterDescriptorImpl]

