'element' @ [27:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[ValueParameterDescriptorImpl]

'getParentOfType' @ [31:36] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtPropertyAccessor..KtPropertyAccessor?)>): KtPropertyAccessor? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'element' @ [31:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[ValueParameterDescriptorImpl]

'java' @ [31:87] ==> public val <T> KClass<KtPropertyAccessor>.java: Class<KtPropertyAccessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPropertyAccessor

'accessor' @ [32:13] ==> val accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'accessor' @ [32:33] ==> val accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'isGetter' @ [32:42] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'accessor' @ [33:24] ==> val accessor: KtPropertyAccessor? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'bodyExpression' @ [33:33] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'when (body) {
                // val a: Int get() { return field }
                is KtBlockExpression -> {
                    val returnedExpression = (body.statements.singleOrNull() as? KtReturnExpression)?.returnedExpression ?: return false
                    returnedExpression.textMatches("field")
                }
                // val a: Int get() = field
                is KtExpression -> body.textMatches("field")
                else -> false
            }' @ [34:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'body' @ [34:26] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'?:' @ [37:46] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'body' @ [37:47] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'statements' @ [37:52] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [37:63] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'returnedExpression' @ [37:103] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'returnedExpression' @ [38:21] ==> val returnedExpression: KtExpression defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'textMatches' @ [38:40] ==> @Contract public abstract fun textMatches(@NotNull @NonNls p0: CharSequence): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'body' @ [41:36] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'textMatches' @ [41:41] ==> @Contract public abstract fun textMatches(@NotNull @NonNls p0: CharSequence): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'getParentOfType' @ [46:36] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtProperty..KtProperty?)>): KtProperty? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'element' @ [46:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[ValueParameterDescriptorImpl]

'java' @ [46:79] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'property' @ [48:13] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'property' @ [49:20] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'getter' @ [49:29] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'!' @ [49:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [49:48] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.debugger.stepping.KotlinSimpleGetterProvider.isInsideSimpleGetter[LocalVariableDescriptor]

'isLocal' @ [49:57] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

