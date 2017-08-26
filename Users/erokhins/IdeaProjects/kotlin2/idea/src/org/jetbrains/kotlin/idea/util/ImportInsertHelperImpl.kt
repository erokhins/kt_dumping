'ImportInsertHelper' @ [52:62] ==> public constructor ImportInsertHelper() defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedClassConstructorDescriptor]

'getInstance' @ [55:41] ==> public open fun getInstance(p0: (Project..Project?)): (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaMethodDescriptor]

'project' @ [55:53] ==> private final val project: Project defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl[PropertyDescriptorImpl]

'ImportPathComparator' @ [58:17] ==> public object ImportPathComparator : Comparator<ImportPath> defined in org.jetbrains.kotlin.idea.imports[FakeCallableDescriptorForObject]

'contextFile' @ [61:37] ==> value-parameter contextFile: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.isImportedWithDefault[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [61:49] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'frontendService' @ [61:71] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): DefaultImportProvider defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DefaultImportProvider

'importPath' @ [62:16] ==> value-parameter importPath: ImportPath defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.isImportedWithDefault[ValueParameterDescriptorImpl]

'isImported' @ [62:27] ==> public fun ImportPath.isImported(imports: Iterable<ImportPath>, excludedFqNames: Iterable<FqName>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.fqName[DeserializedSimpleFunctionDescriptor]

'defaultImportProvider' @ [62:38] ==> val defaultImportProvider: DefaultImportProvider defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.isImportedWithDefault[LocalVariableDescriptor]

'defaultImports' @ [62:60] ==> public final val defaultImports: List<ImportPath> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[DeserializedPropertyDescriptor]

'defaultImportProvider' @ [62:76] ==> val defaultImportProvider: DefaultImportProvider defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.isImportedWithDefault[LocalVariableDescriptor]

'excludedImports' @ [62:98] ==> public final val excludedImports: List<FqName> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[DeserializedPropertyDescriptor]

'descriptor' @ [66:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.mayImportOnShortenReferences[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [66:37] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'when (importable) {
            is PackageViewDescriptor -> false // now package cannot be imported

            is ClassDescriptor -> {
                importable.containingDeclaration is PackageFragmentDescriptor
                    || codeStyleSettings.IMPORT_NESTED_CLASSES
            }

            else -> importable.containingDeclaration is PackageFragmentDescriptor // do not import members (e.g. java static members)
        }' @ [67:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'importable' @ [67:22] ==> val importable: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.mayImportOnShortenReferences[LocalVariableDescriptor]

'importable' @ [71:17] ==> val importable: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.mayImportOnShortenReferences[LocalVariableDescriptor]

'containingDeclaration' @ [71:28] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'codeStyleSettings' @ [72:24] ==> private final val codeStyleSettings: KotlinCodeStyleSettings defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl[PropertyDescriptorImpl]

'IMPORT_NESTED_CLASSES' @ [72:42] ==> public final var IMPORT_NESTED_CLASSES: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'importable' @ [75:21] ==> val importable: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.mayImportOnShortenReferences[LocalVariableDescriptor]

'containingDeclaration' @ [75:32] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'Importer' @ [80:24] ==> public constructor Importer(file: KtFile) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[ClassConstructorDescriptorImpl]

'file' @ [80:33] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.importDescriptor[ValueParameterDescriptorImpl]

'if (forceAllUnderImport) {
            importer.importDescriptorWithStarImport(descriptor)
        }
        else {
            importer.importDescriptor(descriptor)
        }' @ [81:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ImportDescriptorResult, elseBranch: ImportDescriptorResult): ImportDescriptorResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ImportDescriptorResult

'forceAllUnderImport' @ [81:20] ==> value-parameter forceAllUnderImport: Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.importDescriptor[ValueParameterDescriptorImpl]

'importer' @ [82:13] ==> val importer: ImportInsertHelperImpl.Importer defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.importDescriptor[LocalVariableDescriptor]

'importDescriptorWithStarImport' @ [82:22] ==> public final fun importDescriptorWithStarImport(descriptor: DeclarationDescriptor): ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'descriptor' @ [82:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.importDescriptor[ValueParameterDescriptorImpl]

'importer' @ [85:13] ==> val importer: ImportInsertHelperImpl.Importer defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.importDescriptor[LocalVariableDescriptor]

'importDescriptor' @ [85:22] ==> public final fun importDescriptor(descriptor: DeclarationDescriptor): ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'descriptor' @ [85:39] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.importDescriptor[ValueParameterDescriptorImpl]

'file' @ [92:40] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getResolutionFacade' @ [92:45] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'target' @ [95:24] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'name' @ [95:31] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'when (target) {
                is ClassifierDescriptorWithTypeParameters -> {
                    val classifier = topLevelScope.findClassifier(name, NoLookupLocation.FROM_IDE)
                    classifier?.importableFqName == targetFqName
                }

                is FunctionDescriptor ->
                    topLevelScope.findFunction(name, NoLookupLocation.FROM_IDE) { it.importableFqName == targetFqName } != null

                is PropertyDescriptor ->
                    topLevelScope.findVariable(name, NoLookupLocation.FROM_IDE) { it.importableFqName == targetFqName } != null

                else -> false
            }' @ [96:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'target' @ [96:26] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'topLevelScope' @ [98:38] ==> value-parameter topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'findClassifier' @ [98:52] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [98:67] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[LocalVariableDescriptor]

'FROM_IDE' @ [98:90] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifier' @ [99:21] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[LocalVariableDescriptor]

'importableFqName' @ [99:33] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'targetFqName' @ [99:53] ==> value-parameter targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'topLevelScope' @ [103:21] ==> value-parameter topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'findFunction' @ [103:35] ==> public fun HierarchicalScope.findFunction(name: Name, location: LookupLocation, predicate: (FunctionDescriptor) -> Boolean = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [103:48] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[LocalVariableDescriptor]

'FROM_IDE' @ [103:71] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'it' @ [103:83] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [103:86] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'targetFqName' @ [103:106] ==> value-parameter targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'topLevelScope' @ [106:21] ==> value-parameter topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'findVariable' @ [106:35] ==> public fun HierarchicalScope.findVariable(name: Name, location: LookupLocation, predicate: (VariableDescriptor) -> Boolean = ...): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [106:48] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[LocalVariableDescriptor]

'FROM_IDE' @ [106:71] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'it' @ [106:83] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [106:86] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'targetFqName' @ [106:106] ==> value-parameter targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.isAlreadyImported[ValueParameterDescriptorImpl]

'descriptor' @ [113:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [113:37] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'target' @ [115:24] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'name' @ [115:31] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'resolutionFacade' @ [116:33] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getFileResolutionScope' @ [116:50] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'file' @ [116:73] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'target' @ [119:32] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'importableFqName' @ [119:39] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'FAIL' @ [119:89] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'isAlreadyImported' @ [120:17] ==> private final fun isAlreadyImported(target: DeclarationDescriptor, topLevelScope: LexicalScope, targetFqName: FqName): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [120:35] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'topLevelScope' @ [120:43] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'targetFqName' @ [120:58] ==> val targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'ALREADY_IMPORTED' @ [120:103] ==> enum entry ALREADY_IMPORTED defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'file' @ [122:27] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'importDirectives' @ [122:32] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'imports' @ [124:17] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'any' @ [124:25] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.any(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'!' @ [124:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [124:32] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [124:35] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [124:49] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [124:52] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'fqName' @ [124:64] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'targetFqName' @ [124:74] ==> val targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'FAIL' @ [125:47] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'when (target) {
                is ClassDescriptor -> topLevelScope.findClassifier(name, NoLookupLocation.FROM_IDE)
                is PackageViewDescriptor -> topLevelScope.findPackage(name)
                else -> null
            }' @ [129:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'target' @ [129:34] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'topLevelScope' @ [130:39] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'findClassifier' @ [130:53] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [130:68] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'FROM_IDE' @ [130:91] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'topLevelScope' @ [131:45] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'findPackage' @ [131:59] ==> public fun HierarchicalScope.findPackage(name: Name): PackageViewDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [131:71] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'conflict' @ [134:17] ==> val conflict: DeclarationDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'imports' @ [135:20] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'any' @ [135:28] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.any(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'!' @ [135:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [135:35] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [135:38] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [135:52] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [135:55] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'fqName' @ [135:67] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'conflict' @ [135:77] ==> val conflict: DeclarationDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'importableFqName' @ [135:86] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'it' @ [135:106] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [135:109] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'importedName' @ [135:121] ==> public final val importedName: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'name' @ [135:137] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'FAIL' @ [137:47] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'target' @ [140:26] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'importableFqName' @ [140:33] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'fqName' @ [141:35] ==> val fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'parent' @ [141:42] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'shouldTryStarImport' @ [143:33] ==> private final fun shouldTryStarImport(containerFqName: FqName, target: DeclarationDescriptor, imports: Collection<KtImportDirective>): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'containerFqName' @ [143:53] ==> val containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'target' @ [143:70] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'imports' @ [143:78] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'when (target) {
                                        // this check does not give a guarantee that import with * will import the class - for example,
                                        // there can be classes with conflicting name in more than one import with *
                                        is ClassifierDescriptorWithTypeParameters -> topLevelScope.findClassifier(name, NoLookupLocation.FROM_IDE) == null
                                        is FunctionDescriptor, is PropertyDescriptor -> true
                                        else -> error("Unknown kind of descriptor to import:$target")
                                    }' @ [144:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'target' @ [144:46] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'topLevelScope' @ [147:86] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'findClassifier' @ [147:100] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [147:115] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'FROM_IDE' @ [147:138] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'error' @ [149:49] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'target' @ [149:94] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'tryStarImport' @ [152:17] ==> val tryStarImport: Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'addStarImport' @ [153:30] ==> private final fun addStarImport(target: DeclarationDescriptor): ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [153:44] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'result' @ [154:21] ==> val result: ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'FAIL' @ [154:54] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'result' @ [154:67] ==> val result: ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'addExplicitImport' @ [157:20] ==> private final fun addExplicitImport(target: DeclarationDescriptor): ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [157:38] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptor[LocalVariableDescriptor]

'descriptor' @ [161:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [161:37] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'target' @ [163:26] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'importableFqName' @ [163:33] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'FAIL' @ [163:83] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'fqName' @ [164:35] ==> val fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'parent' @ [164:42] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'file' @ [165:27] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'importDirectives' @ [165:32] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'ImportPath' @ [167:34] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'containerFqName' @ [167:45] ==> val containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'imports' @ [168:17] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'any' @ [168:25] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.any(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [168:31] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [168:34] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'starImportPath' @ [168:48] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'if (isAlreadyImported(target, resolutionFacade.getFileResolutionScope(file), fqName))
                    ImportDescriptorResult.ALREADY_IMPORTED
                else
                    ImportDescriptorResult.FAIL' @ [169:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ImportDescriptorResult, elseBranch: ImportDescriptorResult): ImportDescriptorResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ImportDescriptorResult

'isAlreadyImported' @ [169:28] ==> private final fun isAlreadyImported(target: DeclarationDescriptor, topLevelScope: LexicalScope, targetFqName: FqName): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [169:46] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'resolutionFacade' @ [169:54] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getFileResolutionScope' @ [169:71] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'file' @ [169:94] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'fqName' @ [169:101] ==> val fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'ALREADY_IMPORTED' @ [170:44] ==> enum entry ALREADY_IMPORTED defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'FAIL' @ [172:44] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'!' @ [175:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canImportWithStar' @ [175:18] ==> private final fun canImportWithStar(containerFqName: FqName, target: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'containerFqName' @ [175:36] ==> val containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'target' @ [175:53] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'FAIL' @ [175:92] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'addStarImport' @ [177:20] ==> private final fun addStarImport(target: DeclarationDescriptor): ImportDescriptorResult defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [177:34] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.importDescriptorWithStarImport[LocalVariableDescriptor]

'!' @ [181:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canImportWithStar' @ [181:18] ==> private final fun canImportWithStar(containerFqName: FqName, target: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'containerFqName' @ [181:36] ==> value-parameter containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'target' @ [181:53] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'ImportPath' @ [183:34] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'containerFqName' @ [183:45] ==> value-parameter containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'imports' @ [184:17] ==> value-parameter imports: Collection<KtImportDirective> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'any' @ [184:25] ==> public inline fun <T> Iterable<KtImportDirective>.any(predicate: (KtImportDirective) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'it' @ [184:31] ==> value-parameter it: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [184:34] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'starImportPath' @ [184:48] ==> val starImportPath: ImportPath defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[LocalVariableDescriptor]

'containerFqName' @ [186:17] ==> value-parameter containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'asString' @ [186:33] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'codeStyleSettings' @ [186:47] ==> private final val codeStyleSettings: KotlinCodeStyleSettings defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl[PropertyDescriptorImpl]

'PACKAGES_TO_USE_STAR_IMPORTS' @ [186:65] ==> public final val PACKAGES_TO_USE_STAR_IMPORTS: (PackageEntryTable..PackageEntryTable?) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'imports' @ [188:38] ==> value-parameter imports: Collection<KtImportDirective> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'count' @ [188:46] ==> public inline fun <T> Iterable<KtImportDirective>.count(predicate: (KtImportDirective) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective

'it' @ [189:28] ==> value-parameter it: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [189:31] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'path' @ [190:17] ==> val path: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport.<anonymous>[LocalVariableDescriptor]

'!' @ [190:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'path' @ [190:34] ==> val path: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport.<anonymous>[LocalVariableDescriptor]

'isAllUnder' @ [190:39] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'!' @ [190:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'path' @ [190:54] ==> val path: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport.<anonymous>[LocalVariableDescriptor]

'hasAlias' @ [190:59] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'path' @ [190:73] ==> val path: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport.<anonymous>[LocalVariableDescriptor]

'fqName' @ [190:78] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'parent' @ [190:85] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'containerFqName' @ [190:97] ==> value-parameter containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'if (target.containingDeclaration is ClassDescriptor)
                codeStyleSettings.NAME_COUNT_TO_USE_STAR_IMPORT_FOR_MEMBERS
            else
                codeStyleSettings.NAME_COUNT_TO_USE_STAR_IMPORT' @ [192:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'target' @ [192:42] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[ValueParameterDescriptorImpl]

'containingDeclaration' @ [192:49] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'codeStyleSettings' @ [193:17] ==> private final val codeStyleSettings: KotlinCodeStyleSettings defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl[PropertyDescriptorImpl]

'NAME_COUNT_TO_USE_STAR_IMPORT_FOR_MEMBERS' @ [193:35] ==> public final var NAME_COUNT_TO_USE_STAR_IMPORT_FOR_MEMBERS: Int defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'codeStyleSettings' @ [195:17] ==> private final val codeStyleSettings: KotlinCodeStyleSettings defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl[PropertyDescriptorImpl]

'NAME_COUNT_TO_USE_STAR_IMPORT' @ [195:35] ==> public final var NAME_COUNT_TO_USE_STAR_IMPORT: Int defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'importsFromPackage' @ [196:20] ==> val importsFromPackage: Int defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[LocalVariableDescriptor]

'nameCountToUseStar' @ [196:46] ==> val nameCountToUseStar: Int defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.shouldTryStarImport[LocalVariableDescriptor]

'containerFqName' @ [200:17] ==> value-parameter containerFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.canImportWithStar[ValueParameterDescriptorImpl]

'isRoot' @ [200:33] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'target' @ [202:29] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.canImportWithStar[ValueParameterDescriptorImpl]

'containingDeclaration' @ [202:36] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'container' @ [203:17] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.canImportWithStar[LocalVariableDescriptor]

'container' @ [203:49] ==> val container: DeclarationDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.canImportWithStar[LocalVariableDescriptor]

'kind' @ [203:59] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [203:77] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'target' @ [209:32] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[ValueParameterDescriptorImpl]

'importableFqName' @ [209:39] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'targetFqName' @ [210:32] ==> val targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'parent' @ [210:45] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'resolutionFacade' @ [212:36] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'moduleDescriptor' @ [212:53] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'file' @ [213:27] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'importDirectives' @ [213:32] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'getMemberScope' @ [214:33] ==> private final fun getMemberScope(fqName: FqName, moduleDescriptor: ModuleDescriptor): MemberScope? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'parentFqName' @ [214:48] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'moduleDescriptor' @ [214:62] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'FAIL' @ [214:113] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'imports' @ [215:34] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'filter' @ [216:22] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.filter(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): List<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [216:31] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [216:34] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'mapNotNull' @ [217:22] ==> public inline fun <T, R : Any> Iterable<(KtImportDirective..KtImportDirective?)>.mapNotNull(transform: ((KtImportDirective..KtImportDirective?)) -> MemberScope?): List<MemberScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R : Any> -> MemberScope

'it' @ [218:42] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [218:45] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'if (importPath != null) {
                            val fqName = importPath.fqName
                            getMemberScope(fqName, moduleDescriptor)
                        }
                        else {
                            null
                        }' @ [219:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MemberScope?, elseBranch: MemberScope?): MemberScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MemberScope?

'importPath' @ [219:29] ==> val importPath: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[LocalVariableDescriptor]

'importPath' @ [220:42] ==> val importPath: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[LocalVariableDescriptor]

'fqName' @ [220:53] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'getMemberScope' @ [221:29] ==> private final fun getMemberScope(fqName: FqName, moduleDescriptor: ModuleDescriptor): MemberScope? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'fqName' @ [221:44] ==> val fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[LocalVariableDescriptor]

'moduleDescriptor' @ [221:52] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'moduleDescriptor' @ [228:31] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'getPackage' @ [228:48] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'file' @ [228:59] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'packageFqName' @ [228:64] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'descriptor' @ [231:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.isVisible[ValueParameterDescriptorImpl]

'descriptor' @ [232:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.isVisible[ValueParameterDescriptorImpl]

'visibility' @ [232:45] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'!' @ [233:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'visibility' @ [233:25] ==> val visibility: Visibility defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.isVisible[LocalVariableDescriptor]

'mustCheckInImports' @ [233:36] ==> public abstract fun mustCheckInImports(): Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'isVisibleIgnoringReceiver' @ [233:73] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'descriptor' @ [233:99] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.isVisible[ValueParameterDescriptorImpl]

'filePackage' @ [233:111] ==> val filePackage: PackageViewDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'scopeToImport' @ [236:38] ==> val scopeToImport: MemberScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'getDescriptorsFiltered' @ [237:22] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'CLASSIFIERS' @ [237:66] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filter' @ [238:22] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'isVisible' @ [238:31] ==> local final fun isVisible(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[SimpleFunctionDescriptorImpl]

'map' @ [239:22] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Name

'it' @ [239:28] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [239:31] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'resolutionFacade' @ [241:33] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getFileResolutionScope' @ [241:50] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'file' @ [241:73] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'classNamesToImport' @ [242:66] ==> val classNamesToImport: List<Name> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'flatMap' @ [243:22] ==> public inline fun <T, R> Iterable<Name>.flatMap(transform: (Name) -> Iterable<ClassifierDescriptor>): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> ClassifierDescriptor

'importedScopes' @ [244:25] ==> val importedScopes: List<MemberScope> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'mapNotNull' @ [244:40] ==> public inline fun <T, R : Any> Iterable<MemberScope>.mapNotNull(transform: (MemberScope) -> ClassifierDescriptor?): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberScope
    <R : Any> -> ClassifierDescriptor

'scope' @ [244:62] ==> value-parameter scope: MemberScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [244:68] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'it' @ [244:93] ==> value-parameter it: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [244:114] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'filter' @ [246:22] ==> public inline fun <T> Iterable<ClassifierDescriptor>.filter(predicate: (ClassifierDescriptor) -> Boolean): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'isVisible' @ [247:25] ==> local final fun isVisible(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[SimpleFunctionDescriptorImpl]

'importedClass' @ [247:35] ==> value-parameter importedClass: ClassifierDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'topLevelScope' @ [249:32] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'findClassifier' @ [249:46] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'importedClass' @ [249:61] ==> value-parameter importedClass: ClassifierDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [249:75] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [249:98] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'importedClass' @ [249:111] ==> value-parameter importedClass: ClassifierDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'imports' @ [251:32] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'all' @ [251:40] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.all(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [251:46] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [251:49] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'ImportPath' @ [251:63] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'importedClass' @ [251:74] ==> value-parameter importedClass: ClassifierDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [251:88] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'detectNeededImports' @ [253:29] ==> private final fun detectNeededImports(importedClasses: Collection<ClassifierDescriptor>): Set<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'conflictCandidates' @ [253:49] ==> val conflictCandidates: List<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'addImport' @ [255:31] ==> private final fun addImport(fqName: FqName, allUnder: Boolean): KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'parentFqName' @ [255:41] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'resolutionFacade' @ [257:36] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getFileResolutionScope' @ [257:53] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'file' @ [257:76] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'!' @ [258:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAlreadyImported' @ [258:18] ==> private final fun isAlreadyImported(target: DeclarationDescriptor, topLevelScope: LexicalScope, targetFqName: FqName): Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [258:36] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[ValueParameterDescriptorImpl]

'newTopLevelScope' @ [258:44] ==> val newTopLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'targetFqName' @ [258:62] ==> val targetFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'addedImport' @ [259:17] ==> val addedImport: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'delete' @ [259:29] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'FAIL' @ [260:47] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'conflicts' @ [263:30] ==> val conflicts: Set<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'addImport' @ [264:17] ==> private final fun addImport(fqName: FqName, allUnder: Boolean): KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'getFqNameSafe' @ [264:43] ==> @NotNull public open fun getFqNameSafe(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'conflict' @ [264:57] ==> val conflict: ClassifierDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'dropRedundantExplicitImports' @ [267:13] ==> private final fun dropRedundantExplicitImports(packageFqName: FqName): Unit defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'parentFqName' @ [267:42] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addStarImport[LocalVariableDescriptor]

'IMPORT_ADDED' @ [269:43] ==> enum entry IMPORT_ADDED defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'moduleDescriptor' @ [273:31] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[ValueParameterDescriptorImpl]

'getPackage' @ [273:48] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [273:59] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[ValueParameterDescriptorImpl]

'!' @ [274:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageView' @ [274:18] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[LocalVariableDescriptor]

'isEmpty' @ [274:30] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'packageView' @ [275:24] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[LocalVariableDescriptor]

'memberScope' @ [275:36] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getMemberScope' @ [278:31] ==> private final fun getMemberScope(fqName: FqName, moduleDescriptor: ModuleDescriptor): MemberScope? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'fqName' @ [278:46] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[ValueParameterDescriptorImpl]

'parent' @ [278:53] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'moduleDescriptor' @ [278:63] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[ValueParameterDescriptorImpl]

'parentScope' @ [279:30] ==> val parentScope: MemberScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[LocalVariableDescriptor]

'getContributedClassifier' @ [279:42] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'fqName' @ [279:67] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[ValueParameterDescriptorImpl]

'shortName' @ [279:74] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FROM_IDE' @ [279:104] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifier' @ [280:35] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[LocalVariableDescriptor]

'classDescriptor' @ [281:20] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.getMemberScope[LocalVariableDescriptor]

'defaultType' @ [281:36] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [281:48] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'target' @ [285:17] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[ValueParameterDescriptorImpl]

'target' @ [285:46] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[ValueParameterDescriptorImpl]

'resolutionFacade' @ [286:37] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getFileResolutionScope' @ [286:54] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'file' @ [286:77] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'target' @ [287:28] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[ValueParameterDescriptorImpl]

'name' @ [287:35] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'topLevelScope' @ [291:34] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[LocalVariableDescriptor]

'findClassifier' @ [291:48] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [291:63] ==> val name: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[LocalVariableDescriptor]

'FROM_IDE' @ [291:86] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifier' @ [292:21] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[LocalVariableDescriptor]

'detectNeededImports' @ [292:43] ==> private final fun detectNeededImports(importedClasses: Collection<ClassifierDescriptor>): Set<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'listOf' @ [292:63] ==> public fun <T> listOf(element: ClassifierDescriptor): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'classifier' @ [292:70] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[LocalVariableDescriptor]

'isNotEmpty' @ [292:83] ==> @InlineOnly public inline fun <T> Collection<ClassifierDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'FAIL' @ [293:51] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'addImport' @ [297:13] ==> private final fun addImport(fqName: FqName, allUnder: Boolean): KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'target' @ [297:23] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addExplicitImport[ValueParameterDescriptorImpl]

'importableFqName' @ [297:30] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'IMPORT_ADDED' @ [298:43] ==> enum entry IMPORT_ADDED defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'file' @ [302:34] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'importDirectives' @ [302:39] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'filter' @ [302:56] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.filter(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): List<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'!' @ [303:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [303:18] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [303:21] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [303:35] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports.<anonymous>[ValueParameterDescriptorImpl]

'aliasName' @ [303:38] ==> public final val KtImportDirective.aliasName: String?[MyPropertyDescriptor]

'it' @ [303:59] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [303:62] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'fqName' @ [303:74] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'parent' @ [303:82] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageFqName' @ [303:94] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[ValueParameterDescriptorImpl]

'ArrayList' @ [306:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'dropCandidates' @ [307:28] ==> val dropCandidates: List<(KtImportDirective..KtImportDirective?)> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'import' @ [308:21] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'importedReference' @ [308:28] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'import' @ [309:31] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'targetDescriptors' @ [309:38] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'targets' @ [310:21] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'any' @ [310:29] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [310:35] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports.<anonymous>[ValueParameterDescriptorImpl]

'targets' @ [311:39] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'filterIsInstance' @ [311:47] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'firstOrNull' @ [311:83] ==> public fun <T> List<ClassDescriptor>.firstOrNull(): ClassDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'importsToCheck' @ [312:17] ==> val importsToCheck: ArrayList<FqName> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'addIfNotNull' @ [312:32] ==> public fun <T : Any> MutableCollection<FqName>.addIfNotNull(t: FqName?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FqName

'classDescriptor' @ [312:45] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'importableFqName' @ [312:62] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'import' @ [313:17] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'delete' @ [313:24] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'importsToCheck' @ [316:17] ==> val importsToCheck: ArrayList<FqName> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'isNotEmpty' @ [316:32] ==> @InlineOnly public inline fun <T> Collection<FqName>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'resolutionFacade' @ [317:37] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'getFileResolutionScope' @ [317:54] ==> public fun ResolutionFacade.getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'file' @ [317:77] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'importsToCheck' @ [318:37] ==> val importsToCheck: ArrayList<FqName> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'topLevelScope' @ [319:38] ==> val topLevelScope: LexicalScope defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'findClassifier' @ [319:52] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'classFqName' @ [319:67] ==> val classFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'shortName' @ [319:79] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FROM_IDE' @ [319:109] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classifier' @ [320:25] ==> val classifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'importableFqName' @ [320:37] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'classFqName' @ [320:57] ==> val classFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'addImport' @ [321:25] ==> private final fun addImport(fqName: FqName, allUnder: Boolean): KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'classFqName' @ [321:35] ==> val classFqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.dropRedundantExplicitImports[LocalVariableDescriptor]

'importedClasses' @ [328:17] ==> value-parameter importedClasses: Collection<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[ValueParameterDescriptorImpl]

'isEmpty' @ [328:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'setOf' @ [328:51] ==> @InlineOnly public inline fun <T> setOf(): Set<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'importedClasses' @ [330:34] ==> value-parameter importedClasses: Collection<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[ValueParameterDescriptorImpl]

'associateByTo' @ [330:50] ==> public inline fun <T, K, M : MutableMap<in Name, in ClassifierDescriptor>> Iterable<ClassifierDescriptor>.associateByTo(destination: MutableMap<Name, ClassifierDescriptor>, keySelector: (ClassifierDescriptor) -> Name): MutableMap<Name, ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <K> -> Name
    <M : MutableMap<in K, in T>> -> MutableMap<Name, ClassifierDescriptor>

'mutableMapOf' @ [330:64] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Name, ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ClassifierDescriptor

'it' @ [330:82] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [330:85] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'LinkedHashSet' @ [331:26] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ClassifierDescriptor

'file' @ [332:13] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'accept' @ [332:18] ==> public open fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'KtVisitorVoid' @ [332:34] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'classesToCheck' @ [334:25] ==> val classesToCheck: MutableMap<Name, ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[LocalVariableDescriptor]

'isEmpty' @ [334:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'element' @ [335:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [335:29] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [335:44] ==> <this> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>[LazyClassReceiverParameterDescriptor]

'isSelectorInQualified' @ [345:35] ==> public open fun isSelectorInQualified(@NotNull p0: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [345:57] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'expression' @ [347:35] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getReferencedNameAsName' @ [347:46] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'classesToCheck' @ [348:38] ==> val classesToCheck: MutableMap<Name, ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[LocalVariableDescriptor]

'refName' @ [348:53] ==> val refName: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [349:25] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'targetFqName' @ [350:44] ==> private final fun targetFqName(ref: KtReferenceExpression): FqName? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'expression' @ [350:57] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'targetFqName' @ [351:29] ==> val targetFqName: FqName? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'targetFqName' @ [351:53] ==> val targetFqName: FqName? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getFqNameSafe' @ [351:85] ==> @NotNull public open fun getFqNameSafe(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [351:99] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'classesToCheck' @ [352:29] ==> val classesToCheck: MutableMap<Name, ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[LocalVariableDescriptor]

'remove' @ [352:44] ==> public abstract fun remove(key: Name): ClassifierDescriptor? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'refName' @ [352:51] ==> val refName: Name defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'result' @ [353:29] ==> val result: LinkedHashSet<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[LocalVariableDescriptor]

'add' @ [353:36] ==> public open fun add(element: ClassifierDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [353:40] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'result' @ [358:20] ==> val result: LinkedHashSet<ClassifierDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.detectNeededImports[LocalVariableDescriptor]

'ref' @ [362:19] ==> value-parameter ref: KtReferenceExpression defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.targetFqName[ValueParameterDescriptorImpl]

'resolveTargets' @ [362:23] ==> private final fun KtReferenceExpression.resolveTargets(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[SimpleFunctionDescriptorImpl]

'map' @ [362:40] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> FqName?): List<FqName?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> FqName?

'it' @ [362:46] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.targetFqName.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [362:49] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'toSet' @ [362:68] ==> public fun <T> Iterable<FqName?>.toSet(): Set<FqName?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName?

'singleOrNull' @ [362:76] ==> public fun <T> Iterable<FqName?>.singleOrNull(): FqName? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName?

'this' @ [365:19] ==> <this> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.resolveTargets[ReceiverParameterDescriptorImpl]

'getImportableTargets' @ [365:24] ==> public fun KtReferenceExpression.getImportableTargets(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [365:45] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'analyze' @ [365:62] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'this' @ [365:70] ==> <this> defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.resolveTargets[ReceiverParameterDescriptorImpl]

'PARTIAL' @ [365:92] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'ImportPath' @ [368:30] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [368:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[ValueParameterDescriptorImpl]

'allUnder' @ [368:49] ==> value-parameter allUnder: Boolean defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [370:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [370:43] ==> private final val project: Project defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl[PropertyDescriptorImpl]

'file' @ [371:17] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'psiFactory' @ [372:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'createImportDirective' @ [372:47] ==> public final fun createImportDirective(importPath: ImportPath): KtImportDirective defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'importPath' @ [372:69] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'file' @ [373:17] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'addImportsFromString' @ [373:22] ==> public open fun addImportsFromString(imports: String?): Unit defined in org.jetbrains.kotlin.psi.KtCodeFragment[DeserializedSimpleFunctionDescriptor]

'newDirective' @ [373:43] ==> val newDirective: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'text' @ [373:56] ==> public final val KtImportDirective.text: (String..String?)[MyPropertyDescriptor]

'newDirective' @ [374:24] ==> val newDirective: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'file' @ [377:30] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'importList' @ [377:35] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'if (importList != null) {
                val newDirective = psiFactory.createImportDirective(importPath)
                val imports = importList.imports
                return if (imports.isEmpty()) { //TODO: strange hack
                    importList.add(psiFactory.createNewLine())
                    importList.add(newDirective) as KtImportDirective
                }
                else {
                    val insertAfter = imports
                            .lastOrNull {
                                val directivePath = it.importPath
                                directivePath != null && ImportPathComparator.compare(directivePath, importPath) <= 0
                            }
                    importList.addAfter(newDirective, insertAfter) as KtImportDirective
                }
            }
            else {
                error("Trying to insert import $fqName into a file ${file.name} of type ${file::class.java} with no import list.")
            }' @ [378:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'importList' @ [378:17] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'psiFactory' @ [379:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'createImportDirective' @ [379:47] ==> public final fun createImportDirective(importPath: ImportPath): KtImportDirective defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'importPath' @ [379:69] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'importList' @ [380:31] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'imports' @ [380:42] ==> public final val KtImportList.imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'if (imports.isEmpty()) { //TODO: strange hack
                    importList.add(psiFactory.createNewLine())
                    importList.add(newDirective) as KtImportDirective
                }
                else {
                    val insertAfter = imports
                            .lastOrNull {
                                val directivePath = it.importPath
                                directivePath != null && ImportPathComparator.compare(directivePath, importPath) <= 0
                            }
                    importList.addAfter(newDirective, insertAfter) as KtImportDirective
                }' @ [381:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtImportDirective, elseBranch: KtImportDirective): KtImportDirective[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtImportDirective

'imports' @ [381:28] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'isEmpty' @ [381:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'importList' @ [382:21] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'add' @ [382:32] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtImportList[JavaMethodDescriptor]

'psiFactory' @ [382:36] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'createNewLine' @ [382:47] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'importList' @ [383:21] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'add' @ [383:32] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtImportList[JavaMethodDescriptor]

'newDirective' @ [383:36] ==> val newDirective: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'imports' @ [386:39] ==> val imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'lastOrNull' @ [387:30] ==> public inline fun <T> List<(KtImportDirective..KtImportDirective?)>.lastOrNull(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): KtImportDirective? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [388:53] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [388:56] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'directivePath' @ [389:33] ==> val directivePath: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport.<anonymous>[LocalVariableDescriptor]

'ImportPathComparator' @ [389:58] ==> public object ImportPathComparator : Comparator<ImportPath> defined in org.jetbrains.kotlin.idea.imports[FakeCallableDescriptorForObject]

'compare' @ [389:79] ==> public open fun compare(import1: ImportPath, import2: ImportPath): Int defined in org.jetbrains.kotlin.idea.imports.ImportPathComparator[DeserializedSimpleFunctionDescriptor]

'directivePath' @ [389:87] ==> val directivePath: ImportPath? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport.<anonymous>[LocalVariableDescriptor]

'importPath' @ [389:102] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'importList' @ [391:21] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'addAfter' @ [391:32] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtImportList[JavaMethodDescriptor]

'newDirective' @ [391:41] ==> val newDirective: KtImportDirective defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'insertAfter' @ [391:55] ==> val insertAfter: KtImportDirective? defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[LocalVariableDescriptor]

'error' @ [395:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fqName' @ [395:49] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer.addImport[ValueParameterDescriptorImpl]

'file' @ [395:70] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'name' @ [395:75] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'file' @ [395:91] ==> private final val file: KtFile defined in org.jetbrains.kotlin.util.ImportInsertHelperImpl.Importer[PropertyDescriptorImpl]

'java' @ [395:103] ==> public val <T> KClass<out KtFile>.java: Class<out KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KtFile)

