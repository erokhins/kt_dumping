'KtStubElementType<KotlinAnnotationUseSiteTargetStub, KtAnnotationUseSiteTarget>' @ [28:65] ==> public constructor KtStubElementType<StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)>(@NotNull @NonNls debugName: String, @NotNull psiClass: Class<(KtAnnotationUseSiteTarget..KtAnnotationUseSiteTarget?)>, @NotNull stubClass: Class<*>) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementType[JavaClassConstructorDescriptor]
Inferred types:
    <StubT : raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?)> -> KotlinAnnotationUseSiteTargetStub
    <PsiT : (KtElementImplStub<*>..KtElementImplStub<*>?)> -> KtAnnotationUseSiteTarget

'debugName' @ [29:9] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.<init>[ValueParameterDescriptorImpl]

'java' @ [29:53] ==> public val <T> KClass<KtAnnotationUseSiteTarget>.java: Class<KtAnnotationUseSiteTarget> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotationUseSiteTarget

'java' @ [29:100] ==> public val <T> KClass<KotlinAnnotationUseSiteTargetStub>.java: Class<KotlinAnnotationUseSiteTargetStub> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinAnnotationUseSiteTargetStub

'psi' @ [33:29] ==> value-parameter psi: KtAnnotationUseSiteTarget defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.createStub[ValueParameterDescriptorImpl]

'getAnnotationUseSiteTarget' @ [33:33] ==> public final fun getAnnotationUseSiteTarget(): AnnotationUseSiteTarget defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]

'name' @ [33:62] ==> public final val name: String defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[DeserializedPropertyDescriptor]

'KotlinAnnotationUseSiteTargetStubImpl' @ [34:16] ==> public constructor KotlinAnnotationUseSiteTargetStubImpl(parent: StubElement<out PsiElement>?, target: StringRef) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinAnnotationUseSiteTargetStubImpl[ClassConstructorDescriptorImpl]

'parentStub' @ [34:54] ==> value-parameter parentStub: StubElement<PsiElement> defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.createStub[ValueParameterDescriptorImpl]

'!!' @ [34:66] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: StringRef?): StringRef[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> StringRef

'fromString' @ [34:76] ==> @Contract public open fun fromString(@Nullable p0: String?): (StringRef..StringRef?) defined in com.intellij.util.io.StringRef[JavaMethodDescriptor]

'useSiteTarget' @ [34:87] ==> val useSiteTarget: String defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.createStub[LocalVariableDescriptor]

'dataStream' @ [38:9] ==> value-parameter dataStream: StubOutputStream defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.serialize[ValueParameterDescriptorImpl]

'writeName' @ [38:20] ==> public open fun writeName(@Nullable p0: String?): Unit defined in com.intellij.psi.stubs.StubOutputStream[JavaMethodDescriptor]

'stub' @ [38:30] ==> value-parameter stub: KotlinAnnotationUseSiteTargetStub defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.serialize[ValueParameterDescriptorImpl]

'getUseSiteTarget' @ [38:35] ==> public abstract fun getUseSiteTarget(): String defined in org.jetbrains.kotlin.psi.stubs.KotlinAnnotationUseSiteTargetStub[SimpleFunctionDescriptorImpl]

'dataStream' @ [42:29] ==> value-parameter dataStream: StubInputStream defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.deserialize[ValueParameterDescriptorImpl]

'readName' @ [42:40] ==> @Nullable public open fun readName(): StringRef? defined in com.intellij.psi.stubs.StubInputStream[JavaMethodDescriptor]

'KotlinAnnotationUseSiteTargetStubImpl' @ [43:16] ==> public constructor KotlinAnnotationUseSiteTargetStubImpl(parent: StubElement<out PsiElement>?, target: StringRef) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinAnnotationUseSiteTargetStubImpl[ClassConstructorDescriptorImpl]

'parentStub' @ [43:54] ==> value-parameter parentStub: StubElement<PsiElement> defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.deserialize[ValueParameterDescriptorImpl]

'useSiteTarget' @ [43:66] ==> val useSiteTarget: StringRef? defined in org.jetbrains.kotlin.psi.stubs.elements.KtAnnotationUseSiteTargetElementType.deserialize[LocalVariableDescriptor]

