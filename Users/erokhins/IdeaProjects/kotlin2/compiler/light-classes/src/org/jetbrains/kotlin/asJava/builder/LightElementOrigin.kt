'element' @ [41:27] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'when (originalElement) {
        is KtAnnotationEntry -> DefaultLightElementOrigin(originalElement)
        is KtDeclaration -> LightMemberOriginForDeclaration(originalElement, originKind)
        else -> LightElementOrigin.None
    }' @ [42:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LightElementOrigin, entry1: LightElementOrigin, entry2: LightElementOrigin): LightElementOrigin[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LightElementOrigin

'originalElement' @ [42:18] ==> val originalElement: PsiElement? defined in org.jetbrains.kotlin.asJava.builder.toLightMemberOrigin[LocalVariableDescriptor]

'DefaultLightElementOrigin' @ [43:33] ==> public constructor DefaultLightElementOrigin(originalElement: PsiElement?) defined in org.jetbrains.kotlin.asJava.builder.DefaultLightElementOrigin[ClassConstructorDescriptorImpl]

'originalElement' @ [43:59] ==> val originalElement: PsiElement? defined in org.jetbrains.kotlin.asJava.builder.toLightMemberOrigin[LocalVariableDescriptor]

'LightMemberOriginForDeclaration' @ [44:29] ==> public constructor LightMemberOriginForDeclaration(originalElement: KtDeclaration, originKind: JvmDeclarationOriginKind) defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[ClassConstructorDescriptorImpl]

'originalElement' @ [44:61] ==> val originalElement: PsiElement? defined in org.jetbrains.kotlin.asJava.builder.toLightMemberOrigin[LocalVariableDescriptor]

'originKind' @ [44:78] ==> public final val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'None' @ [45:36] ==> public object None : LightElementOrigin defined in org.jetbrains.kotlin.asJava.builder.LightElementOrigin[FakeCallableDescriptorForObject]

'other' @ [59:13] ==> value-parameter other: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration.isEquivalentTo[ValueParameterDescriptorImpl]

'originalElement' @ [60:16] ==> public open val originalElement: KtDeclaration defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'isEquivalentTo' @ [60:32] ==> @Contract public abstract fun isEquivalentTo(p0: (PsiElement..PsiElement?)): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'other' @ [60:47] ==> value-parameter other: LightMemberOrigin? defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration.isEquivalentTo[ValueParameterDescriptorImpl]

'originalElement' @ [60:53] ==> public open val originalElement: KtDeclaration defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'LightMemberOriginForDeclaration' @ [64:16] ==> public constructor LightMemberOriginForDeclaration(originalElement: KtDeclaration, originKind: JvmDeclarationOriginKind) defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[ClassConstructorDescriptorImpl]

'originalElement' @ [64:48] ==> public open val originalElement: KtDeclaration defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'copy' @ [64:64] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'originKind' @ [64:89] ==> public open val originKind: JvmDeclarationOriginKind defined in org.jetbrains.kotlin.asJava.builder.LightMemberOriginForDeclaration[PropertyDescriptorImpl]

'if (this != null) DefaultLightElementOrigin(this) else LightElementOrigin.None' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LightElementOrigin, elseBranch: LightElementOrigin): LightElementOrigin[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LightElementOrigin

'this' @ [73:16] ==> <this> defined in org.jetbrains.kotlin.asJava.builder.toLightClassOrigin[ReceiverParameterDescriptorImpl]

'DefaultLightElementOrigin' @ [73:30] ==> public constructor DefaultLightElementOrigin(originalElement: PsiElement?) defined in org.jetbrains.kotlin.asJava.builder.DefaultLightElementOrigin[ClassConstructorDescriptorImpl]

'this' @ [73:56] ==> <this> defined in org.jetbrains.kotlin.asJava.builder.toLightClassOrigin[ReceiverParameterDescriptorImpl]

'None' @ [73:86] ==> public object None : LightElementOrigin defined in org.jetbrains.kotlin.asJava.builder.LightElementOrigin[FakeCallableDescriptorForObject]

