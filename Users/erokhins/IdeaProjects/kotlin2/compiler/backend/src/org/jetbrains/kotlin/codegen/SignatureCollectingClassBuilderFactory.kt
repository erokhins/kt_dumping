'DelegatingClassBuilderFactory' @ [31:5] ==> public constructor DelegatingClassBuilderFactory(delegate: ClassBuilderFactory) defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilderFactory[ClassConstructorDescriptorImpl]

'delegate' @ [31:35] ==> value-parameter delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.<init>[ValueParameterDescriptorImpl]

'SignatureCollectingClassBuilder' @ [39:16] ==> public constructor SignatureCollectingClassBuilder(classCreatedFor: JvmDeclarationOrigin, _delegate: ClassBuilder) defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[ClassConstructorDescriptorImpl]

'origin' @ [39:48] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'delegate' @ [39:56] ==> protected final val delegate: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory[PropertyDescriptorImpl]

'newClassBuilder' @ [39:65] ==> @NotNull public abstract fun newClassBuilder(@NotNull origin: JvmDeclarationOrigin): ClassBuilder defined in org.jetbrains.kotlin.codegen.ClassBuilderFactory[JavaMethodDescriptor]

'origin' @ [39:81] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.newClassBuilder[ValueParameterDescriptorImpl]

'DelegatingClassBuilder' @ [45:9] ==> public constructor DelegatingClassBuilder() defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaClassConstructorDescriptor]

'_delegate' @ [47:38] ==> internal final val _delegate: ClassBuilder defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'LinkedMultiMap' @ [51:34] ==> public constructor LinkedMultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.LinkedMultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> RawSignature
    <V : (Any..Any?)> -> JvmDeclarationOrigin

'classInternalName' @ [54:13] ==> private final lateinit var classInternalName: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'name' @ [54:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'super' @ [55:13] ==> <this> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[LazyClassReceiverParameterDescriptor]

'defineClass' @ [55:19] ==> @Override public open fun defineClass(@Nullable origin: PsiElement?, version: Int, access: Int, @NotNull name: String, @Nullable signature: String?, @NotNull superName: String, @NotNull interfaces: (Array<(String..String?)>..Array<out (String..String?)>)): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [55:31] ==> value-parameter origin: PsiElement? defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'version' @ [55:39] ==> value-parameter version: Int defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'access' @ [55:48] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'name' @ [55:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'signature' @ [55:62] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'superName' @ [55:73] ==> value-parameter superName: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'interfaces' @ [55:84] ==> value-parameter interfaces: Array<out String> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.defineClass[ValueParameterDescriptorImpl]

'signatures' @ [59:13] ==> private final val signatures: LinkedMultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'putValue' @ [59:24] ==> public open fun putValue(@Nullable p0: RawSignature?, p1: (JvmDeclarationOrigin..JvmDeclarationOrigin?)): Unit defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'RawSignature' @ [59:33] ==> public constructor RawSignature(name: String, desc: String, kind: MemberKind) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedClassConstructorDescriptor]

'name' @ [59:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'desc' @ [59:52] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'FIELD' @ [59:69] ==> enum entry FIELD defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.MemberKind[FakeCallableDescriptorForObject]

'origin' @ [59:77] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'!' @ [60:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [60:18] ==> public abstract operator fun invoke(p1: JvmDeclarationOrigin): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'origin' @ [60:33] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'EMPTY_FIELD_VISITOR' @ [61:45] ==> protected/*protected static*/ final val EMPTY_FIELD_VISITOR: (FieldVisitor..FieldVisitor?) defined in org.jetbrains.kotlin.codegen.AbstractClassBuilder[JavaPropertyDescriptor]

'super' @ [63:20] ==> <this> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[LazyClassReceiverParameterDescriptor]

'newField' @ [63:26] ==> @NotNull @Override public open fun newField(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable value: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [63:35] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'access' @ [63:43] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'name' @ [63:51] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'desc' @ [63:57] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'signature' @ [63:63] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'value' @ [63:74] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newField[ValueParameterDescriptorImpl]

'signatures' @ [67:13] ==> private final val signatures: LinkedMultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'putValue' @ [67:24] ==> public open fun putValue(@Nullable p0: RawSignature?, p1: (JvmDeclarationOrigin..JvmDeclarationOrigin?)): Unit defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'RawSignature' @ [67:33] ==> public constructor RawSignature(name: String, desc: String, kind: MemberKind) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedClassConstructorDescriptor]

'name' @ [67:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'desc' @ [67:52] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'METHOD' @ [67:69] ==> enum entry METHOD defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.MemberKind[FakeCallableDescriptorForObject]

'origin' @ [67:78] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'!' @ [68:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [68:18] ==> public abstract operator fun invoke(p1: JvmDeclarationOrigin): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'origin' @ [68:33] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'EMPTY_METHOD_VISITOR' @ [69:45] ==> protected/*protected static*/ final val EMPTY_METHOD_VISITOR: (MethodVisitor..MethodVisitor?) defined in org.jetbrains.kotlin.codegen.AbstractClassBuilder[JavaPropertyDescriptor]

'super' @ [71:20] ==> <this> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[LazyClassReceiverParameterDescriptor]

'newMethod' @ [71:26] ==> @NotNull @Override public open fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

'origin' @ [71:36] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'access' @ [71:44] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'name' @ [71:52] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'desc' @ [71:58] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'signature' @ [71:64] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'exceptions' @ [71:75] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.newMethod[ValueParameterDescriptorImpl]

'component1' @ [75:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>.component1(): (RawSignature..RawSignature?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature..org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>?)

'component2' @ [75:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>.component2(): (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature..org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin..org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin?)>?)

'signatures' @ [75:57] ==> private final val signatures: LinkedMultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'entrySet' @ [75:68] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>..Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>?)>..Set<(MutableMap.MutableEntry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>..Map.Entry<(RawSignature..RawSignature?), (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?)>?)>) defined in com.intellij.util.containers.LinkedMultiMap[JavaMethodDescriptor]

'elementsAndDescriptors' @ [76:21] ==> val elementsAndDescriptors: (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.done[LocalVariableDescriptor]

'size' @ [76:44] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'handleClashingSignatures' @ [77:17] ==> protected abstract fun handleClashingSignatures(data: ConflictingJvmDeclarationsData): Unit defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory[SimpleFunctionDescriptorImpl]

'ConflictingJvmDeclarationsData' @ [77:42] ==> public constructor ConflictingJvmDeclarationsData(classInternalName: String, classOrigin: JvmDeclarationOrigin, signature: RawSignature, signatureOrigins: Collection<JvmDeclarationOrigin>) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedClassConstructorDescriptor]

'classInternalName' @ [78:25] ==> private final lateinit var classInternalName: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'classCreatedFor' @ [79:25] ==> private final val classCreatedFor: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'signature' @ [80:25] ==> val signature: (RawSignature..RawSignature?) defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.done[LocalVariableDescriptor]

'elementsAndDescriptors' @ [81:25] ==> val elementsAndDescriptors: (MutableCollection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>..Collection<(JvmDeclarationOrigin..JvmDeclarationOrigin?)>?) defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder.done[LocalVariableDescriptor]

'onClassDone' @ [84:13] ==> protected abstract fun onClassDone(classOrigin: JvmDeclarationOrigin, classInternalName: String, signatures: MultiMap<RawSignature, JvmDeclarationOrigin>): Unit defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory[SimpleFunctionDescriptorImpl]

'classCreatedFor' @ [84:25] ==> private final val classCreatedFor: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'classInternalName' @ [84:42] ==> private final lateinit var classInternalName: String defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'signatures' @ [84:61] ==> private final val signatures: LinkedMultiMap<RawSignature, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[PropertyDescriptorImpl]

'super' @ [85:13] ==> <this> defined in org.jetbrains.kotlin.codegen.SignatureCollectingClassBuilderFactory.SignatureCollectingClassBuilder[LazyClassReceiverParameterDescriptor]

'done' @ [85:19] ==> @Override public open fun done(): Unit defined in org.jetbrains.kotlin.codegen.DelegatingClassBuilder[JavaMethodDescriptor]

