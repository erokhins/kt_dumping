'if (inCode) "<code>$s</code>" else s' @ [34:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'inCode' @ [34:50] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.wrapOrSkip[ValueParameterDescriptorImpl]

's' @ [34:66] ==> value-parameter s: String defined in org.jetbrains.kotlin.idea.refactoring.wrapOrSkip[ValueParameterDescriptorImpl]

's' @ [34:81] ==> value-parameter s: String defined in org.jetbrains.kotlin.idea.refactoring.wrapOrSkip[ValueParameterDescriptorImpl]

'IdeDescriptorRenderers' @ [36:69] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [36:92] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [36:125] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [36:132] ==> value-parameter classDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.formatClassDescriptor[ValueParameterDescriptorImpl]

'if (psiClass.isInterface) "interface " else "class "' @ [45:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'psiClass' @ [45:20] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[ValueParameterDescriptorImpl]

'isInterface' @ [45:29] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'description' @ [46:5] ==> var description: String defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[LocalVariableDescriptor]

'kind' @ [46:19] ==> val kind: String defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[LocalVariableDescriptor]

'formatClass' @ [46:40] ==> @NotNull public open fun formatClass(@NotNull p0: PsiClass, @PsiFormatUtil.FormatClassOptions p1: Int): String defined in com.intellij.psi.util.PsiFormatUtil[JavaMethodDescriptor]

'psiClass' @ [47:13] ==> value-parameter psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[ValueParameterDescriptorImpl]

'or' @ [48:13] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SHOW_CONTAINING_CLASS' @ [48:31] ==> public const final val SHOW_CONTAINING_CLASS: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'SHOW_NAME' @ [48:74] ==> public const final val SHOW_NAME: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'SHOW_PARAMETERS' @ [48:105] ==> public const final val SHOW_PARAMETERS: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'SHOW_TYPE' @ [48:142] ==> public const final val SHOW_TYPE: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'description' @ [50:5] ==> var description: String defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[LocalVariableDescriptor]

'wrapOrSkip' @ [50:19] ==> public fun wrapOrSkip(s: String, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'description' @ [50:30] ==> var description: String defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[LocalVariableDescriptor]

'inCode' @ [50:43] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[ValueParameterDescriptorImpl]

'if (markAsJava) "[Java] $description" else description' @ [52:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'markAsJava' @ [52:16] ==> value-parameter markAsJava: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[ValueParameterDescriptorImpl]

'description' @ [52:37] ==> var description: String defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[LocalVariableDescriptor]

'description' @ [52:55] ==> var description: String defined in org.jetbrains.kotlin.idea.refactoring.formatPsiClass[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [56:19] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [56:43] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [56:67] ==> value-parameter classDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.formatClass[ValueParameterDescriptorImpl]

'if (element is PsiClass) {
        formatPsiClass(element, false, inCode)
    }
    else {
        wrapOrSkip(formatClassDescriptor(classDescriptor), inCode)
    }' @ [57:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [57:16] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.formatClass[LocalVariableDescriptor]

'formatPsiClass' @ [58:9] ==> public fun formatPsiClass(psiClass: PsiClass, markAsJava: Boolean, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [58:24] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.formatClass[LocalVariableDescriptor]

'inCode' @ [58:40] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatClass[ValueParameterDescriptorImpl]

'wrapOrSkip' @ [61:9] ==> public fun wrapOrSkip(s: String, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'formatClassDescriptor' @ [61:20] ==> public fun formatClassDescriptor(classDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [61:42] ==> value-parameter classDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.formatClass[ValueParameterDescriptorImpl]

'inCode' @ [61:60] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatClass[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [66:19] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [66:43] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [66:67] ==> value-parameter functionDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.formatFunction[ValueParameterDescriptorImpl]

'if (element is PsiMethod) {
        formatPsiMethod(element, false, inCode)
    }
    else {
        wrapOrSkip(formatFunctionDescriptor(functionDescriptor), inCode)
    }' @ [67:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [67:16] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.formatFunction[LocalVariableDescriptor]

'formatPsiMethod' @ [68:9] ==> public fun formatPsiMethod(psiMethod: PsiMethod, showContainingClass: Boolean, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [68:25] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.formatFunction[LocalVariableDescriptor]

'inCode' @ [68:41] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatFunction[ValueParameterDescriptorImpl]

'wrapOrSkip' @ [71:9] ==> public fun wrapOrSkip(s: String, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'formatFunctionDescriptor' @ [71:20] ==> private fun formatFunctionDescriptor(functionDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [71:45] ==> value-parameter functionDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.formatFunction[ValueParameterDescriptorImpl]

'inCode' @ [71:66] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatFunction[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [75:83] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'COMPACT' @ [75:102] ==> @field:JvmField public final val COMPACT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [75:110] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [75:117] ==> value-parameter functionDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.formatFunctionDescriptor[ValueParameterDescriptorImpl]

'or' @ [82:19] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SHOW_NAME' @ [82:37] ==> public const final val SHOW_NAME: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'SHOW_PARAMETERS' @ [82:68] ==> public const final val SHOW_PARAMETERS: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'SHOW_TYPE' @ [82:105] ==> public const final val SHOW_TYPE: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'showContainingClass' @ [83:9] ==> value-parameter showContainingClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[ValueParameterDescriptorImpl]

'options' @ [85:9] ==> var options: Int defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[LocalVariableDescriptor]

'options' @ [85:19] ==> var options: Int defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[LocalVariableDescriptor]

'SHOW_CONTAINING_CLASS' @ [85:48] ==> public const final val SHOW_CONTAINING_CLASS: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'formatMethod' @ [88:37] ==> public open fun formatMethod(@NotNull p0: PsiMethod, @NotNull p1: PsiSubstitutor, @PsiFormatUtil.FormatMethodOptions p2: Int, @PsiFormatUtil.FormatVariableOptions p3: Int): (String..String?) defined in com.intellij.psi.util.PsiFormatUtil[JavaMethodDescriptor]

'psiMethod' @ [88:50] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[ValueParameterDescriptorImpl]

'EMPTY' @ [88:76] ==> @NotNull public final val EMPTY: PsiSubstitutor defined in com.intellij.psi.PsiSubstitutor[JavaPropertyDescriptor]

'options' @ [88:83] ==> var options: Int defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[LocalVariableDescriptor]

'SHOW_TYPE' @ [88:110] ==> public const final val SHOW_TYPE: Int defined in com.intellij.psi.util.PsiFormatUtilBase[JavaPropertyDescriptor]

'description' @ [89:5] ==> var description: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[LocalVariableDescriptor]

'wrapOrSkip' @ [89:19] ==> public fun wrapOrSkip(s: String, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'description' @ [89:30] ==> var description: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[LocalVariableDescriptor]

'inCode' @ [89:43] ==> value-parameter inCode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[ValueParameterDescriptorImpl]

'description' @ [91:21] ==> var description: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.formatPsiMethod[LocalVariableDescriptor]

'method' @ [95:31] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.formatJavaOrLightMethod[ValueParameterDescriptorImpl]

'unwrapped' @ [95:38] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'if (originalDeclaration is KtDeclaration) {
        formatFunctionDescriptor(originalDeclaration.resolveToDescriptor())
    }
    else {
        formatPsiMethod(method, false, false)
    }' @ [96:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'originalDeclaration' @ [96:16] ==> val originalDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.formatJavaOrLightMethod[LocalVariableDescriptor]

'formatFunctionDescriptor' @ [97:9] ==> private fun formatFunctionDescriptor(functionDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'originalDeclaration' @ [97:34] ==> val originalDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.formatJavaOrLightMethod[LocalVariableDescriptor]

'resolveToDescriptor' @ [97:54] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'formatPsiMethod' @ [100:9] ==> public fun formatPsiMethod(psiMethod: PsiMethod, showContainingClass: Boolean, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'method' @ [100:25] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.formatJavaOrLightMethod[ValueParameterDescriptorImpl]

'formatClassDescriptor' @ [104:51] ==> public fun formatClassDescriptor(classDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'classOrObject' @ [104:73] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.formatClass[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [104:87] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

