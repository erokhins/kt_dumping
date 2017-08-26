'isAbstract' @ [29:26] ==> public open fun isAbstract(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [29:37] ==> public abstract val modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner[PropertyDescriptorImpl]

'isStatic' @ [32:26] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [32:35] ==> public abstract val modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner[PropertyDescriptorImpl]

'isFinal' @ [35:26] ==> public open fun isFinal(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [35:34] ==> public abstract val modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner[PropertyDescriptorImpl]

'modifiers' @ [38:17] ==> public abstract val modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner[PropertyDescriptorImpl]

'let' @ [38:27] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Visibility): Visibility defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Visibility

'when {
                Modifier.isPublic(modifiers) -> Visibilities.PUBLIC
                Modifier.isPrivate(modifiers) -> Visibilities.PRIVATE
                Modifier.isProtected(modifiers) ->
                    if (Modifier.isStatic(modifiers)) JavaVisibilities.PROTECTED_STATIC_VISIBILITY
                    else JavaVisibilities.PROTECTED_AND_PACKAGE
                else -> JavaVisibilities.PACKAGE_VISIBILITY
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Visibility, entry1: Visibility, entry2: Visibility, entry3: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Visibility

'isPublic' @ [40:26] ==> public open fun isPublic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [40:35] ==> value-parameter modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'PUBLIC' @ [40:62] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isPrivate' @ [41:26] ==> public open fun isPrivate(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [41:36] ==> value-parameter modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'PRIVATE' @ [41:63] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isProtected' @ [42:26] ==> public open fun isProtected(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [42:38] ==> value-parameter modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'if (Modifier.isStatic(modifiers)) JavaVisibilities.PROTECTED_STATIC_VISIBILITY
                    else JavaVisibilities.PROTECTED_AND_PACKAGE' @ [43:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'isStatic' @ [43:34] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [43:43] ==> value-parameter modifiers: Int defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaModifierListOwner.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'PROTECTED_STATIC_VISIBILITY' @ [43:72] ==> @NotNull public final val PROTECTED_STATIC_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PROTECTED_AND_PACKAGE' @ [44:43] ==> @NotNull public final val PROTECTED_AND_PACKAGE: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PACKAGE_VISIBILITY' @ [45:42] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

