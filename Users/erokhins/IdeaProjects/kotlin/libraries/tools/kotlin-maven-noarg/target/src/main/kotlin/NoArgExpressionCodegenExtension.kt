'with' @ [36:84] ==> @InlineOnly public inline fun <T, R> with(receiver: ImplementationBodyCodegen, block: ImplementationBodyCodegen.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImplementationBodyCodegen
    <R> -> Unit

'codegen' @ [36:89] ==> value-parameter codegen: ImplementationBodyCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateClassSyntheticParts[ValueParameterDescriptorImpl]

'shouldGenerateNoArgConstructor' @ [37:13] ==> private final fun ImplementationBodyCodegen.shouldGenerateNoArgConstructor(): Boolean defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'generateNoArgConstructor' @ [38:13] ==> private final fun ImplementationBodyCodegen.generateNoArgConstructor(): Unit defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'typeMapper' @ [43:38] ==> public final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'mapClass' @ [43:49] ==> @NotNull public open fun mapClass(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'descriptor' @ [43:58] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'getSuperClassOrAny' @ [43:69] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'internalName' @ [43:91] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'createNoArgConstructorDescriptor' @ [45:37] ==> private final fun createNoArgConstructorDescriptor(containingClass: ClassDescriptor): ConstructorDescriptor defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [45:70] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'==' @ [47:36] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.Modality[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [47:37] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'containingDeclaration' @ [47:48] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'modality' @ [47:92] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'SEALED' @ [47:113] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'functionCodegen' @ [49:9] ==> public final val functionCodegen: (FunctionCodegen..FunctionCodegen?) defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'generateMethod' @ [49:25] ==> public open fun generateMethod(@NotNull p0: JvmDeclarationOrigin, @NotNull p1: FunctionDescriptor, @NotNull p2: FunctionGenerationStrategy): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'NO_ORIGIN' @ [49:61] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'constructorDescriptor' @ [49:72] ==> val constructorDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor[LocalVariableDescriptor]

'CodegenBased' @ [49:103] ==> public constructor CodegenBased(@NotNull p0: GenerationState) defined in org.jetbrains.kotlin.codegen.FunctionGenerationStrategy.CodegenBased[JavaClassConstructorDescriptor]

'state' @ [49:116] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'codegen' @ [51:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [51:25] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'load' @ [51:27] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'OBJECT_TYPE' @ [51:44] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'if (isParentASealedClass) {
                    codegen.v.aconst(null)
                    codegen.v.visitMethodInsn(Opcodes.INVOKESPECIAL, superClassInternalName, "<init>",
                                              "(Lkotlin/jvm/internal/DefaultConstructorMarker;)V", false)
                }
                else {
                    codegen.v.visitMethodInsn(Opcodes.INVOKESPECIAL, superClassInternalName, "<init>", "()V", false)
                }' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isParentASealedClass' @ [53:21] ==> val isParentASealedClass: Boolean defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor[LocalVariableDescriptor]

'codegen' @ [54:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [54:29] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'aconst' @ [54:31] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'codegen' @ [55:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [55:29] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'visitMethodInsn' @ [55:31] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INVOKESPECIAL' @ [55:55] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'superClassInternalName' @ [55:70] ==> val superClassInternalName: (String..String?) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor[LocalVariableDescriptor]

'codegen' @ [59:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [59:29] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'visitMethodInsn' @ [59:31] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INVOKESPECIAL' @ [59:55] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'superClassInternalName' @ [59:70] ==> val superClassInternalName: (String..String?) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor[LocalVariableDescriptor]

'invokeInitializers' @ [62:21] ==> public final val invokeInitializers: Boolean defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[PropertyDescriptorImpl]

'generateInitializers' @ [63:21] ==> public open fun generateInitializers(@NotNull p0: ExpressionCodegen): Unit defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaMethodDescriptor]

'codegen' @ [63:42] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'codegen' @ [65:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.generateNoArgConstructor.<no name provided>.doGenerateBody[ValueParameterDescriptorImpl]

'v' @ [65:25] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'visitInsn' @ [65:27] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'RETURN' @ [65:45] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'createSynthesized' @ [71:47] ==> @NotNull public open fun createSynthesized(@NotNull p0: ClassDescriptor, @NotNull p1: Annotations, p2: Boolean, @NotNull p3: SourceElement): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'containingClass' @ [71:65] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.createNoArgConstructorDescriptor[ValueParameterDescriptorImpl]

'EMPTY' @ [71:94] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'NO_SOURCE' @ [71:122] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'apply' @ [71:133] ==> @InlineOnly public inline fun <T> ClassConstructorDescriptorImpl.apply(block: (ClassConstructorDescriptorImpl).() -> Unit): ClassConstructorDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptorImpl

'initialize' @ [72:13] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): FunctionDescriptorImpl defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'calculateDispatchReceiverParameter' @ [72:30] ==> @Nullable public open fun calculateDispatchReceiverParameter(): ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl[JavaMethodDescriptor]

'emptyList' @ [72:68] ==> public fun <T> emptyList(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'emptyList' @ [72:81] ==> public fun <T> emptyList(): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'containingClass' @ [73:24] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.createNoArgConstructorDescriptor[ValueParameterDescriptorImpl]

'builtIns' @ [73:40] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'unitType' @ [73:49] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'OPEN' @ [73:68] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'PUBLIC' @ [73:87] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'this' @ [77:42] ==> <this> defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.isNoArgClass[ReceiverParameterDescriptorImpl]

'getUserData' @ [77:47] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Boolean..Boolean?)>): Boolean? defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'NO_ARG_CLASS_KEY' @ [77:59] ==> public val NO_ARG_CLASS_KEY: Key<Boolean> defined in org.jetbrains.kotlin.noarg in file NoArgClassKey.kt[PropertyDescriptorImpl]

'myClass' @ [80:22] ==> @NotNull public final val myClass: KtPureClassOrObject defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'descriptor' @ [82:13] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'kind' @ [82:24] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [82:42] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'!' @ [82:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'origin' @ [82:52] ==> val origin: KtClass defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.shouldGenerateNoArgConstructor[LocalVariableDescriptor]

'isNoArgClass' @ [82:59] ==> private final fun KtClass.isNoArgClass(): Boolean defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [86:16] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'constructors' @ [86:27] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'none' @ [86:40] ==> public inline fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.none(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [86:47] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.shouldGenerateNoArgConstructor.<anonymous>[ValueParameterDescriptorImpl]

'isZeroParameterConstructor' @ [86:50] ==> private final fun ClassConstructorDescriptor.isZeroParameterConstructor(): Boolean defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'this' @ [90:26] ==> <this> defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.isZeroParameterConstructor[ReceiverParameterDescriptorImpl]

'valueParameters' @ [90:31] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameters' @ [91:16] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.isZeroParameterConstructor[LocalVariableDescriptor]

'isEmpty' @ [91:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameters' @ [92:20] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.isZeroParameterConstructor[LocalVariableDescriptor]

'all' @ [92:31] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.all(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [92:37] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension.isZeroParameterConstructor.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [92:40] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'isPrimary' @ [92:64] ==> public final val ClassConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'findJvmOverloadsAnnotation' @ [92:77] ==> public fun DeclarationDescriptor.findJvmOverloadsAnnotation(): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.annotations[DeserializedSimpleFunctionDescriptor]

