'mutableListOf' @ [48:32] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'context' @ [50:17] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'state' @ [50:25] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'context' @ [52:22] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'state' @ [52:30] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [52:36] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'irClass' @ [54:22] ==> private final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'descriptor' @ [54:30] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'isAnonymousObject' @ [56:47] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'irClass' @ [56:65] ==> private final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'descriptor' @ [56:73] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'if (isAnonymous) CodegenBinding.asmTypeForAnonymousClass(state.bindingContext, descriptor.source.getPsi() as KtElement) else typeMapper.mapType(descriptor)' @ [58:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'isAnonymous' @ [58:26] ==> private final val isAnonymous: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'asmTypeForAnonymousClass' @ [58:54] ==> @NotNull public open fun asmTypeForAnonymousClass(@NotNull p0: BindingContext, @NotNull p1: KtElement): Type defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaMethodDescriptor]

'state' @ [58:79] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'bindingContext' @ [58:85] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'descriptor' @ [58:101] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'source' @ [58:112] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [58:119] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'typeMapper' @ [58:147] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'mapType' @ [58:158] ==> @NotNull public open fun mapType(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'descriptor' @ [58:166] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'irClass' @ [60:22] ==> private final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'descriptor' @ [60:30] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'psiElement' @ [60:41] ==> private val DeclarationDescriptorWithSource.psiElement: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[PropertyDescriptorImpl]

'state' @ [62:33] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'factory' @ [62:39] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'newVisitor' @ [62:47] ==> @NotNull public open fun newVisitor(@NotNull p0: JvmDeclarationOrigin, @NotNull p1: Type, @NotNull p2: PsiFile): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'OtherOrigin' @ [62:58] ==> @JvmOverloads public fun OtherOrigin(element: PsiElement?, descriptor: DeclarationDescriptor? = ...): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [62:70] ==> public final val psiElement: PsiElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'descriptor' @ [62:82] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'type' @ [62:95] ==> public final val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'psiElement' @ [62:101] ==> public final val psiElement: PsiElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'containingFile' @ [62:112] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'SuperClassInfo' @ [65:30] ==> public companion object defined in org.jetbrains.kotlin.codegen.SuperClassInfo[FakeCallableDescriptorForObject]

'getSuperClassInfo' @ [65:45] ==> @JvmStatic public final fun getSuperClassInfo(descriptor: ClassDescriptor, typeMapper: KotlinTypeMapper): SuperClassInfo defined in org.jetbrains.kotlin.codegen.SuperClassInfo.Companion[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [65:63] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'typeMapper' @ [65:75] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'signature' @ [66:51] ==> @NotNull public open fun signature(@NotNull p0: ClassDescriptor, @NotNull p1: Type, @NotNull p2: SuperClassInfo, @NotNull p3: KotlinTypeMapper): JvmClassSignature defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaMethodDescriptor]

'descriptor' @ [66:61] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'type' @ [66:73] ==> public final val type: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'superClassInfo' @ [66:79] ==> val superClassInfo: SuperClassInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate[LocalVariableDescriptor]

'typeMapper' @ [66:95] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'visitor' @ [68:9] ==> public final val visitor: ClassBuilder defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'defineClass' @ [68:17] ==> public abstract fun defineClass(@Nullable p0: PsiElement?, p1: Int, p2: Int, @NotNull p3: String, @Nullable p4: String?, @NotNull p5: String, @NotNull p6: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'psiElement' @ [69:17] ==> public final val psiElement: PsiElement defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'state' @ [70:17] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'classFileVersion' @ [70:23] ==> public final val classFileVersion: Int defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'descriptor' @ [71:17] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'calculateClassFlags' @ [71:28] ==> public fun ClassDescriptor.calculateClassFlags(): Int defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[SimpleFunctionDescriptorImpl]

'signature' @ [72:17] ==> val signature: JvmClassSignature defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate[LocalVariableDescriptor]

'name' @ [72:27] ==> public final val JvmClassSignature.name: (String..String?)[MyPropertyDescriptor]

'signature' @ [73:17] ==> val signature: JvmClassSignature defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate[LocalVariableDescriptor]

'javaGenericSignature' @ [73:27] ==> public final val JvmClassSignature.javaGenericSignature: (String..String?)[MyPropertyDescriptor]

'signature' @ [74:17] ==> val signature: JvmClassSignature defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate[LocalVariableDescriptor]

'superclassName' @ [74:27] ==> public final val JvmClassSignature.superclassName: (String..String?)[MyPropertyDescriptor]

'signature' @ [75:17] ==> val signature: JvmClassSignature defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate[LocalVariableDescriptor]

'interfaces' @ [75:27] ==> public final val JvmClassSignature.interfaces: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'toTypedArray' @ [75:38] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'forClass' @ [77:27] ==> public open fun forClass(@NotNull p0: ClassVisitor, @NotNull p1: InnerClassConsumer, @NotNull p2: KotlinTypeMapper): (AnnotationCodegen..AnnotationCodegen?) defined in org.jetbrains.kotlin.codegen.AnnotationCodegen[JavaMethodDescriptor]

'visitor' @ [77:36] ==> public final val visitor: ClassBuilder defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'visitor' @ [77:44] ==> public final val ClassBuilder.visitor: ClassVisitor[MyPropertyDescriptor]

'this' @ [77:53] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[LazyClassReceiverParameterDescriptor]

'typeMapper' @ [77:59] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'genAnnotations' @ [77:71] ==> public open fun genAnnotations(@Nullable p0: Annotated?, @Nullable p1: Type?): Unit defined in org.jetbrains.kotlin.codegen.AnnotationCodegen[JavaMethodDescriptor]

'descriptor' @ [77:86] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'irClass' @ [79:9] ==> private final val irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'declarations' @ [79:17] ==> public abstract val declarations: MutableList<IrDeclaration> defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'forEach' @ [79:30] ==> @HidesMembers public inline fun <T> Iterable<IrDeclaration>.forEach(action: (IrDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrDeclaration

'generateDeclaration' @ [80:13] ==> public final fun generateDeclaration(declaration: IrDeclaration): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'it' @ [80:33] ==> value-parameter it: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate.<anonymous>[ValueParameterDescriptorImpl]

'writeInnerClasses' @ [83:9] ==> private final fun writeInnerClasses(): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'visitor' @ [85:9] ==> public final val visitor: ClassBuilder defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'done' @ [85:17] ==> public abstract fun done(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'irClass' @ [90:30] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[ValueParameterDescriptorImpl]

'descriptor' @ [90:38] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrClass[DeserializedPropertyDescriptor]

'context' @ [91:25] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[ValueParameterDescriptorImpl]

'state' @ [91:33] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'isError' @ [93:28] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [93:36] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[LocalVariableDescriptor]

'badDescriptor' @ [94:17] ==> public open fun badDescriptor(p0: (ClassDescriptor..ClassDescriptor?), p1: (ClassBuilderMode..ClassBuilderMode?)): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'descriptor' @ [94:31] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[LocalVariableDescriptor]

'state' @ [94:43] ==> val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[LocalVariableDescriptor]

'classBuilderMode' @ [94:49] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'descriptor' @ [98:17] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[LocalVariableDescriptor]

'name' @ [98:28] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'NO_NAME_PROVIDED' @ [98:49] ==> public final val NO_NAME_PROVIDED: (Name..Name?) defined in org.jetbrains.kotlin.name.SpecialNames[JavaPropertyDescriptor]

'badDescriptor' @ [99:17] ==> public open fun badDescriptor(p0: (ClassDescriptor..ClassDescriptor?), p1: (ClassBuilderMode..ClassBuilderMode?)): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'descriptor' @ [99:31] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[LocalVariableDescriptor]

'state' @ [99:43] ==> val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[LocalVariableDescriptor]

'classBuilderMode' @ [99:49] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'ClassCodegen' @ [102:13] ==> private constructor ClassCodegen(irClass: IrClass, context: JvmBackendContext, parentClassCodegen: ClassCodegen? = ...) defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[ClassConstructorDescriptorImpl]

'irClass' @ [102:26] ==> value-parameter irClass: IrClass defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[ValueParameterDescriptorImpl]

'context' @ [102:35] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.Companion.generate[ValueParameterDescriptorImpl]

'generate' @ [102:44] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'when (declaration) {
            is IrField ->
                generateField(declaration)
            is IrFunction -> {
                generateMethod(declaration)
            }
            is IrAnonymousInitializer -> {
                // skip
            }
            is IrTypeAlias -> {
                // skip
            }
            is IrClass -> {
                ClassCodegen(declaration, context, this).generate()
            }
            else -> throw RuntimeException("Unsupported declaration $declaration")
        }' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [107:15] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateDeclaration[ValueParameterDescriptorImpl]

'generateField' @ [109:17] ==> private final fun generateField(field: IrField): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'declaration' @ [109:31] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateDeclaration[ValueParameterDescriptorImpl]

'generateMethod' @ [111:17] ==> private final fun generateMethod(method: IrFunction): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'declaration' @ [111:32] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateDeclaration[ValueParameterDescriptorImpl]

'ClassCodegen' @ [120:17] ==> private constructor ClassCodegen(irClass: IrClass, context: JvmBackendContext, parentClassCodegen: ClassCodegen? = ...) defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[ClassConstructorDescriptorImpl]

'declaration' @ [120:30] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateDeclaration[ValueParameterDescriptorImpl]

'context' @ [120:43] ==> public final val context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'this' @ [120:52] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[LazyClassReceiverParameterDescriptor]

'generate' @ [120:58] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'RuntimeException' @ [122:27] ==> public constructor RuntimeException(p0: (String..String?)) defined in java.lang.RuntimeException[JavaClassConstructorDescriptor]

'declaration' @ [122:70] ==> value-parameter declaration: IrDeclaration defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateDeclaration[ValueParameterDescriptorImpl]

'typeMapper' @ [128:25] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'mapType' @ [128:36] ==> @NotNull public open fun mapType(@NotNull p0: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'field' @ [128:44] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'descriptor' @ [128:50] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'typeMapper' @ [129:30] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'mapFieldSignature' @ [129:41] ==> @Nullable public open fun mapFieldSignature(@NotNull p0: KotlinType, @NotNull p1: PropertyDescriptor): String? defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'field' @ [129:59] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'descriptor' @ [129:65] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'type' @ [129:76] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'field' @ [129:82] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'descriptor' @ [129:88] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'visitor' @ [130:18] ==> public final val visitor: ClassBuilder defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'newField' @ [130:26] ==> @NotNull public abstract fun newField(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'field' @ [130:35] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'OtherOrigin' @ [130:41] ==> private val IrField.OtherOrigin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[PropertyDescriptorImpl]

'field' @ [130:54] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'descriptor' @ [130:60] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'calculateCommonFlags' @ [130:71] ==> public fun MemberDescriptor.calculateCommonFlags(): Int defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[SimpleFunctionDescriptorImpl]

'field' @ [130:95] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'descriptor' @ [130:101] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'name' @ [130:112] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [130:117] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'fieldType' @ [130:129] ==> val fieldType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[LocalVariableDescriptor]

'descriptor' @ [130:139] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'fieldSignature' @ [131:35] ==> val fieldSignature: String? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[LocalVariableDescriptor]

'if (field.origin == JvmLoweredDeclarationOrigin.FIELD_FOR_ENUM_ENTRY) {
            AnnotationCodegen.forField(fv, this, typeMapper).genAnnotations(field.descriptor, null)
        }
        else {

        }' @ [133:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'field' @ [133:13] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'origin' @ [133:19] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'FIELD_FOR_ENUM_ENTRY' @ [133:57] ==> public object FIELD_FOR_ENUM_ENTRY : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.backend.jvm.JvmLoweredDeclarationOrigin[FakeCallableDescriptorForObject]

'forField' @ [134:31] ==> public open fun forField(@NotNull p0: FieldVisitor, @NotNull p1: InnerClassConsumer, @NotNull p2: KotlinTypeMapper): (AnnotationCodegen..AnnotationCodegen?) defined in org.jetbrains.kotlin.codegen.AnnotationCodegen[JavaMethodDescriptor]

'fv' @ [134:40] ==> val fv: FieldVisitor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[LocalVariableDescriptor]

'this' @ [134:44] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[LazyClassReceiverParameterDescriptor]

'typeMapper' @ [134:50] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'genAnnotations' @ [134:62] ==> public open fun genAnnotations(@Nullable p0: Annotated?, @Nullable p1: Type?): Unit defined in org.jetbrains.kotlin.codegen.AnnotationCodegen[JavaMethodDescriptor]

'field' @ [134:77] ==> value-parameter field: IrField defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateField[ValueParameterDescriptorImpl]

'descriptor' @ [134:83] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'method' @ [142:13] ==> value-parameter method: IrFunction defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethod[ValueParameterDescriptorImpl]

'origin' @ [142:20] ==> public abstract val origin: IrDeclarationOrigin defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'FAKE_OVERRIDE' @ [142:50] ==> public object FAKE_OVERRIDE : IrDeclarationOriginImpl defined in org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin[FakeCallableDescriptorForObject]

'FunctionCodegen' @ [143:9] ==> public constructor FunctionCodegen(irFunction: IrFunction, classCodegen: ClassCodegen) defined in org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen[ClassConstructorDescriptorImpl]

'method' @ [143:25] ==> value-parameter method: IrFunction defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethod[ValueParameterDescriptorImpl]

'this' @ [143:33] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[LazyClassReceiverParameterDescriptor]

'generate' @ [143:39] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen[SimpleFunctionDescriptorImpl]

'classForInnerClassRecord' @ [149:31] ==> private final fun classForInnerClassRecord(): ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [150:13] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'parentClassCodegen' @ [151:17] ==> private final val parentClassCodegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'parentClassCodegen' @ [152:17] ==> private final val parentClassCodegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'innerClasses' @ [152:36] ==> private final val innerClasses: MutableList<ClassDescriptor> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'add' @ [152:49] ==> public abstract fun add(element: ClassDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [152:53] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'this' @ [155:42] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[LazyClassReceiverParameterDescriptor]

'codegen' @ [156:20] ==> var codegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'codegen' @ [157:34] ==> var codegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'classForInnerClassRecord' @ [157:42] ==> private final fun classForInnerClassRecord(): ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[SimpleFunctionDescriptorImpl]

'outerClass' @ [158:21] ==> val outerClass: ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'innerClasses' @ [159:21] ==> private final val innerClasses: MutableList<ClassDescriptor> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'add' @ [159:34] ==> public abstract fun add(element: ClassDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'outerClass' @ [159:38] ==> val outerClass: ClassDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'codegen' @ [161:17] ==> var codegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'codegen' @ [161:27] ==> var codegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'parentClassCodegen' @ [161:35] ==> private final val parentClassCodegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'innerClasses' @ [165:28] ==> private final val innerClasses: MutableList<ClassDescriptor> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'writeInnerClass' @ [166:27] ==> public open fun writeInnerClass(@NotNull p0: ClassDescriptor, @NotNull p1: KotlinTypeMapper, @NotNull p2: ClassBuilder): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'innerClass' @ [166:43] ==> val innerClass: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.writeInnerClasses[LocalVariableDescriptor]

'typeMapper' @ [166:55] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'visitor' @ [166:67] ==> public final val visitor: ClassBuilder defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'if (parentClassCodegen != null) descriptor else null' @ [171:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'parentClassCodegen' @ [171:20] ==> private final val parentClassCodegen: ClassCodegen? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'descriptor' @ [171:48] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'classDescriptor' @ [177:47] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[ValueParameterDescriptorImpl]

'current' @ [178:16] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[LocalVariableDescriptor]

'!' @ [178:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTopLevelDeclaration' @ [178:36] ==> public open fun isTopLevelDeclaration(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'current' @ [178:58] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[LocalVariableDescriptor]

'current' @ [179:17] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[LocalVariableDescriptor]

'innerClasses' @ [180:17] ==> private final val innerClasses: MutableList<ClassDescriptor> defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen[PropertyDescriptorImpl]

'add' @ [180:30] ==> public abstract fun add(element: ClassDescriptor): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'current' @ [180:34] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[LocalVariableDescriptor]

'current' @ [182:13] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[LocalVariableDescriptor]

'current' @ [182:23] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.addInnerClassInfoFromAnnotation[LocalVariableDescriptor]

'containingDeclaration' @ [182:31] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'flags' @ [190:5] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'flags' @ [190:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'if (DescriptorUtils.isInterface(this) || DescriptorUtils.isAnnotationClass(this)) Opcodes.ACC_INTERFACE else Opcodes.ACC_SUPER' @ [190:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isInterface' @ [190:42] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [190:54] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[ReceiverParameterDescriptorImpl]

'isAnnotationClass' @ [190:79] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [190:97] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[ReceiverParameterDescriptorImpl]

'ACC_INTERFACE' @ [190:112] ==> public const final val ACC_INTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [190:139] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'flags' @ [191:5] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'flags' @ [191:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'calcModalityFlag' @ [191:22] ==> private fun MemberDescriptor.calcModalityFlag(): Int defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[SimpleFunctionDescriptorImpl]

'flags' @ [192:5] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'flags' @ [192:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'getVisibilityAccessFlagForClass' @ [192:30] ==> public open fun getVisibilityAccessFlagForClass(@NotNull p0: ClassDescriptor): Int defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'this' @ [192:62] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[ReceiverParameterDescriptorImpl]

'flags' @ [193:5] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'flags' @ [193:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'if (kind == ClassKind.ENUM_CLASS) Opcodes.ACC_ENUM else 0' @ [193:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'kind' @ [193:26] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [193:44] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ACC_ENUM' @ [193:64] ==> public const final val ACC_ENUM: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'flags' @ [194:5] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'flags' @ [194:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'if (kind == ClassKind.ANNOTATION_CLASS) Opcodes.ACC_ANNOTATION else 0' @ [194:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'kind' @ [194:26] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [194:44] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ACC_ANNOTATION' @ [194:70] ==> public const final val ACC_ANNOTATION: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'flags' @ [195:12] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateClassFlags[LocalVariableDescriptor]

'if (Visibilities.isPrivate(visibility)) {
        flags = flags.or(Opcodes.ACC_PRIVATE)
    }
    else if (visibility == Visibilities.PUBLIC || visibility == Visibilities.INTERNAL) {
        flags = flags.or(Opcodes.ACC_PUBLIC)
    }
    else if (visibility == Visibilities.PROTECTED) {
        flags = flags.or(Opcodes.ACC_PROTECTED)
    }
    else if (visibility == JavaVisibilities.PACKAGE_VISIBILITY) {
        // default visibility
    }
    else {
        throw RuntimeException("Unsupported visibility $visibility for descriptor $this")
    }' @ [200:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isPrivate' @ [200:22] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'visibility' @ [200:32] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'flags' @ [201:9] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'flags' @ [201:17] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'or' @ [201:23] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_PRIVATE' @ [201:34] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (visibility == Visibilities.PUBLIC || visibility == Visibilities.INTERNAL) {
        flags = flags.or(Opcodes.ACC_PUBLIC)
    }
    else if (visibility == Visibilities.PROTECTED) {
        flags = flags.or(Opcodes.ACC_PROTECTED)
    }
    else if (visibility == JavaVisibilities.PACKAGE_VISIBILITY) {
        // default visibility
    }
    else {
        throw RuntimeException("Unsupported visibility $visibility for descriptor $this")
    }' @ [203:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'visibility' @ [203:14] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PUBLIC' @ [203:41] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'visibility' @ [203:51] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INTERNAL' @ [203:78] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'flags' @ [204:9] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'flags' @ [204:17] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'or' @ [204:23] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_PUBLIC' @ [204:34] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (visibility == Visibilities.PROTECTED) {
        flags = flags.or(Opcodes.ACC_PROTECTED)
    }
    else if (visibility == JavaVisibilities.PACKAGE_VISIBILITY) {
        // default visibility
    }
    else {
        throw RuntimeException("Unsupported visibility $visibility for descriptor $this")
    }' @ [206:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'visibility' @ [206:14] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PROTECTED' @ [206:41] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'flags' @ [207:9] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'flags' @ [207:17] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'or' @ [207:23] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_PROTECTED' @ [207:34] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (visibility == JavaVisibilities.PACKAGE_VISIBILITY) {
        // default visibility
    }
    else {
        throw RuntimeException("Unsupported visibility $visibility for descriptor $this")
    }' @ [209:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'visibility' @ [209:14] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PACKAGE_VISIBILITY' @ [209:45] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'RuntimeException' @ [213:15] ==> public constructor RuntimeException(p0: (String..String?)) defined in java.lang.RuntimeException[JavaClassConstructorDescriptor]

'visibility' @ [213:57] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'this' @ [213:84] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[ReceiverParameterDescriptorImpl]

'flags' @ [216:5] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'flags' @ [216:14] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'or' @ [216:20] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcModalityFlag' @ [216:23] ==> private fun MemberDescriptor.calcModalityFlag(): Int defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[SimpleFunctionDescriptorImpl]

'this' @ [218:9] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[ReceiverParameterDescriptorImpl]

'flags' @ [219:9] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'flags' @ [219:17] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'extraFlags' @ [219:26] ==> public abstract val extraFlags: Int defined in org.jetbrains.kotlin.backend.jvm.descriptors.JvmDescriptorWithExtraFlags[PropertyDescriptorImpl]

'flags' @ [222:12] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calculateCommonFlags[LocalVariableDescriptor]

'when (effectiveModality) {
        Modality.ABSTRACT -> {
            flags = flags.or(Opcodes.ACC_ABSTRACT)
        }
        Modality.FINAL -> {
            if (this !is ConstructorDescriptor && !DescriptorUtils.isEnumClass(this)) {
                flags = flags.or(Opcodes.ACC_FINAL)
            }
        }
        Modality.OPEN -> {
            assert(!Visibilities.isPrivate(visibility))
        }
        else -> throw RuntimeException("Unsupported modality $modality for descriptor ${this}")
    }' @ [227:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'effectiveModality' @ [227:11] ==> private val MemberDescriptor.effectiveModality: Modality defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[PropertyDescriptorImpl]

'Modality' @ [228:9] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [228:18] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'flags' @ [229:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'flags' @ [229:21] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'or' @ [229:27] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_ABSTRACT' @ [229:38] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'Modality' @ [231:9] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [231:18] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'this' @ [232:17] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[ReceiverParameterDescriptorImpl]

'!' @ [232:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnumClass' @ [232:68] ==> public open fun isEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [232:80] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[ReceiverParameterDescriptorImpl]

'flags' @ [233:17] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'flags' @ [233:25] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'or' @ [233:31] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_FINAL' @ [233:42] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'Modality' @ [236:9] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [236:18] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'assert' @ [237:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [237:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPrivate' @ [237:34] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'visibility' @ [237:44] ==> public final val MemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'RuntimeException' @ [239:23] ==> public constructor RuntimeException(p0: (String..String?)) defined in java.lang.RuntimeException[JavaClassConstructorDescriptor]

'modality' @ [239:63] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'this' @ [239:89] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[ReceiverParameterDescriptorImpl]

'this' @ [242:9] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[ReceiverParameterDescriptorImpl]

'this' @ [243:13] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[ReceiverParameterDescriptorImpl]

'dispatchReceiverParameter' @ [243:47] ==> public final val CallableMemberDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'flags' @ [244:13] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'flags' @ [244:21] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'ACC_STATIC' @ [244:38] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'flags' @ [247:12] ==> var flags: Int defined in org.jetbrains.kotlin.backend.jvm.codegen.calcModalityFlag[LocalVariableDescriptor]

'this' @ [252:13] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.effectiveModality[ReceiverParameterDescriptorImpl]

'kind' @ [252:40] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [252:58] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'hasAbstractMembers' @ [253:32] ==> public open fun hasAbstractMembers(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'this' @ [253:51] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.effectiveModality[ReceiverParameterDescriptorImpl]

'Modality' @ [254:24] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [254:33] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'isSealedClass' @ [257:29] ==> public open fun isSealedClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [257:43] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.effectiveModality[ReceiverParameterDescriptorImpl]

'isAnnotationClass' @ [258:29] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [258:47] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.effectiveModality[ReceiverParameterDescriptorImpl]

'isAnnotationClass' @ [259:29] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [259:47] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.effectiveModality[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [259:52] ==> public final val MemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'Modality' @ [260:20] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [260:29] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'modality' @ [263:16] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'source' @ [267:14] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'psi' @ [267:44] ==> public abstract val psi: PsiElement? defined in org.jetbrains.kotlin.resolve.source.PsiSourceElement[DeserializedPropertyDescriptor]

'OtherOrigin' @ [270:13] ==> @JvmOverloads public fun OtherOrigin(element: PsiElement?, descriptor: DeclarationDescriptor? = ...): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [270:25] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'psiElement' @ [270:36] ==> private val DeclarationDescriptorWithSource.psiElement: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[PropertyDescriptorImpl]

'this' @ [270:48] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.OtherOrigin[ReceiverParameterDescriptorImpl]

'descriptor' @ [270:53] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrField[DeserializedPropertyDescriptor]

'OtherOrigin' @ [273:13] ==> @JvmOverloads public fun OtherOrigin(element: PsiElement?, descriptor: DeclarationDescriptor? = ...): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [273:25] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

'psiElement' @ [273:36] ==> private val DeclarationDescriptorWithSource.psiElement: PsiElement? defined in org.jetbrains.kotlin.backend.jvm.codegen in file ClassCodegen.kt[PropertyDescriptorImpl]

'this' @ [273:48] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.codegen.OtherOrigin[ReceiverParameterDescriptorImpl]

'descriptor' @ [273:53] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.declarations.IrFunction[DeserializedPropertyDescriptor]

