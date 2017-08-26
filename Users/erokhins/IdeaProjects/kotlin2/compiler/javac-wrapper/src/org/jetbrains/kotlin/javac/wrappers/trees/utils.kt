'in' @ [28:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ABSTRACT' @ [28:22] ==> enum entry ABSTRACT defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'getFlags' @ [28:34] ==> public open fun getFlags(): (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaMethodDescriptor]

'in' @ [31:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'FINAL' @ [31:22] ==> enum entry FINAL defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'getFlags' @ [31:31] ==> public open fun getFlags(): (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaMethodDescriptor]

'in' @ [34:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'STATIC' @ [34:22] ==> enum entry STATIC defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'getFlags' @ [34:32] ==> public open fun getFlags(): (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaMethodDescriptor]

'in' @ [37:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [37:22] ==> enum entry DEFAULT defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'getFlags' @ [37:33] ==> public open fun getFlags(): (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaMethodDescriptor]

'getFlags' @ [40:13] ==> public open fun getFlags(): (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaMethodDescriptor]

'let' @ [40:24] ==> @InlineOnly public inline fun <T, R> (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?).let(block: ((MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)) -> Visibility): Visibility defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableSet<(javax.lang.model.element.Modifier..javax.lang.model.element.Modifier?)>..kotlin.collections.Set<(javax.lang.model.element.Modifier..javax.lang.model.element.Modifier?)>?)
    <R> -> Visibility

'when {
            Modifier.PUBLIC in it -> Visibilities.PUBLIC
            Modifier.PRIVATE in it -> Visibilities.PRIVATE
            Modifier.PROTECTED in it -> {
                if (Modifier.STATIC in it) JavaVisibilities.PROTECTED_STATIC_VISIBILITY
                else JavaVisibilities.PROTECTED_AND_PACKAGE
            }
            else -> JavaVisibilities.PACKAGE_VISIBILITY
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Visibility, entry1: Visibility, entry2: Visibility, entry3: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Visibility

'in' @ [42:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'PUBLIC' @ [42:22] ==> enum entry PUBLIC defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'it' @ [42:32] ==> value-parameter it: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in org.jetbrains.kotlin.javac.wrappers.trees.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'PUBLIC' @ [42:51] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'in' @ [43:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'PRIVATE' @ [43:22] ==> enum entry PRIVATE defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'it' @ [43:33] ==> value-parameter it: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in org.jetbrains.kotlin.javac.wrappers.trees.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'PRIVATE' @ [43:52] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'in' @ [44:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'PROTECTED' @ [44:22] ==> enum entry PROTECTED defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'it' @ [44:35] ==> value-parameter it: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in org.jetbrains.kotlin.javac.wrappers.trees.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'if (Modifier.STATIC in it) JavaVisibilities.PROTECTED_STATIC_VISIBILITY
                else JavaVisibilities.PROTECTED_AND_PACKAGE' @ [45:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'in' @ [45:21] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'STATIC' @ [45:30] ==> enum entry STATIC defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'it' @ [45:40] ==> value-parameter it: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?) defined in org.jetbrains.kotlin.javac.wrappers.trees.<get-visibility>.<anonymous>[ValueParameterDescriptorImpl]

'PROTECTED_STATIC_VISIBILITY' @ [45:61] ==> @NotNull public final val PROTECTED_STATIC_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PROTECTED_AND_PACKAGE' @ [46:39] ==> @NotNull public final val PROTECTED_AND_PACKAGE: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PACKAGE_VISIBILITY' @ [48:38] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'when (this) {
    is JCTree.JCMethodDecl -> mods?.annotations
    is JCTree.JCClassDecl -> mods?.annotations
    is JCTree.JCVariableDecl -> mods?.annotations
    is JCTree.JCTypeParameter -> annotations
    else -> null
}' @ [52:70] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?, entry1: List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?, entry2: List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?, entry3: List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?, entry4: List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?): List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<(com.sun.tools.javac.tree.JCTree.JCAnnotation..com.sun.tools.javac.tree.JCTree.JCAnnotation?)>?

'this' @ [52:76] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.annotations[ReceiverParameterDescriptorImpl]

'mods' @ [53:31] ==> public final var mods: (JCTree.JCModifiers..JCTree.JCModifiers?) defined in com.sun.tools.javac.tree.JCTree.JCMethodDecl[JavaPropertyDescriptor]

'annotations' @ [53:37] ==> public final var annotations: (List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>..List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'mods' @ [54:30] ==> public final var mods: (JCTree.JCModifiers..JCTree.JCModifiers?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'annotations' @ [54:36] ==> public final var annotations: (List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>..List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'mods' @ [55:33] ==> public final var mods: (JCTree.JCModifiers..JCTree.JCModifiers?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaPropertyDescriptor]

'annotations' @ [55:39] ==> public final var annotations: (List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>..List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?) defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'annotations' @ [56:34] ==> public final var annotations: (List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>..List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?) defined in com.sun.tools.javac.tree.JCTree.JCTypeParameter[JavaPropertyDescriptor]

'emptyList' @ [58:6] ==> public fun <T> emptyList(): List<JCTree.JCAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCAnnotation

'outerClass' @ [61:9] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'computeClassId' @ [61:21] ==> public fun JavaClass.computeClassId(): ClassId? defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'createNestedClassId' @ [61:39] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'name' @ [61:59] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'fqName' @ [61:68] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'let' @ [61:76] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> ClassId): ClassId defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> ClassId

'topLevel' @ [61:90] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'it' @ [61:99] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.computeClassId.<anonymous>[ValueParameterDescriptorImpl]

