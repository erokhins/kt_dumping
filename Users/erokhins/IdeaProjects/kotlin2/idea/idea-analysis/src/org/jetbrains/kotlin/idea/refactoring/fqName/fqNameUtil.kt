'namedUnwrappedElement' @ [32:19] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'when (element) {
        is PsiPackage -> FqName(element.qualifiedName)
        is PsiClass -> element.qualifiedName?.let(::FqName)
        is PsiMember -> element.getName()?.let { name ->
            val prefix = element.containingClass?.qualifiedName
            FqName(if (prefix != null) "$prefix.$name" else name)
        }
        is KtNamedDeclaration -> element.fqName
        else -> null
    }' @ [33:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FqName?, entry1: FqName?, entry2: FqName?, entry3: FqName?, entry4: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FqName?

'element' @ [33:18] ==> val element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName[LocalVariableDescriptor]

'FqName' @ [34:26] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'element' @ [34:33] ==> val element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName[LocalVariableDescriptor]

'qualifiedName' @ [34:41] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'element' @ [35:24] ==> val element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName[LocalVariableDescriptor]

'qualifiedName' @ [35:32] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'let' @ [35:47] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [35:53] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'element' @ [36:25] ==> val element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName[LocalVariableDescriptor]

'getName' @ [36:33] ==> @Nullable public abstract fun getName(): String? defined in com.intellij.psi.PsiNamedElement[JavaMethodDescriptor]

'let' @ [36:44] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'element' @ [37:26] ==> val element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName[LocalVariableDescriptor]

'containingClass' @ [37:34] ==> public final val PsiMember.containingClass: PsiClass?[MyPropertyDescriptor]

'qualifiedName' @ [37:51] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'FqName' @ [38:13] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'if (prefix != null) "$prefix.$name" else name' @ [38:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'prefix' @ [38:24] ==> val prefix: String? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName.<anonymous>[LocalVariableDescriptor]

'prefix' @ [38:42] ==> val prefix: String? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName.<anonymous>[LocalVariableDescriptor]

'name' @ [38:50] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [38:61] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [40:34] ==> val element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName[LocalVariableDescriptor]

'fqName' @ [40:42] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'when {
        skipAliasedImports && importPath.hasAlias() -> false
        importPath.isAllUnder && !isRoot -> importPath.fqName == this.parent()
        else -> importPath.fqName == this
    }' @ [46:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'skipAliasedImports' @ [47:9] ==> value-parameter skipAliasedImports: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'importPath' @ [47:31] ==> value-parameter importPath: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'hasAlias' @ [47:42] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'importPath' @ [48:9] ==> value-parameter importPath: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'isAllUnder' @ [48:20] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'!' @ [48:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRoot' @ [48:35] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'importPath' @ [48:45] ==> value-parameter importPath: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'fqName' @ [48:56] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'this' @ [48:66] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ReceiverParameterDescriptorImpl]

'parent' @ [48:71] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'importPath' @ [49:17] ==> value-parameter importPath: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'fqName' @ [49:28] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'this' @ [49:38] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ReceiverParameterDescriptorImpl]

'if (isAllUnder || hasAlias()) this == alreadyImported else fqName.isImported(alreadyImported)' @ [54:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isAllUnder' @ [54:16] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'hasAlias' @ [54:30] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'this' @ [54:42] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ReceiverParameterDescriptorImpl]

'alreadyImported' @ [54:50] ==> value-parameter alreadyImported: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'fqName' @ [54:71] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'isImported' @ [54:78] ==> public fun FqName.isImported(importPath: ImportPath, skipAliasedImports: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.fqName in file fqNameUtil.kt[SimpleFunctionDescriptorImpl]

'alreadyImported' @ [54:89] ==> value-parameter alreadyImported: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'imports' @ [57:77] ==> value-parameter imports: Iterable<ImportPath> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'any' @ [57:85] ==> public inline fun <T> Iterable<ImportPath>.any(predicate: (ImportPath) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'isImported' @ [57:91] ==> public fun ImportPath.isImported(alreadyImported: ImportPath): Boolean defined in org.jetbrains.kotlin.idea.refactoring.fqName in file fqNameUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [57:102] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported.<anonymous>[ValueParameterDescriptorImpl]

'isImported' @ [60:12] ==> private fun ImportPath.isImported(imports: Iterable<ImportPath>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.fqName in file fqNameUtil.kt[SimpleFunctionDescriptorImpl]

'imports' @ [60:23] ==> value-parameter imports: Iterable<ImportPath> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

'isAllUnder' @ [60:36] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'this' @ [60:50] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ReceiverParameterDescriptorImpl]

'fqName' @ [60:55] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'excludedFqNames' @ [60:66] ==> value-parameter excludedFqNames: Iterable<FqName> defined in org.jetbrains.kotlin.idea.refactoring.fqName.isImported[ValueParameterDescriptorImpl]

