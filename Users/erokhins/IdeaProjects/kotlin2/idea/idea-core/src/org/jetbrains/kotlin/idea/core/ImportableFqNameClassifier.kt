'HashSet' @ [29:34] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'HashSet' @ [30:41] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'HashSet' @ [31:35] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'HashSet' @ [32:35] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'file' @ [35:24] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'importDirectives' @ [35:29] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'import' @ [36:30] ==> val import: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'importPath' @ [36:37] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'importPath' @ [37:26] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'fqName' @ [37:37] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'when {
                importPath.isAllUnder -> allUnderImports.add(fqName)
                !importPath.hasAlias() -> {
                    preciseImports.add(fqName)
                    preciseImportPackages.add(fqName.parent())
                }
                else -> excludedImports.add(fqName)
            // TODO: support aliased imports in completion
            }' @ [38:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'importPath' @ [39:17] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'isAllUnder' @ [39:28] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'allUnderImports' @ [39:42] ==> private final val allUnderImports: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'add' @ [39:58] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqName' @ [39:62] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'!' @ [40:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'importPath' @ [40:18] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'hasAlias' @ [40:29] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'preciseImports' @ [41:21] ==> private final val preciseImports: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'add' @ [41:36] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqName' @ [41:40] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'preciseImportPackages' @ [42:21] ==> private final val preciseImportPackages: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'add' @ [42:43] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqName' @ [42:47] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'parent' @ [42:54] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'excludedImports' @ [44:25] ==> private final val excludedImports: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'add' @ [44:41] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqName' @ [44:45] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.<init>[LocalVariableDescriptor]

'ImportPath' @ [62:26] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'fqName' @ [62:37] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'isPackage' @ [64:13] ==> value-parameter isPackage: Boolean defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'when {
                isImportedWithPreciseImport(fqName) -> Classification.preciseImport
                fqName.parent().isRoot -> Classification.topLevelPackage
                else -> Classification.notImported
            }' @ [65:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ImportableFqNameClassifier.Classification, entry1: ImportableFqNameClassifier.Classification, entry2: ImportableFqNameClassifier.Classification): ImportableFqNameClassifier.Classification[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Classification

'isImportedWithPreciseImport' @ [66:17] ==> private final fun isImportedWithPreciseImport(name: FqName): Boolean defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[SimpleFunctionDescriptorImpl]

'fqName' @ [66:45] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'preciseImport' @ [66:71] ==> enum entry preciseImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'fqName' @ [67:17] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'parent' @ [67:24] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [67:33] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'topLevelPackage' @ [67:58] ==> enum entry topLevelPackage defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'notImported' @ [68:40] ==> enum entry notImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'when {
            isJavaClassNotToBeUsedInKotlin(fqName) -> Classification.notToBeUsedInKotlin

            fqName.parent() == file.packageFqName -> Classification.fromCurrentPackage

            ImportInsertHelper.getInstance(file.project).isImportedWithDefault(importPath, file) -> Classification.defaultImport

            isImportedWithPreciseImport(fqName) -> Classification.preciseImport

            isImportedWithAllUnderImport(fqName) -> Classification.allUnderImport

            hasPreciseImportFromPackage(fqName.parent()) -> Classification.siblingImported

            else -> Classification.notImported
        }' @ [72:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ImportableFqNameClassifier.Classification, entry1: ImportableFqNameClassifier.Classification, entry2: ImportableFqNameClassifier.Classification, entry3: ImportableFqNameClassifier.Classification, entry4: ImportableFqNameClassifier.Classification, entry5: ImportableFqNameClassifier.Classification, entry6: ImportableFqNameClassifier.Classification): ImportableFqNameClassifier.Classification[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Classification

'isJavaClassNotToBeUsedInKotlin' @ [73:13] ==> public fun isJavaClassNotToBeUsedInKotlin(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.core in file ImportableFqNameClassifier.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [73:44] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'notToBeUsedInKotlin' @ [73:70] ==> enum entry notToBeUsedInKotlin defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'fqName' @ [75:13] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'parent' @ [75:20] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'file' @ [75:32] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'packageFqName' @ [75:37] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'fromCurrentPackage' @ [75:69] ==> enum entry fromCurrentPackage defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'ImportInsertHelper' @ [77:13] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [77:32] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'file' @ [77:44] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'project' @ [77:49] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'isImportedWithDefault' @ [77:58] ==> public abstract fun isImportedWithDefault(importPath: ImportPath, contextFile: KtFile): Boolean defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'importPath' @ [77:80] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[LocalVariableDescriptor]

'file' @ [77:92] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'defaultImport' @ [77:116] ==> enum entry defaultImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'isImportedWithPreciseImport' @ [79:13] ==> private final fun isImportedWithPreciseImport(name: FqName): Boolean defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[SimpleFunctionDescriptorImpl]

'fqName' @ [79:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'preciseImport' @ [79:67] ==> enum entry preciseImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'isImportedWithAllUnderImport' @ [81:13] ==> private final fun isImportedWithAllUnderImport(name: FqName): Boolean defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[SimpleFunctionDescriptorImpl]

'fqName' @ [81:42] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'allUnderImport' @ [81:68] ==> enum entry allUnderImport defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'hasPreciseImportFromPackage' @ [83:13] ==> private final fun hasPreciseImportFromPackage(packageName: FqName): Boolean defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[SimpleFunctionDescriptorImpl]

'fqName' @ [83:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.classify[ValueParameterDescriptorImpl]

'parent' @ [83:48] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'siblingImported' @ [83:76] ==> enum entry siblingImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'notImported' @ [85:36] ==> enum entry notImported defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.Classification[FakeCallableDescriptorForObject]

'name' @ [89:61] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.isImportedWithPreciseImport[ValueParameterDescriptorImpl]

'preciseImports' @ [89:69] ==> private final val preciseImports: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'name' @ [90:62] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.isImportedWithAllUnderImport[ValueParameterDescriptorImpl]

'parent' @ [90:67] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'allUnderImports' @ [90:79] ==> private final val allUnderImports: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'name' @ [90:98] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.isImportedWithAllUnderImport[ValueParameterDescriptorImpl]

'excludedImports' @ [90:107] ==> private final val excludedImports: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'packageName' @ [91:68] ==> value-parameter packageName: FqName defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier.hasPreciseImportFromPackage[ValueParameterDescriptorImpl]

'preciseImportPackages' @ [91:83] ==> private final val preciseImportPackages: HashSet<FqName> defined in org.jetbrains.kotlin.idea.core.ImportableFqNameClassifier[PropertyDescriptorImpl]

'JavaToKotlinClassMap' @ [95:11] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'isJavaPlatformClass' @ [95:32] ==> public final fun isJavaPlatformClass(fqName: FqName): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'fqName' @ [95:52] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.isJavaClassNotToBeUsedInKotlin[ValueParameterDescriptorImpl]

'JavaAnnotationMapper' @ [95:63] ==> public object JavaAnnotationMapper defined in org.jetbrains.kotlin.load.java.components[FakeCallableDescriptorForObject]

'javaToKotlinNameMap' @ [95:84] ==> public final val javaToKotlinNameMap: Map<FqName, FqName> defined in org.jetbrains.kotlin.load.java.components.JavaAnnotationMapper[DeserializedPropertyDescriptor]

'fqName' @ [95:104] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.core.isJavaClassNotToBeUsedInKotlin[ValueParameterDescriptorImpl]

