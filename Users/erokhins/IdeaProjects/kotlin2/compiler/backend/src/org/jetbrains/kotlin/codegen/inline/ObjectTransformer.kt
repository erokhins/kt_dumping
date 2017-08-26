'JvmField' @ [29:62] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [33:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'InlineResult' @ [34:42] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.InlineResult[FakeCallableDescriptorForObject]

'create' @ [34:55] ==> @JvmStatic public final fun create(): InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineResult.Companion[SimpleFunctionDescriptorImpl]

'state' @ [37:28] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[PropertyDescriptorImpl]

'factory' @ [37:34] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'newVisitor' @ [37:42] ==> @NotNull public open fun newVisitor(@NotNull origin: JvmDeclarationOrigin, @NotNull asmType: Type, @NotNull sourceFile: PsiFile): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'NO_ORIGIN' @ [38:38] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'getObjectType' @ [39:22] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'transformationInfo' @ [39:36] ==> @JvmField public final val transformationInfo: T defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[PropertyDescriptorImpl]

'newClassName' @ [39:55] ==> public open val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'inliningContext' @ [40:17] ==> value-parameter inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer.createRemappingClassBuilderViaFactory[ValueParameterDescriptorImpl]

'root' @ [40:33] ==> public final val root: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'sourceCompilerForInline' @ [40:38] ==> public final val sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[PropertyDescriptorImpl]

'callsiteFile' @ [40:62] ==> public abstract val callsiteFile: PsiFile? defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'RemappingClassBuilder' @ [43:16] ==> public constructor RemappingClassBuilder(@NotNull builder: ClassBuilder, @NotNull remapper: Remapper) defined in org.jetbrains.kotlin.codegen.inline.RemappingClassBuilder[JavaClassConstructorDescriptor]

'classBuilder' @ [44:17] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer.createRemappingClassBuilderViaFactory[LocalVariableDescriptor]

'AsmTypeRemapper' @ [45:17] ==> public constructor AsmTypeRemapper(typeRemapper: TypeRemapper, result: InlineResult) defined in org.jetbrains.kotlin.codegen.inline.AsmTypeRemapper[ClassConstructorDescriptorImpl]

'inliningContext' @ [45:33] ==> value-parameter inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer.createRemappingClassBuilderViaFactory[ValueParameterDescriptorImpl]

'typeRemapper' @ [45:49] ==> public final val typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'transformationResult' @ [45:63] ==> @JvmField protected final val transformationResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[PropertyDescriptorImpl]

'buildClassReaderByInternalName' @ [50:16] ==> internal fun buildClassReaderByInternalName(state: GenerationState, internalName: String): ClassReader defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [50:47] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[PropertyDescriptorImpl]

'transformationInfo' @ [50:54] ==> @JvmField public final val transformationInfo: T defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[PropertyDescriptorImpl]

'oldClassName' @ [50:73] ==> public abstract val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'ObjectTransformer<WhenMappingTransformationInfo>' @ [57:5] ==> public constructor ObjectTransformer<out T : TransformationInfo>(transformationInfo: WhenMappingTransformationInfo, state: GenerationState) defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TransformationInfo> -> WhenMappingTransformationInfo

'whenObjectRegenerationInfo' @ [57:54] ==> value-parameter whenObjectRegenerationInfo: WhenMappingTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.<init>[ValueParameterDescriptorImpl]

'inliningContext' @ [57:82] ==> value-parameter inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.<init>[ValueParameterDescriptorImpl]

'state' @ [57:98] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'createClassReader' @ [60:27] ==> public final fun createClassReader(): ClassReader defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[SimpleFunctionDescriptorImpl]

'createRemappingClassBuilderViaFactory' @ [63:28] ==> protected final fun createRemappingClassBuilderViaFactory(inliningContext: InliningContext): ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[SimpleFunctionDescriptorImpl]

'inliningContext' @ [63:66] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[PropertyDescriptorImpl]

'arrayListOf' @ [65:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<MethodNode> /* = ArrayList<MethodNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodNode

'transformationInfo' @ [66:25] ==> @JvmField public final val transformationInfo: WhenMappingTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[PropertyDescriptorImpl]

'fieldNode' @ [66:44] ==> public final val fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformationInfo[PropertyDescriptorImpl]

'classReader' @ [67:9] ==> val classReader: ClassReader defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'accept' @ [67:21] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [67:37] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'API' @ [67:50] ==> public const val API: Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'classBuilder' @ [67:55] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'visitor' @ [67:68] ==> public final val ClassBuilder.visitor: ClassVisitor[MyPropertyDescriptor]

'classBuilder' @ [69:17] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'defineClass' @ [69:30] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'version' @ [69:48] ==> value-parameter version: Int defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'access' @ [69:57] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'name' @ [69:65] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'signature' @ [69:71] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'superName' @ [69:82] ==> value-parameter superName: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'interfaces' @ [69:93] ==> value-parameter interfaces: Array<String> defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'if (name == fieldNode.name) {
                    classBuilder.newField(JvmDeclarationOrigin.NO_ORIGIN, access, name, desc, signature, value)
                }
                else {
                    null
                }' @ [73:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FieldVisitor?, elseBranch: FieldVisitor?): FieldVisitor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FieldVisitor?

'name' @ [73:28] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'fieldNode' @ [73:36] ==> val fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'name' @ [73:46] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'classBuilder' @ [74:21] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'newField' @ [74:34] ==> @NotNull public abstract fun newField(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable value: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [74:64] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'access' @ [74:75] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'name' @ [74:83] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'desc' @ [74:89] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'signature' @ [74:95] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'value' @ [74:106] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'MethodNode' @ [84:24] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'access' @ [84:35] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [84:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [84:49] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [84:55] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [84:66] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'apply' @ [84:78] ==> @InlineOnly public inline fun <T> MethodNode.apply(block: MethodNode.() -> Unit): MethodNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodNode

'methodNodes' @ [85:21] ==> val methodNodes: ArrayList<MethodNode> /* = ArrayList<MethodNode> */ defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'add' @ [85:33] ==> public open fun add(element: MethodNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'this' @ [85:37] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<no name provided>.visitMethod.<anonymous>[ReceiverParameterDescriptorImpl]

'SKIP_FRAMES' @ [88:24] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'assert' @ [90:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'methodNodes' @ [90:16] ==> val methodNodes: ArrayList<MethodNode> /* = ArrayList<MethodNode> */ defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'size' @ [90:28] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'+' @ [91:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fieldNode' @ [91:29] ==> val fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'owner' @ [91:39] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'methodNodes' @ [91:92] ==> val methodNodes: ArrayList<MethodNode> /* = ArrayList<MethodNode> */ defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'joinToString' @ [91:104] ==> public fun <T> Iterable<MethodNode>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((MethodNode) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodNode

'it' @ [91:119] ==> value-parameter it: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [91:122] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNodes' @ [93:22] ==> val methodNodes: ArrayList<MethodNode> /* = ArrayList<MethodNode> */ defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'first' @ [93:34] ==> public fun <T> List<MethodNode>.first(): MethodNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodNode

'assert' @ [94:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'clinit' @ [94:16] ==> val clinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'name' @ [94:23] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'clinit' @ [94:113] ==> val clinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'name' @ [94:120] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'cutOtherMappings' @ [96:33] ==> private final fun cutOtherMappings(node: MethodNode): MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[SimpleFunctionDescriptorImpl]

'clinit' @ [96:50] ==> val clinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'classBuilder' @ [97:22] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'newMethod' @ [97:35] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [98:38] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'transformedClinit' @ [98:49] ==> val transformedClinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'access' @ [98:67] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedClinit' @ [98:75] ==> val transformedClinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'name' @ [98:93] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedClinit' @ [98:99] ==> val transformedClinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'desc' @ [98:117] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedClinit' @ [99:17] ==> val transformedClinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'signature' @ [99:35] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedClinit' @ [99:46] ==> val transformedClinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'exceptions' @ [99:64] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toTypedArray' @ [99:75] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'transformedClinit' @ [101:9] ==> val transformedClinit: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'accept' @ [101:27] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'result' @ [101:34] ==> val result: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'classBuilder' @ [102:9] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.doTransform[LocalVariableDescriptor]

'done' @ [102:22] ==> public abstract fun done(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'transformationResult' @ [104:16] ==> @JvmField protected final val transformationResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[PropertyDescriptorImpl]

'InsnSequence' @ [108:29] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'node' @ [108:42] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[ValueParameterDescriptorImpl]

'instructions' @ [108:47] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [108:61] ==> public inline fun <T> Sequence<AbstractInsnNode>.first(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [109:13] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [109:36] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [109:39] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'equals' @ [109:44] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'transformationInfo' @ [109:51] ==> @JvmField public final val transformationInfo: WhenMappingTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[PropertyDescriptorImpl]

'fieldNode' @ [109:70] ==> public final val fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformationInfo[PropertyDescriptorImpl]

'name' @ [109:80] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'generateSequence' @ [112:30] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: AbstractInsnNode?, nextFunction: (AbstractInsnNode) -> AbstractInsnNode?): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> AbstractInsnNode

'myArrayAccess' @ [112:47] ==> val myArrayAccess: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'it' @ [112:64] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [112:67] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'first' @ [112:78] ==> public inline fun <T> Sequence<AbstractInsnNode>.first(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'isValues' @ [113:13] ==> private final fun isValues(node: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[SimpleFunctionDescriptorImpl]

'it' @ [113:22] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'generateSequence' @ [116:37] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: AbstractInsnNode?, nextFunction: (AbstractInsnNode) -> AbstractInsnNode?): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> AbstractInsnNode

'myArrayAccess' @ [116:54] ==> val myArrayAccess: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'it' @ [116:71] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [116:74] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'first' @ [116:81] ==> public inline fun <T> Sequence<AbstractInsnNode>.first(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'isValues' @ [117:13] ==> private final fun isValues(node: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer[SimpleFunctionDescriptorImpl]

'it' @ [117:22] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [117:29] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [117:32] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'RETURN' @ [117:50] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'MethodNode' @ [120:22] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'node' @ [120:33] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[ValueParameterDescriptorImpl]

'access' @ [120:38] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [120:46] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[ValueParameterDescriptorImpl]

'name' @ [120:51] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [120:57] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[ValueParameterDescriptorImpl]

'desc' @ [120:62] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [120:68] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[ValueParameterDescriptorImpl]

'signature' @ [120:73] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [120:84] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[ValueParameterDescriptorImpl]

'exceptions' @ [120:89] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toTypedArray' @ [120:100] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'InsnSequence' @ [121:9] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'myValuesAccess' @ [121:22] ==> val myValuesAccess: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'nextValuesAccessOrEnd' @ [121:38] ==> val nextValuesAccessOrEnd: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'forEach' @ [121:61] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [121:71] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [121:74] ==> public abstract fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'result' @ [121:81] ==> val result: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'result' @ [122:9] ==> val result: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'visitInsn' @ [122:16] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'RETURN' @ [122:34] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'result' @ [124:16] ==> val result: MethodNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.cutOtherMappings[LocalVariableDescriptor]

'node' @ [128:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.isValues[ValueParameterDescriptorImpl]

'node' @ [129:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.isValues[ValueParameterDescriptorImpl]

'opcode' @ [129:18] ==> public final var MethodInsnNode.opcode: Int[MyPropertyDescriptor]

'INVOKESTATIC' @ [129:36] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [130:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.isValues[ValueParameterDescriptorImpl]

'name' @ [130:18] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'node' @ [131:13] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.isValues[ValueParameterDescriptorImpl]

'desc' @ [131:18] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'+' @ [131:26] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getObjectType' @ [131:39] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'node' @ [131:53] ==> value-parameter node: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformer.isValues[ValueParameterDescriptorImpl]

'owner' @ [131:58] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'descriptor' @ [131:65] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

