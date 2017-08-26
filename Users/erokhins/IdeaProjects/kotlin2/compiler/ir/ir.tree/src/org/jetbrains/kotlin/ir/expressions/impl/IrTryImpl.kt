'IrExpressionBase' @ [31:9] ==> public constructor IrExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [31:26] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [31:39] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [31:50] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [35:9] ==> public constructor IrTryImpl(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [35:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [35:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [35:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[LazyClassReceiverParameterDescriptor]

'tryResult' @ [36:14] ==> public open lateinit var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'tryResult' @ [36:26] ==> value-parameter tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [37:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[LazyClassReceiverParameterDescriptor]

'catches' @ [37:14] ==> public open val catches: MutableList<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'addAll' @ [37:22] ==> public abstract fun addAll(elements: Collection<IrCatch>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'catches' @ [37:29] ==> value-parameter catches: List<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [38:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[LazyClassReceiverParameterDescriptor]

'finallyExpression' @ [38:14] ==> public open var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'finallyExpression' @ [38:34] ==> value-parameter finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.<init>[ValueParameterDescriptorImpl]

'SmartList' @ [43:50] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrCatch

'visitor' @ [48:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.accept[ValueParameterDescriptorImpl]

'visitTry' @ [48:24] ==> public open fun visitTry(aTry: IrTry, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [48:33] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[LazyClassReceiverParameterDescriptor]

'data' @ [48:39] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.accept[ValueParameterDescriptorImpl]

'tryResult' @ [52:9] ==> public open lateinit var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'accept' @ [52:19] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [52:26] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [52:35] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren[ValueParameterDescriptorImpl]

'catches' @ [53:9] ==> public open val catches: MutableList<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'forEach' @ [53:17] ==> @HidesMembers public inline fun <T> Iterable<IrCatch>.forEach(action: (IrCatch) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCatch

'it' @ [53:27] ==> value-parameter it: IrCatch defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [53:30] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrCatch[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [53:37] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [53:46] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren[ValueParameterDescriptorImpl]

'finallyExpression' @ [54:9] ==> public open var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'accept' @ [54:28] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [54:35] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [54:44] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren[ValueParameterDescriptorImpl]

'tryResult' @ [58:9] ==> public open lateinit var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'tryResult' @ [58:21] ==> public open lateinit var tryResult: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'transform' @ [58:31] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [58:41] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [58:54] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren[ValueParameterDescriptorImpl]

'catches' @ [59:9] ==> public open val catches: MutableList<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [59:17] ==> public inline fun <T> Iterable<IrCatch>.forEachIndexed(action: (index: Int, IrCatch) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrCatch

'catches' @ [60:13] ==> public open val catches: MutableList<IrCatch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'i' @ [60:21] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irCatch' @ [60:26] ==> value-parameter irCatch: IrCatch defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [60:34] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrCatch defined in org.jetbrains.kotlin.ir.expressions.IrCatch[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [60:44] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [60:57] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren[ValueParameterDescriptorImpl]

'finallyExpression' @ [62:9] ==> public open var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'finallyExpression' @ [62:29] ==> public open var finallyExpression: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl[PropertyDescriptorImpl]

'transform' @ [62:48] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [62:58] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [62:71] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.transformChildren[ValueParameterDescriptorImpl]

'IrElementBase' @ [67:16] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'startOffset' @ [67:30] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [67:43] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [70:15] ==> public constructor IrCatchImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [70:20] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [70:33] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [71:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[LazyClassReceiverParameterDescriptor]

'catchParameter' @ [71:14] ==> public open lateinit var catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'catchParameter' @ [71:31] ==> value-parameter catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [75:15] ==> public constructor IrCatchImpl(startOffset: Int, endOffset: Int, catchParameter: IrVariable) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [75:20] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [75:33] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'catchParameter' @ [75:44] ==> value-parameter catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [76:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[LazyClassReceiverParameterDescriptor]

'result' @ [76:14] ==> public open lateinit var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'result' @ [76:23] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.<init>[ValueParameterDescriptorImpl]

'catchParameter' @ [82:56] ==> public open lateinit var catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'descriptor' @ [82:71] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrVariable[PropertyDescriptorImpl]

'visitor' @ [85:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.accept[ValueParameterDescriptorImpl]

'visitCatch' @ [85:24] ==> public open fun visitCatch(aCatch: IrCatch, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [85:35] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[LazyClassReceiverParameterDescriptor]

'data' @ [85:41] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.accept[ValueParameterDescriptorImpl]

'catchParameter' @ [89:9] ==> public open lateinit var catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'accept' @ [89:24] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.declarations.IrVariable[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [89:31] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [89:40] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.acceptChildren[ValueParameterDescriptorImpl]

'result' @ [90:9] ==> public open lateinit var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'accept' @ [90:16] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [90:23] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [90:32] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.acceptChildren[ValueParameterDescriptorImpl]

'catchParameter' @ [94:9] ==> public open lateinit var catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'catchParameter' @ [94:26] ==> public open lateinit var catchParameter: IrVariable defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'transform' @ [94:41] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrStatement defined in org.jetbrains.kotlin.ir.declarations.IrVariable[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [94:51] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [94:64] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.transformChildren[ValueParameterDescriptorImpl]

'result' @ [95:9] ==> public open lateinit var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'result' @ [95:18] ==> public open lateinit var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl[PropertyDescriptorImpl]

'transform' @ [95:25] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [95:35] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [95:48] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.transformChildren[ValueParameterDescriptorImpl]

