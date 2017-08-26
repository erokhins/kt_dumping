'JvmOverloads' @ [113:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'targetDir' @ [116:50] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.getOrCreateKotlinFile[ValueParameterDescriptorImpl]

'getPackage' @ [116:60] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'qualifiedName' @ [116:74] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'targetDir' @ [117:10] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.getOrCreateKotlinFile[ValueParameterDescriptorImpl]

'findFile' @ [117:20] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'fileName' @ [117:29] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.refactoring.getOrCreateKotlinFile[ValueParameterDescriptorImpl]

'createKotlinFile' @ [117:42] ==> public fun createKotlinFile(fileName: String, targetDir: PsiDirectory, packageName: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'fileName' @ [117:59] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.refactoring.getOrCreateKotlinFile[ValueParameterDescriptorImpl]

'targetDir' @ [117:69] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.getOrCreateKotlinFile[ValueParameterDescriptorImpl]

'packageName' @ [117:80] ==> value-parameter packageName: String? = ... defined in org.jetbrains.kotlin.idea.refactoring.getOrCreateKotlinFile[ValueParameterDescriptorImpl]

'targetDir' @ [121:45] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'getPackage' @ [121:55] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'qualifiedName' @ [121:69] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'targetDir' @ [122:5] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'checkCreateFile' @ [122:15] ==> public abstract fun checkCreateFile(@NotNull p0: String): Unit defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'fileName' @ [122:31] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'packageName' @ [123:25] ==> value-parameter packageName: String? = ... defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'let' @ [123:38] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [123:44] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'ROOT' @ [123:62] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'getInstance' @ [124:31] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'targetDir' @ [124:43] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'project' @ [124:53] ==> public final val PsiDirectory.project: Project[MyPropertyDescriptor]

'createFileFromText' @ [124:62] ==> @NotNull public abstract fun createFileFromText(@NonNls @NotNull p0: String, @NotNull p1: FileType, @NotNull p2: CharSequence): PsiFile defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'fileName' @ [125:13] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'INSTANCE' @ [125:38] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'if (!packageFqName.isRoot) "package ${packageFqName.quoteSegmentsIfNeeded()} \n\n" else ""' @ [125:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [125:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [125:53] ==> val packageFqName: (FqName..FqName?) defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[LocalVariableDescriptor]

'isRoot' @ [125:67] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'packageFqName' @ [125:86] ==> val packageFqName: (FqName..FqName?) defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[LocalVariableDescriptor]

'quoteSegmentsIfNeeded' @ [125:100] ==> public fun FqName.quoteSegmentsIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'targetDir' @ [128:12] ==> value-parameter targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[ValueParameterDescriptorImpl]

'add' @ [128:22] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'file' @ [128:26] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.createKotlinFile[LocalVariableDescriptor]

'getInstance' @ [131:58] ==> public open fun getInstance(): (LocalFileSystem..LocalFileSystem?) defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'findFileByIoFile' @ [131:72] ==> @Nullable public abstract fun findFileByIoFile(@NotNull p0: File): VirtualFile? defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'this' @ [131:89] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.toVirtualFile[ReceiverParameterDescriptorImpl]

'toVirtualFile' @ [133:50] ==> public fun File.toVirtualFile(): VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'toPsiFile' @ [133:67] ==> public fun VirtualFile.toPsiFile(project: Project): PsiFile? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [133:77] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.toPsiFile[ValueParameterDescriptorImpl]

'toVirtualFile' @ [136:12] ==> public fun File.toVirtualFile(): VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'let' @ [136:29] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> PsiDirectory?): PsiDirectory? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> PsiDirectory?

'getInstance' @ [136:55] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [136:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.toPsiDirectory[ValueParameterDescriptorImpl]

'findDirectory' @ [136:76] ==> @Nullable public abstract fun findDirectory(@NotNull p0: VirtualFile): PsiDirectory? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'vfile' @ [136:90] ==> value-parameter vfile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.toPsiDirectory.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [139:68] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [139:80] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.toPsiFile[ValueParameterDescriptorImpl]

'findFile' @ [139:89] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'this' @ [139:98] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.toPsiFile[ReceiverParameterDescriptorImpl]

'getInstance' @ [141:78] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [141:90] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.toPsiDirectory[ValueParameterDescriptorImpl]

'findDirectory' @ [141:99] ==> @Nullable public abstract fun findDirectory(@NotNull p0: VirtualFile): PsiDirectory? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'this' @ [141:113] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.toPsiDirectory[ReceiverParameterDescriptorImpl]

'if (isDirectory) toPsiDirectory(project) else toPsiFile(project)' @ [143:78] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiFileSystemItem?, elseBranch: PsiFileSystemItem?): PsiFileSystemItem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiFileSystemItem?

'isDirectory' @ [143:82] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'toPsiDirectory' @ [143:95] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [143:110] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.toPsiFileOrDirectory[ValueParameterDescriptorImpl]

'toPsiFile' @ [143:124] ==> public fun VirtualFile.toPsiFile(project: Project): PsiFile? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [143:134] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.toPsiFileOrDirectory[ValueParameterDescriptorImpl]

'when (this) {
        is KtElement -> PsiTreeUtil.getParentOfType(
                this,
                KtPropertyAccessor::class.java,
                KtProperty::class.java,
                KtFunction::class.java,
                KtClassOrObject::class.java
        ) ?: containingFile
        else -> ConflictsUtil.getContainer(this)
    }' @ [146:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement, entry1: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement

'this' @ [146:18] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getUsageContext[ReceiverParameterDescriptorImpl]

'?:' @ [147:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getParentOfType' @ [147:37] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtDeclaration..KtDeclaration?)>..Class<out (KtDeclaration..KtDeclaration?)>?)): KtDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'this' @ [148:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getUsageContext[ReceiverParameterDescriptorImpl]

'java' @ [149:43] ==> public val <T> KClass<KtPropertyAccessor>.java: Class<KtPropertyAccessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPropertyAccessor

'java' @ [150:35] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'java' @ [151:35] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'java' @ [152:40] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'containingFile' @ [153:14] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getContainer' @ [154:31] ==> @NotNull public open fun getContainer(p0: (PsiElement..PsiElement?)): PsiElement defined in com.intellij.refactoring.util.ConflictsUtil[JavaMethodDescriptor]

'this' @ [154:44] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getUsageContext[ReceiverParameterDescriptorImpl]

'!' @ [159:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOutsideJavaSourceRoot' @ [159:31] ==> public open fun isOutsideJavaSourceRoot(@Nullable p0: PsiFile?): Boolean defined in com.intellij.openapi.roots.JavaProjectRootsUtil[JavaMethodDescriptor]

'containingFile' @ [159:55] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'KtPsiFactory' @ [162:19] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [162:32] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[ReceiverParameterDescriptorImpl]

'createAnalyzableFile' @ [162:38] ==> public final fun createAnalyzableFile(fileName: String, text: String, contextToAnalyzeIn: PsiElement): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'name' @ [162:59] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'text' @ [162:65] ==> value-parameter text: String? = ... defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[ValueParameterDescriptorImpl]

'this' @ [162:73] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[ReceiverParameterDescriptorImpl]

'text' @ [162:78] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'this' @ [162:90] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[ReceiverParameterDescriptorImpl]

'tmpFile' @ [163:5] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[LocalVariableDescriptor]

'originalFile' @ [163:13] ==> public final var KtFile.originalFile: PsiFile[MyPropertyDescriptor]

'this' @ [163:28] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[ReceiverParameterDescriptorImpl]

'tmpFile' @ [164:5] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[LocalVariableDescriptor]

'suppressDiagnosticsInDebugMode' @ [164:13] ==> public var KtFile.suppressDiagnosticsInDebugMode: Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil[DeserializedPropertyDescriptor]

'suppressDiagnosticsInDebugMode' @ [164:46] ==> public var KtFile.suppressDiagnosticsInDebugMode: Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil[DeserializedPropertyDescriptor]

'tmpFile' @ [165:12] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.createTempCopy[LocalVariableDescriptor]

'ArrayList' @ [169:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'if (strict) parents else parentsWithSelf' @ [172:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<PsiElement>, elseBranch: Sequence<PsiElement>): Sequence<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<PsiElement>

'strict' @ [172:23] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[ValueParameterDescriptorImpl]

'parents' @ [172:31] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'parentsWithSelf' @ [172:44] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'parents' @ [173:21] ==> val parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'when (element) {
            is KtFile -> true
            is KtClassBody -> !objectOrNonInnerNestedClassFound || element.parent is KtObjectDeclaration
            is KtBlockExpression -> !objectOrNonInnerNestedClassFound
            else -> false
        }' @ [174:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [174:38] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'!' @ [176:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'objectOrNonInnerNestedClassFound' @ [176:32] ==> var objectOrNonInnerNestedClassFound: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'element' @ [176:68] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'parent' @ [176:76] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [177:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'objectOrNonInnerNestedClassFound' @ [177:38] ==> var objectOrNonInnerNestedClassFound: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'!' @ [180:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidContainer' @ [180:14] ==> val isValidContainer: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'containers' @ [182:9] ==> val containers: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'add' @ [182:20] ==> public open fun add(element: KtElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [182:24] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'!' @ [184:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'objectOrNonInnerNestedClassFound' @ [184:14] ==> var objectOrNonInnerNestedClassFound: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'element' @ [185:31] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'parent' @ [185:57] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'objectOrNonInnerNestedClassFound' @ [186:13] ==> var objectOrNonInnerNestedClassFound: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'bodyParent' @ [187:22] ==> val bodyParent: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'!' @ [187:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bodyParent' @ [187:60] ==> val bodyParent: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'isObjectLiteral' @ [187:71] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'bodyParent' @ [188:25] ==> val bodyParent: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'!' @ [188:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bodyParent' @ [188:51] ==> val bodyParent: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'isInner' @ [188:62] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'containers' @ [192:12] ==> val containers: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.getAllExtractionContainers[LocalVariableDescriptor]

'if (strict) element.parents else element.parentsWithSelf' @ [197:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<PsiElement>, elseBranch: Sequence<PsiElement>): Sequence<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<PsiElement>

'strict' @ [197:21] ==> value-parameter strict: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration[ValueParameterDescriptorImpl]

'element' @ [197:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration[ValueParameterDescriptorImpl]

'parents' @ [197:37] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [197:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [197:58] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filter' @ [198:18] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [199:22] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [199:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [199:81] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [199:83] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [199:108] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [199:111] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'it' @ [200:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [201:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [202:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.getEnclosingDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [204:18] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'includeAll' @ [207:9] ==> value-parameter includeAll: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[ValueParameterDescriptorImpl]

'getAllExtractionContainers' @ [207:28] ==> public fun PsiElement.getAllExtractionContainers(strict: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'strict' @ [207:55] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[ValueParameterDescriptorImpl]

'getEnclosingDeclaration' @ [209:32] ==> local final fun getEnclosingDeclaration(element: PsiElement, strict: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[SimpleFunctionDescriptorImpl]

'this' @ [209:56] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[ReceiverParameterDescriptorImpl]

'strict' @ [209:62] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[ValueParameterDescriptorImpl]

'let' @ [209:71] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiElement?

'if (it is KtDeclarationWithBody || it is KtAnonymousInitializer) getEnclosingDeclaration(it, true) else it' @ [210:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'it' @ [210:13] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [210:44] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.<anonymous>[ValueParameterDescriptorImpl]

'getEnclosingDeclaration' @ [210:74] ==> local final fun getEnclosingDeclaration(element: PsiElement, strict: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[SimpleFunctionDescriptorImpl]

'it' @ [210:98] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [210:113] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers.<anonymous>[ValueParameterDescriptorImpl]

'when (enclosingDeclaration) {
        is KtFile -> Collections.singletonList(enclosingDeclaration)
        is KtClassBody -> getAllExtractionContainers(strict).filterIsInstance<KtClassBody>()
        else -> {
            val targetContainer = when (enclosingDeclaration) {
                is KtDeclarationWithBody -> enclosingDeclaration.bodyExpression
                is KtAnonymousInitializer -> enclosingDeclaration.body
                else -> null
            }
            if (targetContainer is KtBlockExpression) Collections.singletonList(targetContainer) else Collections.emptyList()
        }
    }' @ [213:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtElement>, entry1: List<KtElement>, entry2: List<KtElement>): List<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtElement>

'enclosingDeclaration' @ [213:18] ==> val enclosingDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'singletonList' @ [214:34] ==> public open fun <T : (Any..Any?)> singletonList(p0: (KtFile..KtFile?)): (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'enclosingDeclaration' @ [214:48] ==> val enclosingDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'getAllExtractionContainers' @ [215:27] ==> public fun PsiElement.getAllExtractionContainers(strict: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'strict' @ [215:54] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[ValueParameterDescriptorImpl]

'filterIsInstance' @ [215:62] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassBody> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassBody

'when (enclosingDeclaration) {
                is KtDeclarationWithBody -> enclosingDeclaration.bodyExpression
                is KtAnonymousInitializer -> enclosingDeclaration.body
                else -> null
            }' @ [217:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'enclosingDeclaration' @ [217:41] ==> val enclosingDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'enclosingDeclaration' @ [218:45] ==> val enclosingDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'bodyExpression' @ [218:66] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'enclosingDeclaration' @ [219:46] ==> val enclosingDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'body' @ [219:67] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'if (targetContainer is KtBlockExpression) Collections.singletonList(targetContainer) else Collections.emptyList()' @ [222:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (MutableList<out (KtElement..KtElement?)>..List<(KtElement..KtElement?)>?), elseBranch: (MutableList<out (KtElement..KtElement?)>..List<(KtElement..KtElement?)>?)): (MutableList<out (KtElement..KtElement?)>..List<(KtElement..KtElement?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.MutableList<out (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>?)

'targetContainer' @ [222:17] ==> val targetContainer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'singletonList' @ [222:67] ==> public open fun <T : (Any..Any?)> singletonList(p0: (KtBlockExpression..KtBlockExpression?)): (MutableList<(KtBlockExpression..KtBlockExpression?)>..List<(KtBlockExpression..KtBlockExpression?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtBlockExpression..org.jetbrains.kotlin.psi.KtBlockExpression?)

'targetContainer' @ [222:81] ==> val targetContainer: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.getExtractionContainers[LocalVariableDescriptor]

'emptyList' @ [222:115] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'!' @ [231:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conflicts' @ [231:10] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[ValueParameterDescriptorImpl]

'isEmpty' @ [231:20] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MultiMap<PsiElement, String>.isEmpty: Boolean[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'!!' @ [232:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [232:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [232:51] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'ConflictsInTestsException' @ [232:73] ==> public constructor ConflictsInTestsException(@NotNull p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)) defined in com.intellij.refactoring.BaseRefactoringProcessor.ConflictsInTestsException[JavaClassConstructorDescriptor]

'conflicts' @ [232:99] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[ValueParameterDescriptorImpl]

'values' @ [232:109] ==> @NotNull public open fun values(): (MutableCollection<out (String..String?)>..Collection<(String..String?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'ConflictsDialog' @ [234:22] ==> public constructor ConflictsDialog(@NotNull p0: Project, @NotNull p1: MultiMap<(PsiElement..PsiElement?), (String..String?)>, @Nullable p2: (() -> Unit)?) defined in com.intellij.refactoring.ui.ConflictsDialog[SamAdapterClassConstructorDescriptor]

'this' @ [234:38] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[ReceiverParameterDescriptorImpl]

'conflicts' @ [234:44] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[ValueParameterDescriptorImpl]

'invoke' @ [234:57] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'dialog' @ [235:9] ==> val dialog: ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[LocalVariableDescriptor]

'show' @ [235:16] ==> public open fun show(): Unit defined in com.intellij.refactoring.ui.ConflictsDialog[JavaMethodDescriptor]

'!' @ [236:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [236:14] ==> val dialog: ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[LocalVariableDescriptor]

'isOK' @ [236:21] ==> public final val ConflictsDialog.isOK: Boolean[MyPropertyDescriptor]

'dialog' @ [237:17] ==> val dialog: ConflictsDialog defined in org.jetbrains.kotlin.idea.refactoring.checkConflictsInteractively[LocalVariableDescriptor]

'isShowConflicts' @ [237:24] ==> public final val ConflictsDialog.isShowConflicts: Boolean[MyPropertyDescriptor]

'invoke' @ [238:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [244:5] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'conflicts' @ [252:5] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.reportDeclarationConflict[ValueParameterDescriptorImpl]

'putValue' @ [252:15] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'declaration' @ [252:24] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.reportDeclarationConflict[ValueParameterDescriptorImpl]

'invoke' @ [252:37] ==> public abstract operator fun invoke(renderedDeclaration: @ParameterName String): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'getDescription' @ [252:63] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'declaration' @ [252:78] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.reportDeclarationConflict[ValueParameterDescriptorImpl]

'capitalize' @ [252:97] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (highlightSelection) SelectionAwareScopeHighlighter(editor) else null' @ [263:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SelectionAwareScopeHighlighter?, elseBranch: SelectionAwareScopeHighlighter?): SelectionAwareScopeHighlighter?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SelectionAwareScopeHighlighter?

'highlightSelection' @ [263:27] ==> value-parameter highlightSelection: Boolean defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'SelectionAwareScopeHighlighter' @ [263:47] ==> public constructor SelectionAwareScopeHighlighter(editor: Editor) defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[ClassConstructorDescriptorImpl]

'editor' @ [263:78] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'JBList' @ [265:16] ==> public constructor JBList<E : (Any..Any?)>(@NotNull p0: (MutableCollection<(E..E?)>..Collection<(E..E?)>)) defined in com.intellij.ui.components.JBList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (E..E?)

'elements' @ [265:23] ==> value-parameter elements: List<T> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'map' @ [265:32] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> E): List<E> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> E

'toPsi' @ [265:36] ==> value-parameter toPsi: (T) -> E defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'list' @ [266:5] ==> val list: JBList<(E..E?)> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'cellRenderer' @ [266:10] ==> public final var <E : (Any..Any?)> JBList<(E..E?)>.cellRenderer: (ListCellRenderer<in (E..E?)>..ListCellRenderer<in (E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (E..E?)

'renderer' @ [266:25] ==> value-parameter renderer: PsiElementListCellRenderer<E> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'list' @ [267:5] ==> val list: JBList<(E..E?)> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'addListSelectionListener' @ [267:10] ==> public final fun addListSelectionListener(p0: (((ListSelectionEvent..ListSelectionEvent?)) -> Unit..(((ListSelectionEvent..ListSelectionEvent?)) -> Unit)?)): Unit defined in com.intellij.ui.components.JBList[MyFunctionDescriptor]

'highlighter' @ [268:9] ==> val highlighter: SelectionAwareScopeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'dropHighlight' @ [268:22] ==> public final fun dropHighlight(): Unit defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[SimpleFunctionDescriptorImpl]

'list' @ [269:21] ==> val list: JBList<(E..E?)> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'selectedIndex' @ [269:26] ==> public final var <E : (Any..Any?)> JBList<(E..E?)>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (E..E?)

'index' @ [270:13] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup.<anonymous>[LocalVariableDescriptor]

'highlighter' @ [271:13] ==> val highlighter: SelectionAwareScopeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'highlight' @ [271:26] ==> public final fun highlight(wholeAffected: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[SimpleFunctionDescriptorImpl]

'list' @ [271:36] ==> val list: JBList<(E..E?)> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'model' @ [271:41] ==> public final var <E : (Any..Any?)> JBList<(E..E?)>.model: (ListModel<(E..E?)>..ListModel<(E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (E..E?)

'getElementAt' @ [271:49] ==> public abstract fun getElementAt(p0: Int): (E..E?) defined in javax.swing.ListModel[JavaMethodDescriptor]

'index' @ [271:62] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup.<anonymous>[LocalVariableDescriptor]

'with' @ [275:12] ==> @InlineOnly public inline fun <T, R> with(receiver: PopupChooserBuilder, block: PopupChooserBuilder.() -> JBPopup): JBPopup defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PopupChooserBuilder
    <R> -> JBPopup

'PopupChooserBuilder' @ [275:17] ==> public constructor PopupChooserBuilder(@NotNull p0: raw (JList<(Any..Any?)>..JList<*>)) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaClassConstructorDescriptor]

'list' @ [275:37] ==> val list: JBList<(E..E?)> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'title' @ [276:9] ==> value-parameter title: String? defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'let' @ [276:16] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> PopupChooserBuilder): PopupChooserBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PopupChooserBuilder

'setTitle' @ [276:22] ==> @NotNull public open fun setTitle(@NotNull @Nls p0: String): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'it' @ [276:31] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'renderer' @ [277:9] ==> value-parameter renderer: PsiElementListCellRenderer<E> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'installSpeedSearch' @ [277:18] ==> public open fun installSpeedSearch(p0: (PopupChooserBuilder..PopupChooserBuilder?), p1: Boolean): Unit defined in com.intellij.ide.util.PsiElementListCellRenderer[JavaMethodDescriptor]

'this' @ [277:37] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup.<anonymous>[ReceiverParameterDescriptorImpl]

'setItemChoosenCallback' @ [278:9] ==> @NotNull public final fun setItemChoosenCallback(@NotNull p0: () -> Unit): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'list' @ [279:25] ==> val list: JBList<(E..E?)> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'selectedIndex' @ [279:30] ==> public final var <E : (Any..Any?)> JBList<(E..E?)>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (E..E?)

'index' @ [280:17] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [281:17] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'elements' @ [281:27] ==> value-parameter elements: List<T> defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[ValueParameterDescriptorImpl]

'index' @ [281:36] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addListener' @ [284:9] ==> public open fun addListener(p0: (JBPopupListener..JBPopupListener?)): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'JBPopupAdapter' @ [284:30] ==> public constructor JBPopupAdapter() defined in com.intellij.openapi.ui.popup.JBPopupAdapter[JavaClassConstructorDescriptor]

'highlighter' @ [286:17] ==> val highlighter: SelectionAwareScopeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.getPsiElementPopup[LocalVariableDescriptor]

'dropHighlight' @ [286:30] ==> public final fun dropHighlight(): Unit defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[SimpleFunctionDescriptorImpl]

'createPopup' @ [290:9] ==> @NotNull public open fun createPopup(): JBPopup defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'ArrayList' @ [295:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> RangeHighlighter

'highlighters' @ [298:9] ==> private final val highlighters: ArrayList<RangeHighlighter> defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[PropertyDescriptorImpl]

'add' @ [298:22] ==> public open fun add(element: RangeHighlighter): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'editor' @ [299:17] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[PropertyDescriptorImpl]

'markupModel' @ [299:24] ==> public final val Editor.markupModel: MarkupModel[MyPropertyDescriptor]

'addRangeHighlighter' @ [299:36] ==> @NotNull public abstract fun addRangeHighlighter(p0: Int, p1: Int, p2: Int, @Nullable p3: TextAttributes?, @NotNull p4: HighlighterTargetArea): RangeHighlighter defined in com.intellij.openapi.editor.markup.MarkupModel[JavaMethodDescriptor]

'r' @ [300:25] ==> value-parameter r: TextRange defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.addHighlighter[ValueParameterDescriptorImpl]

'startOffset' @ [300:27] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'r' @ [301:25] ==> value-parameter r: TextRange defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.addHighlighter[ValueParameterDescriptorImpl]

'endOffset' @ [301:27] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'HIGHLIGHTER_LEVEL' @ [302:39] ==> public const final val HIGHLIGHTER_LEVEL: Int defined in com.intellij.codeInsight.unwrap.UnwrapHandler[JavaPropertyDescriptor]

'attr' @ [303:25] ==> value-parameter attr: TextAttributes defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.addHighlighter[ValueParameterDescriptorImpl]

'EXACT_RANGE' @ [304:47] ==> enum entry EXACT_RANGE defined in com.intellij.openapi.editor.markup.HighlighterTargetArea[FakeCallableDescriptorForObject]

'dropHighlight' @ [310:9] ==> public final fun dropHighlight(): Unit defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[SimpleFunctionDescriptorImpl]

'wholeAffected' @ [312:29] ==> value-parameter wholeAffected: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.highlight[ValueParameterDescriptorImpl]

'textRange' @ [312:43] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'!!' @ [314:26] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: TextAttributes?): TextAttributes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> TextAttributes

'getInstance' @ [314:46] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'globalScheme' @ [314:60] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'getAttributes' @ [314:73] ==> public abstract fun getAttributes(p0: (TextAttributesKey..TextAttributesKey?)): (TextAttributes..TextAttributes?) defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'SEARCH_RESULT_ATTRIBUTES' @ [314:100] ==> public final val SEARCH_RESULT_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.EditorColors[JavaPropertyDescriptor]

'with' @ [315:29] ==> @InlineOnly public inline fun <T, R> with(receiver: SelectionModel, block: (SelectionModel).() -> TextRange): TextRange defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SelectionModel
    <R> -> TextRange

'editor' @ [315:34] ==> public final val editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[PropertyDescriptorImpl]

'selectionModel' @ [315:41] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'TextRange' @ [315:59] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'selectionStart' @ [315:69] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'selectionEnd' @ [315:85] ==> public final val SelectionModel.selectionEnd: Int[MyPropertyDescriptor]

'iterator' @ [316:19] ==> public abstract fun iterator(): MutableIterator<(TextRange..TextRange?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'split' @ [316:33] ==> public open fun split(p0: (TextRange..TextRange?), p1: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)): (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?) defined in com.intellij.codeInsight.unwrap.RangeSplitter[JavaMethodDescriptor]

'affectedRange' @ [316:39] ==> val affectedRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.highlight[LocalVariableDescriptor]

'singletonList' @ [316:66] ==> public open fun <T : (Any..Any?)> singletonList(p0: (TextRange..TextRange?)): (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.util.TextRange..com.intellij.openapi.util.TextRange?)

'selectedRange' @ [316:80] ==> val selectedRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.highlight[LocalVariableDescriptor]

'addHighlighter' @ [317:13] ==> private final fun addHighlighter(r: TextRange, attr: TextAttributes): Unit defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[SimpleFunctionDescriptorImpl]

'r' @ [317:28] ==> val r: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.highlight[LocalVariableDescriptor]

'attributes' @ [317:31] ==> val attributes: TextAttributes defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.highlight[LocalVariableDescriptor]

'highlighters' @ [322:9] ==> private final val highlighters: ArrayList<RangeHighlighter> defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[PropertyDescriptorImpl]

'forEach' @ [322:22] ==> @HidesMembers public inline fun <T> Iterable<RangeHighlighter>.forEach(action: (RangeHighlighter) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter

'it' @ [322:32] ==> value-parameter it: RangeHighlighter defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter.dropHighlight.<anonymous>[ValueParameterDescriptorImpl]

'dispose' @ [322:35] ==> public abstract fun dispose(): Unit defined in com.intellij.openapi.editor.markup.RangeHighlighter[JavaMethodDescriptor]

'highlighters' @ [323:9] ==> private final val highlighters: ArrayList<RangeHighlighter> defined in org.jetbrains.kotlin.idea.refactoring.SelectionAwareScopeHighlighter[PropertyDescriptorImpl]

'clear' @ [323:22] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'getInstance' @ [328:34] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [328:46] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'getDocument' @ [328:55] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'this' @ [328:67] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[ReceiverParameterDescriptorImpl]

'doc' @ [329:9] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'line' @ [329:24] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[ValueParameterDescriptorImpl]

'line' @ [329:37] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[ValueParameterDescriptorImpl]

'doc' @ [329:44] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'lineCount' @ [329:48] ==> public final val Document.lineCount: Int[MyPropertyDescriptor]

'doc' @ [330:27] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'getLineStartOffset' @ [330:31] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [330:50] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[ValueParameterDescriptorImpl]

'findElementAt' @ [331:23] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'startOffset' @ [331:37] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'startOffset' @ [331:60] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'?:' @ [333:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int?

'skipSiblingsForward' @ [333:28] ==> @Nullable @Contract public open fun skipSiblingsForward(@Nullable p0: PsiElement?, @NotNull vararg p1: raw (Class<(Any..Any?)>..Class<*>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'element' @ [333:48] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'java' @ [333:78] ==> public val <T> KClass<PsiWhiteSpace>.java: Class<PsiWhiteSpace> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiWhiteSpace

'java' @ [333:102] ==> public val <T> KClass<PsiComment>.java: Class<PsiComment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiComment

'startOffset' @ [333:109] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'startOffset' @ [333:124] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineStartOffset[LocalVariableDescriptor]

'getInstance' @ [340:31] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [340:43] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'getDocument' @ [340:52] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'this' @ [340:64] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getLineEndOffset[ReceiverParameterDescriptorImpl]

'getLineEndOffset' @ [340:71] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [340:88] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineEndOffset[ValueParameterDescriptorImpl]

'?:' @ [344:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'getInstance' @ [344:31] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [344:43] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getDocument' @ [344:52] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'this' @ [344:64] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getLineNumber[ReceiverParameterDescriptorImpl]

'containingFile' @ [344:69] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getLineNumber' @ [344:86] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'if (start) this.startOffset else this.endOffset' @ [344:100] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'start' @ [344:104] ==> value-parameter start: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.getLineNumber[ValueParameterDescriptorImpl]

'this' @ [344:111] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getLineNumber[ReceiverParameterDescriptorImpl]

'startOffset' @ [344:116] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'this' @ [344:133] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getLineNumber[ReceiverParameterDescriptorImpl]

'endOffset' @ [344:138] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'containingFile' @ [348:15] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'let' @ [348:31] ==> @InlineOnly public inline fun <T, R> PsiFile.let(block: (PsiFile) -> Document?): Document? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R> -> Document?

'getInstance' @ [348:64] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [348:76] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getDocument' @ [348:85] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [348:97] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.getLineCount.<anonymous>[ValueParameterDescriptorImpl]

'doc' @ [349:9] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'textRange' @ [350:26] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'EMPTY_RANGE' @ [350:49] ==> public final val EMPTY_RANGE: (TextRange..TextRange?) defined in com.intellij.openapi.util.TextRange[JavaPropertyDescriptor]

'spaceRange' @ [352:13] ==> val spaceRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'endOffset' @ [352:24] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'doc' @ [352:37] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'textLength' @ [352:41] ==> public final val Document.textLength: Int[MyPropertyDescriptor]

'doc' @ [353:29] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'getLineNumber' @ [353:33] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'spaceRange' @ [353:47] ==> val spaceRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'startOffset' @ [353:58] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'doc' @ [354:27] ==> val doc: Document? defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'getLineNumber' @ [354:31] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'spaceRange' @ [354:45] ==> val spaceRange: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'endOffset' @ [354:56] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'endLine' @ [356:20] ==> val endLine: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'startLine' @ [356:30] ==> val startLine: Int defined in org.jetbrains.kotlin.idea.refactoring.getLineCount[LocalVariableDescriptor]

'+' @ [360:12] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'text' @ [360:13] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'count' @ [360:25] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [360:33] ==> value-parameter it: Char defined in org.jetbrains.kotlin.idea.refactoring.getLineCount.<anonymous>[ValueParameterDescriptorImpl]

'getLineCount' @ [363:41] ==> public fun PsiElement.getLineCount(): Int defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'LightElement' @ [365:50] ==> protected/*protected and package*/ constructor LightElement(@NotNull p0: PsiManager, @NotNull p1: Language) defined in com.intellij.psi.impl.light.LightElement[JavaClassConstructorDescriptor]

'manager' @ [365:63] ==> value-parameter manager: PsiManager defined in org.jetbrains.kotlin.idea.refactoring.SeparateFileWrapper.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [365:87] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'getPsiElementPopup' @ [376:12] ==> public fun <T, E : PsiElement> getPsiElementPopup(editor: Editor, elements: List<T>, renderer: PsiElementListCellRenderer<PsiElement>, title: String?, highlightSelection: Boolean, toPsi: (T) -> PsiElement, processor: (T) -> Boolean): JBPopup defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T
    <E : PsiElement> -> PsiElement

'editor' @ [377:13] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement[ValueParameterDescriptorImpl]

'containers' @ [378:13] ==> value-parameter containers: List<T> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement[ValueParameterDescriptorImpl]

'PsiElementListCellRenderer<PsiElement>' @ [379:22] ==> protected/*protected and package*/ constructor PsiElementListCellRenderer<T : (PsiElement..PsiElement?)>() defined in com.intellij.ide.util.PsiElementListCellRenderer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'this' @ [381:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderName[ReceiverParameterDescriptorImpl]

'property' @ [382:32] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'renderName' @ [382:41] ==> private final fun PsiElement.renderName(): String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'if (isGetter) ".get" else ".set"' @ [382:56] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isGetter' @ [382:60] ==> public final val KtPropertyAccessor.isGetter: Boolean[MyPropertyDescriptor]

'this' @ [384:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderName[ReceiverParameterDescriptorImpl]

'this' @ [384:56] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderName[ReceiverParameterDescriptorImpl]

'isCompanion' @ [384:61] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'getStrictParentOfType' @ [385:55] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'renderName' @ [385:97] ==> private final fun PsiElement.renderName(): String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'?:' @ [387:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'this' @ [387:29] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderName[ReceiverParameterDescriptorImpl]

'name' @ [387:56] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'this' @ [391:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[ReceiverParameterDescriptorImpl]

'isFunctionalExpression' @ [391:54] ==> public fun PsiElement.isFunctionalExpression(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'renderText' @ [391:87] ==> private final fun PsiElement.renderText(): String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'when {
                                         this is KtFile -> name
                                         this is KtElement -> analyze()[BindingContext.DECLARATION_TO_DESCRIPTOR, this]
                                         this is PsiMember -> getJavaMemberDescriptor()
                                         else -> null
                                     }' @ [393:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'this' @ [394:42] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[ReceiverParameterDescriptorImpl]

'name' @ [394:60] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'this' @ [395:42] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[ReceiverParameterDescriptorImpl]

'analyze' @ [395:63] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [395:88] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [395:115] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[ReceiverParameterDescriptorImpl]

'this' @ [396:42] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[ReceiverParameterDescriptorImpl]

'getJavaMemberDescriptor' @ [396:63] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'renderName' @ [399:32] ==> private final fun PsiElement.renderName(): String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'?:' @ [400:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'descriptor' @ [400:35] ==> val descriptor: Any defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[LocalVariableDescriptor]

'valueParameters' @ [400:71] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [401:44] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> String

'DescriptorRenderer' @ [401:50] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [401:79] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [401:100] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [401:111] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [401:114] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'joinToString' @ [402:44] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'name' @ [403:30] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[LocalVariableDescriptor]

'params' @ [403:35] ==> val params: String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderDeclaration[LocalVariableDescriptor]

'this' @ [407:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.renderText[ReceiverParameterDescriptorImpl]

'shortenTextWithEllipsis' @ [408:39] ==> @NotNull @Contract public open fun shortenTextWithEllipsis(@NotNull p0: String, p1: Int, p2: Int): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [408:63] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'collapseSpaces' @ [408:70] ==> public fun String.collapseSpaces(): String defined in org.jetbrains.kotlin.idea.util.string[DeserializedSimpleFunctionDescriptor]

'when (this) {
                        is KtBlockExpression -> (parent as? KtDeclarationWithBody) ?: this
                        is KtClassBody -> parent as KtClassOrObject
                        else -> this
                    }' @ [412:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement, entry1: PsiElement, entry2: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement

'this' @ [412:34] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getRepresentativeElement[ReceiverParameterDescriptorImpl]

'?:' @ [413:49] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'parent' @ [413:50] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [413:87] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getRepresentativeElement[ReceiverParameterDescriptorImpl]

'parent' @ [414:43] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [415:33] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getRepresentativeElement[ReceiverParameterDescriptorImpl]

'element' @ [420:49] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getElementText[ValueParameterDescriptorImpl]

'getRepresentativeElement' @ [420:57] ==> private final fun PsiElement.getRepresentativeElement(): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'representativeElement' @ [421:28] ==> val representativeElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getElementText[LocalVariableDescriptor]

'renderDeclaration' @ [421:50] ==> private final fun PsiElement.renderDeclaration(): String? defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'representativeElement' @ [421:73] ==> val representativeElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getElementText[LocalVariableDescriptor]

'renderText' @ [421:95] ==> private final fun PsiElement.renderText(): String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [429:25] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[LazyClassReceiverParameterDescriptor]

'getIcon' @ [429:31] ==> protected/*protected and package*/ open fun getIcon(p0: (PsiElement..PsiElement?)): (Icon..Icon?) defined in com.intellij.ide.util.PsiElementListCellRenderer[JavaMethodDescriptor]

'element' @ [429:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>.getIcon[ValueParameterDescriptorImpl]

'getRepresentativeElement' @ [429:47] ==> private final fun PsiElement.getRepresentativeElement(): PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<no name provided>[SimpleFunctionDescriptorImpl]

'title' @ [431:13] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement[ValueParameterDescriptorImpl]

'highlightSelection' @ [432:13] ==> value-parameter highlightSelection: Boolean defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement[ValueParameterDescriptorImpl]

'toPsi' @ [433:13] ==> value-parameter toPsi: (T) -> PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement[ValueParameterDescriptorImpl]

'invoke' @ [435:17] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [435:26] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement.<anonymous>[ValueParameterDescriptorImpl]

'showInBestPositionFor' @ [438:7] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'editor' @ [438:29] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElement[ValueParameterDescriptorImpl]

'when {
        containers.isEmpty() -> return
        containers.size == 1 || ApplicationManager.getApplication()!!.isUnitTestMode -> onSelect(containers.first())
        else -> chooseContainerElement(containers, editor, title, highlightSelection, toPsi, onSelect)
    }' @ [449:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'containers' @ [450:9] ==> value-parameter containers: List<T> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'isEmpty' @ [450:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'containers' @ [451:9] ==> value-parameter containers: List<T> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'size' @ [451:20] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'!!' @ [451:33] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [451:52] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [451:71] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'invoke' @ [451:89] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'containers' @ [451:98] ==> value-parameter containers: List<T> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'first' @ [451:109] ==> public fun <T> List<T>.first(): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'chooseContainerElement' @ [452:17] ==> public fun <T> chooseContainerElement(containers: List<T>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (T) -> PsiElement, onSelect: (T) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'containers' @ [452:40] ==> value-parameter containers: List<T> defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'editor' @ [452:52] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'title' @ [452:60] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'highlightSelection' @ [452:67] ==> value-parameter highlightSelection: Boolean defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'toPsi' @ [452:87] ==> value-parameter toPsi: (T) -> PsiElement defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'onSelect' @ [452:94] ==> value-parameter onSelect: (T) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.chooseContainerElementIfNecessary[ValueParameterDescriptorImpl]

'this' @ [456:46] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.isTrueJavaMethod[ReceiverParameterDescriptorImpl]

'this' @ [456:67] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.isTrueJavaMethod[ReceiverParameterDescriptorImpl]

'!' @ [459:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [459:10] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.canRefactor[ReceiverParameterDescriptorImpl]

'isValid' @ [459:15] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'when {
        this is PsiPackage ->
            directories.any { it.canRefactor() }
        this is KtElement ||
        this is PsiMember && language == JavaLanguage.INSTANCE ||
        this is PsiDirectory ->
            ProjectRootsUtil.isInProjectSource(this)
        else ->
            false
    }' @ [461:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [462:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.canRefactor[ReceiverParameterDescriptorImpl]

'directories' @ [463:13] ==> public final val PsiPackage.directories: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>)[MyPropertyDescriptor]

'any' @ [463:25] ==> public inline fun <T> Array<out (PsiDirectory..PsiDirectory?)>.any(predicate: ((PsiDirectory..PsiDirectory?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'it' @ [463:31] ==> value-parameter it: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.refactoring.canRefactor.<anonymous>[ValueParameterDescriptorImpl]

'canRefactor' @ [463:34] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [464:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.canRefactor[ReceiverParameterDescriptorImpl]

'this' @ [465:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.canRefactor[ReceiverParameterDescriptorImpl]

'language' @ [465:30] ==> public final val PsiMember.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [465:55] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'this' @ [466:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.canRefactor[ReceiverParameterDescriptorImpl]

'isInProjectSource' @ [467:30] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [467:48] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.canRefactor[ReceiverParameterDescriptorImpl]

'withPsiModifiers' @ [474:9] ==> value-parameter withPsiModifiers: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[ValueParameterDescriptorImpl]

'iterator' @ [475:26] ==> public final operator fun iterator(): Iterator<(String..String?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'MODIFIERS' @ [475:38] ==> public final val MODIFIERS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'from' @ [476:17] ==> value-parameter from: PsiModifierList defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[ValueParameterDescriptorImpl]

'hasExplicitModifier' @ [476:22] ==> public abstract fun hasExplicitModifier(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'modifier' @ [476:42] ==> val modifier: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[LocalVariableDescriptor]

'to' @ [477:17] ==> value-parameter to: PsiModifierList defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[ValueParameterDescriptorImpl]

'setModifierProperty' @ [477:20] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'modifier' @ [477:40] ==> val modifier: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[LocalVariableDescriptor]

'from' @ [481:24] ==> value-parameter from: PsiModifierList defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[ValueParameterDescriptorImpl]

'annotations' @ [481:29] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'annotation' @ [482:30] ==> val annotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[LocalVariableDescriptor]

'qualifiedName' @ [482:41] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'Retention' @ [484:13] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'java' @ [484:30] ==> public val <T> KClass<Retention>.java: Class<Retention> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Retention

'name' @ [484:35] ==> public final val <T : (Any..Any?)> Class<Retention>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Retention

'annotationName' @ [484:43] ==> val annotationName: String defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[LocalVariableDescriptor]

'to' @ [485:13] ==> value-parameter to: PsiModifierList defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[ValueParameterDescriptorImpl]

'addAnnotation' @ [485:16] ==> @NotNull public abstract fun addAnnotation(@NotNull @NonNls p0: String): PsiAnnotation defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'annotationName' @ [485:30] ==> val annotationName: String defined in org.jetbrains.kotlin.idea.refactoring.copyModifierListItems[LocalVariableDescriptor]

'getInstance' @ [495:45] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'from' @ [495:58] ==> value-parameter from: T defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[ValueParameterDescriptorImpl]

'project' @ [495:78] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'from' @ [496:30] ==> value-parameter from: T defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[ValueParameterDescriptorImpl]

'typeParameterList' @ [496:35] ==> public final val PsiTypeParameterListOwner.typeParameterList: PsiTypeParameterList?[MyPropertyDescriptor]

'typeParameters' @ [496:54] ==> public final val PsiTypeParameterList.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [496:89] ==> public final val EMPTY_ARRAY: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>?) defined in com.intellij.psi.PsiTypeParameter[JavaPropertyDescriptor]

'templateTypeParams' @ [497:9] ==> val templateTypeParams: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>?) defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'isNotEmpty' @ [497:28] ==> @InlineOnly public inline fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'invoke' @ [498:9] ==> public abstract operator fun invoke(p1: T, p2: PsiTypeParameterList): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'to' @ [498:18] ==> value-parameter to: T defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[ValueParameterDescriptorImpl]

'factory' @ [498:22] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'createTypeParameterList' @ [498:30] ==> @NotNull public abstract fun createTypeParameterList(): PsiTypeParameterList defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'to' @ [499:35] ==> value-parameter to: T defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[ValueParameterDescriptorImpl]

'typeParameterList' @ [499:38] ==> public final val PsiTypeParameterListOwner.typeParameterList: PsiTypeParameterList?[MyPropertyDescriptor]

'templateTypeParams' @ [500:29] ==> val templateTypeParams: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>?) defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'map' @ [500:48] ==> public inline fun <T, R> Array<out (PsiTypeParameter..PsiTypeParameter?)>.map(transform: ((PsiTypeParameter..PsiTypeParameter?)) -> PsiTypeParameter): List<PsiTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)
    <R> -> PsiTypeParameter

'factory' @ [501:13] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'createTypeParameter' @ [501:21] ==> @NotNull public abstract fun createTypeParameter(p0: (String..String?), p1: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>?)): PsiTypeParameter defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'it' @ [501:41] ==> value-parameter it: (PsiTypeParameter..PsiTypeParameter?) defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [501:44] ==> public final val PsiTypeParameter.name: String?[MyPropertyDescriptor]

'it' @ [501:50] ==> value-parameter it: (PsiTypeParameter..PsiTypeParameter?) defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'extendsList' @ [501:53] ==> public final val PsiTypeParameter.extendsList: PsiReferenceList[MyPropertyDescriptor]

'referencedTypes' @ [501:65] ==> public final val PsiReferenceList.referencedTypes: (Array<(PsiClassType..PsiClassType?)>..Array<out (PsiClassType..PsiClassType?)>)[MyPropertyDescriptor]

'synchronizeList' @ [503:29] ==> public final fun <Parent : (PsiElement..PsiElement?), Child : (PsiElement..PsiElement?)> synchronizeList(p0: PsiTypeParameterList?, p1: (MutableList<(PsiTypeParameter..PsiTypeParameter?)>..List<(PsiTypeParameter..PsiTypeParameter?)>?), p2: ((PsiTypeParameterList?) -> (MutableList<(PsiTypeParameter..PsiTypeParameter?)>..List<(PsiTypeParameter..PsiTypeParameter?)>?)..((PsiTypeParameterList?) -> (MutableList<(PsiTypeParameter..PsiTypeParameter?)>..List<(PsiTypeParameter..PsiTypeParameter?)>?))?), p3: (BooleanArray..BooleanArray?)): Unit defined in com.intellij.refactoring.changeSignature.ChangeSignatureUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <Parent : (PsiElement..PsiElement?)> -> PsiTypeParameterList?
    <Child : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'targetTypeParamList' @ [504:17] ==> val targetTypeParamList: PsiTypeParameterList? defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'newTypeParams' @ [505:17] ==> val newTypeParams: List<PsiTypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'it' @ [506:19] ==> value-parameter it: PsiTypeParameterList? defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [506:24] ==> public final val PsiTypeParameterList.typeParameters: (Array<(PsiTypeParameter..PsiTypeParameter?)>..Array<out (PsiTypeParameter..PsiTypeParameter?)>)[MyPropertyDescriptor]

'toList' @ [506:39] ==> public fun <T> Array<out (PsiTypeParameter..PsiTypeParameter?)>.toList(): List<(PsiTypeParameter..PsiTypeParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiTypeParameter..com.intellij.psi.PsiTypeParameter?)

'BooleanArray' @ [507:17] ==> public constructor BooleanArray(size: Int) defined in kotlin.BooleanArray[DeserializedClassConstructorDescriptor]

'newTypeParams' @ [507:30] ==> val newTypeParams: List<PsiTypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.copyTypeParameters[LocalVariableDescriptor]

'size' @ [507:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'?:' @ [513:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiMethod?, right: PsiMethod): PsiMethod[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiMethod

'getLightClassMethod' @ [513:35] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'function' @ [513:55] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'AssertionError' @ [514:29] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'function' @ [514:76] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [514:85] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'createJavaMethod' @ [515:12] ==> public fun createJavaMethod(template: PsiMethod, targetClass: PsiClass): PsiMethod defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'template' @ [515:29] ==> val template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'targetClass' @ [515:39] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'getInstance' @ [519:45] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'template' @ [519:57] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'project' @ [519:66] ==> public final val PsiMethod.project: Project[MyPropertyDescriptor]

'if (template.isConstructor) {
        factory.createConstructor(template.name)
    }
    else {
        factory.createMethod(template.name, template.returnType)
    }' @ [520:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiMethod, elseBranch: PsiMethod): PsiMethod[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiMethod

'template' @ [520:27] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'isConstructor' @ [520:36] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'factory' @ [521:9] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'createConstructor' @ [521:17] ==> @NotNull public abstract fun createConstructor(@NotNull @NonNls p0: String): PsiMethod defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'template' @ [521:35] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'name' @ [521:44] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'factory' @ [524:9] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'createMethod' @ [524:17] ==> @NotNull public abstract fun createMethod(@NotNull @NonNls p0: String, p1: (PsiType..PsiType?)): PsiMethod defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'template' @ [524:30] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'name' @ [524:39] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'template' @ [524:45] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'returnType' @ [524:54] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'targetClass' @ [526:18] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'add' @ [526:30] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'methodToAdd' @ [526:34] ==> val methodToAdd: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'copyModifierListItems' @ [528:5] ==> private fun copyModifierListItems(from: PsiModifierList, to: PsiModifierList, withPsiModifiers: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'template' @ [528:27] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'modifierList' @ [528:36] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'method' @ [528:50] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'modifierList' @ [528:57] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'targetClass' @ [529:9] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'isInterface' @ [529:21] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'method' @ [530:9] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'modifierList' @ [530:16] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'setModifierProperty' @ [530:29] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'FINAL' @ [530:61] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'copyTypeParameters' @ [533:5] ==> private fun <T : PsiTypeParameterListOwner> copyTypeParameters(from: PsiMethod, to: PsiMethod, inserter: (PsiMethod, PsiTypeParameterList) -> Unit): Unit where T : PsiNameIdentifierOwner defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiTypeParameterListOwner & PsiNameIdentifierOwner> -> PsiMethod

'template' @ [533:24] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'method' @ [533:34] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'method' @ [534:9] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [534:16] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'typeParameterList' @ [534:25] ==> value-parameter typeParameterList: PsiTypeParameterList defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [534:44] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'modifierList' @ [534:51] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'method' @ [537:27] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'parameterList' @ [537:34] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'template' @ [538:21] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'parameterList' @ [538:30] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [538:44] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'map' @ [538:55] ==> public inline fun <T, R> Array<out (PsiParameter..PsiParameter?)>.map(transform: ((PsiParameter..PsiParameter?)) -> PsiParameter): List<PsiParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)
    <R> -> PsiParameter

'factory' @ [539:21] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'createParameter' @ [539:29] ==> @NotNull public abstract fun createParameter(@NotNull @NonNls p0: String, @NotNull p1: PsiType): PsiParameter defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'it' @ [539:45] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [539:48] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'it' @ [539:56] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [539:59] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'copyModifierListItems' @ [540:9] ==> private fun copyModifierListItems(from: PsiModifierList, to: PsiModifierList, withPsiModifiers: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [540:31] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'modifierList' @ [540:34] ==> public final val PsiParameter.modifierList: PsiModifierList?[MyPropertyDescriptor]

'param' @ [540:50] ==> val param: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[LocalVariableDescriptor]

'modifierList' @ [540:56] ==> public final val PsiParameter.modifierList: PsiModifierList?[MyPropertyDescriptor]

'param' @ [541:9] ==> val param: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[LocalVariableDescriptor]

'synchronizeList' @ [543:25] ==> public final fun <Parent : (PsiElement..PsiElement?), Child : (PsiElement..PsiElement?)> synchronizeList(p0: (PsiParameterList..PsiParameterList?), p1: (MutableList<(PsiParameter..PsiParameter?)>..List<(PsiParameter..PsiParameter?)>?), p2: (((PsiParameterList..PsiParameterList?)) -> (MutableList<(PsiParameter..PsiParameter?)>..List<(PsiParameter..PsiParameter?)>?)..(((PsiParameterList..PsiParameterList?)) -> (MutableList<(PsiParameter..PsiParameter?)>..List<(PsiParameter..PsiParameter?)>?))?), p3: (BooleanArray..BooleanArray?)): Unit defined in com.intellij.refactoring.changeSignature.ChangeSignatureUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <Parent : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiParameterList..com.intellij.psi.PsiParameterList?)
    <Child : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'targetParamList' @ [544:13] ==> val targetParamList: PsiParameterList defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'newParams' @ [545:13] ==> val newParams: List<PsiParameter> defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'it' @ [546:15] ==> value-parameter it: (PsiParameterList..PsiParameterList?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [546:18] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'toList' @ [546:29] ==> public fun <T> Array<out (PsiParameter..PsiParameter?)>.toList(): List<(PsiParameter..PsiParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'BooleanArray' @ [547:13] ==> public constructor BooleanArray(size: Int) defined in kotlin.BooleanArray[DeserializedClassConstructorDescriptor]

'newParams' @ [547:26] ==> val newParams: List<PsiParameter> defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'size' @ [547:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (template.modifierList.hasModifierProperty(PsiModifier.ABSTRACT) || targetClass.isInterface) {
        method.body!!.delete()
    }
    else if (!template.isConstructor) {
        CreateFromUsageUtils.setupMethodBody(method)
    }' @ [550:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'template' @ [550:9] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'modifierList' @ [550:18] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'hasModifierProperty' @ [550:31] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'ABSTRACT' @ [550:63] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'targetClass' @ [550:76] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'isInterface' @ [550:88] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'method' @ [551:9] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'body' @ [551:16] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'delete' @ [551:23] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiCodeBlock[JavaMethodDescriptor]

'!' @ [553:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'template' @ [553:15] ==> value-parameter template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[ValueParameterDescriptorImpl]

'isConstructor' @ [553:24] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'setupMethodBody' @ [554:30] ==> public open fun setupMethodBody(@NotNull p0: PsiMethod): Unit defined in com.intellij.codeInsight.daemon.impl.quickfix.CreateFromUsageUtils[JavaMethodDescriptor]

'method' @ [554:46] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'method' @ [557:12] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaMethod[LocalVariableDescriptor]

'property' @ [561:32] ==> value-parameter property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[ValueParameterDescriptorImpl]

'getAccessorLightMethods' @ [561:41] ==> public fun KtNamedDeclaration.getAccessorLightMethods(): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'accessorLightMethods' @ [562:20] ==> val accessorLightMethods: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'getter' @ [562:41] ==> public final val getter: PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[DeserializedPropertyDescriptor]

'AssertionError' @ [563:29] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'property' @ [563:76] ==> value-parameter property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [563:85] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [565:45] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'template' @ [565:57] ==> val template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'project' @ [565:66] ==> public final val PsiMethod.project: Project[MyPropertyDescriptor]

'targetClass' @ [566:17] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[ValueParameterDescriptorImpl]

'add' @ [566:29] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'factory' @ [566:33] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'createField' @ [566:41] ==> @NotNull public abstract fun createField(@NotNull @NonNls p0: String, @NotNull p1: PsiType): PsiField defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'property' @ [566:53] ==> value-parameter property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[ValueParameterDescriptorImpl]

'name' @ [566:62] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'template' @ [566:70] ==> val template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'returnType' @ [566:79] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'with' @ [568:5] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiModifierList, block: (PsiModifierList).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiModifierList
    <R> -> Unit

'field' @ [568:10] ==> val field: PsiField defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'modifierList' @ [568:16] ==> public final val PsiField.modifierList: PsiModifierList?[MyPropertyDescriptor]

'template' @ [569:33] ==> val template: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'modifierList' @ [569:42] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'setModifierProperty' @ [570:9] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'getVisibilityModifier' @ [570:44] ==> @PsiModifier.ModifierConstant @NotNull public open fun getVisibilityModifier(p0: (PsiModifierList..PsiModifierList?)): String defined in com.intellij.util.VisibilityUtil[JavaMethodDescriptor]

'templateModifiers' @ [570:66] ==> val templateModifiers: PsiModifierList defined in org.jetbrains.kotlin.idea.refactoring.createJavaField.<anonymous>[LocalVariableDescriptor]

'!=' @ [571:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[DeserializedSimpleFunctionDescriptor]

'property' @ [571:14] ==> value-parameter property: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[ValueParameterDescriptorImpl]

'valOrVarKeyword' @ [571:48] ==> public final val KtValVarKeywordOwner.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'toValVar' @ [571:64] ==> public fun PsiElement?.toValVar(): KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'Var' @ [571:91] ==> enum entry Var defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'targetClass' @ [571:98] ==> value-parameter targetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[ValueParameterDescriptorImpl]

'isInterface' @ [571:110] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'setModifierProperty' @ [572:13] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'FINAL' @ [572:45] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'copyModifierListItems' @ [574:9] ==> private fun copyModifierListItems(from: PsiModifierList, to: PsiModifierList, withPsiModifiers: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'templateModifiers' @ [574:31] ==> val templateModifiers: PsiModifierList defined in org.jetbrains.kotlin.idea.refactoring.createJavaField.<anonymous>[LocalVariableDescriptor]

'this' @ [574:50] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.createJavaField.<anonymous>[ReceiverParameterDescriptorImpl]

'field' @ [577:12] ==> val field: PsiField defined in org.jetbrains.kotlin.idea.refactoring.createJavaField[LocalVariableDescriptor]

'if (forcePlainClass) ClassKind.CLASS else (klass.resolveToDescriptor() as ClassDescriptor).kind' @ [581:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassKind, elseBranch: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassKind

'forcePlainClass' @ [581:20] ==> value-parameter forcePlainClass: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'CLASS' @ [581:47] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'klass' @ [581:59] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [581:65] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'kind' @ [581:107] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'getInstance' @ [583:45] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'klass' @ [583:57] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'project' @ [583:63] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'klass' @ [584:21] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'name' @ [584:27] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'when (kind) {
        ClassKind.CLASS -> factory.createClass(className)
        ClassKind.INTERFACE -> factory.createInterface(className)
        ClassKind.ANNOTATION_CLASS -> factory.createAnnotationType(className)
        ClassKind.ENUM_CLASS -> factory.createEnum(className)
        else -> throw AssertionError("Unexpected class kind: ${klass.getElementTextWithContext()}")
    }' @ [585:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass, entry1: PsiClass, entry2: PsiClass, entry3: PsiClass, entry4: PsiClass): PsiClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass

'kind' @ [585:32] ==> val kind: ClassKind defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'CLASS' @ [586:19] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'factory' @ [586:28] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createClass' @ [586:36] ==> @NotNull public abstract fun createClass(@NonNls @NotNull p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'className' @ [586:48] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'INTERFACE' @ [587:19] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'factory' @ [587:32] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createInterface' @ [587:40] ==> @NotNull public abstract fun createInterface(@NonNls @NotNull p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'className' @ [587:56] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'ANNOTATION_CLASS' @ [588:19] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'factory' @ [588:39] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createAnnotationType' @ [588:47] ==> @NotNull public abstract fun createAnnotationType(@NotNull @NonNls p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'className' @ [588:68] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'ENUM_CLASS' @ [589:19] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'factory' @ [589:33] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createEnum' @ [589:41] ==> @NotNull public abstract fun createEnum(@NotNull @NonNls p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'className' @ [589:52] ==> val className: String defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'AssertionError' @ [590:23] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'klass' @ [590:64] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [590:70] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'targetClass' @ [592:22] ==> value-parameter targetClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'add' @ [592:35] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'javaClassToAdd' @ [592:39] ==> val javaClassToAdd: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'javaClassToAdd' @ [592:58] ==> val javaClassToAdd: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'klass' @ [594:20] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'toLightClass' @ [594:26] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [594:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'klass' @ [594:96] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [594:102] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'copyModifierListItems' @ [596:5] ==> private fun copyModifierListItems(from: PsiModifierList, to: PsiModifierList, withPsiModifiers: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'template' @ [596:27] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'modifierList' @ [596:36] ==> public final val KtLightClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'javaClass' @ [596:52] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'modifierList' @ [596:62] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'template' @ [597:9] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'isInterface' @ [597:18] ==> public final val KtLightClass.isInterface: Boolean[MyPropertyDescriptor]

'javaClass' @ [598:9] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'modifierList' @ [598:19] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'setModifierProperty' @ [598:34] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'ABSTRACT' @ [598:66] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'copyTypeParameters' @ [601:5] ==> private fun <T : PsiTypeParameterListOwner> copyTypeParameters(from: PsiClass, to: PsiClass, inserter: (PsiClass, PsiTypeParameterList) -> Unit): Unit where T : PsiNameIdentifierOwner defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiTypeParameterListOwner & PsiNameIdentifierOwner> -> PsiClass

'template' @ [601:24] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'javaClass' @ [601:34] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'klass' @ [602:9] ==> value-parameter klass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [602:15] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'typeParameterList' @ [602:24] ==> value-parameter typeParameterList: PsiTypeParameterList defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'klass' @ [602:43] ==> value-parameter klass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [602:49] ==> public final val PsiClass.nameIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'if (!javaClass.isInterface && template.isInterface) {
        val implementsList = factory.createReferenceListWithRole(
                template.extendsList?.referenceElements ?: PsiJavaCodeReferenceElement.EMPTY_ARRAY,
                PsiReferenceList.Role.IMPLEMENTS_LIST
        )
        implementsList?.let { javaClass.implementsList?.replace(it) }
    }
    else {
        val extendsList = factory.createReferenceListWithRole(
                template.extendsList?.referenceElements ?: PsiJavaCodeReferenceElement.EMPTY_ARRAY,
                PsiReferenceList.Role.EXTENDS_LIST
        )
        extendsList?.let { javaClass.extendsList?.replace(it) }

        val implementsList = factory.createReferenceListWithRole(
                template.implementsList?.referenceElements ?: PsiJavaCodeReferenceElement.EMPTY_ARRAY,
                PsiReferenceList.Role.IMPLEMENTS_LIST
        )
        implementsList?.let { javaClass.implementsList?.replace(it) }
    }' @ [606:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'!' @ [606:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'javaClass' @ [606:10] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'isInterface' @ [606:20] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'template' @ [606:35] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'isInterface' @ [606:44] ==> public final val KtLightClass.isInterface: Boolean[MyPropertyDescriptor]

'factory' @ [607:30] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createReferenceListWithRole' @ [607:38] ==> public fun PsiElementFactory.createReferenceListWithRole(references: Array<PsiJavaCodeReferenceElement>, role: PsiReferenceList.Role): PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring in file javaElementFactoryUtils.kt[SimpleFunctionDescriptorImpl]

'template' @ [608:17] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'extendsList' @ [608:26] ==> public final val KtLightClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'referenceElements' @ [608:39] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [608:88] ==> public final val EMPTY_ARRAY: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>?) defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaPropertyDescriptor]

'IMPLEMENTS_LIST' @ [609:39] ==> enum entry IMPLEMENTS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'implementsList' @ [611:9] ==> val implementsList: PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'let' @ [611:25] ==> @InlineOnly public inline fun <T, R> PsiReferenceList.let(block: (PsiReferenceList) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceList
    <R> -> PsiElement?

'javaClass' @ [611:31] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'implementsList' @ [611:41] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'replace' @ [611:57] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceList[JavaMethodDescriptor]

'it' @ [611:65] ==> value-parameter it: PsiReferenceList defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [614:27] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createReferenceListWithRole' @ [614:35] ==> public fun PsiElementFactory.createReferenceListWithRole(references: Array<PsiJavaCodeReferenceElement>, role: PsiReferenceList.Role): PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring in file javaElementFactoryUtils.kt[SimpleFunctionDescriptorImpl]

'template' @ [615:17] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'extendsList' @ [615:26] ==> public final val KtLightClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'referenceElements' @ [615:39] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [615:88] ==> public final val EMPTY_ARRAY: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>?) defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaPropertyDescriptor]

'EXTENDS_LIST' @ [616:39] ==> enum entry EXTENDS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'extendsList' @ [618:9] ==> val extendsList: PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'let' @ [618:22] ==> @InlineOnly public inline fun <T, R> PsiReferenceList.let(block: (PsiReferenceList) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceList
    <R> -> PsiElement?

'javaClass' @ [618:28] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'extendsList' @ [618:38] ==> public final val PsiClass.extendsList: PsiReferenceList?[MyPropertyDescriptor]

'replace' @ [618:51] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceList[JavaMethodDescriptor]

'it' @ [618:59] ==> value-parameter it: PsiReferenceList defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [620:30] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createReferenceListWithRole' @ [620:38] ==> public fun PsiElementFactory.createReferenceListWithRole(references: Array<PsiJavaCodeReferenceElement>, role: PsiReferenceList.Role): PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring in file javaElementFactoryUtils.kt[SimpleFunctionDescriptorImpl]

'template' @ [621:17] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'implementsList' @ [621:26] ==> public final val KtLightClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'referenceElements' @ [621:42] ==> public final val PsiReferenceList.referenceElements: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [621:91] ==> public final val EMPTY_ARRAY: (Array<(PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>..Array<out (PsiJavaCodeReferenceElement..PsiJavaCodeReferenceElement?)>?) defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaPropertyDescriptor]

'IMPLEMENTS_LIST' @ [622:39] ==> enum entry IMPLEMENTS_LIST defined in com.intellij.psi.PsiReferenceList.Role[FakeCallableDescriptorForObject]

'implementsList' @ [624:9] ==> val implementsList: PsiReferenceList? defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'let' @ [624:25] ==> @InlineOnly public inline fun <T, R> PsiReferenceList.let(block: (PsiReferenceList) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceList
    <R> -> PsiElement?

'javaClass' @ [624:31] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'implementsList' @ [624:41] ==> public final val PsiClass.implementsList: PsiReferenceList?[MyPropertyDescriptor]

'replace' @ [624:57] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReferenceList[JavaMethodDescriptor]

'it' @ [624:65] ==> value-parameter it: PsiReferenceList defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'template' @ [627:20] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'methods' @ [627:29] ==> public final val KtLightClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'method' @ [628:25] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'parameterList' @ [628:32] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [628:46] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'!' @ [629:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'template' @ [629:30] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'isEnum' @ [629:39] ==> public final val KtLightClass.isEnum: Boolean[MyPropertyDescriptor]

'template' @ [630:30] ==> val template: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'superClass' @ [630:39] ==> public final val KtLightClass.superClass: PsiClass?[MyPropertyDescriptor]

'constructors' @ [630:51] ==> public final val PsiClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'EMPTY_ARRAY' @ [630:77] ==> public final val EMPTY_ARRAY: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>?) defined in com.intellij.psi.PsiMethod[JavaPropertyDescriptor]

'all' @ [630:90] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.all(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [631:33] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ValueParameterDescriptorImpl]

'parameterList' @ [631:36] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [631:50] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'method' @ [633:13] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'isConstructor' @ [633:20] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'!' @ [633:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasParams' @ [633:39] ==> val hasParams: Boolean defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'needSuperCall' @ [633:52] ==> val needSuperCall: Boolean defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'with' @ [634:9] ==> @InlineOnly public inline fun <T, R> with(receiver: PsiMethod, block: PsiMethod.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> Unit

'createJavaMethod' @ [634:14] ==> public fun createJavaMethod(template: PsiMethod, targetClass: PsiClass): PsiMethod defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'method' @ [634:31] ==> val method: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'javaClass' @ [634:39] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'isConstructor' @ [635:17] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'needSuperCall' @ [635:34] ==> val needSuperCall: Boolean defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'body' @ [636:17] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'add' @ [636:24] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiCodeBlock[JavaMethodDescriptor]

'factory' @ [636:28] ==> val factory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'createStatementFromText' @ [636:36] ==> @NotNull public abstract fun createStatementFromText(@NotNull @NonNls p0: String, @Nullable p1: PsiElement?): PsiStatement defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'this' @ [636:72] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass.<anonymous>[ReceiverParameterDescriptorImpl]

'javaClass' @ [641:12] ==> val javaClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.createJavaClass[LocalVariableDescriptor]

'language' @ [645:9] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [645:34] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'JavaToKotlinConverter' @ [647:24] ==> public constructor JavaToKotlinConverter(project: Project, settings: ConverterSettings, services: JavaToKotlinConverterServices) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedClassConstructorDescriptor]

'project' @ [647:46] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'defaultSettings' @ [648:74] ==> public final val defaultSettings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ConverterSettings.Companion[DeserializedPropertyDescriptor]

'IdeaJavaToKotlinServices' @ [649:46] ==> public object IdeaJavaToKotlinServices : JavaToKotlinConverterServices defined in org.jetbrains.kotlin.idea.j2k in file IdeaJavaToKotlinServices.kt[FakeCallableDescriptorForObject]

'j2kConverter' @ [650:12] ==> val j2kConverter: JavaToKotlinConverter defined in org.jetbrains.kotlin.idea.refactoring.j2kText[LocalVariableDescriptor]

'elementsToKotlin' @ [650:25] ==> public final fun elementsToKotlin(inputElements: List<PsiElement>): JavaToKotlinConverter.Result defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedSimpleFunctionDescriptor]

'listOf' @ [650:42] ==> public fun <T> listOf(element: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'this' @ [650:49] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.j2kText[ReceiverParameterDescriptorImpl]

'results' @ [650:56] ==> public final val results: List<JavaToKotlinConverter.ElementResult?> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.Result[DeserializedPropertyDescriptor]

'single' @ [650:64] ==> public fun <T> List<JavaToKotlinConverter.ElementResult?>.single(): JavaToKotlinConverter.ElementResult? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementResult?

'text' @ [650:74] ==> public final val text: String defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.ElementResult[DeserializedPropertyDescriptor]

'j2kText' @ [654:16] ==> public fun PsiElement.j2kText(): String? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [655:12] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [655:25] ==> public final val PsiExpression.project: Project[MyPropertyDescriptor]

'createExpression' @ [655:34] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [655:51] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.j2k[LocalVariableDescriptor]

'j2kText' @ [659:16] ==> public fun PsiElement.j2kText(): String? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [660:12] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [660:25] ==> public final val PsiMember.project: Project[MyPropertyDescriptor]

'createDeclaration' @ [660:34] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtNamedDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtNamedDeclaration

'text' @ [660:52] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.j2k[LocalVariableDescriptor]

'project' @ [668:22] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.runRefactoringWithPostprocessing[ValueParameterDescriptorImpl]

'messageBus' @ [668:30] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [668:41] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'connection' @ [669:5] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.refactoring.runRefactoringWithPostprocessing[LocalVariableDescriptor]

'subscribe' @ [669:16] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(RefactoringEventListener..RefactoringEventListener?)>, @NotNull p1: RefactoringEventListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.refactoring.listeners.RefactoringEventListener..com.intellij.refactoring.listeners.RefactoringEventListener?)

'REFACTORING_EVENT_TOPIC' @ [669:51] ==> public final val REFACTORING_EVENT_TOPIC: (Topic<(RefactoringEventListener..RefactoringEventListener?)>..Topic<(RefactoringEventListener..RefactoringEventListener?)>?) defined in com.intellij.refactoring.listeners.RefactoringEventListener[JavaPropertyDescriptor]

'refactoringId' @ [684:38] ==> value-parameter refactoringId: String defined in org.jetbrains.kotlin.idea.refactoring.runRefactoringWithPostprocessing.<no name provided>.refactoringDone[ValueParameterDescriptorImpl]

'targetRefactoringId' @ [684:55] ==> value-parameter targetRefactoringId: String defined in org.jetbrains.kotlin.idea.refactoring.runRefactoringWithPostprocessing[ValueParameterDescriptorImpl]

'invoke' @ [686:42] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'connection' @ [689:42] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.refactoring.runRefactoringWithPostprocessing[LocalVariableDescriptor]

'disconnect' @ [689:53] ==> public abstract fun disconnect(): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]

'this' @ [694:5] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.runRefactoringWithPostprocessing[ReceiverParameterDescriptorImpl]

'Throws' @ [697:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'this' @ [698:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.validateElement[ReceiverParameterDescriptorImpl]

'ConfigurationException' @ [698:29] ==> public constructor ConfigurationException(p0: (String..String?)) defined in com.intellij.openapi.options.ConfigurationException[JavaClassConstructorDescriptor]

'errorMessage' @ [698:52] ==> value-parameter errorMessage: String defined in org.jetbrains.kotlin.idea.refactoring.validateElement[ValueParameterDescriptorImpl]

'checkForSyntacticErrors' @ [701:24] ==> public open fun checkForSyntacticErrors(@NotNull p0: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'this' @ [701:48] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.validateElement[ReceiverParameterDescriptorImpl]

'ConfigurationException' @ [704:15] ==> public constructor ConfigurationException(p0: (String..String?)) defined in com.intellij.openapi.options.ConfigurationException[JavaClassConstructorDescriptor]

'errorMessage' @ [704:38] ==> value-parameter errorMessage: String defined in org.jetbrains.kotlin.idea.refactoring.validateElement[ValueParameterDescriptorImpl]

'getInstance' @ [709:45] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'CommandAdapter' @ [710:29] ==> public constructor CommandAdapter() defined in com.intellij.openapi.command.CommandAdapter[JavaClassConstructorDescriptor]

'invoke' @ [712:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'commandProcessor' @ [713:13] ==> val commandProcessor: (CommandProcessor..CommandProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.invokeOnceOnCommandFinish[LocalVariableDescriptor]

'removeCommandListener' @ [713:30] ==> public abstract fun removeCommandListener(@NotNull p0: CommandListener): Unit defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'this' @ [713:52] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.invokeOnceOnCommandFinish.<no name provided>[LazyClassReceiverParameterDescriptor]

'commandProcessor' @ [716:5] ==> val commandProcessor: (CommandProcessor..CommandProcessor?) defined in org.jetbrains.kotlin.idea.refactoring.invokeOnceOnCommandFinish[LocalVariableDescriptor]

'addCommandListener' @ [716:22] ==> public abstract fun addCommandListener(@NotNull p0: CommandListener): Unit defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'listener' @ [716:41] ==> val listener: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.invokeOnceOnCommandFinish[LocalVariableDescriptor]

'pathSegments' @ [719:50] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'all' @ [719:65] ==> public inline fun <T> Iterable<(Name..Name?)>.all(predicate: ((Name..Name?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'KotlinNameSuggester' @ [719:71] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [719:91] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [719:104] ==> value-parameter it: (Name..Name?) defined in org.jetbrains.kotlin.idea.refactoring.hasIdentifiersOnly.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [719:107] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'quoteIfNeeded' @ [719:118] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'pathSegments' @ [721:44] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'all' @ [721:59] ==> public inline fun <T> Iterable<(Name..Name?)>.all(predicate: ((Name..Name?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'KotlinNameSuggester' @ [721:65] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [721:85] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [721:98] ==> value-parameter it: (Name..Name?) defined in org.jetbrains.kotlin.idea.refactoring.hasIdentifiersOnly.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [721:101] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'quoteIfNeeded' @ [721:112] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'when (this) {
    is KtClass -> isInterface()
    is PsiClass -> isInterface
    is KtPsiClassWrapper -> psiClass.isInterface
    else -> false
}' @ [723:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [723:57] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.isInterfaceClass[ReceiverParameterDescriptorImpl]

'isInterface' @ [724:19] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [725:20] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'psiClass' @ [726:29] ==> public abstract val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KtPsiClassWrapper[PropertyDescriptorImpl]

'isInterface' @ [726:38] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'hasModifier' @ [731:9] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [731:30] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [732:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClassOrObject' @ [732:11] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'isInterfaceClass' @ [732:36] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'when (this) {
        is KtProperty -> initializer == null && delegate == null && accessors.isEmpty()
        is KtNamedFunction -> !hasBody()
        else -> false
    }' @ [733:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [733:18] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.isAbstract[ReceiverParameterDescriptorImpl]

'initializer' @ [734:26] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'delegate' @ [734:49] ==> public final val KtProperty.delegate: KtPropertyDelegate?[MyPropertyDescriptor]

'accessors' @ [734:69] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'isEmpty' @ [734:79] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'!' @ [735:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBody' @ [735:32] ==> public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'this' @ [740:58] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.isConstructorDeclaredProperty[ReceiverParameterDescriptorImpl]

'ownerFunction' @ [740:81] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'hasValOrVar' @ [740:122] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'Suppress' @ [745:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'replace' @ [745:87] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'it' @ [745:95] ==> value-parameter it: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters.<anonymous>[ValueParameterDescriptorImpl]

'originalList' @ [748:5] ==> value-parameter originalList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'children' @ [748:18] ==> public final val KtElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'takeWhile' @ [748:27] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.takeWhile(predicate: ((PsiElement..PsiElement?)) -> Boolean): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [748:39] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [748:63] ==> @HidesMembers public inline fun <T> Iterable<(PsiElement..PsiElement?)>.forEach(action: ((PsiElement..PsiElement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [748:73] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [748:76] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'originalList' @ [750:25] ==> value-parameter originalList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'invoke' @ [750:38] ==> public abstract operator fun ListType.invoke(): List<KtElement> defined in kotlin.Function1[FunctionInvokeDescriptor]

'toMutableList' @ [750:49] ==> public fun <T> Collection<KtElement>.toMutableList(): MutableList<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'newList' @ [751:25] ==> value-parameter newList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'invoke' @ [751:33] ==> public abstract operator fun ListType.invoke(): List<KtElement> defined in kotlin.Function1[FunctionInvokeDescriptor]

'oldParameters' @ [752:20] ==> val oldParameters: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'size' @ [752:34] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'newParameters' @ [753:20] ==> val newParameters: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'size' @ [753:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'min' @ [755:28] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'oldCount' @ [755:32] ==> val oldCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'newCount' @ [755:42] ==> val newCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'..' @ [756:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'commonCount' @ [756:18] ==> val commonCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'oldParameters' @ [757:9] ==> val oldParameters: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'i' @ [757:23] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'oldParameters' @ [757:28] ==> val oldParameters: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'i' @ [757:42] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'replace' @ [757:45] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'newParameters' @ [757:53] ==> val newParameters: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'i' @ [757:67] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'commonCount' @ [760:9] ==> val commonCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'originalList' @ [760:34] ==> value-parameter originalList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'invoke' @ [760:47] ==> public abstract operator fun ListType.invoke(p2: ListType): ListType defined in kotlin.Function2[FunctionInvokeDescriptor]

'newList' @ [760:60] ==> value-parameter newList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'if (oldCount > commonCount) {
        originalList.deleteChildRange(oldParameters[commonCount - 1].nextSibling, oldParameters.last())
    }
    else if (newCount > commonCount) {
        originalList.addRangeAfter(newParameters[commonCount - 1].nextSibling, newParameters.last(), oldParameters.last())
    }' @ [762:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'oldCount' @ [762:9] ==> val oldCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'commonCount' @ [762:20] ==> val commonCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'originalList' @ [763:9] ==> value-parameter originalList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'deleteChildRange' @ [763:22] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'oldParameters' @ [763:39] ==> val oldParameters: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'commonCount' @ [763:53] ==> val commonCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'nextSibling' @ [763:70] ==> public final val KtElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'oldParameters' @ [763:83] ==> val oldParameters: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'last' @ [763:97] ==> public fun <T> List<KtElement>.last(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'newCount' @ [765:14] ==> val newCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'commonCount' @ [765:25] ==> val commonCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'originalList' @ [766:9] ==> value-parameter originalList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'addRangeAfter' @ [766:22] ==> public abstract fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'newParameters' @ [766:36] ==> val newParameters: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'commonCount' @ [766:50] ==> val commonCount: Int defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'nextSibling' @ [766:67] ==> public final val KtElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'newParameters' @ [766:80] ==> val newParameters: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'last' @ [766:94] ==> public fun <T> List<KtElement>.last(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'oldParameters' @ [766:102] ==> val oldParameters: MutableList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[LocalVariableDescriptor]

'last' @ [766:116] ==> public fun <T> List<KtElement>.last(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'originalList' @ [769:12] ==> value-parameter originalList: ListType defined in org.jetbrains.kotlin.idea.refactoring.replaceListPsiAndKeepDelimiters[ValueParameterDescriptorImpl]

'Pass<T>' @ [772:44] ==> public constructor Pass<T : (Any..Any?)>() defined in com.intellij.openapi.util.Pass[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [773:31] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

't' @ [773:36] ==> value-parameter t: T defined in org.jetbrains.kotlin.idea.refactoring.Pass.<no name provided>.pass[ValueParameterDescriptorImpl]

'parent' @ [777:18] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [778:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'this' @ [778:55] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[ReceiverParameterDescriptorImpl]

'RemoveCurlyBracesFromTemplateIntention' @ [780:21] ==> public constructor RemoveCurlyBracesFromTemplateIntention() defined in org.jetbrains.kotlin.idea.intentions.RemoveCurlyBracesFromTemplateIntention[ClassConstructorDescriptorImpl]

'if (intention.isApplicableTo(parent)) intention.applyTo(parent) else parent' @ [781:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtStringTemplateEntryWithExpression, elseBranch: KtStringTemplateEntryWithExpression): KtStringTemplateEntryWithExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtStringTemplateEntryWithExpression

'intention' @ [781:24] ==> val intention: RemoveCurlyBracesFromTemplateIntention defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'isApplicableTo' @ [781:34] ==> public open fun isApplicableTo(element: KtBlockStringTemplateEntry): Boolean defined in org.jetbrains.kotlin.idea.intentions.RemoveCurlyBracesFromTemplateIntention[SimpleFunctionDescriptorImpl]

'parent' @ [781:49] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'intention' @ [781:58] ==> val intention: RemoveCurlyBracesFromTemplateIntention defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'applyTo' @ [781:68] ==> public final fun applyTo(element: KtBlockStringTemplateEntry): KtSimpleNameStringTemplateEntry defined in org.jetbrains.kotlin.idea.intentions.RemoveCurlyBracesFromTemplateIntention[SimpleFunctionDescriptorImpl]

'parent' @ [781:76] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'parent' @ [781:89] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'newEntry' @ [782:12] ==> val newEntry: KtStringTemplateEntryWithExpression defined in org.jetbrains.kotlin.idea.refactoring.removeTemplateEntryBracesIfPossible[LocalVariableDescriptor]

'expression' @ [782:21] ==> public final val KtStringTemplateEntryWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'element' @ [786:30] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.dropOverrideKeywordIfNecessary[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [786:38] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [786:74] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callableDescriptor' @ [787:9] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.dropOverrideKeywordIfNecessary[LocalVariableDescriptor]

'overriddenDescriptors' @ [787:28] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [787:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'element' @ [788:9] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.dropOverrideKeywordIfNecessary[ValueParameterDescriptorImpl]

'removeModifier' @ [788:17] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [788:41] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'initializer' @ [794:35] ==> value-parameter initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[ValueParameterDescriptorImpl]

'analyze' @ [794:47] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [794:71] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'initializer' @ [796:16] ==> value-parameter initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[ValueParameterDescriptorImpl]

'getResolvedCall' @ [796:28] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [796:44] ==> value-parameter context: BindingContext = ... defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[ValueParameterDescriptorImpl]

'call' @ [797:27] ==> val call: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[LocalVariableDescriptor]

'typeArguments' @ [797:32] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'call' @ [798:25] ==> val call: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[LocalVariableDescriptor]

'candidateDescriptor' @ [798:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'typeParameters' @ [798:50] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'mapNotNull' @ [798:65] ==> public inline fun <T, R : Any> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.mapNotNull(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R : Any> -> KotlinType

'typeArgumentMap' @ [798:78] ==> val typeArgumentMap: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[LocalVariableDescriptor]

'it' @ [798:94] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList.<anonymous>[ValueParameterDescriptorImpl]

'typeArguments' @ [799:24] ==> val typeArguments: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[LocalVariableDescriptor]

'joinToString' @ [799:38] ==> public fun <T> Iterable<KotlinType>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KotlinType) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'IdeDescriptorRenderers' @ [800:9] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION' @ [800:32] ==> @field:JvmField public final val SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [800:72] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [800:83] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [802:12] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'initializer' @ [802:25] ==> value-parameter initializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[ValueParameterDescriptorImpl]

'createTypeArguments' @ [802:38] ==> public final fun createTypeArguments(text: String): KtTypeArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'renderedList' @ [802:58] ==> val renderedList: String defined in org.jetbrains.kotlin.idea.refactoring.getQualifiedTypeArgumentList[LocalVariableDescriptor]

'expression' @ [806:19] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[ValueParameterDescriptorImpl]

'analyze' @ [806:30] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [806:54] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'expression' @ [807:16] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[ValueParameterDescriptorImpl]

'getCallWithAssert' @ [807:27] ==> public fun KtElement.getCallWithAssert(context: BindingContext): Call defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [807:45] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'call' @ [808:23] ==> val call: Call defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'callElement' @ [808:28] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'call' @ [809:9] ==> val call: Call defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'typeArgumentList' @ [809:14] ==> public final val Call.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'call' @ [810:18] ==> val call: Call defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'calleeExpression' @ [810:23] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'context' @ [811:9] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'diagnostics' @ [811:17] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [811:29] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'callee' @ [811:40] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'all' @ [811:48] ==> public inline fun <T> Iterable<Diagnostic>.all(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [811:54] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [811:57] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER' @ [811:75] ==> public final val TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER: (DiagnosticFactory1<(PsiElement..PsiElement?), (InferenceErrorData..InferenceErrorData?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (InferenceErrorData..InferenceErrorData?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'callElement' @ [813:5] ==> val callElement: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'addAfter' @ [813:17] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'typeArgumentList' @ [813:26] ==> value-parameter typeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[ValueParameterDescriptorImpl]

'callElement' @ [813:44] ==> val callElement: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'calleeExpression' @ [813:56] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'ShortenReferences' @ [814:5] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [814:23] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [814:31] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'callElement' @ [814:39] ==> val callElement: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.addTypeArgumentsIfNeeded[LocalVariableDescriptor]

'typeArgumentList' @ [814:51] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'!' @ [818:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [818:10] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [818:15] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'name' @ [818:33] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [818:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'this' @ [819:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.getThisLabelName[ReceiverParameterDescriptorImpl]

'source' @ [820:24] ==> public final val AnonymousFunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [820:31] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'function' @ [821:24] ==> val function: KtFunction? defined in org.jetbrains.kotlin.idea.refactoring.getThisLabelName[LocalVariableDescriptor]

'parent' @ [821:34] ==> public final val KtFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [822:27] ==> val argument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.getThisLabelName[LocalVariableDescriptor]

'getStrictParentOfType' @ [822:37] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'callElement' @ [823:22] ==> val callElement: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.getThisLabelName[LocalVariableDescriptor]

'calleeExpression' @ [823:35] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callee' @ [824:13] ==> val callee: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.getThisLabelName[LocalVariableDescriptor]

'callee' @ [824:36] ==> val callee: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.getThisLabelName[LocalVariableDescriptor]

'text' @ [824:43] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'getThisLabelName' @ [830:21] ==> internal fun DeclarationDescriptor.getThisLabelName(): String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'if (labelName.isEmpty()) "this" else "this@$labelName"' @ [831:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'labelName' @ [831:16] ==> val labelName: String defined in org.jetbrains.kotlin.idea.refactoring.explicateAsTextForReceiver[LocalVariableDescriptor]

'isEmpty' @ [831:26] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'labelName' @ [831:56] ==> val labelName: String defined in org.jetbrains.kotlin.idea.refactoring.explicateAsTextForReceiver[LocalVariableDescriptor]

'declarationDescriptor' @ [835:12] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'explicateAsTextForReceiver' @ [835:34] ==> internal fun DeclarationDescriptor.explicateAsTextForReceiver(): String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'getInstance' @ [839:37] ==> public open fun getInstance(p0: (Project..Project?)): (InjectedLanguageManager..InjectedLanguageManager?) defined in com.intellij.lang.injection.InjectedLanguageManager[JavaMethodDescriptor]

'project' @ [839:49] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'isInjectedFragment' @ [839:58] ==> public abstract fun isInjectedFragment(@NotNull p0: PsiFile): Boolean defined in com.intellij.lang.injection.InjectedLanguageManager[JavaMethodDescriptor]

'this' @ [839:77] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.isInjectedFragment[ReceiverParameterDescriptorImpl]

'containingFile' @ [842:13] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'isInjectedFragment' @ [842:28] ==> public val PsiFile.isInjectedFragment: Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[PropertyDescriptorImpl]

'overriddenElementsToDescriptor' @ [850:16] ==> value-parameter overriddenElementsToDescriptor: Map<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions[ValueParameterDescriptorImpl]

'entries' @ [850:47] ==> public abstract val entries: Set<Map.Entry<PsiElement, CallableDescriptor>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [850:55] ==> public inline fun <T, R> Iterable<Map.Entry<PsiElement, CallableDescriptor>>.map(transform: (Map.Entry<PsiElement, CallableDescriptor>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<PsiElement, CallableDescriptor>
    <R> -> String

'component1' @ [851:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiElement, CallableDescriptor>.component1(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> CallableDescriptor

'component2' @ [851:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiElement, CallableDescriptor>.component2(): CallableDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> CallableDescriptor

'entry' @ [851:41] ==> value-parameter entry: Map.Entry<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[ValueParameterDescriptorImpl]

'when (element) {
                is KtNamedFunction, is KtProperty, is KtParameter -> formatClassDescriptor(descriptor.containingDeclaration)
                is PsiMethod -> {
                    val psiClass = element.containingClass ?: error("Invalid element: ${element.getText()}")
                    formatPsiClass(psiClass, true, false)
                }
                else -> error("Unexpected element: ${element.getElementTextWithContext()}")
            }' @ [852:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'element' @ [852:37] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'formatClassDescriptor' @ [853:70] ==> public fun formatClassDescriptor(classDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [853:92] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [853:103] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'element' @ [855:36] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'containingClass' @ [855:44] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'error' @ [855:63] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [855:89] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'getText' @ [855:97] ==> @NonNls @Contract public abstract fun getText(): (String..String?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'formatPsiClass' @ [856:21] ==> public fun formatPsiClass(psiClass: PsiClass, markAsJava: Boolean, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'psiClass' @ [856:36] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'error' @ [858:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'element' @ [858:54] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'getElementTextWithContext' @ [858:62] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'description' @ [860:19] ==> val description: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.getClassDescriptions.<anonymous>[LocalVariableDescriptor]

'getClassDescriptions' @ [868:38] ==> local final fun getClassDescriptions(overriddenElementsToDescriptor: Map<PsiElement, CallableDescriptor>): List<String> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[SimpleFunctionDescriptorImpl]

'overriddenElementsToDescriptor' @ [868:59] ==> value-parameter overriddenElementsToDescriptor: Map<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.askUserForMethodsToSearch[ValueParameterDescriptorImpl]

'message' @ [870:36] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'COMPACT_WITH_SHORT_TYPES' @ [872:36] ==> @field:JvmField public final val COMPACT_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [872:61] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'declarationDescriptor' @ [872:68] ==> value-parameter declarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.askUserForMethodsToSearch[ValueParameterDescriptorImpl]

'superClassDescriptions' @ [873:22] ==> val superClassDescriptions: List<String> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.askUserForMethodsToSearch[LocalVariableDescriptor]

'joinToString' @ [873:45] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'actionString' @ [874:17] ==> value-parameter actionString: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'showYesNoCancelDialog' @ [877:24] ==> public fun showYesNoCancelDialog(key: String, project: Project, message: String, title: String, icon: Icon, default: Int?): Int defined in org.jetbrains.kotlin.idea.core.util[DeserializedSimpleFunctionDescriptor]

'CHECK_SUPER_METHODS_YES_NO_DIALOG' @ [878:17] ==> public val CHECK_SUPER_METHODS_YES_NO_DIALOG: String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[PropertyDescriptorImpl]

'declaration' @ [879:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'project' @ [879:29] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'message' @ [879:38] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.askUserForMethodsToSearch[LocalVariableDescriptor]

'message' @ [879:57] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'getQuestionIcon' @ [879:92] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'YES' @ [879:120] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'when (exitCode) {
            Messages.YES -> overriddenElementsToDescriptor.keys.toList()
            Messages.NO -> listOf(declaration)
            else -> emptyList()
        }' @ [880:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<PsiElement>, entry1: List<PsiElement>, entry2: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<PsiElement>

'exitCode' @ [880:22] ==> val exitCode: Int defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.askUserForMethodsToSearch[LocalVariableDescriptor]

'YES' @ [881:22] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'overriddenElementsToDescriptor' @ [881:29] ==> value-parameter overriddenElementsToDescriptor: Map<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods.askUserForMethodsToSearch[ValueParameterDescriptorImpl]

'keys' @ [881:60] ==> public abstract val keys: Set<PsiElement> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toList' @ [881:65] ==> public fun <T> Iterable<PsiElement>.toList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'NO' @ [882:22] ==> public const final val NO: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'listOf' @ [882:28] ==> public fun <T> listOf(element: KtDeclaration): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'declaration' @ [882:35] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'emptyList' @ [883:21] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'declaration' @ [888:33] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [888:45] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'declarationDescriptor' @ [890:9] ==> val declarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'listOf' @ [890:66] ==> public fun <T> listOf(element: KtDeclaration): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'declaration' @ [890:73] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'declaration' @ [892:19] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'project' @ [892:31] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'HashMap' @ [893:42] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> CallableDescriptor

'iterator' @ [894:34] ==> public abstract fun iterator(): MutableIterator<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'getAllOverriddenDescriptors' @ [894:50] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> getAllOverriddenDescriptors(@NotNull p0: CallableDescriptor): (MutableSet<(CallableDescriptor..CallableDescriptor?)>..Set<(CallableDescriptor..CallableDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'declarationDescriptor' @ [894:78] ==> val declarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'?:' @ [895:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getAnyDeclaration' @ [895:64] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [895:82] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDescriptor' @ [895:91] ==> val overriddenDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDeclaration' @ [896:13] ==> val overriddenDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDeclaration' @ [896:57] ==> val overriddenDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDeclaration' @ [896:96] ==> val overriddenDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDeclaration' @ [896:134] ==> val overriddenDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenElementsToDescriptor' @ [897:13] ==> val overriddenElementsToDescriptor: HashMap<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDeclaration' @ [897:44] ==> val overriddenDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenDescriptor' @ [897:69] ==> val overriddenDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'ignore' @ [900:9] ==> value-parameter ignore: Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'overriddenElementsToDescriptor' @ [901:9] ==> val overriddenElementsToDescriptor: HashMap<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'keys' @ [901:40] ==> public open val keys: MutableSet<PsiElement> defined in java.util.HashMap[JavaPropertyDescriptor]

'removeAll' @ [901:45] ==> public abstract fun removeAll(elements: Collection<PsiElement>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ignore' @ [901:55] ==> value-parameter ignore: Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'overriddenElementsToDescriptor' @ [904:9] ==> val overriddenElementsToDescriptor: HashMap<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'isEmpty' @ [904:40] ==> public open fun isEmpty(): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'listOf' @ [904:58] ==> public fun <T> listOf(element: KtDeclaration): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'declaration' @ [904:65] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[ValueParameterDescriptorImpl]

'askUserForMethodsToSearch' @ [906:12] ==> local final fun askUserForMethodsToSearch(declarationDescriptor: CallableDescriptor, overriddenElementsToDescriptor: Map<PsiElement, CallableDescriptor>): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [906:38] ==> val declarationDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'overriddenElementsToDescriptor' @ [906:61] ==> val overriddenElementsToDescriptor: HashMap<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethods[LocalVariableDescriptor]

'deepestSuperMethods' @ [916:9] ==> value-parameter deepestSuperMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'isEmpty' @ [916:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'invoke' @ [916:47] ==> public abstract operator fun invoke(p1: List<PsiElement>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'listOf' @ [916:54] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declaration' @ [916:61] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'deepestSuperMethods' @ [918:23] ==> value-parameter deepestSuperMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'first' @ [918:43] ==> public fun <T> List<PsiMethod>.first(): PsiMethod defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'superMethod' @ [920:22] ==> val superMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'containingClass' @ [920:34] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'invoke' @ [920:60] ==> public abstract operator fun invoke(p1: List<PsiElement>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'listOf' @ [920:67] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declaration' @ [920:74] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'getApplication' @ [922:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [922:45] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'invoke' @ [922:68] ==> public abstract operator fun invoke(p1: List<PsiElement>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'deepestSuperMethods' @ [922:75] ==> value-parameter deepestSuperMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'when (declaration) {
        is KtNamedFunction -> "function"
        is KtProperty, is KtParameter -> "property"
        else -> return
    }' @ [924:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'declaration' @ [924:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'deepestSuperMethods' @ [930:27] ==> value-parameter deepestSuperMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'mapNotNull' @ [930:47] ==> public inline fun <T, R : Any> Iterable<PsiMethod>.mapNotNull(transform: (PsiMethod) -> PsiNamedElement?): List<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R : Any> -> PsiNamedElement

'it' @ [930:60] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup.<anonymous>[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [930:63] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'unwrappedSupers' @ [931:26] ==> val unwrappedSupers: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'any' @ [931:42] ==> public inline fun <T> Iterable<PsiNamedElement>.any(predicate: (PsiNamedElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'it' @ [931:48] ==> value-parameter it: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup.<anonymous>[ValueParameterDescriptorImpl]

'unwrappedSupers' @ [932:24] ==> val unwrappedSupers: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'any' @ [932:40] ==> public inline fun <T> Iterable<PsiNamedElement>.any(predicate: (PsiNamedElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'it' @ [932:46] ==> value-parameter it: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup.<anonymous>[ValueParameterDescriptorImpl]

'when {
        hasJavaMethods && hasKtMembers -> "member"
        hasJavaMethods -> "method"
        else -> kind
    }' @ [933:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'hasJavaMethods' @ [934:9] ==> val hasJavaMethods: Boolean defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'hasKtMembers' @ [934:27] ==> val hasKtMembers: Boolean defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'hasJavaMethods' @ [935:9] ==> val hasJavaMethods: Boolean defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'kind' @ [936:17] ==> val kind: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'actionString' @ [939:22] ==> value-parameter actionString: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'superKind' @ [939:45] ==> val superKind: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'if (deepestSuperMethods.size > 1) "s" else ""' @ [939:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'deepestSuperMethods' @ [939:63] ==> value-parameter deepestSuperMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'size' @ [939:83] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'actionString' @ [940:25] ==> value-parameter actionString: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'kind' @ [940:56] ==> val kind: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'buildString' @ [941:17] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [942:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'declaration' @ [942:16] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'name' @ [942:28] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'append' @ [943:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (superMethod.hasModifierProperty(PsiModifier.ABSTRACT)) " implements " else " overrides "' @ [943:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'superMethod' @ [943:20] ==> val superMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'hasModifierProperty' @ [943:32] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'ABSTRACT' @ [943:64] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'append' @ [944:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getElementDescription' @ [944:39] ==> @NotNull public open fun getElementDescription(@NotNull p0: PsiElement, @NotNull p1: ElementDescriptionLocation): String defined in com.intellij.psi.ElementDescriptionUtil[JavaMethodDescriptor]

'superMethod' @ [944:61] ==> val superMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'INSTANCE' @ [944:96] ==> public final val INSTANCE: (UsageViewTypeLocation..UsageViewTypeLocation?) defined in com.intellij.usageView.UsageViewTypeLocation[JavaPropertyDescriptor]

'append' @ [945:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [946:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getSymbolPresentableText' @ [946:39] ==> public open fun getSymbolPresentableText(@NotNull p0: PsiElement): (String..String?) defined in com.intellij.psi.presentation.java.SymbolPresentationUtil[JavaMethodDescriptor]

'superClass' @ [946:64] ==> val superClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'JBList' @ [948:16] ==> public constructor JBList<E : (Any..Any?)>(@NotNull vararg p0: (String..String?)) defined in com.intellij.ui.components.JBList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'renameBase' @ [948:31] ==> val renameBase: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'renameCurrent' @ [948:43] ==> val renameCurrent: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'getInstance' @ [949:20] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopupBuilder' @ [950:14] ==> @NotNull public open fun createListPopupBuilder(@NotNull p0: raw (JList<(Any..Any?)>..JList<*>)): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'list' @ [950:37] ==> val list: JBList<String> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'setTitle' @ [951:14] ==> @NotNull public open fun setTitle(@NotNull @Nls p0: String): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'title' @ [951:23] ==> val title: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'setMovable' @ [952:14] ==> public open fun setMovable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setResizable' @ [953:14] ==> public open fun setResizable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setRequestFocus' @ [954:14] ==> public open fun setRequestFocus(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setItemChoosenCallback' @ [955:14] ==> @NotNull public final fun setItemChoosenCallback(@NotNull p0: () -> Unit): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'list' @ [956:29] ==> val list: JBList<String> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'selectedValue' @ [956:34] ==> public final val <E : (Any..Any?)> JBList<String>.selectedValue: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'if (value == renameBase) deepestSuperMethods + declaration else listOf(declaration)' @ [957:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PsiElement>, elseBranch: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PsiElement>

'value' @ [957:42] ==> val value: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup.<anonymous>[LocalVariableDescriptor]

'renameBase' @ [957:51] ==> val renameBase: String defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[LocalVariableDescriptor]

'deepestSuperMethods' @ [957:63] ==> value-parameter deepestSuperMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'declaration' @ [957:85] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'listOf' @ [957:102] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declaration' @ [957:109] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'invoke' @ [958:17] ==> public abstract operator fun invoke(p1: List<PsiElement>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'chosenElements' @ [958:24] ==> val chosenElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup.<anonymous>[LocalVariableDescriptor]

'createPopup' @ [960:14] ==> @NotNull public open fun createPopup(): JBPopup defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'showInBestPositionFor' @ [961:14] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'editor' @ [961:36] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.checkSuperMethodsWithPopup[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [965:28] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'containingObject' @ [966:12] ==> val containingObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.refactoring.isCompanionMemberOf[LocalVariableDescriptor]

'isCompanion' @ [966:29] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'containingObject' @ [966:46] ==> val containingObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.refactoring.isCompanionMemberOf[LocalVariableDescriptor]

'containingClassOrObject' @ [966:63] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'klass' @ [966:90] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.isCompanionMemberOf[ValueParameterDescriptorImpl]

'liftToHeader' @ [970:18] ==> internal fun KtDeclaration.liftToHeader(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [970:43] ==> public fun <T> listOf(element: KtDeclaration): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'this' @ [970:50] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.withHeaderImplementations[ReceiverParameterDescriptorImpl]

'header' @ [971:27] ==> val header: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.withHeaderImplementations[LocalVariableDescriptor]

'headerImplementations' @ [971:34] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [972:12] ==> public fun <T> listOf(element: KtDeclaration): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'header' @ [972:19] ==> val header: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.withHeaderImplementations[LocalVariableDescriptor]

'implementations' @ [972:29] ==> val implementations: Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.withHeaderImplementations[LocalVariableDescriptor]

'resolveToDescriptor' @ [976:22] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [977:12] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.resolveToHeaderDescriptorIfPossible[LocalVariableDescriptor]

'liftToHeader' @ [977:23] ==> internal fun DeclarationDescriptor.liftToHeader(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [977:41] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.resolveToHeaderDescriptorIfPossible[LocalVariableDescriptor]

