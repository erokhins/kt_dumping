'descriptor' @ [38:17] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'name' @ [38:29] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'psiElement' @ [38:38] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'name' @ [38:71] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'let' @ [38:77] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Name): Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'identifier' @ [38:88] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [38:99] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.<get-name>.<anonymous>[ValueParameterDescriptorImpl]

'if (descriptor != null)
                descriptor.importableFqName
            else
                (psiElement as? PsiClass)?.qualifiedName?.let(::FqName)' @ [42:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'descriptor' @ [42:24] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'descriptor' @ [43:17] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'importableFqName' @ [43:28] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'psiElement' @ [45:18] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'qualifiedName' @ [45:44] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'let' @ [45:59] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [45:65] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'super' @ [48:31] ==> <this> defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[LazyClassReceiverParameterDescriptor]

'toString' @ [48:37] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [48:57] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'psiElement' @ [48:71] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'if (descriptor != null)
            descriptor.original.hashCode()
        else
            psiElement!!.hashCode()' @ [51:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'descriptor' @ [51:20] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'descriptor' @ [52:13] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'original' @ [52:24] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'hashCode' @ [52:33] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [54:13] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'hashCode' @ [54:26] ==> public open fun hashCode(): Int defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'this' @ [58:13] ==> <this> defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[LazyClassReceiverParameterDescriptor]

'other' @ [58:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[ValueParameterDescriptorImpl]

'other' @ [59:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[ValueParameterDescriptorImpl]

'this' @ [59:30] ==> <this> defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[LazyClassReceiverParameterDescriptor]

'java' @ [59:42] ==> public val <T> KClass<out DeclarationLookupObjectImpl>.java: Class<out DeclarationLookupObjectImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out DeclarationLookupObjectImpl)

'other' @ [59:50] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[ValueParameterDescriptorImpl]

'java' @ [59:63] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'other' @ [60:28] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[ValueParameterDescriptorImpl]

'if (descriptor != null)
            descriptorsEqualWithSubstitution(descriptor, lookupObject.descriptor)
        else
            lookupObject.descriptor == null && psiElement == lookupObject.psiElement' @ [61:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'descriptor' @ [61:20] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'descriptorsEqualWithSubstitution' @ [62:13] ==> public fun descriptorsEqualWithSubstitution(descriptor1: DeclarationDescriptor?, descriptor2: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [62:46] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'lookupObject' @ [62:58] ==> val lookupObject: DeclarationLookupObjectImpl defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[LocalVariableDescriptor]

'descriptor' @ [62:71] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'lookupObject' @ [64:13] ==> val lookupObject: DeclarationLookupObjectImpl defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[LocalVariableDescriptor]

'descriptor' @ [64:26] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'psiElement' @ [64:48] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'lookupObject' @ [64:62] ==> val lookupObject: DeclarationLookupObjectImpl defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl.equals[LocalVariableDescriptor]

'psiElement' @ [64:75] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'if (descriptor != null)
                KotlinBuiltIns.isDeprecated(descriptor)
            else
                (psiElement as? PsiDocCommentOwner)?.isDeprecated == true' @ [69:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'descriptor' @ [69:24] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'isDeprecated' @ [70:32] ==> public open fun isDeprecated(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'descriptor' @ [70:45] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[PropertyDescriptorImpl]

'==' @ [72:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [72:18] ==> public abstract val psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.completion.DeclarationLookupObjectImpl[DeserializedPropertyDescriptor]

'isDeprecated' @ [72:54] ==> public final val PsiDocCommentOwner.isDeprecated: Boolean[MyPropertyDescriptor]

