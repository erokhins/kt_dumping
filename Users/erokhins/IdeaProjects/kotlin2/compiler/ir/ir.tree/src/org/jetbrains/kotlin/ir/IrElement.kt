'accept' @ [32:13] ==> public abstract fun <R, D> accept(visitor: IrElementVisitor<IrElement, D>, data: D): IrElement defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> IrElement
    <D> -> D

'transformer' @ [32:20] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.IrElement.transform[ValueParameterDescriptorImpl]

'data' @ [32:33] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.IrElement.transform[ValueParameterDescriptorImpl]

'super' @ [39:13] ==> <this> defined in org.jetbrains.kotlin.ir.IrStatement[LazyClassReceiverParameterDescriptor]

'transform' @ [39:19] ==> public open fun <D> transform(transformer: IrElementTransformer<D>, data: D): IrElement defined in org.jetbrains.kotlin.ir.IrElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> D

'transformer' @ [39:29] ==> value-parameter transformer: IrElementTransformer<D> defined in org.jetbrains.kotlin.ir.IrStatement.transform[ValueParameterDescriptorImpl]

'data' @ [39:42] ==> value-parameter data: D defined in org.jetbrains.kotlin.ir.IrStatement.transform[ValueParameterDescriptorImpl]

'if (this is T) this else throw AssertionError("Expected ${T::class.simpleName}: $this")' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'this' @ [43:13] ==> <this> defined in org.jetbrains.kotlin.ir.assertCast[ReceiverParameterDescriptorImpl]

'this' @ [43:24] ==> <this> defined in org.jetbrains.kotlin.ir.assertCast[ReceiverParameterDescriptorImpl]

'AssertionError' @ [43:40] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'simpleName' @ [43:76] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'this' @ [43:90] ==> <this> defined in org.jetbrains.kotlin.ir.assertCast[ReceiverParameterDescriptorImpl]

