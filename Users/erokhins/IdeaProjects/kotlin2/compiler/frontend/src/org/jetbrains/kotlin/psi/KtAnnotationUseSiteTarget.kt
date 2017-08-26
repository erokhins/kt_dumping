'super' @ [27:34] ==> public constructor KtElementImplStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtElementImplStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinAnnotationUseSiteTargetStub

'node' @ [27:40] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.<init>[ValueParameterDescriptorImpl]

'super' @ [29:60] ==> public constructor KtElementImplStub<T : (StubElement<*>..StubElement<*>?)>(@NotNull stub: KotlinAnnotationUseSiteTargetStub, @NotNull nodeType: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>)) defined in org.jetbrains.kotlin.psi.KtElementImplStub[JavaClassConstructorDescriptor]
Inferred types:
    <T : (StubElement<*>..StubElement<*>?)> -> KotlinAnnotationUseSiteTargetStub

'stub' @ [29:66] ==> value-parameter stub: KotlinAnnotationUseSiteTargetStub defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.<init>[ValueParameterDescriptorImpl]

'ANNOTATION_TARGET' @ [29:91] ==> public final val ANNOTATION_TARGET: (KtAnnotationUseSiteTargetElementType..KtAnnotationUseSiteTargetElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'visitor' @ [31:69] ==> value-parameter visitor: KtVisitor<R, D> defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.accept[ValueParameterDescriptorImpl]

'visitAnnotationUseSiteTarget' @ [31:77] ==> public open fun visitAnnotationUseSiteTarget(@NotNull annotationTarget: KtAnnotationUseSiteTarget, data: (D..D?)): (R..R?) defined in org.jetbrains.kotlin.psi.KtVisitor[JavaMethodDescriptor]

'this' @ [31:106] ==> <this> defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget[LazyClassReceiverParameterDescriptor]

'data' @ [31:112] ==> value-parameter data: D defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.accept[ValueParameterDescriptorImpl]

'stub' @ [34:28] ==> public final val KtAnnotationUseSiteTarget.stub: KotlinAnnotationUseSiteTargetStub?[MyPropertyDescriptor]

'getUseSiteTarget' @ [34:34] ==> public abstract fun getUseSiteTarget(): String defined in org.jetbrains.kotlin.psi.stubs.KotlinAnnotationUseSiteTargetStub[SimpleFunctionDescriptorImpl]

'targetString' @ [35:13] ==> val targetString: String? defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.getAnnotationUseSiteTarget[LocalVariableDescriptor]

'AnnotationUseSiteTarget' @ [37:24] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'valueOf' @ [37:48] ==> public final fun valueOf(value: String): AnnotationUseSiteTarget defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]

'targetString' @ [37:56] ==> val targetString: String? defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.getAnnotationUseSiteTarget[LocalVariableDescriptor]

'firstChild' @ [43:20] ==> public final val KtAnnotationUseSiteTarget.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [43:31] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'when (node.elementType) {
            KtTokens.FIELD_KEYWORD -> AnnotationUseSiteTarget.FIELD
            KtTokens.FILE_KEYWORD -> AnnotationUseSiteTarget.FILE
            KtTokens.PROPERTY_KEYWORD -> AnnotationUseSiteTarget.PROPERTY
            KtTokens.GET_KEYWORD -> AnnotationUseSiteTarget.PROPERTY_GETTER
            KtTokens.SET_KEYWORD -> AnnotationUseSiteTarget.PROPERTY_SETTER
            KtTokens.RECEIVER_KEYWORD -> AnnotationUseSiteTarget.RECEIVER
            KtTokens.PARAM_KEYWORD -> AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER
            KtTokens.SETPARAM_KEYWORD -> AnnotationUseSiteTarget.SETTER_PARAMETER
            KtTokens.DELEGATE_KEYWORD -> AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD
            else -> throw IllegalStateException("Unknown annotation target " + node.text)
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AnnotationUseSiteTarget, entry1: AnnotationUseSiteTarget, entry2: AnnotationUseSiteTarget, entry3: AnnotationUseSiteTarget, entry4: AnnotationUseSiteTarget, entry5: AnnotationUseSiteTarget, entry6: AnnotationUseSiteTarget, entry7: AnnotationUseSiteTarget, entry8: AnnotationUseSiteTarget, entry9: AnnotationUseSiteTarget): AnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AnnotationUseSiteTarget

'node' @ [44:22] ==> val node: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.getAnnotationUseSiteTarget[LocalVariableDescriptor]

'elementType' @ [44:27] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'FIELD_KEYWORD' @ [45:22] ==> public final val FIELD_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FIELD' @ [45:63] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FILE_KEYWORD' @ [46:22] ==> public final val FILE_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FILE' @ [46:62] ==> enum entry FILE defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_KEYWORD' @ [47:22] ==> public final val PROPERTY_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROPERTY' @ [47:66] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'GET_KEYWORD' @ [48:22] ==> public final val GET_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROPERTY_GETTER' @ [48:61] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'SET_KEYWORD' @ [49:22] ==> public final val SET_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROPERTY_SETTER' @ [49:61] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'RECEIVER_KEYWORD' @ [50:22] ==> public final val RECEIVER_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'RECEIVER' @ [50:66] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PARAM_KEYWORD' @ [51:22] ==> public final val PARAM_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'CONSTRUCTOR_PARAMETER' @ [51:63] ==> enum entry CONSTRUCTOR_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'SETPARAM_KEYWORD' @ [52:22] ==> public final val SETPARAM_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SETTER_PARAMETER' @ [52:66] ==> enum entry SETTER_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'DELEGATE_KEYWORD' @ [53:22] ==> public final val DELEGATE_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PROPERTY_DELEGATE_FIELD' @ [53:66] ==> enum entry PROPERTY_DELEGATE_FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'IllegalStateException' @ [54:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [54:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [54:80] ==> val node: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.psi.KtAnnotationUseSiteTarget.getAnnotationUseSiteTarget[LocalVariableDescriptor]

'text' @ [54:85] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

