'IrExpressionBase' @ [31:15] ==> public constructor IrExpressionBase(startOffset: Int, endOffset: Int, type: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBase[ClassConstructorDescriptorImpl]

'startOffset' @ [31:32] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [31:45] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [31:56] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [35:9] ==> public constructor IrVarargImpl(startOffset: Int, endOffset: Int, type: KotlinType, varargElementType: KotlinType) defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[ClassConstructorDescriptorImpl]

'startOffset' @ [35:14] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'endOffset' @ [35:27] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'type' @ [35:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'varargElementType' @ [35:44] ==> value-parameter varargElementType: KotlinType defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'this' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[LazyClassReceiverParameterDescriptor]

'elements' @ [36:14] ==> public open val elements: MutableList<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[PropertyDescriptorImpl]

'addAll' @ [36:23] ==> public abstract fun addAll(elements: Collection<IrVarargElement>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'elements' @ [36:30] ==> value-parameter elements: List<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.<init>[ValueParameterDescriptorImpl]

'SmartList' @ [39:59] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IrVarargElement

'elements' @ [42:9] ==> public open val elements: MutableList<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[PropertyDescriptorImpl]

'add' @ [42:18] ==> public abstract fun add(element: IrVarargElement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'varargElement' @ [42:22] ==> value-parameter varargElement: IrVarargElement defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.addElement[ValueParameterDescriptorImpl]

'elements' @ [46:9] ==> public open val elements: MutableList<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[PropertyDescriptorImpl]

'i' @ [46:18] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.putElement[ValueParameterDescriptorImpl]

'element' @ [46:23] ==> value-parameter element: IrVarargElement defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.putElement[ValueParameterDescriptorImpl]

'visitor' @ [50:16] ==> value-parameter visitor: IrElementVisitor<R, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.accept[ValueParameterDescriptorImpl]

'visitVararg' @ [50:24] ==> public open fun visitVararg(expression: IrVararg, data: D): R defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitor[SimpleFunctionDescriptorImpl]

'this' @ [50:36] ==> <this> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[LazyClassReceiverParameterDescriptor]

'data' @ [50:42] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.accept[ValueParameterDescriptorImpl]

'elements' @ [54:9] ==> public open val elements: MutableList<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[PropertyDescriptorImpl]

'forEach' @ [54:18] ==> @HidesMembers public inline fun <T> Iterable<IrVarargElement>.forEach(action: (IrVarargElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'it' @ [54:28] ==> value-parameter it: IrVarargElement defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.acceptChildren.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [54:31] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<Unit, D>, data: D): Unit defined in org.jetbrains.kotlin.ir.expressions.IrVarargElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit
    <D> -> D

'visitor' @ [54:38] ==> value-parameter visitor: IrElementVisitor<Unit, D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.acceptChildren[ValueParameterDescriptorImpl]

'data' @ [54:47] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.acceptChildren[ValueParameterDescriptorImpl]

'elements' @ [58:9] ==> public open val elements: MutableList<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[PropertyDescriptorImpl]

'forEachIndexed' @ [58:18] ==> public inline fun <T> Iterable<IrVarargElement>.forEachIndexed(action: (index: Int, IrVarargElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrVarargElement

'elements' @ [59:13] ==> public open val elements: MutableList<IrVarargElement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl[PropertyDescriptorImpl]

'i' @ [59:22] ==> value-parameter i: Int defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'irVarargElement' @ [59:27] ==> value-parameter irVarargElement: IrVarargElement defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.transformChildren.<anonymous>[ValueParameterDescriptorImpl]

'transform' @ [59:43] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrElement defined in org.jetbrains.kotlin.ir.expressions.IrVarargElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [59:53] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.transformChildren[ValueParameterDescriptorImpl]

'data' @ [59:66] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.transformChildren[ValueParameterDescriptorImpl]

