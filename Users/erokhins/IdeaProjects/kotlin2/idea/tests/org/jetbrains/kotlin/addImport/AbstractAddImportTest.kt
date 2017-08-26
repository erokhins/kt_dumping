'AbstractImportsTest' @ [31:40] ==> public constructor AbstractImportsTest() defined in org.jetbrains.kotlin.AbstractImportsTest[ClassConstructorDescriptorImpl]

'?:' @ [33:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'findStringWithPrefixes' @ [33:52] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [33:75] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[ValueParameterDescriptorImpl]

'text' @ [33:80] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'error' @ [34:33] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptorName' @ [37:13] ==> var descriptorName: String defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'startsWith' @ [37:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filter' @ [38:13] ==> var filter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'it' @ [38:24] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'descriptorName' @ [39:13] ==> var descriptorName: String defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'descriptorName' @ [39:30] ==> var descriptorName: String defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'substring' @ [39:45] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'length' @ [39:64] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'trim' @ [39:72] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'file' @ [42:27] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[ValueParameterDescriptorImpl]

'resolveImportReference' @ [42:32] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FqName' @ [42:55] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'descriptorName' @ [42:62] ==> var descriptorName: String defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'filter' @ [42:79] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'filter' @ [42:86] ==> var filter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'when {
            descriptors.isEmpty() ->
                error("No descriptor $descriptorName found")

            descriptors.size > 1 ->
                error("Multiple descriptors found:\n    " + descriptors.map { DescriptorRenderer.FQ_NAMES_IN_TYPES.render(it) }.joinToString("\n    "))

            else -> {
                val success = ImportInsertHelper.getInstance(project).importDescriptor(file, descriptors.single()) != ImportDescriptorResult.FAIL
                if (!success) {
                    val document = PsiDocumentManager.getInstance(project).getDocument(file)!!
                    document.replaceString(0, document.textLength, "Failed to add import")
                    PsiDocumentManager.getInstance(project).commitAllDocuments()
                }
            }
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptors' @ [45:13] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'isEmpty' @ [45:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'error' @ [46:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptorName' @ [46:39] ==> var descriptorName: String defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'descriptors' @ [48:13] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'size' @ [48:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'error' @ [49:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [49:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptors' @ [49:61] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'map' @ [49:73] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'DescriptorRenderer' @ [49:79] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [49:98] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [49:116] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [49:123] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [49:129] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ImportInsertHelper' @ [52:31] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [52:50] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [52:62] ==> public final val AbstractAddImportTest.project: Project[MyPropertyDescriptor]

'importDescriptor' @ [52:71] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [52:88] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[ValueParameterDescriptorImpl]

'descriptors' @ [52:94] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'single' @ [52:106] ==> public fun <T> List<DeclarationDescriptor>.single(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'FAIL' @ [52:142] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'!' @ [53:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'success' @ [53:22] ==> val success: Boolean defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'!!' @ [54:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [54:55] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [54:67] ==> public final val AbstractAddImportTest.project: Project[MyPropertyDescriptor]

'getDocument' @ [54:76] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [54:88] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[ValueParameterDescriptorImpl]

'document' @ [55:21] ==> val document: Document defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'replaceString' @ [55:30] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'document' @ [55:47] ==> val document: Document defined in org.jetbrains.kotlin.addImport.AbstractAddImportTest.doTest[LocalVariableDescriptor]

'textLength' @ [55:56] ==> public final val Document.textLength: Int[MyPropertyDescriptor]

'getInstance' @ [56:40] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [56:52] ==> public final val AbstractAddImportTest.project: Project[MyPropertyDescriptor]

'commitAllDocuments' @ [56:61] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

