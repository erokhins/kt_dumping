'AbstractKotlinInspection' @ [32:37] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [34:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'element' @ [36:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'node' @ [36:29] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [36:35] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [36:59] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [38:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'text' @ [38:36] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'!' @ [40:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'text' @ [40:22] ==> val text: (String..String?) defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'startsWith' @ [40:27] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [40:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'text' @ [40:47] ==> val text: (String..String?) defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'endsWith' @ [40:52] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'unquoteIdentifier' @ [42:46] ==> @NotNull public open fun unquoteIdentifier(@NotNull p0: String): String defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'text' @ [42:64] ==> val text: (String..String?) defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'unquotedName' @ [44:21] ==> val unquotedName: String defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'isEmpty' @ [44:34] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [46:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'unquotedName' @ [46:22] ==> val unquotedName: String defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[LocalVariableDescriptor]

'all' @ [46:35] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isValidDalvikCharacter' @ [46:41] ==> private final fun isValidDalvikCharacter(c: Char): Boolean defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [46:64] ==> value-parameter it: Char defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'checkAndroidFacet' @ [46:73] ==> private final fun checkAndroidFacet(element: PsiElement): Boolean defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'element' @ [46:91] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'holder' @ [47:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [47:28] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'element' @ [47:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'GENERIC_ERROR' @ [49:65] ==> enum entry GENERIC_ERROR defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'RenameIdentifierFix' @ [50:44] ==> public constructor RenameIdentifierFix() defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix[ClassConstructorDescriptorImpl]

'element' @ [55:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.checkAndroidFacet[ValueParameterDescriptorImpl]

'getAndroidFacetForFile' @ [55:32] ==> internal fun PsiElement.getAndroidFacetForFile(): AndroidFacet? defined in org.jetbrains.kotlin.android in file AndroidUtil.kt[SimpleFunctionDescriptorImpl]

'getApplication' @ [55:87] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [55:104] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'when (c) {
                in 'A'..'Z' -> true
                in 'a'..'z' -> true
                in '0'..'9' -> true
                '$', '-', '_' -> true
                in '\u00a1' .. '\u1fff' -> true
                in '\u2010' .. '\u2027' -> true
                in '\u2030' .. '\ud7ff' -> true
                in '\ue000' .. '\uffef' -> true
                else -> false
            }' @ [59:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean, entry7: Boolean, entry8: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'c' @ [59:65] ==> value-parameter c: Char defined in org.jetbrains.kotlin.android.inspection.IllegalIdentifierInspection.buildVisitor.<no name provided>.isValidDalvikCharacter[ValueParameterDescriptorImpl]

'in' @ [60:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [60:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [61:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [61:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [62:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [62:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [64:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [64:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [65:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [65:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [66:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [66:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'in' @ [67:17] ==> public open fun contains(value: Char): Boolean defined in kotlin.ranges.CharRange[DeserializedSimpleFunctionDescriptor]

'..' @ [67:20] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

