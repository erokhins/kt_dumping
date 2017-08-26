'ObjectTransformer<AnonymousObjectTransformationInfo>' @ [35:5] ==> public constructor ObjectTransformer<out T : TransformationInfo>(transformationInfo: AnonymousObjectTransformationInfo, state: GenerationState) defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TransformationInfo> -> AnonymousObjectTransformationInfo

'transformationInfo' @ [35:58] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.<init>[ValueParameterDescriptorImpl]

'inliningContext' @ [35:78] ==> value-parameter inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.<init>[ValueParameterDescriptorImpl]

'state' @ [35:94] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'getObjectType' @ [37:38] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'transformationInfo' @ [37:52] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.<init>[ValueParameterDescriptorImpl]

'oldClassName' @ [37:71] ==> public open val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'hashMapOf' @ [39:30] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, MutableList<String>> /* = HashMap<String, MutableList<String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableList<String>

'ArrayList' @ [47:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InnerClassNode

'createRemappingClassBuilderViaFactory' @ [48:28] ==> protected final fun createRemappingClassBuilderViaFactory(inliningContext: InliningContext): ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'inliningContext' @ [48:66] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'ArrayList' @ [49:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MethodNode

'createClassReader' @ [51:9] ==> public final fun createClassReader(): ClassReader defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'accept' @ [51:29] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [51:45] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'API' @ [51:58] ==> public const val API: Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'classBuilder' @ [51:63] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'visitor' @ [51:76] ==> public final val ClassBuilder.visitor: ClassVisitor[MyPropertyDescriptor]

'classBuilder' @ [53:17] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'defineClass' @ [53:30] ==> public abstract fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'version' @ [53:48] ==> value-parameter version: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'access' @ [53:57] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'name' @ [53:65] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'signature' @ [53:71] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'superName' @ [53:82] ==> value-parameter superName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'interfaces' @ [53:93] ==> value-parameter interfaces: Array<String> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'COROUTINE_IMPL_ASM_TYPE' @ [54:21] ==> @JvmField public val COROUTINE_IMPL_ASM_TYPE: Type defined in org.jetbrains.kotlin.codegen.coroutines in file coroutineCodegenUtil.kt[PropertyDescriptorImpl]

'internalName' @ [54:45] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'superName' @ [54:61] ==> value-parameter superName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visit[ValueParameterDescriptorImpl]

'inliningContext' @ [55:21] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'isContinuation' @ [55:37] ==> public final var isContinuation: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'innerClassNodes' @ [60:17] ==> val innerClassNodes: ArrayList<InnerClassNode> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'add' @ [60:33] ==> public open fun add(element: InnerClassNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'InnerClassNode' @ [60:37] ==> public constructor InnerClassNode(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Int) defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaClassConstructorDescriptor]

'name' @ [60:52] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitInnerClass[ValueParameterDescriptorImpl]

'outerName' @ [60:58] ==> value-parameter outerName: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitInnerClass[ValueParameterDescriptorImpl]

'innerName' @ [60:69] ==> value-parameter innerName: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitInnerClass[ValueParameterDescriptorImpl]

'access' @ [60:80] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitInnerClass[ValueParameterDescriptorImpl]

'MethodNode' @ [66:28] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'access' @ [66:39] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [66:47] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [66:53] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [66:59] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [66:70] ==> value-parameter exceptions: Array<String>? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'if (name == "<init>") {
                    if (constructor != null) {
                        throw RuntimeException("Lambda, SAM or anonymous object should have only one constructor")
                    }
                    constructor = node
                }
                else {
                    methodsToTransform.add(node)
                }' @ [67:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'name' @ [67:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'constructor' @ [68:25] ==> private final var constructor: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'RuntimeException' @ [69:31] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'constructor' @ [71:21] ==> private final var constructor: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'node' @ [71:35] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[LocalVariableDescriptor]

'methodsToTransform' @ [74:21] ==> val methodsToTransform: ArrayList<MethodNode> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'add' @ [74:40] ==> public open fun add(element: MethodNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'node' @ [74:44] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[LocalVariableDescriptor]

'node' @ [76:24] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitMethod[LocalVariableDescriptor]

'addUniqueField' @ [80:17] ==> private final fun addUniqueField(name: String): String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'name' @ [80:32] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'if (isCapturedFieldName(name)) {
                    null
                }
                else {
                    classBuilder.newField(JvmDeclarationOrigin.NO_ORIGIN, access, name, desc, signature, value)
                }' @ [81:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FieldVisitor?, elseBranch: FieldVisitor?): FieldVisitor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FieldVisitor?

'isCapturedFieldName' @ [81:28] ==> internal fun isCapturedFieldName(fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [81:48] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'classBuilder' @ [85:21] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'newField' @ [85:34] ==> @NotNull public abstract fun newField(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable value: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'JvmDeclarationOrigin' @ [85:43] ==> public companion object defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[FakeCallableDescriptorForObject]

'NO_ORIGIN' @ [85:64] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'access' @ [85:75] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'name' @ [85:83] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'desc' @ [85:89] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'signature' @ [85:95] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'value' @ [85:106] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitField[ValueParameterDescriptorImpl]

'sourceInfo' @ [90:17] ==> private final var sourceInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'source' @ [90:30] ==> value-parameter source: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitSource[ValueParameterDescriptorImpl]

'debugInfo' @ [91:17] ==> private final var debugInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'debug' @ [91:29] ==> value-parameter debug: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<no name provided>.visitSource[ValueParameterDescriptorImpl]

'SKIP_FRAMES' @ [95:24] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'if (!inliningContext.isInliningLambda) {
            sourceMapper = if (debugInfo != null && !debugInfo!!.isEmpty()) {
                SourceMapper.createFromSmap(SMAPParser.parse(debugInfo!!))
            }
            else {
                //seems we can't do any clever mapping cause we don't know any about original class name
                IdenticalSourceMapper
            }
            if (sourceInfo != null && !GENERATE_SMAP) {
                classBuilder.visitSource(sourceInfo!!, debugInfo)
            }
        }
        else {
            if (sourceInfo != null) {
                classBuilder.visitSource(sourceInfo!!, debugInfo)
            }
            sourceMapper = IdenticalSourceMapper
        }' @ [97:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [97:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inliningContext' @ [97:14] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'isInliningLambda' @ [97:30] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'sourceMapper' @ [98:13] ==> private final lateinit var sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'if (debugInfo != null && !debugInfo!!.isEmpty()) {
                SourceMapper.createFromSmap(SMAPParser.parse(debugInfo!!))
            }
            else {
                //seems we can't do any clever mapping cause we don't know any about original class name
                IdenticalSourceMapper
            }' @ [98:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SourceMapper, elseBranch: SourceMapper): SourceMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SourceMapper

'debugInfo' @ [98:32] ==> private final var debugInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'!' @ [98:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'debugInfo' @ [98:54] ==> private final var debugInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'isEmpty' @ [98:66] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'SourceMapper' @ [99:17] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.SourceMapper[FakeCallableDescriptorForObject]

'createFromSmap' @ [99:30] ==> public final fun createFromSmap(smap: SMAP): SourceMapper defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion[SimpleFunctionDescriptorImpl]

'SMAPParser' @ [99:45] ==> public object SMAPParser defined in org.jetbrains.kotlin.codegen.inline in file SMAPParser.kt[FakeCallableDescriptorForObject]

'parse' @ [99:56] ==> @JvmStatic public final fun parse(mappingInfo: String): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[SimpleFunctionDescriptorImpl]

'debugInfo' @ [99:62] ==> private final var debugInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'IdenticalSourceMapper' @ [103:17] ==> public object IdenticalSourceMapper : SourceMapper defined in org.jetbrains.kotlin.codegen.inline in file SMAP.kt[FakeCallableDescriptorForObject]

'sourceInfo' @ [105:17] ==> private final var sourceInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'!' @ [105:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'GENERATE_SMAP' @ [105:40] ==> public const val GENERATE_SMAP: Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'classBuilder' @ [106:17] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'visitSource' @ [106:30] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'sourceInfo' @ [106:42] ==> private final var sourceInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'debugInfo' @ [106:56] ==> private final var debugInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'sourceInfo' @ [110:17] ==> private final var sourceInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'classBuilder' @ [111:17] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'visitSource' @ [111:30] ==> public abstract fun visitSource(@NotNull name: String, @Nullable debug: String?): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'sourceInfo' @ [111:42] ==> private final var sourceInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'debugInfo' @ [111:56] ==> private final var debugInfo: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'sourceMapper' @ [113:13] ==> private final lateinit var sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'IdenticalSourceMapper' @ [113:28] ==> public object IdenticalSourceMapper : SourceMapper defined in org.jetbrains.kotlin.codegen.inline in file SMAP.kt[FakeCallableDescriptorForObject]

'ParametersBuilder' @ [116:39] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[FakeCallableDescriptorForObject]

'newBuilder' @ [116:57] ==> @JvmStatic public final fun newBuilder(): ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion[SimpleFunctionDescriptorImpl]

'ParametersBuilder' @ [117:39] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[FakeCallableDescriptorForObject]

'newBuilder' @ [117:57] ==> @JvmStatic public final fun newBuilder(): ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion[SimpleFunctionDescriptorImpl]

'extractParametersMappingAndPatchConstructor' @ [118:36] ==> private final fun extractParametersMappingAndPatchConstructor(constructor: MethodNode, capturedParamBuilder: ParametersBuilder, constructorParamBuilder: ParametersBuilder, transformationInfo: AnonymousObjectTransformationInfo, parentFieldRemapper: FieldRemapper): List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'constructor' @ [119:17] ==> private final var constructor: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'allCapturedParamBuilder' @ [119:32] ==> val allCapturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'constructorParamBuilder' @ [119:57] ==> val constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'transformationInfo' @ [119:81] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'parentRemapper' @ [119:101] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[ValueParameterDescriptorImpl]

'ArrayList' @ [121:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeferredMethodVisitor

'generateConstructorAndFields' @ [123:9] ==> private final fun generateConstructorAndFields(classBuilder: ClassBuilder, allCapturedBuilder: ParametersBuilder, constructorInlineBuilder: ParametersBuilder, parentRemapper: FieldRemapper, constructorAdditionalFakeParams: List<CapturedParamInfo>): Unit defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'classBuilder' @ [123:38] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'allCapturedParamBuilder' @ [123:52] ==> val allCapturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'constructorParamBuilder' @ [123:77] ==> val constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'parentRemapper' @ [123:102] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[ValueParameterDescriptorImpl]

'additionalFakeParams' @ [123:118] ==> val additionalFakeParams: List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'methodsToTransform' @ [125:22] ==> val methodsToTransform: ArrayList<MethodNode> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'newMethod' @ [126:36] ==> private final fun newMethod(builder: ClassBuilder, original: MethodNode): DeferredMethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'classBuilder' @ [126:46] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'next' @ [126:60] ==> val next: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'inlineMethodAndUpdateGlobalResult' @ [127:29] ==> private final fun inlineMethodAndUpdateGlobalResult(parentRemapper: FieldRemapper, deferringVisitor: MethodVisitor, next: MethodNode, allCapturedParamBuilder: ParametersBuilder, isConstructor: Boolean): InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'parentRemapper' @ [127:63] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[ValueParameterDescriptorImpl]

'deferringVisitor' @ [127:79] ==> val deferringVisitor: DeferredMethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'next' @ [127:97] ==> val next: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'allCapturedParamBuilder' @ [127:103] ==> val allCapturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'getReturnType' @ [129:35] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'next' @ [129:49] ==> val next: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'desc' @ [129:54] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!' @ [130:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPrimitive' @ [130:26] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'returnType' @ [130:38] ==> val returnType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'returnType' @ [131:40] ==> val returnType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'internalName' @ [131:51] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'funResult' @ [132:40] ==> val funResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'getChangedTypes' @ [132:50] ==> public final fun getChangedTypes(): Map<String, String> defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'oldFunReturnType' @ [132:68] ==> val oldFunReturnType: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'newFunReturnType' @ [133:21] ==> val newFunReturnType: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'inliningContext' @ [134:21] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'typeRemapper' @ [134:37] ==> public final val typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'addAdditionalMappings' @ [134:50] ==> public final fun addAdditionalMappings(oldName: String, newName: String): Unit defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[SimpleFunctionDescriptorImpl]

'oldFunReturnType' @ [134:72] ==> val oldFunReturnType: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'newFunReturnType' @ [134:90] ==> val newFunReturnType: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'deferringMethods' @ [137:13] ==> val deferringMethods: ArrayList<DeferredMethodVisitor> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'add' @ [137:30] ==> public open fun add(element: DeferredMethodVisitor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'deferringVisitor' @ [137:34] ==> val deferringVisitor: DeferredMethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'deferringMethods' @ [140:9] ==> val deferringMethods: ArrayList<DeferredMethodVisitor> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'forEach' @ [140:26] ==> @HidesMembers public inline fun <T> Iterable<DeferredMethodVisitor>.forEach(action: (DeferredMethodVisitor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeferredMethodVisitor

'removeFinallyMarkers' @ [141:13] ==> internal fun removeFinallyMarkers(intoNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'method' @ [141:34] ==> value-parameter method: DeferredMethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<anonymous>[ValueParameterDescriptorImpl]

'intermediate' @ [141:41] ==> public final val intermediate: MethodNode defined in org.jetbrains.kotlin.codegen.inline.DeferredMethodVisitor[PropertyDescriptorImpl]

'method' @ [142:13] ==> value-parameter method: DeferredMethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<anonymous>[ValueParameterDescriptorImpl]

'visitEnd' @ [142:20] ==> public open fun visitEnd(): Unit defined in org.jetbrains.kotlin.codegen.inline.DeferredMethodVisitor[SimpleFunctionDescriptorImpl]

'SourceMapper' @ [145:9] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.SourceMapper[FakeCallableDescriptorForObject]

'flushToClassBuilder' @ [145:22] ==> public final fun flushToClassBuilder(mapper: SourceMapper, v: ClassBuilder): Unit defined in org.jetbrains.kotlin.codegen.inline.SourceMapper.Companion[SimpleFunctionDescriptorImpl]

'sourceMapper' @ [145:42] ==> private final lateinit var sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'classBuilder' @ [145:56] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'classBuilder' @ [147:23] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'visitor' @ [147:36] ==> public final val ClassBuilder.visitor: ClassVisitor[MyPropertyDescriptor]

'innerClassNodes' @ [148:9] ==> val innerClassNodes: ArrayList<InnerClassNode> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'forEach' @ [148:25] ==> @HidesMembers public inline fun <T> Iterable<InnerClassNode>.forEach(action: (InnerClassNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InnerClassNode

'visitor' @ [150:13] ==> val visitor: ClassVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'visitInnerClass' @ [150:21] ==> public open fun visitInnerClass(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'node' @ [150:37] ==> value-parameter node: InnerClassNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [150:42] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaPropertyDescriptor]

'node' @ [150:48] ==> value-parameter node: InnerClassNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<anonymous>[ValueParameterDescriptorImpl]

'outerName' @ [150:53] ==> public final var outerName: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaPropertyDescriptor]

'node' @ [150:64] ==> value-parameter node: InnerClassNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<anonymous>[ValueParameterDescriptorImpl]

'innerName' @ [150:69] ==> public final var innerName: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaPropertyDescriptor]

'node' @ [150:80] ==> value-parameter node: InnerClassNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform.<anonymous>[ValueParameterDescriptorImpl]

'access' @ [150:85] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.InnerClassNode[JavaPropertyDescriptor]

'writeOuterInfo' @ [153:9] ==> private final fun writeOuterInfo(visitor: ClassVisitor): Unit defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'visitor' @ [153:24] ==> val visitor: ClassVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'classBuilder' @ [155:9] ==> val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.doTransform[LocalVariableDescriptor]

'done' @ [155:22] ==> public abstract fun done(): Unit defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'transformationResult' @ [157:16] ==> @JvmField protected final val transformationResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'inliningContext' @ [161:20] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'callSiteInfo' @ [161:36] ==> public open val callSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'visitor' @ [162:9] ==> value-parameter visitor: ClassVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.writeOuterInfo[ValueParameterDescriptorImpl]

'visitOuterClass' @ [162:17] ==> public open fun visitOuterClass(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'info' @ [162:33] ==> val info: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.writeOuterInfo[LocalVariableDescriptor]

'ownerClassName' @ [162:38] ==> public final val ownerClassName: String defined in org.jetbrains.kotlin.codegen.inline.InlineCallSiteInfo[PropertyDescriptorImpl]

'info' @ [162:54] ==> val info: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.writeOuterInfo[LocalVariableDescriptor]

'functionName' @ [162:59] ==> public final val functionName: String? defined in org.jetbrains.kotlin.codegen.inline.InlineCallSiteInfo[PropertyDescriptorImpl]

'info' @ [162:73] ==> val info: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.writeOuterInfo[LocalVariableDescriptor]

'functionDesc' @ [162:78] ==> public final val functionDesc: String? defined in org.jetbrains.kotlin.codegen.inline.InlineCallSiteInfo[PropertyDescriptorImpl]

'inlineMethod' @ [172:25] ==> private final fun inlineMethod(parentRemapper: FieldRemapper, deferringVisitor: MethodVisitor, sourceNode: MethodNode, capturedBuilder: ParametersBuilder, isConstructor: Boolean): InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'parentRemapper' @ [172:38] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[ValueParameterDescriptorImpl]

'deferringVisitor' @ [172:54] ==> value-parameter deferringVisitor: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[ValueParameterDescriptorImpl]

'next' @ [172:72] ==> value-parameter next: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[ValueParameterDescriptorImpl]

'allCapturedParamBuilder' @ [172:78] ==> value-parameter allCapturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[ValueParameterDescriptorImpl]

'isConstructor' @ [172:103] ==> value-parameter isConstructor: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[ValueParameterDescriptorImpl]

'transformationResult' @ [173:9] ==> @JvmField protected final val transformationResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'merge' @ [173:30] ==> public final fun merge(child: InlineResult): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'funResult' @ [173:36] ==> val funResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[LocalVariableDescriptor]

'transformationResult' @ [174:9] ==> @JvmField protected final val transformationResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'reifiedTypeParametersUsages' @ [174:30] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'mergeAll' @ [174:58] ==> public final fun mergeAll(other: ReifiedTypeParametersUsages): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'funResult' @ [174:67] ==> val funResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[LocalVariableDescriptor]

'reifiedTypeParametersUsages' @ [174:77] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'funResult' @ [175:16] ==> val funResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethodAndUpdateGlobalResult[LocalVariableDescriptor]

'inliningContext' @ [185:37] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'root' @ [185:53] ==> public final val root: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'inlineMethodReifier' @ [185:58] ==> public final val inlineMethodReifier: ReifiedTypeInliner defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[PropertyDescriptorImpl]

'reifyInstructions' @ [185:78] ==> public final fun reifyInstructions(node: MethodNode): ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[SimpleFunctionDescriptorImpl]

'sourceNode' @ [185:96] ==> value-parameter sourceNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'if (isConstructor) capturedBuilder.buildParameters() else getMethodParametersWithCaptured(capturedBuilder, sourceNode)' @ [186:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Parameters, elseBranch: Parameters): Parameters[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Parameters

'isConstructor' @ [186:30] ==> value-parameter isConstructor: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'capturedBuilder' @ [186:45] ==> value-parameter capturedBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'buildParameters' @ [186:61] ==> public final fun buildParameters(): Parameters defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'getMethodParametersWithCaptured' @ [186:84] ==> private final fun getMethodParametersWithCaptured(capturedBuilder: ParametersBuilder, sourceNode: MethodNode): Parameters defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'capturedBuilder' @ [186:116] ==> value-parameter capturedBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'sourceNode' @ [186:133] ==> value-parameter sourceNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'RegeneratedLambdaFieldRemapper' @ [188:24] ==> public constructor RegeneratedLambdaFieldRemapper(originalLambdaInternalName: String, newLambdaInternalName: String, parameters: Parameters, recapturedLambdas: Map<String, LambdaInfo>, remapper: FieldRemapper, isConstructor: Boolean) defined in org.jetbrains.kotlin.codegen.inline.RegeneratedLambdaFieldRemapper[ClassConstructorDescriptorImpl]

'oldObjectType' @ [189:17] ==> private final val oldObjectType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'internalName' @ [189:31] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'transformationInfo' @ [189:45] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'newClassName' @ [189:64] ==> public open val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'parameters' @ [189:78] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'transformationInfo' @ [190:17] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'capturedLambdasToInline' @ [190:36] ==> public final lateinit var capturedLambdasToInline: Map<String, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'parentRemapper' @ [190:61] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'isConstructor' @ [190:77] ==> value-parameter isConstructor: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'MethodInliner' @ [193:23] ==> public constructor MethodInliner(node: MethodNode, parameters: Parameters, inliningContext: InliningContext, nodeRemapper: FieldRemapper, isSameModule: Boolean, errorPrefix: String, sourceMapper: SourceMapper, inlineCallSiteInfo: InlineCallSiteInfo, inlineOnlySmapSkipper: InlineOnlySmapSkipper?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[ClassConstructorDescriptorImpl]

'sourceNode' @ [194:17] ==> value-parameter sourceNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'parameters' @ [195:17] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'inliningContext' @ [196:17] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'subInline' @ [196:33] ==> @JvmOverloads public final fun subInline(generator: NameGenerator, additionalTypeMappings: Map<String, String?> = ..., lambdaInfo: LambdaInfo? = ...): InliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'transformationInfo' @ [196:43] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'nameGenerator' @ [196:62] ==> public open val nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'remapper' @ [197:17] ==> val remapper: RegeneratedLambdaFieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'isSameModule' @ [198:17] ==> private final val isSameModule: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'+' @ [199:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'transformationInfo' @ [199:38] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'oldClassName' @ [199:57] ==> public open val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'sourceMapper' @ [200:17] ==> private final lateinit var sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'InlineCallSiteInfo' @ [201:17] ==> public constructor InlineCallSiteInfo(ownerClassName: String, functionName: String?, functionDesc: String?) defined in org.jetbrains.kotlin.codegen.inline.InlineCallSiteInfo[ClassConstructorDescriptorImpl]

'transformationInfo' @ [202:25] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'oldClassName' @ [202:44] ==> public open val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'sourceNode' @ [203:25] ==> value-parameter sourceNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'name' @ [203:36] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'if (isConstructor) transformationInfo.newConstructorDescriptor else sourceNode.desc' @ [204:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'isConstructor' @ [204:29] ==> value-parameter isConstructor: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'transformationInfo' @ [204:44] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'newConstructorDescriptor' @ [204:63] ==> public final lateinit var newConstructorDescriptor: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'sourceNode' @ [204:93] ==> value-parameter sourceNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'desc' @ [204:104] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'inliner' @ [208:22] ==> val inliner: MethodInliner defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'doInline' @ [208:30] ==> public final fun doInline(adapter: MethodVisitor, remapper: LocalVarRemapper, remapReturn: Boolean, labelOwner: LabelOwner): InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'deferringVisitor' @ [208:39] ==> value-parameter deferringVisitor: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'LocalVarRemapper' @ [208:57] ==> public constructor LocalVarRemapper(params: Parameters, additionalShift: Int) defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[ClassConstructorDescriptorImpl]

'parameters' @ [208:74] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'NOT_APPLICABLE' @ [208:108] ==> public final val NOT_APPLICABLE: (LabelOwner..LabelOwner?) defined in org.jetbrains.kotlin.codegen.inline.LabelOwner[JavaPropertyDescriptor]

'result' @ [209:9] ==> val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'reifiedTypeParametersUsages' @ [209:16] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'mergeAll' @ [209:44] ==> public final fun mergeAll(other: ReifiedTypeParametersUsages): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'typeParametersToReify' @ [209:53] ==> val typeParametersToReify: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'deferringVisitor' @ [210:9] ==> value-parameter deferringVisitor: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[ValueParameterDescriptorImpl]

'visitMaxs' @ [210:26] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'-' @ [210:36] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [210:40] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [211:16] ==> val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.inlineMethod[LocalVariableDescriptor]

'ArrayList' @ [221:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'constructorInlineBuilder' @ [223:33] ==> value-parameter constructorInlineBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'buildParameters' @ [223:58] ==> public final fun buildParameters(): Parameters defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'IntArray' @ [224:31] ==> public constructor IntArray(size: Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'constructorParams' @ [224:40] ==> val constructorParams: Parameters defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'parameters' @ [224:58] ==> public final val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'size' @ [224:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'constructorParams' @ [229:22] ==> val constructorParams: Parameters defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'!' @ [230:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [230:18] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'isSkipped' @ [230:23] ==> public final val isSkipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'info' @ [231:21] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'isCaptured' @ [231:26] ==> public final var ParameterInfo.isCaptured: Boolean[MyPropertyDescriptor]

'info' @ [231:40] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'capturedIndexes' @ [232:21] ==> val capturedIndexes: IntArray defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'index' @ [232:37] ==> var index: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'size' @ [232:46] ==> var size: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'index' @ [233:21] ==> var index: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'size' @ [236:21] ==> var size: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'descTypes' @ [237:21] ==> val descTypes: ArrayList<Type> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'add' @ [237:31] ==> public open fun add(element: Type): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'info' @ [237:35] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'getType' @ [237:40] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'size' @ [239:17] ==> var size: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'info' @ [239:25] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'getType' @ [239:30] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'size' @ [239:40] ==> public final val Type.size: Int[MyPropertyDescriptor]

'getMethodDescriptor' @ [243:42] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'VOID_TYPE' @ [243:67] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'descTypes' @ [243:79] ==> val descTypes: ArrayList<Type> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'toTypedArray' @ [243:89] ==> public inline fun <reified T> Collection<Type>.toTypedArray(): Array<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Type

'transformationInfo' @ [245:9] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'newConstructorDescriptor' @ [245:28] ==> public final lateinit var newConstructorDescriptor: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'constructorDescriptor' @ [245:55] ==> val constructorDescriptor: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'classBuilder' @ [246:34] ==> value-parameter classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'newMethod' @ [246:47] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [247:17] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[PropertyImportedFromObject]

'constructor' @ [247:28] ==> private final var constructor: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'access' @ [247:42] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'constructorDescriptor' @ [247:60] ==> val constructorDescriptor: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'EMPTY_STRING_ARRAY' @ [247:99] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'Label' @ [250:33] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'constructorVisitor' @ [251:9] ==> val constructorVisitor: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'visitLabel' @ [251:28] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'newBodyStartLabel' @ [251:39] ==> val newBodyStartLabel: Label defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'getNewFieldsToGenerate' @ [253:36] ==> public fun getNewFieldsToGenerate(params: List<CapturedParamInfo>): List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'allCapturedBuilder' @ [253:59] ==> value-parameter allCapturedBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'listCaptured' @ [253:78] ==> public final fun listCaptured(): List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'transformToFieldInfo' @ [254:36] ==> public fun transformToFieldInfo(lambdaType: Type, newFields: List<NewJavaField>): List<FieldInfo> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'getObjectType' @ [254:62] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'transformationInfo' @ [254:76] ==> @JvmField public final val transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'newClassName' @ [254:95] ==> public open val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'newFieldsWithSkipped' @ [254:110] ==> val newFieldsWithSkipped: List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'InstructionAdapter' @ [256:40] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'constructorVisitor' @ [256:59] ==> val constructorVisitor: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'fieldInfoWithSkipped' @ [257:9] ==> val fieldInfoWithSkipped: List<FieldInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'forEachIndexed' @ [257:30] ==> public inline fun <T> Iterable<FieldInfo>.forEachIndexed(action: (index: Int, FieldInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FieldInfo

'!' @ [258:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newFieldsWithSkipped' @ [258:18] ==> val newFieldsWithSkipped: List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'paramIndex' @ [258:39] ==> value-parameter paramIndex: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<anonymous>[ValueParameterDescriptorImpl]

'skip' @ [258:51] ==> public final val skip: Boolean defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[PropertyDescriptorImpl]

'genAssignInstanceFieldFromParam' @ [259:25] ==> public open fun genAssignInstanceFieldFromParam(info: (FieldInfo..FieldInfo?), index: Int, iv: (InstructionAdapter..InstructionAdapter?)): Int defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'fieldInfo' @ [259:57] ==> value-parameter fieldInfo: FieldInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<anonymous>[ValueParameterDescriptorImpl]

'capturedIndexes' @ [259:68] ==> val capturedIndexes: IntArray defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'paramIndex' @ [259:84] ==> value-parameter paramIndex: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<anonymous>[ValueParameterDescriptorImpl]

'capturedFieldInitializer' @ [259:97] ==> val capturedFieldInitializer: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'constructorAdditionalFakeParams' @ [267:22] ==> value-parameter constructorAdditionalFakeParams: List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'constructorInlineBuilder' @ [268:24] ==> value-parameter constructorInlineBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'addCapturedParamCopy' @ [268:49] ==> public final fun addCapturedParamCopy(copyFrom: CapturedParamInfo): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'info' @ [268:70] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'fake' @ [270:17] ==> val fake: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'lambda' @ [270:22] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'field' @ [272:43] ==> @NotNull public open fun field(@NotNull type: Type, @NotNull owner: Type, @NotNull name: String, isStatic: Boolean, @NotNull receiver: StackValue): StackValue.Field defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'fake' @ [273:25] ==> val fake: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'getType' @ [273:30] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaMethodDescriptor]

'oldObjectType' @ [274:25] ==> private final val oldObjectType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'fake' @ [275:25] ==> val fake: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'newFieldName' @ [275:30] ==> public final val CapturedParamInfo.newFieldName: String[MyPropertyDescriptor]

'LOCAL_0' @ [277:36] ==> public final val LOCAL_0: (StackValue.Local..StackValue.Local?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'fake' @ [279:17] ==> val fake: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'remapValue' @ [279:22] ==> public final var CapturedParamInfo.remapValue: StackValue?[MyPropertyDescriptor]

'composed' @ [279:35] ==> val composed: StackValue.Field defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'MethodNode' @ [283:38] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'constructor' @ [283:49] ==> private final var constructor: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'access' @ [283:63] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'constructorDescriptor' @ [283:81] ==> val constructorDescriptor: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'EMPTY_STRING_ARRAY' @ [283:120] ==> public final val EMPTY_STRING_ARRAY: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.util.ArrayUtil[JavaPropertyDescriptor]

'inlineMethodAndUpdateGlobalResult' @ [284:9] ==> private final fun inlineMethodAndUpdateGlobalResult(parentRemapper: FieldRemapper, deferringVisitor: MethodVisitor, next: MethodNode, allCapturedParamBuilder: ParametersBuilder, isConstructor: Boolean): InlineResult defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'parentRemapper' @ [284:43] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'intermediateMethodNode' @ [284:59] ==> val intermediateMethodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'constructor' @ [284:83] ==> private final var constructor: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'constructorInlineBuilder' @ [284:98] ==> value-parameter constructorInlineBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'removeFinallyMarkers' @ [285:9] ==> internal fun removeFinallyMarkers(intoNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'intermediateMethodNode' @ [285:30] ==> val intermediateMethodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'intermediateMethodNode' @ [287:21] ==> val intermediateMethodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'instructions' @ [287:44] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [287:57] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'first' @ [288:30] ==> val first: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'label' @ [288:52] ==> public final val LabelNode.label: (Label..Label?)[MyPropertyDescriptor]

'intermediateMethodNode' @ [289:9] ==> val intermediateMethodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'accept' @ [289:32] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'MethodBodyVisitor' @ [289:48] ==> public constructor MethodBodyVisitor(mv: MethodVisitor, visitAnnotationsAndAttributes: Boolean = ...) defined in org.jetbrains.kotlin.codegen.inline.MethodBodyVisitor[ClassConstructorDescriptorImpl]

'capturedFieldInitializer' @ [289:66] ==> val capturedFieldInitializer: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'super' @ [293:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLocalVariable' @ [293:23] ==> public open fun visitLocalVariable(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (Label..Label?), p4: (Label..Label?), p5: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodBodyVisitor[JavaMethodDescriptor]

'name' @ [294:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'desc' @ [294:31] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'signature' @ [294:37] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'if (oldStartLabel === start) newBodyStartLabel else start' @ [296:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Label, elseBranch: Label): Label[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Label

'oldStartLabel' @ [296:29] ==> val oldStartLabel: Label? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'start' @ [296:47] ==> value-parameter start: Label defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'newBodyStartLabel' @ [296:54] ==> val newBodyStartLabel: Label defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'start' @ [296:77] ==> value-parameter start: Label defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'end' @ [297:25] ==> value-parameter end: Label defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'index' @ [297:30] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'constructorVisitor' @ [301:9] ==> val constructorVisitor: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'visitEnd' @ [301:28] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'genClosureFields' @ [302:17] ==> public open fun genClosureFields(allFields: (MutableList<(Pair<(String..String?), (Type..Type?)>..Pair<(String..String?), (Type..Type?)>?)>..List<(Pair<(String..String?), (Type..Type?)>..Pair<(String..String?), (Type..Type?)>?)>?), builder: (ClassBuilder..ClassBuilder?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'toNameTypePair' @ [303:17] ==> public fun toNameTypePair(fields: List<NewJavaField>): List<Pair<String, Type>> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'filterSkipped' @ [303:32] ==> public fun filterSkipped(fields: List<NewJavaField>): List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'newFieldsWithSkipped' @ [303:46] ==> val newFieldsWithSkipped: List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[LocalVariableDescriptor]

'classBuilder' @ [303:70] ==> value-parameter classBuilder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.generateConstructorAndFields[ValueParameterDescriptorImpl]

'ParametersBuilder' @ [308:23] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[FakeCallableDescriptorForObject]

'initializeBuilderFrom' @ [308:41] ==> @JvmOverloads @JvmStatic public final fun initializeBuilderFrom(objectType: Type, descriptor: String, inlineLambda: LambdaInfo? = ...): ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion[SimpleFunctionDescriptorImpl]

'oldObjectType' @ [308:63] ==> private final val oldObjectType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'sourceNode' @ [308:78] ==> value-parameter sourceNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getMethodParametersWithCaptured[ValueParameterDescriptorImpl]

'desc' @ [308:89] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'capturedBuilder' @ [309:23] ==> value-parameter capturedBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getMethodParametersWithCaptured[ValueParameterDescriptorImpl]

'listCaptured' @ [309:39] ==> public final fun listCaptured(): List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [310:13] ==> val builder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getMethodParametersWithCaptured[LocalVariableDescriptor]

'addCapturedParamCopy' @ [310:21] ==> public final fun addCapturedParamCopy(copyFrom: CapturedParamInfo): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'param' @ [310:42] ==> val param: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getMethodParametersWithCaptured[LocalVariableDescriptor]

'builder' @ [312:16] ==> val builder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getMethodParametersWithCaptured[LocalVariableDescriptor]

'buildParameters' @ [312:24] ==> public final fun buildParameters(): Parameters defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'DeferredMethodVisitor' @ [316:16] ==> public constructor DeferredMethodVisitor(intermediate: MethodNode, resultNode: () -> MethodVisitor) defined in org.jetbrains.kotlin.codegen.inline.DeferredMethodVisitor[ClassConstructorDescriptorImpl]

'MethodNode' @ [317:17] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'original' @ [318:25] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'access' @ [318:34] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'original' @ [318:42] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'name' @ [318:51] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'original' @ [318:57] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'desc' @ [318:66] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'original' @ [318:72] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'signature' @ [318:81] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toStringArray' @ [319:35] ==> @NotNull @Contract public open fun toStringArray(@Nullable p0: (MutableCollection<(String..String?)>?..Collection<(String..String?)>?)): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.util.ArrayUtil[JavaMethodDescriptor]

'original' @ [319:49] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'exceptions' @ [319:58] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'builder' @ [322:13] ==> value-parameter builder: ClassBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'newMethod' @ [322:21] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [323:21] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[PropertyImportedFromObject]

'original' @ [323:32] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'access' @ [323:41] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'original' @ [323:49] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'name' @ [323:58] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'original' @ [323:64] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'desc' @ [323:73] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'original' @ [323:79] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'signature' @ [323:88] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toStringArray' @ [324:31] ==> @NotNull @Contract public open fun toStringArray(@Nullable p0: (MutableCollection<(String..String?)>?..Collection<(String..String?)>?)): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.util.ArrayUtil[JavaMethodDescriptor]

'original' @ [324:45] ==> value-parameter original: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.newMethod[ValueParameterDescriptorImpl]

'exceptions' @ [324:54] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'LinkedHashSet' @ [336:31] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LambdaInfo

'ArrayList' @ [337:47] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CapturedParamInfo

'transformationInfo' @ [338:29] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'lambdasToInline' @ [338:48] ==> public final val lambdasToInline: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'HashSet' @ [339:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'arrayListOf' @ [343:24] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'constructor' @ [344:9] ==> value-parameter constructor: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'findCapturedFieldAssignmentInstructions' @ [344:21] ==> public fun MethodNode.findCapturedFieldAssignmentInstructions(): Sequence<FieldInsnNode> defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'forEach' @ [345:17] ==> public inline fun <T> Sequence<FieldInsnNode>.forEach(action: (FieldInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FieldInsnNode

'fieldNode' @ [346:37] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [346:47] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'fieldNode' @ [347:42] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [347:52] ==> public final val FieldInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'parameterAload' @ [348:36] ==> val parameterAload: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'`var`' @ [348:51] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'indexToLambda' @ [349:38] ==> val indexToLambda: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'varIndex' @ [349:52] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'if (isThis0(fieldName) && shouldRenameThis0(parentFieldRemapper, indexToLambda.values))
                        getNewFieldName(fieldName, true)
                    else
                        fieldName' @ [350:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'isThis0' @ [350:44] ==> internal fun isThis0(name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'fieldName' @ [350:52] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'shouldRenameThis0' @ [350:66] ==> private final fun shouldRenameThis0(parentFieldRemapper: FieldRemapper, values: Collection<LambdaInfo>): Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'parentFieldRemapper' @ [350:84] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'indexToLambda' @ [350:105] ==> val indexToLambda: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'values' @ [350:119] ==> public abstract val values: Collection<LambdaInfo> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'getNewFieldName' @ [351:25] ==> private final fun getNewFieldName(oldName: String, originalField: Boolean): String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'fieldName' @ [351:41] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'fieldName' @ [353:25] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'capturedParamBuilder' @ [354:32] ==> value-parameter capturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addCapturedParam' @ [354:53] ==> public final fun addCapturedParam(containingLambdaType: Type, fieldName: String, newFieldName: String, type: Type, skipped: Boolean, original: ParameterInfo?): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'getObjectType' @ [355:34] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'transformationInfo' @ [355:48] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'oldClassName' @ [355:67] ==> public open val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'fieldName' @ [355:82] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'newFieldName' @ [355:93] ==> val newFieldName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'getType' @ [356:34] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'fieldNode' @ [356:42] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [356:52] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'lambdaInfo' @ [356:59] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'lambdaInfo' @ [358:25] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'info' @ [359:25] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'lambda' @ [359:30] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'lambdaInfo' @ [359:39] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'capturedLambdas' @ [360:25] ==> val capturedLambdas: LinkedHashSet<LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [360:41] ==> public open fun add(element: LambdaInfo): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'lambdaInfo' @ [360:45] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'constructorAdditionalFakeParams' @ [362:21] ==> val constructorAdditionalFakeParams: ArrayList<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [362:53] ==> public open fun add(element: CapturedParamInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'info' @ [362:57] ==> val info: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'capturedParams' @ [363:21] ==> val capturedParams: HashSet<Int> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [363:36] ==> public open fun add(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'varIndex' @ [363:40] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [365:21] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [365:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parameterAload' @ [365:34] ==> val parameterAload: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'previous' @ [365:49] ==> public final val VarInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'toDelete' @ [366:21] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [366:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parameterAload' @ [366:34] ==> val parameterAload: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [367:21] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [367:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'fieldNode' @ [367:34] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [369:9] ==> value-parameter constructor: MethodNode defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'remove' @ [369:21] ==> public fun MethodNode.remove(instructions: Collection<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'toDelete' @ [369:28] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'constructorParamBuilder' @ [371:9] ==> value-parameter constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addThis' @ [371:33] ==> public final fun addThis(type: Type, skipped: Boolean): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'oldObjectType' @ [371:41] ==> private final val oldObjectType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'transformationInfo' @ [373:26] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'constructorDesc' @ [373:45] ==> public final val constructorDesc: String? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'let' @ [373:62] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (Array<(Type..Type?)>..Array<out (Type..Type?)>?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.Array<(org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>..kotlin.Array<out (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>?)

'getArgumentTypes' @ [373:73] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'it' @ [373:90] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [373:99] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<(Type..Type?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'paramTypes' @ [374:22] ==> val paramTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'indexToLambda' @ [375:24] ==> val indexToLambda: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'constructorParamBuilder' @ [375:38] ==> value-parameter constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'nextParameterOffset' @ [375:62] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'constructorParamBuilder' @ [376:33] ==> value-parameter constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addNextParameter' @ [376:57] ==> public final fun addNextParameter(type: Type, skipped: Boolean): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'type' @ [376:74] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'info' @ [376:80] ==> val info: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'parameterInfo' @ [377:13] ==> val parameterInfo: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'lambda' @ [377:27] ==> public final var ParameterInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'info' @ [377:36] ==> val info: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'if (capturedParams.contains(parameterInfo.index)) {
                parameterInfo.isCaptured = true
            }
            else {
                //otherwise it's super constructor parameter
            }' @ [378:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'capturedParams' @ [378:17] ==> val capturedParams: HashSet<Int> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'contains' @ [378:32] ==> public open fun contains(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'parameterInfo' @ [378:41] ==> val parameterInfo: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'index' @ [378:55] ==> public final val ParameterInfo.index: Int[MyPropertyDescriptor]

'parameterInfo' @ [379:17] ==> val parameterInfo: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'isCaptured' @ [379:31] ==> public final var ParameterInfo.isCaptured: Boolean[MyPropertyDescriptor]

'HashMap' @ [388:39] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> LambdaInfo

'ArrayList' @ [389:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CapturedParamDesc

'parentFieldRemapper' @ [390:38] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'isRoot' @ [390:58] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'parentFieldRemapper' @ [390:68] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'parentFieldRemapper' @ [390:116] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'parent' @ [390:136] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'isRoot' @ [390:145] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'HashMap' @ [391:28] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> CapturedParamInfo

'capturedLambdas' @ [392:22] ==> val capturedLambdas: LinkedHashSet<LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'addCapturedNotAddOuter' @ [393:17] ==> val addCapturedNotAddOuter: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'info' @ [394:30] ==> val info: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'capturedVars' @ [394:35] ==> public abstract val capturedVars: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'desc' @ [395:31] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'fieldName' @ [395:36] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'desc' @ [395:56] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'type' @ [395:61] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'className' @ [395:66] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'alreadyAdded' @ [396:45] ==> val alreadyAdded: HashMap<String, CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'key' @ [396:58] ==> val key: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'capturedParamBuilder' @ [398:47] ==> value-parameter capturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addCapturedParam' @ [398:68] ==> public final fun addCapturedParam(desc: CapturedParamDesc, newFieldName: String, skipInConstructor: Boolean): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'desc' @ [399:29] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'alreadyAddedParam' @ [400:29] ==> val alreadyAddedParam: CapturedParamInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'newFieldName' @ [400:48] ==> public final val CapturedParamInfo.newFieldName: String[MyPropertyDescriptor]

'getNewFieldName' @ [400:64] ==> private final fun getNewFieldName(oldName: String, originalField: Boolean): String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'desc' @ [400:80] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'fieldName' @ [400:85] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'alreadyAddedParam' @ [401:29] ==> val alreadyAddedParam: CapturedParamInfo? defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'field' @ [403:47] ==> @NotNull public open fun field(@NotNull type: Type, @NotNull owner: Type, @NotNull name: String, isStatic: Boolean, @NotNull receiver: StackValue): StackValue.Field defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'desc' @ [404:29] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'type' @ [404:34] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'oldObjectType' @ [405:29] ==> private final val oldObjectType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'recapturedParamInfo' @ [406:29] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'newFieldName' @ [406:49] ==> public final val CapturedParamInfo.newFieldName: String[MyPropertyDescriptor]

'LOCAL_0' @ [408:40] ==> public final val LOCAL_0: (StackValue.Local..StackValue.Local?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'recapturedParamInfo' @ [410:21] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'remapValue' @ [410:41] ==> public final var CapturedParamInfo.remapValue: StackValue?[MyPropertyDescriptor]

'composed' @ [410:54] ==> val composed: StackValue.Field defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'allRecapturedParameters' @ [411:21] ==> val allRecapturedParameters: ArrayList<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [411:45] ==> public open fun add(element: CapturedParamDesc): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'desc' @ [411:49] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'constructorParamBuilder' @ [413:21] ==> value-parameter constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addCapturedParam' @ [413:45] ==> public final fun addCapturedParam(original: CapturedParamInfo, newFieldName: String): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'recapturedParamInfo' @ [413:62] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'recapturedParamInfo' @ [413:83] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'newFieldName' @ [413:103] ==> public final val CapturedParamInfo.newFieldName: String[MyPropertyDescriptor]

'remapValue' @ [413:117] ==> public final var CapturedParamInfo.remapValue: StackValue?[MyPropertyDescriptor]

'composed' @ [413:130] ==> val composed: StackValue.Field defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'isThis0' @ [415:25] ==> internal fun isThis0(name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'desc' @ [415:33] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'fieldName' @ [415:38] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'alreadyAdded' @ [416:25] ==> val alreadyAdded: HashMap<String, CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'put' @ [416:38] ==> public open fun put(key: String, value: CapturedParamInfo): CapturedParamInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'key' @ [416:42] ==> val key: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'recapturedParamInfo' @ [416:47] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'capturedLambdasToInline' @ [420:13] ==> val capturedLambdasToInline: HashMap<String, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'put' @ [420:37] ==> public open fun put(key: String, value: LambdaInfo): LambdaInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'info' @ [420:41] ==> val info: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'lambdaClassType' @ [420:46] ==> public abstract val lambdaClassType: Type defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'internalName' @ [420:62] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'info' @ [420:76] ==> val info: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'parentFieldRemapper' @ [423:13] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'!' @ [423:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'capturedLambdas' @ [423:62] ==> val capturedLambdas: LinkedHashSet<LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'isEmpty' @ [423:78] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'!' @ [423:91] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'addCapturedNotAddOuter' @ [423:92] ==> val addCapturedNotAddOuter: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'parentFieldRemapper' @ [425:26] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'parent' @ [425:46] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'AssertionError' @ [426:32] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'parentFieldRemapper' @ [426:96] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'parent' @ [426:116] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'getObjectType' @ [427:34] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'parent' @ [427:48] ==> val parent: RegeneratedLambdaFieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'originalLambdaInternalName' @ [427:55] ==> public final val originalLambdaInternalName: String? defined in org.jetbrains.kotlin.codegen.inline.RegeneratedLambdaFieldRemapper[PropertyDescriptorImpl]

'CapturedParamDesc' @ [428:24] ==> public constructor CapturedParamDesc(@NotNull containingLambdaType: Type, @NotNull fieldName: String, @NotNull type: Type) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamDesc[JavaClassConstructorDescriptor]

'ownerType' @ [428:42] ==> val ownerType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'THIS' @ [428:53] ==> internal const val THIS: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'ownerType' @ [428:59] ==> val ownerType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'capturedParamBuilder' @ [429:39] ==> value-parameter capturedParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addCapturedParam' @ [429:60] ==> public final fun addCapturedParam(desc: CapturedParamDesc, newFieldName: String, skipInConstructor: Boolean): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'desc' @ [429:77] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'THIS_0' @ [429:83] ==> internal const val THIS_0: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'LOCAL_0' @ [430:39] ==> public final val LOCAL_0: (StackValue.Local..StackValue.Local?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'recapturedParamInfo' @ [431:13] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'remapValue' @ [431:33] ==> public final var CapturedParamInfo.remapValue: StackValue?[MyPropertyDescriptor]

'composed' @ [431:46] ==> val composed: (StackValue.Local..StackValue.Local?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'allRecapturedParameters' @ [432:13] ==> val allRecapturedParameters: ArrayList<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'add' @ [432:37] ==> public open fun add(element: CapturedParamDesc): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'desc' @ [432:41] ==> val desc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'constructorParamBuilder' @ [434:13] ==> value-parameter constructorParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'addCapturedParam' @ [434:37] ==> public final fun addCapturedParam(original: CapturedParamInfo, newFieldName: String): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'recapturedParamInfo' @ [434:54] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'recapturedParamInfo' @ [434:75] ==> val recapturedParamInfo: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'newFieldName' @ [434:95] ==> public final val CapturedParamInfo.newFieldName: String[MyPropertyDescriptor]

'remapValue' @ [434:109] ==> public final var CapturedParamInfo.remapValue: StackValue?[MyPropertyDescriptor]

'composed' @ [434:122] ==> val composed: (StackValue.Local..StackValue.Local?) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'transformationInfo' @ [437:9] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'allRecapturedParameters' @ [437:28] ==> public final lateinit var allRecapturedParameters: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'allRecapturedParameters' @ [437:54] ==> val allRecapturedParameters: ArrayList<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'transformationInfo' @ [438:9] ==> value-parameter transformationInfo: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[ValueParameterDescriptorImpl]

'capturedLambdasToInline' @ [438:28] ==> public final lateinit var capturedLambdasToInline: Map<String, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'capturedLambdasToInline' @ [438:54] ==> val capturedLambdasToInline: HashMap<String, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'constructorAdditionalFakeParams' @ [440:16] ==> val constructorAdditionalFakeParams: ArrayList<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.extractParametersMappingAndPatchConstructor[LocalVariableDescriptor]

'if (isFirstDeclSiteLambdaFieldRemapper(parentFieldRemapper)) {
            values.any { it.capturedVars.any { isThis0(it.fieldName) }}
        }
        else false' @ [444:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isFirstDeclSiteLambdaFieldRemapper' @ [444:20] ==> private final fun isFirstDeclSiteLambdaFieldRemapper(parentRemapper: FieldRemapper): Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'parentFieldRemapper' @ [444:55] ==> value-parameter parentFieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.shouldRenameThis0[ValueParameterDescriptorImpl]

'values' @ [445:13] ==> value-parameter values: Collection<LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.shouldRenameThis0[ValueParameterDescriptorImpl]

'any' @ [445:20] ==> public inline fun <T> Iterable<LambdaInfo>.any(predicate: (LambdaInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo

'it' @ [445:26] ==> value-parameter it: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.shouldRenameThis0.<anonymous>[ValueParameterDescriptorImpl]

'capturedVars' @ [445:29] ==> public abstract val capturedVars: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'any' @ [445:42] ==> public inline fun <T> Iterable<CapturedParamDesc>.any(predicate: (CapturedParamDesc) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CapturedParamDesc

'isThis0' @ [445:48] ==> internal fun isThis0(name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [445:56] ==> value-parameter it: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.shouldRenameThis0.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fieldName' @ [445:59] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'THIS_0' @ [451:13] ==> internal const val THIS_0: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'oldName' @ [451:23] ==> value-parameter oldName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getNewFieldName[ValueParameterDescriptorImpl]

'if (!originalField) {
                oldName
            }
            else {
                //rename original 'this$0' in declaration site lambda (inside inline function) to use this$0 only for outer lambda/object access on call site
                addUniqueField(oldName + INLINE_FUN_THIS_0_SUFFIX)
            }' @ [452:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [452:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originalField' @ [452:25] ==> value-parameter originalField: Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getNewFieldName[ValueParameterDescriptorImpl]

'oldName' @ [453:17] ==> value-parameter oldName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getNewFieldName[ValueParameterDescriptorImpl]

'addUniqueField' @ [457:17] ==> private final fun addUniqueField(name: String): String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'oldName' @ [457:32] ==> value-parameter oldName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getNewFieldName[ValueParameterDescriptorImpl]

'INLINE_FUN_THIS_0_SUFFIX' @ [457:42] ==> internal const val INLINE_FUN_THIS_0_SUFFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'addUniqueField' @ [460:16] ==> private final fun addUniqueField(name: String): String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[SimpleFunctionDescriptorImpl]

'oldName' @ [460:31] ==> value-parameter oldName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.getNewFieldName[ValueParameterDescriptorImpl]

'INLINE_TRANSFORMATION_SUFFIX' @ [460:41] ==> internal const val INLINE_TRANSFORMATION_SUFFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'fieldNames' @ [464:26] ==> private final val fieldNames: HashMap<String, MutableList<String>> /* = HashMap<String, MutableList<String>> */ defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer[PropertyDescriptorImpl]

'getOrPut' @ [464:37] ==> public inline fun <K, V> MutableMap<String, MutableList<String>>.getOrPut(key: String, defaultValue: () -> MutableList<String>): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableList<String>

'name' @ [464:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[ValueParameterDescriptorImpl]

'LinkedList' @ [464:54] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'if (existNames.isEmpty()) "" else "$" + existNames.size' @ [465:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'existNames' @ [465:26] ==> val existNames: MutableList<String> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[LocalVariableDescriptor]

'isEmpty' @ [465:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'+' @ [465:56] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'existNames' @ [465:62] ==> val existNames: MutableList<String> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[LocalVariableDescriptor]

'size' @ [465:73] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'name' @ [466:23] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[ValueParameterDescriptorImpl]

'suffix' @ [466:30] ==> val suffix: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[LocalVariableDescriptor]

'existNames' @ [467:9] ==> val existNames: MutableList<String> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[LocalVariableDescriptor]

'add' @ [467:20] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'newName' @ [467:24] ==> val newName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[LocalVariableDescriptor]

'newName' @ [468:16] ==> val newName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.addUniqueField[LocalVariableDescriptor]

'parentRemapper' @ [472:13] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.isFirstDeclSiteLambdaFieldRemapper[ValueParameterDescriptorImpl]

'parentRemapper' @ [472:66] ==> value-parameter parentRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformer.isFirstDeclSiteLambdaFieldRemapper[ValueParameterDescriptorImpl]

