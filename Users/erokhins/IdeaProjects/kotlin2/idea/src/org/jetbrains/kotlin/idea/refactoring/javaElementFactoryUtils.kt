'references' @ [28:20] ==> value-parameter references: Array<PsiJavaCodeReferenceElement> defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[ValueParameterDescriptorImpl]

'map' @ [28:31] ==> public inline fun <T, R> Array<out PsiJavaCodeReferenceElement>.map(transform: (PsiJavaCodeReferenceElement) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiJavaCodeReferenceElement
    <R> -> String

'it' @ [28:37] ==> value-parameter it: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole.<anonymous>[ValueParameterDescriptorImpl]

'canonicalText' @ [28:40] ==> public final val PsiJavaCodeReferenceElement.canonicalText: String[MyPropertyDescriptor]

'if (refsText.isNotEmpty()) refsText.joinToString() else return null' @ [29:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'refsText' @ [29:27] ==> val refsText: List<String> defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[LocalVariableDescriptor]

'isNotEmpty' @ [29:36] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'refsText' @ [29:50] ==> val refsText: List<String> defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[LocalVariableDescriptor]

'joinToString' @ [29:59] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'when (role) {
        Role.THROWS_LIST -> createMethodFromText("void foo() throws $refListText {}", null).throwsList
        Role.EXTENDS_LIST -> createClassFromText("class Foo extends $refListText {}", null).innerClasses[0].extendsList
        Role.IMPLEMENTS_LIST -> createClassFromText("class Foo implements $refListText {}", null).innerClasses[0].implementsList
        Role.EXTENDS_BOUNDS_LIST -> createTypeParameterFromText("T extends $refListText", null).extendsList
        else -> throw UnsupportedOperationException("Unsupported role $role")
    }' @ [30:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiReferenceList?, entry1: PsiReferenceList?, entry2: PsiReferenceList?, entry3: PsiReferenceList?, entry4: PsiReferenceList?): PsiReferenceList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiReferenceList?

'role' @ [30:18] ==> value-parameter role: PsiReferenceList.Role defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[ValueParameterDescriptorImpl]

'THROWS_LIST' @ [31:14] ==> enum entry THROWS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'createMethodFromText' @ [31:29] ==> @NotNull public abstract fun createMethodFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiMethod defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'refListText' @ [31:70] ==> val refListText: String defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[LocalVariableDescriptor]

'throwsList' @ [31:93] ==> public final val PsiMethod.throwsList: PsiReferenceList[MyPropertyDescriptor]

'EXTENDS_LIST' @ [32:14] ==> enum entry EXTENDS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'createClassFromText' @ [32:30] ==> @NotNull public abstract fun createClassFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'refListText' @ [32:70] ==> val refListText: String defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[LocalVariableDescriptor]

'innerClasses' @ [32:93] ==> public final val PsiClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'extendsList' @ [32:109] ==> public final val PsiClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'IMPLEMENTS_LIST' @ [33:14] ==> enum entry IMPLEMENTS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'createClassFromText' @ [33:33] ==> @NotNull public abstract fun createClassFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'refListText' @ [33:76] ==> val refListText: String defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[LocalVariableDescriptor]

'innerClasses' @ [33:99] ==> public final val PsiClass.innerClasses: (Array<(PsiClass..PsiClass?)>..Array<out (PsiClass..PsiClass?)>)[MyPropertyDescriptor]

'implementsList' @ [33:115] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'EXTENDS_BOUNDS_LIST' @ [34:14] ==> enum entry EXTENDS_BOUNDS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'createTypeParameterFromText' @ [34:37] ==> @NotNull public abstract fun createTypeParameterFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiTypeParameter defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'refListText' @ [34:77] ==> val refListText: String defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[LocalVariableDescriptor]

'extendsList' @ [34:97] ==> public final val PsiTypeParameter.extendsList: PsiReferenceList[MyPropertyDescriptor]

'UnsupportedOperationException' @ [35:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'role' @ [35:72] ==> value-parameter role: PsiReferenceList.Role defined in org.jetbrains.kotlin.idea.refactoring.createReferenceListWithRole[ValueParameterDescriptorImpl]

