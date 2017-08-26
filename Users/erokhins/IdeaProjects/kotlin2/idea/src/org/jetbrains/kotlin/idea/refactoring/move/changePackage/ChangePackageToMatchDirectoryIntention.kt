'SelfTargetingOffsetIndependentIntention<KtPackageDirective>' @ [27:48] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtPackageDirective>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtPackageDirective

'java' @ [28:35] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'element' @ [31:20] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [31:28] ==> public final val KtPackageDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [32:13] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'isInjectedFragment' @ [32:18] ==> public val PsiFile.isInjectedFragment: Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[PropertyDescriptorImpl]

'file' @ [32:40] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'packageMatchesDirectory' @ [32:45] ==> public fun KtFile.packageMatchesDirectory(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'file' @ [34:33] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'getFqNameByDirectory' @ [34:38] ==> public fun PsiFile.getFqNameByDirectory(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'text' @ [35:9] ==> public final var ChangePackageToMatchDirectoryIntention.text: String[MyPropertyDescriptor]

'if (!fqNameByDirectory.hasIdentifiersOnly()) {
            "File package doesn't match directory (cannot fix)"
        }
        else {
            "Change file's package to '${fqNameByDirectory.asString()}'"
        }' @ [35:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [35:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fqNameByDirectory' @ [35:21] ==> val fqNameByDirectory: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'hasIdentifiersOnly' @ [35:39] ==> public fun FqName.hasIdentifiersOnly(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'fqNameByDirectory' @ [39:42] ==> val fqNameByDirectory: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'asString' @ [39:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'element' @ [45:20] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.applyTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [45:28] ==> public final val KtPackageDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [46:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.applyTo[LocalVariableDescriptor]

'getFqNameByDirectory' @ [46:30] ==> public fun PsiFile.getFqNameByDirectory(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newFqName' @ [47:14] ==> val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.applyTo[LocalVariableDescriptor]

'hasIdentifiersOnly' @ [47:24] ==> public fun FqName.hasIdentifiersOnly(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'KotlinChangePackageRefactoring' @ [48:9] ==> public constructor KotlinChangePackageRefactoring(file: KtFile) defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[ClassConstructorDescriptorImpl]

'file' @ [48:40] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.applyTo[LocalVariableDescriptor]

'run' @ [48:46] ==> public final fun run(newFqName: FqName): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[SimpleFunctionDescriptorImpl]

'newFqName' @ [48:50] ==> val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.ChangePackageToMatchDirectoryIntention.applyTo[LocalVariableDescriptor]

