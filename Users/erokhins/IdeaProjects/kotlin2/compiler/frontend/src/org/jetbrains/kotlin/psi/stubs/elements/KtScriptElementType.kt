'KtStubElementType<KotlinScriptStub, KtScript>' @ [29:48] ==> public constructor KtStubElementType<StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)>(@NotNull @NonNls debugName: String, @NotNull psiClass: Class<(KtScript..KtScript?)>, @NotNull stubClass: Class<*>) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementType[JavaClassConstructorDescriptor]
Inferred types:
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinScriptStub
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtScript

'debugName' @ [30:9] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.<init>[ValueParameterDescriptorImpl]

'java' @ [30:36] ==> public val <T> KClass<KtScript>.java: Class<KtScript> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtScript

'java' @ [30:66] ==> public val <T> KClass<KotlinScriptStub>.java: Class<KotlinScriptStub> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinScriptStub

'KotlinScriptStubImpl' @ [34:16] ==> public constructor KotlinScriptStubImpl(parent: StubElement<out PsiElement>?, _fqName: StringRef?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinScriptStubImpl[ClassConstructorDescriptorImpl]

'parentStub' @ [34:37] ==> value-parameter parentStub: StubElement<PsiElement> defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.createStub[ValueParameterDescriptorImpl]

'fromString' @ [34:59] ==> @Contract public open fun fromString(@Nullable p0: String?): (StringRef..StringRef?) defined in com.intellij.util.io.StringRef[JavaMethodDescriptor]

'psi' @ [34:70] ==> value-parameter psi: KtScript defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.createStub[ValueParameterDescriptorImpl]

'fqName' @ [34:74] ==> public final val KtScript.fqName: FqName[MyPropertyDescriptor]

'asString' @ [34:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'dataStream' @ [38:9] ==> value-parameter dataStream: StubOutputStream defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.serialize[ValueParameterDescriptorImpl]

'writeName' @ [38:20] ==> public open fun writeName(@Nullable p0: String?): Unit defined in com.intellij.psi.stubs.StubOutputStream[JavaMethodDescriptor]

'stub' @ [38:30] ==> value-parameter stub: KotlinScriptStub defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.serialize[ValueParameterDescriptorImpl]

'getFqName' @ [38:35] ==> public abstract fun getFqName(): FqName defined in org.jetbrains.kotlin.psi.stubs.KotlinScriptStub[SimpleFunctionDescriptorImpl]

'asString' @ [38:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'dataStream' @ [42:22] ==> value-parameter dataStream: StubInputStream defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.deserialize[ValueParameterDescriptorImpl]

'readName' @ [42:33] ==> @Nullable public open fun readName(): StringRef? defined in com.intellij.psi.stubs.StubInputStream[JavaMethodDescriptor]

'KotlinScriptStubImpl' @ [43:16] ==> public constructor KotlinScriptStubImpl(parent: StubElement<out PsiElement>?, _fqName: StringRef?) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinScriptStubImpl[ClassConstructorDescriptorImpl]

'parentStub' @ [43:37] ==> value-parameter parentStub: StubElement<PsiElement> defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.deserialize[ValueParameterDescriptorImpl]

'fqName' @ [43:49] ==> val fqName: StringRef? defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.deserialize[LocalVariableDescriptor]

'StubIndexService' @ [48:9] ==> public companion object defined in org.jetbrains.kotlin.psi.stubs.elements.StubIndexService[FakeCallableDescriptorForObject]

'getInstance' @ [48:26] ==> @JvmStatic public final fun getInstance(): StubIndexService defined in org.jetbrains.kotlin.psi.stubs.elements.StubIndexService.Companion[SimpleFunctionDescriptorImpl]

'indexScript' @ [48:40] ==> public open fun indexScript(stub: KotlinScriptStub, sink: IndexSink): Unit defined in org.jetbrains.kotlin.psi.stubs.elements.StubIndexService[SimpleFunctionDescriptorImpl]

'stub' @ [48:52] ==> value-parameter stub: KotlinScriptStub defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.indexStub[ValueParameterDescriptorImpl]

'sink' @ [48:58] ==> value-parameter sink: IndexSink defined in org.jetbrains.kotlin.psi.stubs.elements.KtScriptElementType.indexStub[ValueParameterDescriptorImpl]

