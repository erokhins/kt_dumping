'UnresolvedReferenceQuickFixProvider<KtSimpleNameReference>' @ [44:56] ==> public constructor UnresolvedReferenceQuickFixProvider<T : (PsiReference..PsiReference?)>() defined in com.intellij.codeInsight.quickfix.UnresolvedReferenceQuickFixProvider[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiReference..PsiReference?)> -> KtSimpleNameReference

'KtSimpleNameReference' @ [45:71] ==> public constructor KtSimpleNameReference(expression: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedClassConstructorDescriptor]

'java' @ [45:100] ==> public val <T> KClass<KtSimpleNameReference>.java: Class<KtSimpleNameReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSimpleNameReference

'?:' @ [48:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [48:37] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'ref' @ [48:61] ==> value-parameter ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[ValueParameterDescriptorImpl]

'expression' @ [48:65] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [49:35] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [49:47] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'project' @ [49:54] ==> public final val Module.project: Project[MyPropertyDescriptor]

'isMavenizedModule' @ [49:63] ==> public open fun isMavenizedModule(@NotNull p0: Module): Boolean defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [49:81] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'ref' @ [53:26] ==> value-parameter ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[ValueParameterDescriptorImpl]

'expression' @ [53:30] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'expression' @ [54:31] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'getParentOfType' @ [54:42] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'if (importDirective != null) {
            if (importDirective.isAllUnder) {
                null
            } else {
                importDirective.importedFqName?.asString()
            }
        }
        else {
            val typeReference = expression.getParentOfType<KtTypeReference>(true)
            val referenced = typeReference?.text ?: expression.getReferencedName()

            expression.containingKtFile
                    .importDirectives
                    .firstOrNull { !it.isAllUnder && it.aliasName == referenced || it.importedFqName?.shortName()?.asString() == referenced }
                    ?.let { it.importedFqName?.asString() }
                    ?: referenced
        }' @ [56:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'importDirective' @ [56:24] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'if (importDirective.isAllUnder) {
                null
            } else {
                importDirective.importedFqName?.asString()
            }' @ [57:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'importDirective' @ [57:17] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'isAllUnder' @ [57:33] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'importDirective' @ [60:17] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'importedFqName' @ [60:33] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'asString' @ [60:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'expression' @ [64:33] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'getParentOfType' @ [64:44] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'typeReference' @ [65:30] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'text' @ [65:45] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'expression' @ [65:53] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'getReferencedName' @ [65:64] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [67:13] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'containingKtFile' @ [67:24] ==> public final val KtSimpleNameExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'importDirectives' @ [68:22] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'firstOrNull' @ [69:22] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.firstOrNull(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): KtImportDirective? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'!' @ [69:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [69:37] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [69:40] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [69:54] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes.<anonymous>[ValueParameterDescriptorImpl]

'aliasName' @ [69:57] ==> public final val KtImportDirective.aliasName: String?[MyPropertyDescriptor]

'referenced' @ [69:70] ==> val referenced: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'it' @ [69:84] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [69:87] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'shortName' @ [69:103] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [69:116] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'referenced' @ [69:130] ==> val referenced: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'let' @ [70:23] ==> @InlineOnly public inline fun <T, R> KtImportDirective.let(block: (KtImportDirective) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective
    <R> -> String?

'it' @ [70:29] ==> value-parameter it: KtImportDirective defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [70:32] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'asString' @ [70:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'referenced' @ [71:24] ==> val referenced: String defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'name' @ [74:13] ==> val name: String? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'registrar' @ [75:13] ==> value-parameter registrar: QuickFixActionRegistrar defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[ValueParameterDescriptorImpl]

'register' @ [75:23] ==> public abstract fun register(@NotNull p0: IntentionAction): Unit defined in com.intellij.codeInsight.daemon.QuickFixActionRegistrar[JavaMethodDescriptor]

'AddMavenDependencyQuickFix' @ [75:32] ==> public constructor AddMavenDependencyQuickFix(className: String, smartPsiElementPointer: SmartPsiElementPointer<KtSimpleNameExpression>) defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix[ClassConstructorDescriptorImpl]

'name' @ [75:59] ==> val name: String? defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'expression' @ [75:65] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.maven.inspections.KotlinMavenUnresolvedReferenceQuickFixProvider.registerFixes[LocalVariableDescriptor]

'createSmartPointer' @ [75:76] ==> public fun <E : PsiElement> KtSimpleNameExpression.createSmartPointer(): SmartPsiElementPointer<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtSimpleNameExpression

'text' @ [82:36] ==> public final val AddMavenDependencyQuickFix.text: String[MyPropertyDescriptor]

'smartPsiElementPointer' @ [85:13] ==> public final val smartPsiElementPointer: SmartPsiElementPointer<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix[PropertyDescriptorImpl]

'element' @ [85:36] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtSimpleNameExpression>.element: KtSimpleNameExpression?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtSimpleNameExpression

'let' @ [85:44] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression?.let(block: (KtSimpleNameExpression?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression?
    <R> -> Boolean

'it' @ [85:50] ==> value-parameter it: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [85:64] ==> value-parameter it: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [85:67] ==> public final val KtSimpleNameExpression.isValid: Boolean[MyPropertyDescriptor]

'file' @ [85:80] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.isAvailable[ValueParameterDescriptorImpl]

'!=' @ [85:96] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.idea.maven.project.MavenProject[DeserializedSimpleFunctionDescriptor]

'findContainingProject' @ [85:109] ==> @Nullable public open fun findContainingProject(@NotNull p0: PsiElement): MavenProject? defined in org.jetbrains.idea.maven.dom.MavenDomUtil[JavaMethodDescriptor]

'file' @ [85:131] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [88:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'file' @ [88:31] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'file' @ [92:27] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'originalFile' @ [92:32] ==> public final val PsiFile.originalFile: PsiFile[MyPropertyDescriptor]

'virtualFile' @ [92:45] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'?:' @ [93:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: MavenProject?, right: MavenProject): MavenProject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MavenProject

'findContainingProject' @ [93:41] ==> @Nullable public open fun findContainingProject(@NotNull p0: PsiElement): MavenProject? defined in org.jetbrains.idea.maven.dom.MavenDomUtil[JavaMethodDescriptor]

'file' @ [93:63] ==> value-parameter file: PsiFile? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'?:' @ [94:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: XmlFile?, right: XmlFile): XmlFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> XmlFile

'getInstance' @ [94:34] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [94:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'findFile' @ [94:55] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'mavenProject' @ [94:64] ==> val mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[LocalVariableDescriptor]

'file' @ [94:77] ==> public final val MavenProject.file: VirtualFile[MyPropertyDescriptor]

'searchForClass' @ [96:45] ==> @NotNull public open fun searchForClass(p0: (Project..Project?), p1: (String..String?)): (MutableList<(MavenId..MavenId?)>..List<(MavenId..MavenId?)>) defined in org.jetbrains.idea.maven.indices.MavenArtifactSearchDialog[JavaMethodDescriptor]

'project' @ [96:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'className' @ [96:69] ==> public final val className: String defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix[PropertyDescriptorImpl]

'ids' @ [97:13] ==> val ids: (MutableList<(MavenId..MavenId?)>..List<(MavenId..MavenId?)>) defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[LocalVariableDescriptor]

'isEmpty' @ [97:17] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'runWriteAction' @ [99:9] ==> public fun <T> runWriteAction(action: () -> Unit?): Unit? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit?

'getInstance' @ [100:51] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [100:63] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[ValueParameterDescriptorImpl]

'fileIndex' @ [100:72] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'isInTestSourceContent' @ [100:82] ==> public abstract fun isInTestSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'virtualFile' @ [100:104] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[LocalVariableDescriptor]

'if (isTestSource) MavenArtifactScope.TEST else null' @ [101:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MavenArtifactScope?, elseBranch: MavenArtifactScope?): MavenArtifactScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MavenArtifactScope?

'isTestSource' @ [101:29] ==> val isTestSource: Boolean defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke.<anonymous>[LocalVariableDescriptor]

'TEST' @ [101:62] ==> enum entry TEST defined in org.jetbrains.idea.maven.utils.MavenArtifactScope[FakeCallableDescriptorForObject]

'PomFile' @ [103:13] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'forFileOrNull' @ [103:21] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'xmlFile' @ [103:35] ==> val xmlFile: XmlFile defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[LocalVariableDescriptor]

'let' @ [103:45] ==> @InlineOnly public inline fun <T, R> PomFile.let(block: (PomFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PomFile
    <R> -> Unit

'ids' @ [104:17] ==> val ids: (MutableList<(MavenId..MavenId?)>..List<(MavenId..MavenId?)>) defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke[LocalVariableDescriptor]

'forEach' @ [104:21] ==> @HidesMembers public inline fun <T> Iterable<(MavenId..MavenId?)>.forEach(action: ((MavenId..MavenId?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenId..org.jetbrains.idea.maven.model.MavenId?)

'pom' @ [105:21] ==> value-parameter pom: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addDependency' @ [105:25] ==> public final fun addDependency(artifact: MavenId, scope: MavenArtifactScope? = ..., classifier: String? = ..., optional: Boolean = ..., systemPath: String? = ...): MavenDomDependency defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'it' @ [105:39] ==> value-parameter it: (MavenId..MavenId?) defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [105:43] ==> val scope: MavenArtifactScope? defined in org.jetbrains.kotlin.idea.maven.inspections.AddMavenDependencyQuickFix.invoke.<anonymous>[LocalVariableDescriptor]

