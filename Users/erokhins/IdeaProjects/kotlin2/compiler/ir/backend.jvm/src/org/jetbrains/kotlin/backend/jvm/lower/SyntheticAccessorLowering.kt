'CodegenContext<DeclarationDescriptor>' @ [56:17] ==> public constructor CodegenContext<T : (DeclarationDescriptor..DeclarationDescriptor?)>(@NotNull p0: DeclarationDescriptor, @NotNull p1: OwnerKind, @Nullable p2: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>?..CodegenContext<*>?), @Nullable p3: MutableClosure?, @Nullable p4: ClassDescriptor?, @Nullable p5: LocalLookup?) defined in org.jetbrains.kotlin.codegen.context.CodegenContext[JavaClassConstructorDescriptor]
Inferred types:
    <T : (DeclarationDescriptor..DeclarationDescriptor?)> -> DeclarationDescriptor

'if (contextDescriptor is FileClassDescriptor) contextDescriptor.containingDeclaration else contextDescriptor' @ [57:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'contextDescriptor' @ [57:13] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext.<init>[ValueParameterDescriptorImpl]

'contextDescriptor' @ [57:55] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext.<init>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [57:73] ==> public final val FileClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'contextDescriptor' @ [57:100] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext.<init>[ValueParameterDescriptorImpl]

'OwnerKind' @ [58:9] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'IMPLEMENTATION' @ [58:19] ==> enum entry IMPLEMENTATION defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'parentContext' @ [58:35] ==> value-parameter parentContext: CodegenContext<*>? defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext.<init>[ValueParameterDescriptorImpl]

'if (contextDescriptor is FileClassDescriptor) null else contextDescriptor' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'contextDescriptor' @ [59:13] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext.<init>[ValueParameterDescriptorImpl]

'contextDescriptor' @ [59:65] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext.<init>[ValueParameterDescriptorImpl]

'ClassContext' @ [68:18] ==> public constructor ClassContext(@NotNull p0: KotlinTypeMapper, @NotNull p1: ClassDescriptor, @NotNull p2: OwnerKind, @Nullable p3: raw (CodegenContext<(DeclarationDescriptor..DeclarationDescriptor?)>?..CodegenContext<*>?), @Nullable p4: LocalLookup?) defined in org.jetbrains.kotlin.codegen.context.ClassContext[JavaClassConstructorDescriptor]

'typeMapper' @ [68:32] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.lower.ClassStubContext.<init>[ValueParameterDescriptorImpl]

'contextDescriptor' @ [68:44] ==> value-parameter contextDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ClassStubContext.<init>[ValueParameterDescriptorImpl]

'OwnerKind' @ [68:63] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'IMPLEMENTATION' @ [68:73] ==> enum entry IMPLEMENTATION defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'parentContext' @ [68:89] ==> value-parameter parentContext: CodegenContext<*>? defined in org.jetbrains.kotlin.backend.jvm.lower.ClassStubContext.<init>[ValueParameterDescriptorImpl]

'ClassLowerWithContext' @ [70:54] ==> public constructor ClassLowerWithContext() defined in org.jetbrains.kotlin.backend.jvm.lower.ClassLowerWithContext[ClassConstructorDescriptorImpl]

'hashMapOf' @ [72:27] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrClassContext, CodegenContext<*>> /* = HashMap<IrClassContext, CodegenContext<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrClassContext
    <V> -> CodegenContext<*>

'hashMapOf' @ [73:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<ClassDescriptor, CodegenContext<*>> /* = HashMap<ClassDescriptor, CodegenContext<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> CodegenContext<*>

'context2Codegen' @ [76:17] ==> public final val context2Codegen: HashMap<IrClassContext, CodegenContext<*>> /* = HashMap<IrClassContext, CodegenContext<*>> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'this' @ [76:33] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.codegenContext[ReceiverParameterDescriptorImpl]

'class2Codegen' @ [79:17] ==> public final val class2Codegen: HashMap<ClassDescriptor, CodegenContext<*>> /* = HashMap<ClassDescriptor, CodegenContext<*>> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'this' @ [79:31] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.codegenContext[ReceiverParameterDescriptorImpl]

'irClass' @ [83:26] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[ValueParameterDescriptorImpl]

'descriptor' @ [83:34] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'if (descriptor is FileClassDescriptor) {
            StubCodegenContext(descriptor, data.parent?.codegenContext, data)
        }
        else {
            ClassStubContext(descriptor, data.parent?.codegenContext, data, state.typeMapper)
        }' @ [84:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodegenContext<*>, elseBranch: CodegenContext<*>): CodegenContext<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodegenContext<*>

'descriptor' @ [84:49] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[LocalVariableDescriptor]

'StubCodegenContext' @ [85:13] ==> public constructor StubCodegenContext(contextDescriptor: ClassDescriptor, parentContext: CodegenContext<*>?, irClassContext: IrClassContext) defined in org.jetbrains.kotlin.backend.jvm.lower.StubCodegenContext[ClassConstructorDescriptorImpl]

'descriptor' @ [85:32] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[LocalVariableDescriptor]

'data' @ [85:44] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[ValueParameterDescriptorImpl]

'parent' @ [85:49] ==> public final val parent: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'codegenContext' @ [85:57] ==> private final val IrClassContext.codegenContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'data' @ [85:73] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[ValueParameterDescriptorImpl]

'ClassStubContext' @ [88:13] ==> public constructor ClassStubContext(contextDescriptor: ClassDescriptor, parentContext: CodegenContext<*>?, irClassContext: IrClassContext, typeMapper: KotlinTypeMapper) defined in org.jetbrains.kotlin.backend.jvm.lower.ClassStubContext[ClassConstructorDescriptorImpl]

'descriptor' @ [88:30] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[LocalVariableDescriptor]

'data' @ [88:42] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[ValueParameterDescriptorImpl]

'parent' @ [88:47] ==> public final val parent: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'codegenContext' @ [88:55] ==> private final val IrClassContext.codegenContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'data' @ [88:71] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[ValueParameterDescriptorImpl]

'state' @ [88:77] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'typeMapper' @ [88:83] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'newContext' @ [90:9] ==> val newContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[LocalVariableDescriptor]

'apply' @ [90:20] ==> @InlineOnly public inline fun <T> CodegenContext<out (DeclarationDescriptor..DeclarationDescriptor?)>.apply(block: CodegenContext<out (DeclarationDescriptor..DeclarationDescriptor?)>.() -> Unit): CodegenContext<out (DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CodegenContext<out (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>

'context2Codegen' @ [91:13] ==> public final val context2Codegen: HashMap<IrClassContext, CodegenContext<*>> /* = HashMap<IrClassContext, CodegenContext<*>> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'put' @ [91:29] ==> public open fun put(key: IrClassContext, value: CodegenContext<*>): CodegenContext<*>? defined in java.util.HashMap[JavaMethodDescriptor]

'data' @ [91:33] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[ValueParameterDescriptorImpl]

'this' @ [91:39] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore.<anonymous>[ReceiverParameterDescriptorImpl]

'class2Codegen' @ [92:13] ==> public final val class2Codegen: HashMap<ClassDescriptor, CodegenContext<*>> /* = HashMap<ClassDescriptor, CodegenContext<*>> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'put' @ [92:27] ==> public open fun put(key: ClassDescriptor, value: CodegenContext<*>): CodegenContext<*>? defined in java.util.HashMap[JavaMethodDescriptor]

'descriptor' @ [92:31] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore[LocalVariableDescriptor]

'this' @ [92:43] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator.lowerBefore.<anonymous>[ReceiverParameterDescriptorImpl]

'contextAnnotator' @ [104:17] ==> private final lateinit var contextAnnotator: ContextAnnotator defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'context2Codegen' @ [104:34] ==> public final val context2Codegen: HashMap<IrClassContext, CodegenContext<*>> /* = HashMap<IrClassContext, CodegenContext<*>> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'this' @ [104:50] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.codegenContext[ReceiverParameterDescriptorImpl]

'contextAnnotator' @ [109:17] ==> private final lateinit var contextAnnotator: ContextAnnotator defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'class2Codegen' @ [109:34] ==> public final val class2Codegen: HashMap<ClassDescriptor, CodegenContext<*>> /* = HashMap<ClassDescriptor, CodegenContext<*>> */ defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[PropertyDescriptorImpl]

'this' @ [109:48] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.codegenContext[ReceiverParameterDescriptorImpl]

'contextAnnotator' @ [112:9] ==> private final lateinit var contextAnnotator: ContextAnnotator defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'ContextAnnotator' @ [112:28] ==> public constructor ContextAnnotator(state: GenerationState) defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[ClassConstructorDescriptorImpl]

'state' @ [112:45] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'contextAnnotator' @ [113:9] ==> private final lateinit var contextAnnotator: ContextAnnotator defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'lower' @ [113:26] ==> public open fun lower(irFile: IrFile): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.ContextAnnotator[SimpleFunctionDescriptorImpl]

'irFile' @ [113:32] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[ValueParameterDescriptorImpl]

'irFile' @ [114:9] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[ValueParameterDescriptorImpl]

'transform' @ [114:16] ==> public open fun <D> transform(transformer: IrElementTransformer<Nothing?>, data: Nothing?): IrFile defined in org.jetbrains.kotlin.ir.declarations.IrFile[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> Nothing?

'this' @ [114:26] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[LazyClassReceiverParameterDescriptor]

'declaration' @ [118:29] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [118:41] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'codegenContext' @ [118:52] ==> private final val ClassDescriptor.codegenContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'irClassContext' @ [118:83] ==> public abstract val irClassContext: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.StubContext[PropertyDescriptorImpl]

'super' @ [119:16] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[LazyClassReceiverParameterDescriptor]

'visitClass' @ [119:22] ==> public open fun visitClass(declaration: IrClass, data: IrClassContext?): IrStatement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformer[DeserializedSimpleFunctionDescriptor]

'declaration' @ [119:33] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitClass[ValueParameterDescriptorImpl]

'classContext' @ [119:46] ==> val classContext: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitClass[LocalVariableDescriptor]

'apply' @ [119:60] ==> @InlineOnly public inline fun <T> IrStatement.apply(block: IrStatement.() -> Unit): IrStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatement

'lower' @ [120:13] ==> public final fun lower(irCLass: IrClass, data: IrClassContext): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[SimpleFunctionDescriptorImpl]

'this' @ [120:19] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitClass.<anonymous>[ReceiverParameterDescriptorImpl]

'classContext' @ [120:36] ==> val classContext: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitClass[LocalVariableDescriptor]

'data' @ [125:30] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[ValueParameterDescriptorImpl]

'codegenContext' @ [125:35] ==> private final val IrClassContext.codegenContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'codegenContext' @ [126:25] ==> val codegenContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[LocalVariableDescriptor]

'accessors' @ [126:40] ==> public final val <T : (DeclarationDescriptor..DeclarationDescriptor?)> CodegenContext<out (DeclarationDescriptor..DeclarationDescriptor?)>.accessors: Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)>[MyPropertyDescriptor]
Inferred types:
    <T : (DeclarationDescriptor..DeclarationDescriptor?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'accessors' @ [129:25] ==> val accessors: Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[LocalVariableDescriptor]

'filterIsInstance' @ [129:35] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FunctionDescriptor

'accessors' @ [130:25] ==> val accessors: Collection<(AccessorForCallableDescriptor<*>..AccessorForCallableDescriptor<*>?)> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[LocalVariableDescriptor]

'filterIsInstance' @ [130:35] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<AccessorForPropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> AccessorForPropertyDescriptor

'flatMap' @ [130:85] ==> public inline fun <T, R> Iterable<AccessorForPropertyDescriptor>.flatMap(transform: (AccessorForPropertyDescriptor) -> Iterable<PropertyAccessorDescriptor>): List<PropertyAccessorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AccessorForPropertyDescriptor
    <R> -> PropertyAccessorDescriptor

'listOf' @ [131:29] ==> public fun <T> listOf(vararg elements: PropertyAccessorDescriptor?): List<PropertyAccessorDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyAccessorDescriptor?

'if (it.isWithSyntheticGetterAccessor) it.getter else null' @ [131:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyGetterDescriptorImpl?, elseBranch: PropertyGetterDescriptorImpl?): PropertyGetterDescriptorImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyGetterDescriptorImpl?

'it' @ [131:40] ==> value-parameter it: AccessorForPropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'isWithSyntheticGetterAccessor' @ [131:43] ==> public final val AccessorForPropertyDescriptor.isWithSyntheticGetterAccessor: Boolean[MyPropertyDescriptor]

'it' @ [131:74] ==> value-parameter it: AccessorForPropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'getter' @ [131:77] ==> public open val getter: PropertyGetterDescriptorImpl? defined in org.jetbrains.kotlin.codegen.AccessorForPropertyDescriptor[JavaPropertyDescriptor]

'if (it.isWithSyntheticSetterAccessor) it.setter else null' @ [131:95] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertySetterDescriptor?, elseBranch: PropertySetterDescriptor?): PropertySetterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertySetterDescriptor?

'it' @ [131:99] ==> value-parameter it: AccessorForPropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'isWithSyntheticSetterAccessor' @ [131:102] ==> public final val AccessorForPropertyDescriptor.isWithSyntheticSetterAccessor: Boolean[MyPropertyDescriptor]

'it' @ [131:133] ==> value-parameter it: AccessorForPropertyDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [131:136] ==> public open val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.codegen.AccessorForPropertyDescriptor[JavaPropertyDescriptor]

'filterNotNull' @ [131:154] ==> public fun <T : Any> Iterable<PropertyAccessorDescriptor?>.filterNotNull(): List<PropertyAccessorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PropertyAccessorDescriptor

'filterIsInstance' @ [133:19] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<AccessorForCallableDescriptor<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> AccessorForCallableDescriptor<*>

'allAccessors' @ [134:9] ==> val allAccessors: List<AccessorForCallableDescriptor<*>> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[LocalVariableDescriptor]

'forEach' @ [134:22] ==> @HidesMembers public inline fun <T> Iterable<AccessorForCallableDescriptor<*>>.forEach(action: (AccessorForCallableDescriptor<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AccessorForCallableDescriptor<*>

'accessor' @ [135:34] ==> value-parameter accessor: AccessorForCallableDescriptor<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [135:66] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'IrBlockBodyImpl' @ [136:24] ==> public constructor IrBlockBodyImpl(startOffset: Int, endOffset: Int) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [136:40] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [136:58] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'accessor' @ [137:38] ==> value-parameter accessor: AccessorForCallableDescriptor<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'toStatic' @ [137:47] ==> public fun FunctionDescriptor.toStatic(newOwner: ClassOrPackageFragmentDescriptor, name: Name = ..., dispatchReceiverClass: ClassDescriptor? = ...): FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'accessorOwner' @ [137:56] ==> val accessorOwner: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'identifier' @ [137:76] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'state' @ [137:87] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'typeMapper' @ [137:93] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapAsmMethod' @ [137:104] ==> @NotNull public open fun mapAsmMethod(@NotNull p0: FunctionDescriptor): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'accessor' @ [137:117] ==> value-parameter accessor: AccessorForCallableDescriptor<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [137:127] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'IrFunctionImpl' @ [138:37] ==> public constructor IrFunctionImpl(startOffset: Int, endOffset: Int, origin: IrDeclarationOrigin, descriptor: FunctionDescriptor, body: IrBody?) defined in org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [139:21] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [139:39] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'SYNTHETIC_ACCESSOR' @ [139:85] ==> public object SYNTHETIC_ACCESSOR : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.jvm.JvmLoweredDeclarationOrigin[FakeCallableDescriptorForObject]

'accessorDescriptor' @ [140:21] ==> val accessorDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'body' @ [140:41] ==> val body: IrBlockBodyImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'accessor' @ [142:36] ==> value-parameter accessor: AccessorForCallableDescriptor<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'calleeDescriptor' @ [142:45] ==> public final val <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> AccessorForCallableDescriptor<out (CallableMemberDescriptor..CallableMemberDescriptor?)>.calleeDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <T : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'IrCallImpl' @ [143:30] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [143:41] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [143:59] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'calleeDescriptor' @ [143:77] ==> val calleeDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'copyAllArgsToValueParams' @ [144:13] ==> private final fun copyAllArgsToValueParams(call: IrCallImpl, fromDescriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[SimpleFunctionDescriptorImpl]

'returnExpr' @ [144:38] ==> val returnExpr: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'accessorDescriptor' @ [144:50] ==> val accessorDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'body' @ [145:13] ==> val body: IrBlockBodyImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'statements' @ [145:18] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl[DeserializedPropertyDescriptor]

'add' @ [145:29] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'IrReturnImpl' @ [145:33] ==> @Deprecated public constructor IrReturnImpl(startOffset: Int, endOffset: Int, returnTargetDescriptor: FunctionDescriptor, value: IrExpression) defined in org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [145:46] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [145:64] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'accessor' @ [145:82] ==> value-parameter accessor: AccessorForCallableDescriptor<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[ValueParameterDescriptorImpl]

'returnExpr' @ [145:92] ==> val returnExpr: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'data' @ [146:13] ==> value-parameter data: IrClassContext defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower[ValueParameterDescriptorImpl]

'irClass' @ [146:18] ==> public final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.lower.IrClassContext[PropertyDescriptorImpl]

'declarations' @ [146:26] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'add' @ [146:39] ==> public abstract fun add(element: IrDeclaration): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'syntheticFunction' @ [146:43] ==> val syntheticFunction: IrFunctionImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.lower.<anonymous>[LocalVariableDescriptor]

'super' @ [152:27] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[LazyClassReceiverParameterDescriptor]

'visitMemberAccess' @ [152:33] ==> public open fun visitMemberAccess(expression: IrMemberAccessExpression, data: IrClassContext?): IrElement defined in org.jetbrains.kotlin.ir.visitors.IrElementTransformer[DeserializedSimpleFunctionDescriptor]

'expression' @ [152:51] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'data' @ [152:63] ==> value-parameter data: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'expression' @ [153:26] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'descriptor' @ [153:37] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'descriptor' @ [154:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'data' @ [155:34] ==> value-parameter data: IrClassContext? defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'codegenContext' @ [155:41] ==> private final val IrClassContext.codegenContext: CodegenContext<*> defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'accessibleDescriptor' @ [155:56] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> accessibleDescriptor(@NotNull p0: CallableMemberDescriptor, @Nullable p1: ClassDescriptor?): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.context.CodegenContext[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> CallableMemberDescriptor

'getDirectMember' @ [155:92] ==> @NotNull public open fun getDirectMember(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'descriptor' @ [155:108] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'expression' @ [155:122] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'superQualifier' @ [155:146] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'actualAccessor' @ [156:28] ==> private final fun actualAccessor(descriptor: FunctionDescriptor, calculatedAccessor: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[SimpleFunctionDescriptorImpl]

'descriptor' @ [156:43] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'directAccessor' @ [156:55] ==> val directAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'accessor' @ [158:17] ==> val accessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'descriptor' @ [158:65] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'accessor' @ [159:37] ==> val accessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'containingDeclaration' @ [159:46] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'descriptor' @ [160:38] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'toStatic' @ [160:49] ==> public fun FunctionDescriptor.toStatic(newOwner: ClassOrPackageFragmentDescriptor, name: Name = ..., dispatchReceiverClass: ClassDescriptor? = ...): FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'accessorOwner' @ [160:58] ==> val accessorOwner: ClassOrPackageFragmentDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'identifier' @ [160:78] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'state' @ [160:89] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering[PropertyDescriptorImpl]

'typeMapper' @ [160:95] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapAsmMethod' @ [160:106] ==> @NotNull public open fun mapAsmMethod(@NotNull p0: FunctionDescriptor): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'accessor' @ [160:119] ==> val accessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'name' @ [160:151] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'IrCallImpl' @ [161:28] ==> @Deprecated public constructor IrCallImpl(startOffset: Int, endOffset: Int, calleeDescriptor: FunctionDescriptor, typeArguments: Map<TypeParameterDescriptor, KotlinType>? = ..., origin: IrStatementOrigin? = ..., superQualifierDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedClassConstructorDescriptor]

'expression' @ [161:39] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'startOffset' @ [161:50] ==> public abstract val startOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'expression' @ [161:63] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'endOffset' @ [161:74] ==> public abstract val endOffset: Int defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'staticAccessor' @ [161:85] ==> val staticAccessor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'emptyMap' @ [161:101] ==> public fun <K, V> emptyMap(): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'expression' @ [161:113] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'origin' @ [161:124] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'expression' @ [163:17] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[ValueParameterDescriptorImpl]

'receiverAndArgs' @ [163:28] ==> public fun IrMemberAccessExpression.receiverAndArgs(): List<IrExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics[SimpleFunctionDescriptorImpl]

'forEachIndexed' @ [163:46] ==> public inline fun <T> Iterable<IrExpression>.forEachIndexed(action: (index: Int, IrExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrExpression

'call' @ [164:21] ==> val call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'putValueArgument' @ [164:26] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'i' @ [164:43] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess.<anonymous>[ValueParameterDescriptorImpl]

'irExpression' @ [164:46] ==> value-parameter irExpression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [166:24] ==> val call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'superResult' @ [169:16] ==> val superResult: IrElement defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.visitMemberAccess[LocalVariableDescriptor]

'calculatedAccessor' @ [173:13] ==> value-parameter calculatedAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'descriptor' @ [174:28] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'if (isGetter) calculatedAccessor.getter!! else calculatedAccessor.setter!!' @ [175:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyAccessorDescriptor, elseBranch: PropertyAccessorDescriptor): PropertyAccessorDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyAccessorDescriptor

'isGetter' @ [175:40] ==> val isGetter: Boolean defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[LocalVariableDescriptor]

'calculatedAccessor' @ [175:50] ==> value-parameter calculatedAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'getter' @ [175:69] ==> public open val getter: PropertyGetterDescriptorImpl? defined in org.jetbrains.kotlin.codegen.AccessorForPropertyDescriptor[JavaPropertyDescriptor]

'calculatedAccessor' @ [175:83] ==> value-parameter calculatedAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'setter' @ [175:102] ==> public open val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.codegen.AccessorForPropertyDescriptor[JavaPropertyDescriptor]

'isGetter' @ [176:17] ==> val isGetter: Boolean defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[LocalVariableDescriptor]

'calculatedAccessor' @ [176:29] ==> value-parameter calculatedAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'isWithSyntheticGetterAccessor' @ [176:48] ==> public final val AccessorForPropertyDescriptor.isWithSyntheticGetterAccessor: Boolean[MyPropertyDescriptor]

'!' @ [176:81] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGetter' @ [176:82] ==> val isGetter: Boolean defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[LocalVariableDescriptor]

'calculatedAccessor' @ [176:94] ==> value-parameter calculatedAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'isWithSyntheticSetterAccessor' @ [176:113] ==> public final val AccessorForPropertyDescriptor.isWithSyntheticSetterAccessor: Boolean[MyPropertyDescriptor]

'propertyAccessor' @ [177:24] ==> val propertyAccessor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[LocalVariableDescriptor]

'descriptor' @ [179:20] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'calculatedAccessor' @ [182:16] ==> value-parameter calculatedAccessor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.actualAccessor[ValueParameterDescriptorImpl]

'call' @ [187:29] ==> value-parameter call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'descriptor' @ [187:34] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'newDescriptor' @ [188:9] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[LocalVariableDescriptor]

'dispatchReceiverParameter' @ [188:23] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [188:50] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Unit

'call' @ [189:13] ==> value-parameter call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [189:18] ==> public open var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [189:37] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [189:52] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [189:70] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'fromDescriptor' @ [189:88] ==> value-parameter fromDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'valueParameters' @ [189:103] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'offset' @ [189:119] ==> var offset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[LocalVariableDescriptor]

'newDescriptor' @ [192:9] ==> val newDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[LocalVariableDescriptor]

'extensionReceiverParameter' @ [192:23] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [192:51] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Unit

'call' @ [193:13] ==> value-parameter call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'extensionReceiver' @ [193:18] ==> public open var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'IrGetValueImpl' @ [193:38] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [193:53] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [193:71] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'fromDescriptor' @ [193:89] ==> value-parameter fromDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'valueParameters' @ [193:104] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'offset' @ [193:120] ==> var offset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[LocalVariableDescriptor]

'call' @ [196:9] ==> value-parameter call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'descriptor' @ [196:14] ==> public open val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedPropertyDescriptor]

'valueParameters' @ [196:25] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEachIndexed' @ [196:41] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEachIndexed(action: (index: Int, (ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'call' @ [197:13] ==> value-parameter call: IrCallImpl defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'putValueArgument' @ [197:18] ==> public open fun putValueArgument(index: Int, valueArgument: IrExpression?): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl[DeserializedSimpleFunctionDescriptor]

'i' @ [197:35] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams.<anonymous>[ValueParameterDescriptorImpl]

'IrGetValueImpl' @ [197:38] ==> @Deprecated public constructor IrGetValueImpl(startOffset: Int, endOffset: Int, descriptor: ValueDescriptor, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl[DeserializedClassConstructorDescriptor]

'UNDEFINED_OFFSET' @ [197:53] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [197:71] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'fromDescriptor' @ [197:89] ==> value-parameter fromDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[ValueParameterDescriptorImpl]

'valueParameters' @ [197:104] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'i' @ [197:120] ==> value-parameter i: Int defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams.<anonymous>[ValueParameterDescriptorImpl]

'offset' @ [197:124] ==> var offset: Int defined in org.jetbrains.kotlin.backend.jvm.lower.SyntheticAccessorLowering.copyAllArgsToValueParams[LocalVariableDescriptor]

