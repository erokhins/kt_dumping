'IrElementTransformerVoid' @ [41:65] ==> public constructor IrElementTransformerVoid() defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid[DeserializedClassConstructorDescriptor]

'irClass' @ [44:26] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.lower[ValueParameterDescriptorImpl]

'descriptor' @ [44:34] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'isInterface' @ [45:29] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [45:41] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.lower[LocalVariableDescriptor]

'irClass' @ [49:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.lower[ValueParameterDescriptorImpl]

'transformChildrenVoid' @ [49:17] ==> public fun IrElement.transformChildrenVoid(transformer: IrElementTransformerVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [49:39] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering[LazyClassReceiverParameterDescriptor]

'generateInterfaceMethods' @ [50:9] ==> private final fun generateInterfaceMethods(irClass: IrClass, descriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering[SimpleFunctionDescriptorImpl]

'irClass' @ [50:34] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.lower[ValueParameterDescriptorImpl]

'descriptor' @ [50:43] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.lower[LocalVariableDescriptor]

'if (descriptor is DefaultImplsClassDescriptor) descriptor.correspondingInterface else descriptor' @ [55:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor, elseBranch: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor

'descriptor' @ [55:35] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[ValueParameterDescriptorImpl]

'descriptor' @ [55:78] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[ValueParameterDescriptorImpl]

'correspondingInterface' @ [55:89] ==> public abstract val correspondingInterface: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.descriptors.DefaultImplsClassDescriptor[PropertyDescriptorImpl]

'descriptor' @ [55:117] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[ValueParameterDescriptorImpl]

'component1' @ [56:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FunctionDescriptor, FunctionDescriptor>.component1(): FunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> FunctionDescriptor

'component2' @ [56:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FunctionDescriptor, FunctionDescriptor>.component2(): FunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V> -> FunctionDescriptor

'CodegenUtil' @ [56:39] ==> public object CodegenUtil defined in org.jetbrains.kotlin.backend.common[FakeCallableDescriptorForObject]

'getNonPrivateTraitMethods' @ [56:51] ==> @JvmStatic public final fun getNonPrivateTraitMethods(descriptor: ClassDescriptor): Map<FunctionDescriptor, FunctionDescriptor> defined in org.jetbrains.kotlin.backend.common.CodegenUtil[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [56:77] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'!' @ [58:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'interfaceFun' @ [58:18] ==> val interfaceFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'isDefinitelyNotDefaultImplsMethod' @ [58:31] ==> public fun CallableMemberDescriptor.isDefinitelyNotDefaultImplsMethod(): Boolean defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'if (classDescriptor !== descriptor) {
                            InterfaceLowering.createDefaultImplFunDescriptor(descriptor as DefaultImplsClassDescriptorImpl, interfaceFun, classDescriptor, state.typeMapper)
                        }
                        else {
                            value
                        }' @ [60:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor, elseBranch: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor

'classDescriptor' @ [60:29] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'descriptor' @ [60:49] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[ValueParameterDescriptorImpl]

'createDefaultImplFunDescriptor' @ [61:47] ==> public final fun createDefaultImplFunDescriptor(defaultImplsDescriptor: DefaultImplsClassDescriptorImpl, descriptor: FunctionDescriptor, interfaceDescriptor: ClassDescriptor, typeMapper: KotlinTypeMapper): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceLowering.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [61:78] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[ValueParameterDescriptorImpl]

'interfaceFun' @ [61:125] ==> val interfaceFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'classDescriptor' @ [61:139] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'state' @ [61:156] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering[PropertyDescriptorImpl]

'typeMapper' @ [61:162] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'value' @ [64:29] ==> val value: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'generateDelegationToDefaultImpl' @ [66:17] ==> private final fun generateDelegationToDefaultImpl(irClass: IrClass, interfaceFun: FunctionDescriptor, inheritedFun: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering[SimpleFunctionDescriptorImpl]

'irClass' @ [66:49] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[ValueParameterDescriptorImpl]

'interfaceFun' @ [66:58] ==> val interfaceFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'inheritedFun' @ [66:72] ==> val inheritedFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateInterfaceMethods[LocalVariableDescriptor]

'IrBlockBodyImpl' @ [72:22] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [72:38] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [72:56] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'IrFunctionImpl' @ [73:26] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, body: IrBody?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [73:41] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [73:59] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'DEFINED' @ [73:97] ==> public object DEFINED : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'inheritedFun' @ [73:106] ==> value-parameter inheritedFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'irBody' @ [73:120] ==> val irBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'irClass' @ [74:9] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'declarations' @ [74:17] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [74:30] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irFunction' @ [74:34] ==> val irFunction: IrFunctionImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'interfaceFun' @ [76:35] ==> value-parameter interfaceFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'containingDeclaration' @ [76:48] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'InterfaceLowering' @ [77:28] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceLowering[FakeCallableDescriptorForObject]

'createDefaultImplsClassDescriptor' @ [77:46] ==> public final fun createDefaultImplsClassDescriptor(interfaceDescriptor: ClassDescriptor): DefaultImplsClassDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceLowering.Companion[SimpleFunctionDescriptorImpl]

'interfaceDescriptor' @ [77:80] ==> val interfaceDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'InterfaceLowering' @ [78:30] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceLowering[FakeCallableDescriptorForObject]

'createDefaultImplFunDescriptor' @ [78:48] ==> public final fun createDefaultImplFunDescriptor(defaultImplsDescriptor: DefaultImplsClassDescriptorImpl, descriptor: FunctionDescriptor, interfaceDescriptor: ClassDescriptor, typeMapper: KotlinTypeMapper): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceLowering.Companion[SimpleFunctionDescriptorImpl]

'defaultImpls' @ [78:79] ==> val defaultImpls: DefaultImplsClassDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'interfaceFun' @ [78:93] ==> value-parameter interfaceFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'original' @ [78:106] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'interfaceDescriptor' @ [78:116] ==> val interfaceDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'state' @ [78:137] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering[PropertyDescriptorImpl]

'typeMapper' @ [78:143] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'inheritedFun' @ [79:26] ==> value-parameter inheritedFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'returnType' @ [79:39] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'IrCallImpl' @ [80:26] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [80:37] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [80:55] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'defaultImplFun' @ [80:73] ==> val defaultImplFun: SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'DEFAULT_IMPLS_DELEGATION' @ [80:121] ==> public object DEFAULT_IMPLS_DELEGATION : IrStatementOriginImpl defined in org.jetbrains.kotlin.backend.jvm.JvmLoweredStatementOrigin[FakeCallableDescriptorForObject]

'irBody' @ [81:9] ==> val irBody: IrBlockBodyImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'statements' @ [81:16] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [81:27] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrReturnImpl' @ [81:31] ==> @Deprecated public constructor IrReturnImpl(startOffset: Int, endOffset: Int, returnTargetDescriptor: FunctionDescriptor, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [81:44] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [81:62] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'inheritedFun' @ [81:80] ==> value-parameter inheritedFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'irCallImpl' @ [81:94] ==> val irCallImpl: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'inheritedFun' @ [84:13] ==> value-parameter inheritedFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [84:26] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'irCallImpl' @ [85:13] ==> val irCallImpl: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'putValueArgument' @ [85:24] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'IrGetValueImpl' @ [85:44] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [85:59] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [85:77] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'interfaceFun' @ [85:95] ==> value-parameter interfaceFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [85:108] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'shift' @ [86:13] ==> var shift: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'inheritedFun' @ [88:9] ==> value-parameter inheritedFun: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[ValueParameterDescriptorImpl]

'valueParameters' @ [88:22] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapIndexed' @ [88:38] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapIndexed(transform: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> Unit

'irCallImpl' @ [89:13] ==> val irCallImpl: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'putValueArgument' @ [89:24] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'i' @ [89:41] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl.<anonymous>[ValueParameterDescriptorImpl]

'shift' @ [89:45] ==> var shift: Int defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl[LocalVariableDescriptor]

'IrGetValueImpl' @ [89:52] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [89:67] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [89:85] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'valueParameterDescriptor' @ [89:103] ==> value-parameter valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.backend.jvm.lower.InterfaceDelegationLowering.generateDelegationToDefaultImpl.<anonymous>[ValueParameterDescriptorImpl]

