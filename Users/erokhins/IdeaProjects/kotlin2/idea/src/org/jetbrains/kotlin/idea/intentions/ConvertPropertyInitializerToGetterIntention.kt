'SelfTargetingRangeIntention<KtProperty>' @ [30:53] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtProperty>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtProperty

'java' @ [30:111] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'element' @ [33:27] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applicabilityRange[ValueParameterDescriptorImpl]

'initializer' @ [33:35] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'if (initializer != null && element.getter == null && !element.isExtensionDeclaration() && !element.isLocal)
            initializer.textRange
        else
            null' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'initializer' @ [34:20] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applicabilityRange[LocalVariableDescriptor]

'element' @ [34:43] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applicabilityRange[ValueParameterDescriptorImpl]

'getter' @ [34:51] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'!' @ [34:69] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [34:70] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applicabilityRange[ValueParameterDescriptorImpl]

'isExtensionDeclaration' @ [34:78] ==> public fun PsiElement.isExtensionDeclaration(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [34:106] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [34:107] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applicabilityRange[ValueParameterDescriptorImpl]

'isLocal' @ [34:115] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'initializer' @ [35:13] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applicabilityRange[LocalVariableDescriptor]

'textRange' @ [35:25] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [42:16] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'super' @ [42:45] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention[LazyClassReceiverParameterDescriptor]

'allowCaretInsideElement' @ [42:51] ==> protected open fun allowCaretInsideElement(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedSimpleFunctionDescriptor]

'element' @ [42:75] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'convertPropertyInitializerToGetter' @ [46:9] ==> public final fun convertPropertyInitializerToGetter(property: KtProperty, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [46:44] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applyTo[ValueParameterDescriptorImpl]

'editor' @ [46:53] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.applyTo[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [49:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'ConvertPropertyInitializerToGetterIntention' @ [51:20] ==> public constructor ConvertPropertyInitializerToGetterIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention[ClassConstructorDescriptorImpl]

'SpecifyTypeExplicitlyIntention' @ [55:24] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'getTypeForDeclaration' @ [55:55] ==> public final fun getTypeForDeclaration(declaration: KtCallableDeclaration): KotlinType defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'property' @ [55:77] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'SpecifyTypeExplicitlyIntention' @ [56:13] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'addTypeAnnotation' @ [56:44] ==> public final fun addTypeAnnotation(editor: Editor?, declaration: KtCallableDeclaration, exprType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [56:62] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'property' @ [56:70] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'type' @ [56:80] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'property' @ [58:31] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'initializer' @ [58:40] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'KtPsiFactory' @ [59:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'property' @ [59:39] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'createPropertyGetter' @ [59:49] ==> public final fun createPropertyGetter(expression: KtExpression): KtPropertyAccessor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'initializer' @ [59:70] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'property' @ [60:26] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'setter' @ [60:35] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'if (setter != null) {
                property.addBefore(getter, setter)
            }
            else if (property.isVar) {
                property.add(getter)
                val notImplemented = KtPsiFactory(property).createExpression("TODO()")
                val notImplementedSetter = KtPsiFactory(property).createPropertySetter(notImplemented)
                property.add(notImplementedSetter)
            }
            else {
                property.add(getter)
            }' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'setter' @ [62:17] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'property' @ [63:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'addBefore' @ [63:26] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'getter' @ [63:36] ==> val getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'setter' @ [63:44] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'if (property.isVar) {
                property.add(getter)
                val notImplemented = KtPsiFactory(property).createExpression("TODO()")
                val notImplementedSetter = KtPsiFactory(property).createPropertySetter(notImplemented)
                property.add(notImplementedSetter)
            }
            else {
                property.add(getter)
            }' @ [65:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'property' @ [65:22] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'isVar' @ [65:31] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'property' @ [66:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'add' @ [66:26] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'getter' @ [66:30] ==> val getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'KtPsiFactory' @ [67:38] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'property' @ [67:51] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'createExpression' @ [67:61] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [68:44] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'property' @ [68:57] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'createPropertySetter' @ [68:67] ==> public final fun createPropertySetter(expression: KtExpression): KtPropertyAccessor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'notImplemented' @ [68:88] ==> val notImplemented: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'property' @ [69:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'add' @ [69:26] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'notImplementedSetter' @ [69:30] ==> val notImplementedSetter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'property' @ [72:17] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'add' @ [72:26] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'getter' @ [72:30] ==> val getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[LocalVariableDescriptor]

'property' @ [75:13] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.intentions.ConvertPropertyInitializerToGetterIntention.Companion.convertPropertyInitializerToGetter[ValueParameterDescriptorImpl]

'initializer' @ [75:22] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

