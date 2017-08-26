'findLocalUsages' @ [32:11] ==> public abstract fun findLocalUsages(element: PsiElement, scope: PsiElement): Collection<PsiReference> defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'variable' @ [32:27] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.j2k.findVariableUsages[ValueParameterDescriptorImpl]

'scope' @ [32:37] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.j2k.findVariableUsages[ValueParameterDescriptorImpl]

'filterIsInstance' @ [32:44] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PsiReferenceExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PsiReferenceExpression

'findLocalUsages' @ [35:12] ==> public abstract fun findLocalUsages(element: PsiElement, scope: PsiElement): Collection<PsiReference> defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'method' @ [35:28] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.findMethodCalls[ValueParameterDescriptorImpl]

'scope' @ [35:36] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.j2k.findMethodCalls[ValueParameterDescriptorImpl]

'mapNotNull' @ [35:43] ==> public inline fun <T, R : Any> Iterable<PsiReference>.mapNotNull(transform: (PsiReference) -> PsiMethodCallExpression?): List<PsiMethodCallExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference
    <R : Any> -> PsiMethodCallExpression

'if (it is PsiReferenceExpression) {
            val methodCall = it.parent as? PsiMethodCallExpression
            if (methodCall?.methodExpression == it) methodCall else null
        }
        else {
            null
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiMethodCallExpression?, elseBranch: PsiMethodCallExpression?): PsiMethodCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiMethodCallExpression?

'it' @ [36:13] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.findMethodCalls.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [37:30] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.findMethodCalls.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [37:33] ==> public final val PsiReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (methodCall?.methodExpression == it) methodCall else null' @ [38:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiMethodCallExpression?, elseBranch: PsiMethodCallExpression?): PsiMethodCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiMethodCallExpression?

'methodCall' @ [38:17] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.findMethodCalls.<anonymous>[LocalVariableDescriptor]

'methodExpression' @ [38:29] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'it' @ [38:49] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.j2k.findMethodCalls.<anonymous>[ValueParameterDescriptorImpl]

'methodCall' @ [38:53] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.findMethodCalls.<anonymous>[LocalVariableDescriptor]

'hasModifierProperty' @ [47:9] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'FINAL' @ [47:41] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'!' @ [48:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasModifierProperty' @ [48:10] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'PRIVATE' @ [48:42] ==> public const final val PRIVATE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'containingClass' @ [49:27] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'searcher' @ [50:18] ==> value-parameter searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.isVar[ValueParameterDescriptorImpl]

'findVariableUsages' @ [50:27] ==> public fun ReferenceSearcher.findVariableUsages(variable: PsiVariable, scope: PsiElement): Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'this' @ [50:46] ==> <this> defined in org.jetbrains.kotlin.j2k.isVar[ReceiverParameterDescriptorImpl]

'containingClass' @ [50:52] ==> val containingClass: PsiClass defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'filter' @ [50:69] ==> public inline fun <T> Iterable<PsiReferenceExpression>.filter(predicate: (PsiReferenceExpression) -> Boolean): List<PsiReferenceExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression

'isAccessedForWriting' @ [50:86] ==> public open fun isAccessedForWriting(@NotNull p0: PsiExpression): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'it' @ [50:107] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.isVar.<anonymous>[ValueParameterDescriptorImpl]

'writes' @ [51:9] ==> val writes: List<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'size' @ [51:16] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'writes' @ [52:9] ==> val writes: List<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'size' @ [52:16] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'writes' @ [53:17] ==> val writes: List<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'single' @ [53:24] ==> public fun <T> List<PsiReferenceExpression>.single(): PsiReferenceExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression

'write' @ [54:18] ==> val write: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'parent' @ [54:24] ==> public final val PsiReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [55:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'parent' @ [56:12] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'operationSign' @ [56:19] ==> public final val PsiAssignmentExpression.operationSign: PsiJavaToken[MyPropertyDescriptor]

'tokenType' @ [56:33] ==> public final val PsiJavaToken.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'EQ' @ [56:60] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'write' @ [57:12] ==> val write: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'isQualifierEmptyOrThis' @ [57:18] ==> public fun PsiReferenceExpression.isQualifierEmptyOrThis(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'write' @ [59:27] ==> val write: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'getContainingConstructor' @ [59:33] ==> public fun PsiElement.getContainingConstructor(): PsiMethod? defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [60:16] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'constructor' @ [61:19] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'containingClass' @ [61:31] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'containingClass' @ [61:50] ==> val containingClass: PsiClass defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'!' @ [62:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [62:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'parent' @ [62:28] ==> public final val PsiAssignmentExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [63:19] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'parent' @ [63:26] ==> public final val PsiAssignmentExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [63:34] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'constructor' @ [63:44] ==> val constructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.isVar[LocalVariableDescriptor]

'body' @ [63:56] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'if (scope != null) searcher.findVariableUsages(this, scope).any { PsiUtil.isAccessedForWriting(it) } else false' @ [69:11] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'scope' @ [69:15] ==> value-parameter scope: PsiElement? defined in org.jetbrains.kotlin.j2k.hasWriteAccesses[ValueParameterDescriptorImpl]

'searcher' @ [69:30] ==> value-parameter searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.hasWriteAccesses[ValueParameterDescriptorImpl]

'findVariableUsages' @ [69:39] ==> public fun ReferenceSearcher.findVariableUsages(variable: PsiVariable, scope: PsiElement): Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'this' @ [69:58] ==> <this> defined in org.jetbrains.kotlin.j2k.hasWriteAccesses[ReceiverParameterDescriptorImpl]

'scope' @ [69:64] ==> value-parameter scope: PsiElement? defined in org.jetbrains.kotlin.j2k.hasWriteAccesses[ValueParameterDescriptorImpl]

'any' @ [69:71] ==> public inline fun <T> Iterable<PsiReferenceExpression>.any(predicate: (PsiReferenceExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression

'isAccessedForWriting' @ [69:85] ==> public open fun isAccessedForWriting(@NotNull p0: PsiExpression): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'it' @ [69:106] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.hasWriteAccesses.<anonymous>[ValueParameterDescriptorImpl]

'if (scope != null) searcher.findVariableUsages(this, scope).any {
        val parent = PsiTreeUtil.skipParentsOfType(it, PsiParenthesizedExpression::class.java)
        parent is PsiVariable && parent.initializer == it
    } else false' @ [72:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'scope' @ [72:16] ==> value-parameter scope: PsiElement? defined in org.jetbrains.kotlin.j2k.isInVariableInitializer[ValueParameterDescriptorImpl]

'searcher' @ [72:31] ==> value-parameter searcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.isInVariableInitializer[ValueParameterDescriptorImpl]

'findVariableUsages' @ [72:40] ==> public fun ReferenceSearcher.findVariableUsages(variable: PsiVariable, scope: PsiElement): Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'this' @ [72:59] ==> <this> defined in org.jetbrains.kotlin.j2k.isInVariableInitializer[ReceiverParameterDescriptorImpl]

'scope' @ [72:65] ==> value-parameter scope: PsiElement? defined in org.jetbrains.kotlin.j2k.isInVariableInitializer[ValueParameterDescriptorImpl]

'any' @ [72:72] ==> public inline fun <T> Iterable<PsiReferenceExpression>.any(predicate: (PsiReferenceExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression

'skipParentsOfType' @ [73:34] ==> @Nullable @Contract public open fun skipParentsOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'it' @ [73:52] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.isInVariableInitializer.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [73:90] ==> public val <T> KClass<PsiParenthesizedExpression>.java: Class<PsiParenthesizedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiParenthesizedExpression

'parent' @ [74:9] ==> val parent: PsiElement? defined in org.jetbrains.kotlin.j2k.isInVariableInitializer.<anonymous>[LocalVariableDescriptor]

'parent' @ [74:34] ==> val parent: PsiElement? defined in org.jetbrains.kotlin.j2k.isInVariableInitializer.<anonymous>[LocalVariableDescriptor]

'initializer' @ [74:41] ==> public final val PsiVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'it' @ [74:56] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.isInVariableInitializer.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [79:102] ==> public fun <T> emptyList(): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'emptyList' @ [83:15] ==> public fun <T> emptyList(): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

