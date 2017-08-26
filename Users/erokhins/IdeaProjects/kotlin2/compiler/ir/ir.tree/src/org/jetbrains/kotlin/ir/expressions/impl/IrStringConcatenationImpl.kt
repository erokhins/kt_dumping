'IrExpressionBase' @ [27:9] ==> public constructor IrExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [27:26] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [27:39] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [27:50] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [28:108] ==> public constructor IrStringConcatenationImpl(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [28:113] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [28:126] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [28:137] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [29:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[LazyClassReceiverParameterDescriptor]

'arguments' @ [29:14] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[PropertyDescriptorImpl]

'addAll' @ [29:24] ==> public abstract fun addAll(elements: Collection<IrExpression>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arguments' @ [29:31] ==> value-parameter arguments: Collection<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [32:57] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrExpression

'arguments' @ [35:9] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[PropertyDescriptorImpl]

'add' @ [35:19] ==> public abstract fun add(element: IrExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argument' @ [35:23] ==> value-parameter argument: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.addArgument[ValueParameterDescriptorImpl]

'visitor' @ [39:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.accept[ValueParameterDescriptorImpl]

'visitStringConcatenation' @ [39:21] ==> public open fun visitStringConcatenation(expression: IrStringConcatenation, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [39:46] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[LazyClassReceiverParameterDescriptor]

'data' @ [39:52] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.accept[ValueParameterDescriptorImpl]

'arguments' @ [42:9] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[PropertyDescriptorImpl]

'forEach' @ [42:19] ==> @HidesMembers public inline fun <T> Iterable<IrExpression>.forEach(action: (IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'it' @ [42:29] ==> value-parameter it: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [42:32] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [42:39] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [42:48] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.acceptChildren[ValueParameterDescriptorImpl]

'arguments' @ [46:9] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [46:19] ==> public inline fun <T> Iterable<IrExpression>.forEachIndexed(action: (index: Int, IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'arguments' @ [47:13] ==> public open val arguments: MutableList<IrExpression> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl[PropertyDescriptorImpl]

'i' @ [47:23] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irExpression' @ [47:28] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [47:41] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [47:51] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [47:64] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl.transformChildren[ValueParameterDescriptorImpl]

