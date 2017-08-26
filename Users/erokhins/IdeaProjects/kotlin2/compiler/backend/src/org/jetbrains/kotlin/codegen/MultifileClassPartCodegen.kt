'MemberCodegen<KtFile>' @ [50:5] ==> public constructor MemberCodegen<T : (KtPureElement..KtPureElement?)>(@NotNull state: GenerationState, @Nullable parentCodegen: MemberCodegen<*>?, @NotNull context: raw (FieldOwnerContext<(DeclarationDescriptor..DeclarationDescriptor?)>..FieldOwnerContext<*>), element: (KtFile..KtFile?), @NotNull builder: ClassBuilder) defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtPureElement..KtPureElement?)> -> KtFile

'state' @ [50:27] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'partContext' @ [50:40] ==> value-parameter partContext: MultifileClassPartContext defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'file' @ [50:53] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'v' @ [50:59] ==> value-parameter v: ClassBuilder defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'partContext' @ [51:28] ==> value-parameter partContext: MultifileClassPartContext defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'filePartType' @ [51:40] ==> public final val MultifileClassPartContext.filePartType: (Type..Type?)[MyPropertyDescriptor]

'partContext' @ [52:35] ==> value-parameter partContext: MultifileClassPartContext defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'multifileClassType' @ [52:47] ==> public final val MultifileClassPartContext.multifileClassType: (Type..Type?)[MyPropertyDescriptor]

'getObjectType' @ [53:44] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'partType' @ [53:58] ==> private final val partType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [53:67] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'STATIC_INIT_CLASS_SUFFIX' @ [53:82] ==> private final val STATIC_INIT_CLASS_SUFFIX: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'if (shouldGeneratePartHierarchy)
                OPEN_PART_CLASS_ATTRIBUTES
            else
                FINAL_PART_CLASS_ATTRIBUTES' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'shouldGeneratePartHierarchy' @ [56:17] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'OPEN_PART_CLASS_ATTRIBUTES' @ [57:17] ==> private final val OPEN_PART_CLASS_ATTRIBUTES: Int defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'FINAL_PART_CLASS_ATTRIBUTES' @ [59:17] ==> private final val FINAL_PART_CLASS_ATTRIBUTES: Int defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'newMethod' @ [62:13] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'OtherOrigin' @ [62:23] ==> public fun OtherOrigin(descriptor: DeclarationDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'originDescriptor' @ [62:35] ==> value-parameter originDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.newSpecialMethod[ValueParameterDescriptorImpl]

'ACC_STATIC' @ [62:62] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'name' @ [62:74] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.newSpecialMethod[ValueParameterDescriptorImpl]

'ClassBuilderOnDemand' @ [64:42] ==> public constructor ClassBuilderOnDemand(@NotNull createClassBuilder: () -> (ClassBuilder..ClassBuilder?)) defined in org.jetbrains.kotlin.codegen.ClassBuilderOnDemand[JavaClassConstructorDescriptor]

'state' @ [65:9] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'factory' @ [65:15] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'newVisitor' @ [65:23] ==> @NotNull public open fun newVisitor(@NotNull origin: JvmDeclarationOrigin, @NotNull asmType: Type, @NotNull sourceFile: PsiFile): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'MultifileClass' @ [65:34] ==> public fun MultifileClass(representativeFile: KtFile?, descriptor: PackageFragmentDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'file' @ [65:49] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'packageFragment' @ [65:55] ==> private final val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'staticInitClassType' @ [65:73] ==> private final val staticInitClassType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'file' @ [65:94] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'apply' @ [65:100] ==> @InlineOnly public inline fun <T> ClassBuilder.apply(block: (ClassBuilder).() -> Unit): ClassBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassBuilder

'defineClass' @ [66:13] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'file' @ [66:25] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'state' @ [66:31] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'classFileVersion' @ [66:37] ==> public final val classFileVersion: Int defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'STATE_INITIALIZER_CLASS_ATTRIBUTES' @ [66:55] ==> private final val STATE_INITIALIZER_CLASS_ATTRIBUTES: Int defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'staticInitClassType' @ [67:25] ==> private final val staticInitClassType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [67:45] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'EMPTY_STRING_ARRAY' @ [67:95] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'visitSource' @ [69:13] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'file' @ [69:25] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'name' @ [69:30] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'shouldGeneratePartHierarchy' @ [74:13] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'file' @ [74:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.<init>[ValueParameterDescriptorImpl]

'declarations' @ [74:49] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'any' @ [74:62] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.any(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [75:17] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.requiresDeferredStaticInitialization.<anonymous>[ValueParameterDescriptorImpl]

'shouldInitializeProperty' @ [75:37] ==> public open fun shouldInitializeProperty(@NotNull property: KtProperty): Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaMethodDescriptor]

'it' @ [75:62] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.requiresDeferredStaticInitialization.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [79:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [79:14] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'classBuilderMode' @ [79:20] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'generateMultiFileFacadePartClasses' @ [79:37] ==> public final val generateMultiFileFacadePartClasses: Boolean defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'super' @ [81:9] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[LazyClassReceiverParameterDescriptor]

'generate' @ [81:15] ==> public open fun generate(): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'state' @ [83:30] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'classBuilderMode' @ [83:36] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'generateBodies' @ [83:53] ==> public final val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'shouldGeneratePartHierarchy' @ [85:13] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'v' @ [86:13] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'newMethod' @ [86:15] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'OtherOrigin' @ [86:25] ==> public fun OtherOrigin(descriptor: DeclarationDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'packageFragment' @ [86:37] ==> private final val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'ACC_PUBLIC' @ [86:63] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'apply' @ [86:104] ==> @InlineOnly public inline fun <T> MethodVisitor.apply(block: (MethodVisitor).() -> Unit): MethodVisitor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodVisitor

'generateBodies' @ [87:21] ==> val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generate[LocalVariableDescriptor]

'visitCode' @ [88:21] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitVarInsn' @ [89:21] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [89:42] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMethodInsn' @ [90:21] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESPECIAL' @ [90:45] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'superClassInternalName' @ [90:60] ==> private final val superClassInternalName: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'visitInsn' @ [91:21] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'RETURN' @ [91:39] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [92:21] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [94:17] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'requiresDeferredStaticInitialization' @ [98:13] ==> private final val requiresDeferredStaticInitialization: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'staticInitClassBuilder' @ [99:13] ==> private final val staticInitClassBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'apply' @ [99:36] ==> @InlineOnly public inline fun <T> ClassBuilderOnDemand.apply(block: ClassBuilderOnDemand.() -> Unit): ClassBuilderOnDemand defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassBuilderOnDemand

'newField' @ [100:17] ==> @NotNull @Override public open fun newField(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable value: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilderOnDemand[JavaMethodDescriptor]

'OtherOrigin' @ [100:26] ==> public fun OtherOrigin(descriptor: DeclarationDescriptor): JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics[DeserializedSimpleFunctionDescriptor]

'packageFragment' @ [100:38] ==> private final val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'or' @ [100:56] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_STATIC' @ [100:64] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_PRIVATE' @ [100:86] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_VOLATILE' @ [100:109] ==> public const final val ACC_VOLATILE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'CLINIT_SYNC_NAME' @ [101:26] ==> private final val CLINIT_SYNC_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'newSpecialMethod' @ [103:17] ==> private final fun ClassBuilder.newSpecialMethod(originDescriptor: DeclarationDescriptor, name: String): MethodVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[SimpleFunctionDescriptorImpl]

'packageFragment' @ [103:34] ==> private final val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'CLINIT_TRIGGER_NAME' @ [103:51] ==> private final val CLINIT_TRIGGER_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'apply' @ [103:72] ==> @InlineOnly public inline fun <T> MethodVisitor.apply(block: (MethodVisitor).() -> Unit): MethodVisitor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodVisitor

'generateBodies' @ [104:25] ==> val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generate[LocalVariableDescriptor]

'visitCode' @ [105:25] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitFieldInsn' @ [106:25] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'GETSTATIC' @ [106:48] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'staticInitClassType' @ [106:59] ==> private final val staticInitClassType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [106:79] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'CLINIT_SYNC_NAME' @ [106:93] ==> private final val CLINIT_SYNC_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'visitInsn' @ [107:25] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'RETURN' @ [107:43] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [108:25] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [110:21] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'newSpecialMethod' @ [113:17] ==> private final fun ClassBuilder.newSpecialMethod(originDescriptor: DeclarationDescriptor, name: String): MethodVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[SimpleFunctionDescriptorImpl]

'packageFragment' @ [113:34] ==> private final val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'apply' @ [113:63] ==> @InlineOnly public inline fun <T> MethodVisitor.apply(block: (MethodVisitor).() -> Unit): MethodVisitor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodVisitor

'generateBodies' @ [114:25] ==> val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generate[LocalVariableDescriptor]

'visitCode' @ [115:25] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitMethodInsn' @ [116:25] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESTATIC' @ [116:49] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'partType' @ [116:63] ==> private final val partType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [116:72] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'DEFERRED_PART_CLINIT_NAME' @ [116:86] ==> private final val DEFERRED_PART_CLINIT_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'visitInsn' @ [117:25] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ICONST_0' @ [117:43] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitFieldInsn' @ [118:25] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'PUTSTATIC' @ [118:48] ==> public const final val PUTSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'staticInitClassType' @ [118:59] ==> private final val staticInitClassType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [118:79] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'CLINIT_SYNC_NAME' @ [118:93] ==> private final val CLINIT_SYNC_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'visitInsn' @ [119:25] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'RETURN' @ [119:43] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [120:25] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [122:21] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'writeSyntheticClassMetadata' @ [125:17] ==> public fun writeSyntheticClassMetadata(cb: ClassBuilder, state: GenerationState): Unit defined in org.jetbrains.kotlin.codegen in file writeAnnotationUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [125:45] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generate.<anonymous>[ReceiverParameterDescriptorImpl]

'state' @ [125:51] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'v' @ [131:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'defineClass' @ [131:11] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'element' @ [131:23] ==> protected/*protected and package*/ final val element: (KtFile..KtFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'state' @ [131:32] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'classFileVersion' @ [131:38] ==> public final val classFileVersion: Int defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'partClassAttributes' @ [131:56] ==> private final val partClassAttributes: Int defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'partType' @ [131:77] ==> private final val partType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [131:86] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'superClassInternalName' @ [131:106] ==> private final val superClassInternalName: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'EMPTY_STRING_ARRAY' @ [131:140] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'v' @ [132:9] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'visitSource' @ [132:11] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'element' @ [132:23] ==> protected/*protected and package*/ final val element: (KtFile..KtFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'name' @ [132:31] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'generatePropertyMetadataArrayFieldIfNeeded' @ [134:9] ==> protected/*protected and package*/ open fun generatePropertyMetadataArrayFieldIfNeeded(@NotNull thisAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaMethodDescriptor]

'partType' @ [134:52] ==> private final val partType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'element' @ [138:29] ==> protected/*protected and package*/ final val element: (KtFile..KtFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'declarations' @ [138:37] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [139:17] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateBody[LocalVariableDescriptor]

'declaration' @ [139:51] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateBody[LocalVariableDescriptor]

'declaration' @ [139:80] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateBody[LocalVariableDescriptor]

'genSimpleMember' @ [140:17] ==> public open fun genSimpleMember(@NotNull declaration: KtDeclaration): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaMethodDescriptor]

'declaration' @ [140:33] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateBody[LocalVariableDescriptor]

'state' @ [144:13] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'classBuilderMode' @ [144:19] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'generateBodies' @ [144:36] ==> public final val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'generateInitializers' @ [145:13] ==> protected/*protected and package*/ open fun generateInitializers(@NotNull createCodegen: () -> (ExpressionCodegen..ExpressionCodegen?)): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaMethodDescriptor]

'createOrGetClInitCodegen' @ [145:36] ==> @NotNull public final fun createOrGetClInitCodegen(): ExpressionCodegen defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaMethodDescriptor]

'if (requiresDeferredStaticInitialization)
                v.newSpecialMethod(contextDescriptor, DEFERRED_PART_CLINIT_NAME)
            else
                super.createClInitMethodVisitor(contextDescriptor)' @ [150:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MethodVisitor, elseBranch: MethodVisitor): MethodVisitor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MethodVisitor

'requiresDeferredStaticInitialization' @ [150:17] ==> private final val requiresDeferredStaticInitialization: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'v' @ [151:17] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'newSpecialMethod' @ [151:19] ==> private final fun ClassBuilder.newSpecialMethod(originDescriptor: DeclarationDescriptor, name: String): MethodVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[SimpleFunctionDescriptorImpl]

'contextDescriptor' @ [151:36] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.createClInitMethodVisitor[ValueParameterDescriptorImpl]

'DEFERRED_PART_CLINIT_NAME' @ [151:55] ==> private final val DEFERRED_PART_CLINIT_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'super' @ [153:17] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[LazyClassReceiverParameterDescriptor]

'createClInitMethodVisitor' @ [153:23] ==> @NotNull public open fun createClInitMethodVisitor(@NotNull contextDescriptor: DeclarationDescriptor): MethodVisitor defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'contextDescriptor' @ [153:49] ==> value-parameter contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.createClInitMethodVisitor[ValueParameterDescriptorImpl]

'super' @ [156:9] ==> <this> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[LazyClassReceiverParameterDescriptor]

'done' @ [156:15] ==> protected/*protected and package*/ open fun done(): Unit defined in org.jetbrains.kotlin.codegen.MemberCodegen[JavaMethodDescriptor]

'staticInitClassBuilder' @ [158:13] ==> private final val staticInitClassBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'isComputed' @ [158:36] ==> public final val ClassBuilderOnDemand.isComputed: Boolean[MyPropertyDescriptor]

'staticInitClassBuilder' @ [159:13] ==> private final val staticInitClassBuilder: ClassBuilderOnDemand defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'done' @ [159:36] ==> @Override public open fun done(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilderOnDemand[JavaMethodDescriptor]

'ArrayList' @ [164:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'element' @ [165:29] ==> protected/*protected and package*/ final val element: (KtFile..KtFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'declarations' @ [165:37] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'when (declaration) {
                is KtNamedFunction -> {
                    val functionDescriptor = bindingContext.get(BindingContext.FUNCTION, declaration)
                    members.add(functionDescriptor ?: throw AssertionError("Function ${declaration.name} is not bound in ${element.name}"))
                }
                is KtProperty -> {
                    val property = bindingContext.get(BindingContext.VARIABLE, declaration)
                    members.add(property ?: throw AssertionError("Property ${declaration.name} is not bound in ${element.name}"))
                }
            }' @ [166:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'declaration' @ [166:19] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'bindingContext' @ [168:46] ==> public final val bindingContext: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'get' @ [168:61] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), p1: (PsiElement..PsiElement?)): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> SimpleFunctionDescriptor

'FUNCTION' @ [168:80] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [168:90] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'members' @ [169:21] ==> val members: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'add' @ [169:29] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'functionDescriptor' @ [169:33] ==> val functionDescriptor: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'AssertionError' @ [169:61] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'declaration' @ [169:88] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'name' @ [169:100] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'element' @ [169:124] ==> protected/*protected and package*/ final val element: (KtFile..KtFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'name' @ [169:132] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'bindingContext' @ [172:36] ==> public final val bindingContext: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'get' @ [172:51] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), p1: (PsiElement..PsiElement?)): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> VariableDescriptor

'VARIABLE' @ [172:70] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [172:80] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'members' @ [173:21] ==> val members: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'add' @ [173:29] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'property' @ [173:33] ==> val property: VariableDescriptor? defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'AssertionError' @ [173:51] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'declaration' @ [173:78] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'name' @ [173:90] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'element' @ [173:114] ==> protected/*protected and package*/ final val element: (KtFile..KtFile?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'name' @ [173:122] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'JvmSerializerExtension' @ [178:25] ==> public constructor JvmSerializerExtension(@NotNull bindings: JvmSerializationBindings, @NotNull state: GenerationState) defined in org.jetbrains.kotlin.codegen.serialization.JvmSerializerExtension[JavaClassConstructorDescriptor]

'v' @ [178:48] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'serializationBindings' @ [178:50] ==> public final val ClassBuilder.serializationBindings: JvmSerializationBindings[MyPropertyDescriptor]

'state' @ [178:73] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'DescriptorSerializer' @ [179:26] ==> public companion object defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[FakeCallableDescriptorForObject]

'createTopLevel' @ [179:47] ==> @JvmStatic public final fun createTopLevel(extension: SerializerExtension): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[DeserializedSimpleFunctionDescriptor]

'extension' @ [179:62] ==> val extension: JvmSerializerExtension defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'serializer' @ [180:23] ==> val serializer: DescriptorSerializer defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'packagePartProto' @ [180:34] ==> public final fun packagePartProto(packageFqName: FqName, members: Collection<DeclarationDescriptor>): ProtoBuf.Package.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[DeserializedSimpleFunctionDescriptor]

'packageFragment' @ [180:51] ==> private final val packageFragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'fqName' @ [180:67] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'members' @ [180:75] ==> val members: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'extension' @ [181:9] ==> val extension: JvmSerializerExtension defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'serializeJvmPackage' @ [181:19] ==> public open fun serializeJvmPackage(@NotNull proto: ProtoBuf.Package.Builder, @NotNull partAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.serialization.JvmSerializerExtension[JavaMethodDescriptor]

'builder' @ [181:39] ==> val builder: ProtoBuf.Package.Builder defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'partType' @ [181:48] ==> private final val partType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'builder' @ [182:28] ==> val builder: ProtoBuf.Package.Builder defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'build' @ [182:36] ==> public open fun build(): (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]

'if (shouldGeneratePartHierarchy) JvmAnnotationNames.METADATA_MULTIFILE_PARTS_INHERIT_FLAG else 0' @ [184:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'shouldGeneratePartHierarchy' @ [184:30] ==> private final val shouldGeneratePartHierarchy: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'METADATA_MULTIFILE_PARTS_INHERIT_FLAG' @ [184:78] ==> public const final val METADATA_MULTIFILE_PARTS_INHERIT_FLAG: Int defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'writeKotlinMetadata' @ [186:9] ==> public fun writeKotlinMetadata(cb: ClassBuilder, state: GenerationState, kind: KotlinClassHeader.Kind, extraFlags: Int, action: (AnnotationVisitor) -> Unit): Unit defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'v' @ [186:29] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'state' @ [186:32] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaPropertyDescriptor]

'MULTIFILE_CLASS_PART' @ [186:62] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'extraFlags' @ [186:84] ==> val extraFlags: Int defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'writeAnnotationData' @ [187:21] ==> public open fun writeAnnotationData(@NotNull av: AnnotationVisitor, @NotNull serializer: DescriptorSerializer, @NotNull message: MessageLite): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'av' @ [187:41] ==> value-parameter av: AnnotationVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'serializer' @ [187:45] ==> val serializer: DescriptorSerializer defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'packageProto' @ [187:57] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation[LocalVariableDescriptor]

'av' @ [188:13] ==> value-parameter av: AnnotationVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.generateKotlinMetadataAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'visit' @ [188:16] ==> public open fun visit(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'METADATA_MULTIFILE_CLASS_NAME_FIELD_NAME' @ [188:41] ==> public const final val METADATA_MULTIFILE_CLASS_NAME_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'facadeClassType' @ [188:83] ==> private final val facadeClassType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [188:99] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'generateSyntheticAccessors' @ [193:9] ==> protected/*protected and package*/ open fun generateSyntheticAccessors(): Unit defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[JavaMethodDescriptor]

'requiresDeferredStaticInitialization' @ [197:13] ==> private final val requiresDeferredStaticInitialization: Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'mv' @ [198:13] ==> value-parameter mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.beforeMethodBody[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [198:16] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESTATIC' @ [198:40] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'staticInitClassType' @ [198:54] ==> private final val staticInitClassType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[PropertyDescriptorImpl]

'internalName' @ [198:74] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'CLINIT_TRIGGER_NAME' @ [198:88] ==> private final val CLINIT_TRIGGER_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'ACC_SUPER' @ [203:58] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'or' @ [204:51] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_SYNTHETIC' @ [204:59] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [204:84] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [204:105] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'or' @ [205:58] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACC_SYNTHETIC' @ [205:66] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [205:91] ==> public const final val ACC_SUPER: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [205:112] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'JvmStatic' @ [212:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'insn' @ [213:17] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion.isStaticInitTrigger[ValueParameterDescriptorImpl]

'opcode' @ [213:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'INVOKESTATIC' @ [213:40] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [214:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion.isStaticInitTrigger[ValueParameterDescriptorImpl]

'insn' @ [215:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion.isStaticInitTrigger[ValueParameterDescriptorImpl]

'owner' @ [215:25] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'endsWith' @ [215:31] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'STATIC_INIT_CLASS_SUFFIX' @ [215:40] ==> private final val STATIC_INIT_CLASS_SUFFIX: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'insn' @ [216:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion.isStaticInitTrigger[ValueParameterDescriptorImpl]

'name' @ [216:25] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'CLINIT_TRIGGER_NAME' @ [216:33] ==> private final val CLINIT_TRIGGER_NAME: String defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[PropertyDescriptorImpl]

'insn' @ [217:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion.isStaticInitTrigger[ValueParameterDescriptorImpl]

'desc' @ [217:25] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

