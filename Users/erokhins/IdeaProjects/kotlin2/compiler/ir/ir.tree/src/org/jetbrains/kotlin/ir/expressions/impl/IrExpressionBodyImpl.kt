'IrElementBase' @ [25:64] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'startOffset' @ [25:78] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [25:91] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [26:79] ==> public constructor IrExpressionBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [26:84] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [26:97] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [27:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[LazyClassReceiverParameterDescriptor]

'expression' @ [27:14] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[PropertyDescriptorImpl]

'expression' @ [27:27] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [30:45] ==> public constructor IrExpressionBodyImpl(startOffset: Int, endOffset: Int, expression: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[ClassConstructorDescriptorImpl]

'expression' @ [30:50] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [30:61] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'expression' @ [30:74] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [30:85] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'expression' @ [30:96] ==> value-parameter expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.<init>[ValueParameterDescriptorImpl]

'visitor' @ [35:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.accept[ValueParameterDescriptorImpl]

'visitExpressionBody' @ [35:21] ==> public open fun visitExpressionBody(body: IrExpressionBody, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [35:41] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[LazyClassReceiverParameterDescriptor]

'data' @ [35:47] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.accept[ValueParameterDescriptorImpl]

'expression' @ [38:9] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[PropertyDescriptorImpl]

'accept' @ [38:20] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [38:27] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [38:36] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.acceptChildren[ValueParameterDescriptorImpl]

'expression' @ [42:9] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[PropertyDescriptorImpl]

'expression' @ [42:22] ==> public open lateinit var expression: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl[PropertyDescriptorImpl]

'transform' @ [42:33] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [42:43] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [42:56] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl.transformChildren[ValueParameterDescriptorImpl]

