'IrExpressionBase' @ [28:9] ==> public constructor IrExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [28:26] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [28:39] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.<init>[ValueParameterDescriptorImpl]

'type' @ [28:50] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.<init>[ValueParameterDescriptorImpl]

'visitor' @ [30:13] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.accept[ValueParameterDescriptorImpl]

'visitWhen' @ [30:21] ==> public open fun visitWhen(expression: IrWhen, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [30:31] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase[LazyClassReceiverParameterDescriptor]

'data' @ [30:37] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.accept[ValueParameterDescriptorImpl]

'branches' @ [33:9] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase[PropertyDescriptorImpl]

'forEach' @ [33:18] ==> @HidesMembers public inline fun <T> Iterable<IrBranch>.forEach(action: (IrBranch) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch

'it' @ [33:28] ==> value-parameter it: IrBranch defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [33:31] ==> public open fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrBranch[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [33:38] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [33:47] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.acceptChildren[ValueParameterDescriptorImpl]

'branches' @ [37:9] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase[PropertyDescriptorImpl]

'forEachIndexed' @ [37:18] ==> public inline fun <T> Iterable<IrBranch>.forEachIndexed(action: (index: Int, IrBranch) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrBranch

'branches' @ [38:13] ==> public abstract val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase[PropertyDescriptorImpl]

'i' @ [38:22] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irBranch' @ [38:27] ==> value-parameter irBranch: IrBranch defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [38:36] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrBranch defined in org.jetbrains.kotlin.ir.expressions.IrBranch[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [38:46] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.transformChildren[ValueParameterDescriptorImpl]

'data' @ [38:59] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase.transformChildren[ValueParameterDescriptorImpl]

'IrWhenBase' @ [48:5] ==> public constructor IrWhenBase(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenBase[ClassConstructorDescriptorImpl]

'startOffset' @ [48:16] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [48:29] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [48:40] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [52:9] ==> public constructor IrWhenImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [52:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [52:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [52:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'origin' @ [52:44] ==> value-parameter origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [53:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[LazyClassReceiverParameterDescriptor]

'branches' @ [53:14] ==> public open val branches: MutableList<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl[PropertyDescriptorImpl]

'addAll' @ [53:23] ==> public abstract fun addAll(elements: Collection<IrBranch>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'branches' @ [53:30] ==> value-parameter branches: List<IrBranch> defined in org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [56:52] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrBranch

'IrElementBase' @ [60:9] ==> public constructor IrElementBase(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.IrElementBase[ClassConstructorDescriptorImpl]

'startOffset' @ [60:23] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [60:36] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [61:66] ==> public constructor IrBranchImpl(startOffset: Int, endOffset: Int, condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[ClassConstructorDescriptorImpl]

'condition' @ [61:71] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [61:81] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'condition' @ [61:94] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [61:104] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'condition' @ [61:115] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.<init>[ValueParameterDescriptorImpl]

'result' @ [61:126] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.<init>[ValueParameterDescriptorImpl]

'condition' @ [64:9] ==> public open var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[PropertyDescriptorImpl]

'accept' @ [64:19] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [64:26] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [64:35] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.acceptChildren[ValueParameterDescriptorImpl]

'result' @ [65:9] ==> public open var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[PropertyDescriptorImpl]

'accept' @ [65:16] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [65:23] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [65:32] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.acceptChildren[ValueParameterDescriptorImpl]

'condition' @ [69:9] ==> public open var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[PropertyDescriptorImpl]

'condition' @ [69:21] ==> public open var condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[PropertyDescriptorImpl]

'transform' @ [69:31] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [69:41] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [69:54] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.transformChildren[ValueParameterDescriptorImpl]

'result' @ [70:9] ==> public open var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[PropertyDescriptorImpl]

'result' @ [70:18] ==> public open var result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[PropertyDescriptorImpl]

'transform' @ [70:25] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrExpression defined in org.jetbrains.kotlin.ir.expressions.IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [70:35] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [70:48] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.transformChildren[ValueParameterDescriptorImpl]

'IrElseBranchImpl' @ [75:17] ==> public constructor IrElseBranchImpl(condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl[ClassConstructorDescriptorImpl]

'IrConstImpl' @ [76:25] ==> public companion object defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl[FakeCallableDescriptorForObject]

'boolean' @ [76:37] ==> public final fun boolean(startOffset: Int, endOffset: Int, type: KotlinType, value: Boolean): IrConstImpl<Boolean> defined in org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl.Companion[SimpleFunctionDescriptorImpl]

'result' @ [76:45] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion.elseBranch[ValueParameterDescriptorImpl]

'startOffset' @ [76:52] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'result' @ [76:65] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion.elseBranch[ValueParameterDescriptorImpl]

'endOffset' @ [76:72] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'result' @ [76:83] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion.elseBranch[ValueParameterDescriptorImpl]

'type' @ [76:90] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'builtIns' @ [76:95] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'booleanType' @ [76:104] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'result' @ [77:25] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl.Companion.elseBranch[ValueParameterDescriptorImpl]

'IrBranchImpl' @ [83:9] ==> public constructor IrBranchImpl(startOffset: Int, endOffset: Int, condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [83:22] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [83:35] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'condition' @ [83:46] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'result' @ [83:57] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [84:66] ==> public constructor IrElseBranchImpl(startOffset: Int, endOffset: Int, condition: IrExpression, result: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl[ClassConstructorDescriptorImpl]

'condition' @ [84:71] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'startOffset' @ [84:81] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'condition' @ [84:94] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [84:104] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrExpression[PropertyDescriptorImpl]

'condition' @ [84:115] ==> value-parameter condition: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

'result' @ [84:126] ==> value-parameter result: IrExpression defined in org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl.<init>[ValueParameterDescriptorImpl]

