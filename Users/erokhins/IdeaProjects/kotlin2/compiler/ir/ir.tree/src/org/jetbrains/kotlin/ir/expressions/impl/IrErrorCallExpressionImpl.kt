'IrExpressionBase' @ [31:5] ==> public constructor IrExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [31:22] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [31:35] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [31:46] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.<init>[ValueParameterDescriptorImpl]

'SmartList' @ [33:57] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrExpression

'arguments' @ [36:9] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'add' @ [36:19] ==> public abstract fun add(element: IrExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argument' @ [36:23] ==> value-parameter argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.addArgument[ValueParameterDescriptorImpl]

'visitor' @ [40:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.accept[ValueParameterDescriptorImpl]

'visitErrorCallExpression' @ [40:24] ==> public open fun visitErrorCallExpression(expression: IrErrorCallExpression, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [40:49] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[LazyClassReceiverParameterDescriptor]

'data' @ [40:55] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.accept[ValueParameterDescriptorImpl]

'explicitReceiver' @ [44:9] ==> public open var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'accept' @ [44:27] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [44:34] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [44:43] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.acceptChildren[ValueParameterDescriptorImpl]

'arguments' @ [45:9] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'forEach' @ [45:19] ==> @HidesMembers public inline fun <T> Iterable<IrExpression>.forEach(action: (IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'it' @ [45:29] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [45:32] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [45:39] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [45:48] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.acceptChildren[ValueParameterDescriptorImpl]

'explicitReceiver' @ [49:9] ==> public open var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'explicitReceiver' @ [49:28] ==> public open var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'transform' @ [49:46] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [49:56] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [49:69] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.transformChildren[ValueParameterDescriptorImpl]

'arguments' @ [50:9] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [50:19] ==> public inline fun <T> Iterable<IrExpression>.forEachIndexed(action: (index: Int, IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'arguments' @ [51:13] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[PropertyDescriptorImpl]

'i' @ [51:23] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irExpression' @ [51:28] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [51:41] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [51:51] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [51:64] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl.transformChildren[ValueParameterDescriptorImpl]

