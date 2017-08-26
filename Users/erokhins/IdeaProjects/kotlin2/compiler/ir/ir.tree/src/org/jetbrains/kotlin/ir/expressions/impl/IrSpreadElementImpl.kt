'IrElementBase' @ [28:5] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'startOffset' @ [28:19] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [28:32] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [29:79] ==> public constructor IrSpreadElementImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [29:84] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [29:97] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [30:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[LazyClassReceiverParameterDescriptor]

'expression' @ [30:14] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[PropertyDescriptorImpl]

'expression' @ [30:27] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.<init>[ValueParameterDescriptorImpl]

'visitor' @ [36:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.accept[ValueParameterDescriptorImpl]

'visitSpreadElement' @ [36:24] ==> public open fun visitSpreadElement(spread: IrSpreadElement, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [36:43] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[LazyClassReceiverParameterDescriptor]

'data' @ [36:49] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.accept[ValueParameterDescriptorImpl]

'expression' @ [40:9] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[PropertyDescriptorImpl]

'accept' @ [40:20] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [40:27] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [40:36] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.acceptChildren[ValueParameterDescriptorImpl]

'expression' @ [44:9] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[PropertyDescriptorImpl]

'expression' @ [44:22] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl[PropertyDescriptorImpl]

'transform' @ [44:33] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [44:43] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [44:56] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl.transformChildren[ValueParameterDescriptorImpl]

