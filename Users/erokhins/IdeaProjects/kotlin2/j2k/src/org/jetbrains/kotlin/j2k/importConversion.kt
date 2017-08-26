'importList' @ [38:19] ==> value-parameter importList: PsiImportList defined in org.jetbrains.kotlin.j2k.convertImportList[ValueParameterDescriptorImpl]

'allImportStatements' @ [38:30] ==> public final val PsiImportList.allImportStatements: (Array<(PsiImportStatementBase..PsiImportStatementBase?)>..Array<out (PsiImportStatementBase..PsiImportStatementBase?)>)[MyPropertyDescriptor]

'flatMap' @ [39:14] ==> public inline fun <T, R> Array<out (PsiImportStatementBase..PsiImportStatementBase?)>.flatMap(transform: ((PsiImportStatementBase..PsiImportStatementBase?)) -> Iterable<Import>): List<Import> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiImportStatementBase..com.intellij.psi.PsiImportStatementBase?)
    <R> -> Import

'convertImport' @ [39:24] ==> public fun Converter.convertImport(anImport: PsiImportStatementBase, dumpConversion: Boolean = ...): List<Import> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'it' @ [39:38] ==> value-parameter it: (PsiImportStatementBase..PsiImportStatementBase?) defined in org.jetbrains.kotlin.j2k.convertImportList.<anonymous>[ValueParameterDescriptorImpl]

'distinctBy' @ [40:14] ==> public inline fun <T, K> Iterable<Import>.distinctBy(selector: (Import) -> String): List<Import> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Import
    <K> -> String

'it' @ [40:27] ==> value-parameter it: Import defined in org.jetbrains.kotlin.j2k.convertImportList.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [40:30] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.ast.Import[PropertyDescriptorImpl]

'ImportList' @ [41:12] ==> public constructor ImportList(imports: List<Import>) defined in org.jetbrains.kotlin.j2k.ast.ImportList[ClassConstructorDescriptorImpl]

'imports' @ [41:23] ==> val imports: List<Import> defined in org.jetbrains.kotlin.j2k.convertImportList[LocalVariableDescriptor]

'assignPrototype' @ [41:32] ==> public fun <TElement : Element> ImportList.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): ImportList defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ImportList

'importList' @ [41:48] ==> value-parameter importList: PsiImportList defined in org.jetbrains.kotlin.j2k.convertImportList[ValueParameterDescriptorImpl]

'anImport' @ [45:21] ==> value-parameter anImport: PsiImportStatementBase defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'importReference' @ [45:30] ==> public final val PsiImportStatementBase.importReference: PsiJavaCodeReferenceElement?[MyPropertyDescriptor]

'emptyList' @ [45:56] ==> public fun <T> emptyList(): List<Import> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Import

'FqName' @ [46:18] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'reference' @ [46:25] ==> val reference: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'qualifiedName' @ [46:35] ==> public final val PsiJavaCodeReferenceElement.qualifiedName: (String..String?)[MyPropertyDescriptor]

'anImport' @ [47:20] ==> value-parameter anImport: PsiImportStatementBase defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'isOnDemand' @ [47:29] ==> public final val PsiImportStatementBase.isOnDemand: Boolean[MyPropertyDescriptor]

'if (dumpConversion) {
        listOf(Import(renderImportName(fqName, onDemand)))
    }
    else {
        convertImport(fqName, reference, onDemand, anImport is PsiImportStaticStatement)
                .map(::Import)
    }' @ [48:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Import>, elseBranch: List<Import>): List<Import>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Import>

'dumpConversion' @ [48:32] ==> value-parameter dumpConversion: Boolean = ... defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'listOf' @ [49:9] ==> public fun <T> listOf(element: Import): List<Import> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Import

'Import' @ [49:16] ==> public constructor Import(name: String) defined in org.jetbrains.kotlin.j2k.ast.Import[ClassConstructorDescriptorImpl]

'renderImportName' @ [49:23] ==> private fun renderImportName(fqName: FqName, isOnDemand: Boolean): String defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [49:40] ==> val fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'onDemand' @ [49:48] ==> val onDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'convertImport' @ [52:9] ==> private fun Converter.convertImport(fqName: FqName, ref: PsiJavaCodeReferenceElement, isOnDemand: Boolean, isImportStatic: Boolean): List<String> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [52:23] ==> val fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'reference' @ [52:31] ==> val reference: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'onDemand' @ [52:42] ==> val onDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'anImport' @ [52:52] ==> value-parameter anImport: PsiImportStatementBase defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'map' @ [53:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Import): List<Import> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Import

'Import' @ [53:24] ==> public constructor Import(name: String) defined in org.jetbrains.kotlin.j2k.ast.Import[ClassConstructorDescriptorImpl]

'convertedImports' @ [55:12] ==> val convertedImports: List<Import> defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'map' @ [55:29] ==> public inline fun <T, R> Iterable<Import>.map(transform: (Import) -> Import): List<Import> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Import
    <R> -> Import

'it' @ [55:35] ==> value-parameter it: Import defined in org.jetbrains.kotlin.j2k.convertImport.<anonymous>[ValueParameterDescriptorImpl]

'assignPrototype' @ [55:38] ==> public fun <TElement : Element> Import.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Import defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Import

'anImport' @ [55:54] ==> value-parameter anImport: PsiImportStatementBase defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'!' @ [59:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnDemand' @ [59:10] ==> value-parameter isOnDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'annotationConverter' @ [60:13] ==> public final val annotationConverter: AnnotationConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'isImportNotRequired' @ [60:33] ==> public final fun isImportNotRequired(fqName: FqName): Boolean defined in org.jetbrains.kotlin.j2k.AnnotationConverter[SimpleFunctionDescriptorImpl]

'fqName' @ [60:53] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'emptyList' @ [60:69] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'JavaToKotlinClassMap' @ [63:22] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'mapJavaToKotlin' @ [63:43] ==> public final fun mapJavaToKotlin(fqName: FqName): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'fqName' @ [63:59] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'mapped' @ [64:9] ==> val mapped: ClassId? defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'let' @ [64:17] ==> @InlineOnly public inline fun <T, R> ClassId.let(block: (ClassId) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> Nothing

'!' @ [66:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [66:18] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.j2k.convertImport.<anonymous>[ValueParameterDescriptorImpl]

'isNestedClass' @ [66:21] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'emptyList' @ [66:43] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'convertNonStaticImport' @ [67:20] ==> private fun convertNonStaticImport(fqName: FqName, isOnDemand: Boolean, target: PsiElement?): List<String> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'it' @ [67:43] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.j2k.convertImport.<anonymous>[ValueParameterDescriptorImpl]

'asSingleFqName' @ [67:46] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'ref' @ [72:18] ==> value-parameter ref: PsiJavaCodeReferenceElement defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'resolve' @ [72:22] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiJavaCodeReferenceElement[JavaMethodDescriptor]

'if (isImportStatic) {
        if (isOnDemand) {
            convertStaticImportOnDemand(fqName, target)
        }
        else {
            convertStaticExplicitImport(fqName, target)
        }
    }
    else {
        convertNonStaticImport(fqName, isOnDemand, target)
    }' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'isImportStatic' @ [73:16] ==> value-parameter isImportStatic: Boolean defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'if (isOnDemand) {
            convertStaticImportOnDemand(fqName, target)
        }
        else {
            convertStaticExplicitImport(fqName, target)
        }' @ [74:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'isOnDemand' @ [74:13] ==> value-parameter isOnDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'convertStaticImportOnDemand' @ [75:13] ==> private fun Converter.convertStaticImportOnDemand(fqName: FqName, target: PsiElement?): List<String> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [75:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'target' @ [75:49] ==> val target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'convertStaticExplicitImport' @ [78:13] ==> private fun convertStaticExplicitImport(fqName: FqName, target: PsiElement?): List<String> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [78:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'target' @ [78:49] ==> val target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'convertNonStaticImport' @ [82:9] ==> private fun convertNonStaticImport(fqName: FqName, isOnDemand: Boolean, target: PsiElement?): List<String> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [82:32] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'isOnDemand' @ [82:40] ==> value-parameter isOnDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertImport[ValueParameterDescriptorImpl]

'target' @ [82:52] ==> val target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertImport[LocalVariableDescriptor]

'when (target) {
        is KtLightClassForFacade -> return listOf(target.fqName.parent().render() + ".*")

        is KtLightClass -> {
            val kotlinOrigin = target.kotlinOrigin
            val importFromObject = when (kotlinOrigin) {
                is KtObjectDeclaration -> kotlinOrigin
                is KtClass -> kotlinOrigin.getCompanionObjects().singleOrNull()
                else -> null
            }
            if (importFromObject != null) {
                val objectFqName = importFromObject.fqName
                if (objectFqName != null) {
                    // cannot import on demand from object, generate imports for all members
                    return importFromObject.declarations
                            .mapNotNull {
                                val descriptor = services.resolverForConverter.resolveToDescriptor(it) ?: return@mapNotNull null
                                if (descriptor.hasJvmStaticAnnotation() || descriptor is PropertyDescriptor && descriptor.isConst)
                                    descriptor.name
                                else
                                    null
                            }
                            .distinct()
                            .map { objectFqName.child(it).render() }
                }
            }
        }
    }' @ [87:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'target' @ [87:11] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[ValueParameterDescriptorImpl]

'listOf' @ [88:44] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'target' @ [88:51] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[ValueParameterDescriptorImpl]

'fqName' @ [88:58] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'parent' @ [88:65] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'render' @ [88:74] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'target' @ [91:32] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [91:39] ==> public abstract val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.asJava.classes.KtLightClass[DeserializedPropertyDescriptor]

'when (kotlinOrigin) {
                is KtObjectDeclaration -> kotlinOrigin
                is KtClass -> kotlinOrigin.getCompanionObjects().singleOrNull()
                else -> null
            }' @ [92:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtObjectDeclaration?, entry1: KtObjectDeclaration?, entry2: KtObjectDeclaration?): KtObjectDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtObjectDeclaration?

'kotlinOrigin' @ [92:42] ==> val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'kotlinOrigin' @ [93:43] ==> val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'kotlinOrigin' @ [94:31] ==> val kotlinOrigin: KtClassOrObject? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'getCompanionObjects' @ [94:44] ==> @NotNull @ReadOnly public abstract fun getCompanionObjects(): List<(KtObjectDeclaration..KtObjectDeclaration?)> defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'singleOrNull' @ [94:66] ==> public fun <T> List<(KtObjectDeclaration..KtObjectDeclaration?)>.singleOrNull(): KtObjectDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtObjectDeclaration..org.jetbrains.kotlin.psi.KtObjectDeclaration?)

'importFromObject' @ [97:17] ==> val importFromObject: KtObjectDeclaration? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'importFromObject' @ [98:36] ==> val importFromObject: KtObjectDeclaration? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'fqName' @ [98:53] ==> public final val KtObjectDeclaration.fqName: FqName?[MyPropertyDescriptor]

'objectFqName' @ [99:21] ==> val objectFqName: FqName? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'importFromObject' @ [101:28] ==> val importFromObject: KtObjectDeclaration? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'declarations' @ [101:45] ==> public final val KtObjectDeclaration.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'mapNotNull' @ [102:30] ==> public inline fun <T, R : Any> Iterable<KtDeclaration>.mapNotNull(transform: (KtDeclaration) -> Name?): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R : Any> -> Name

'services' @ [103:50] ==> public final val services: JavaToKotlinConverterServices defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'resolverForConverter' @ [103:59] ==> public abstract val resolverForConverter: ResolverForConverter defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverterServices[PropertyDescriptorImpl]

'resolveToDescriptor' @ [103:80] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration): DeclarationDescriptor? defined in org.jetbrains.kotlin.j2k.ResolverForConverter[SimpleFunctionDescriptorImpl]

'it' @ [103:100] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand.<anonymous>[ValueParameterDescriptorImpl]

'if (descriptor.hasJvmStaticAnnotation() || descriptor is PropertyDescriptor && descriptor.isConst)
                                    descriptor.name
                                else
                                    null' @ [104:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'descriptor' @ [104:37] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand.<anonymous>[LocalVariableDescriptor]

'hasJvmStaticAnnotation' @ [104:48] ==> public fun DeclarationDescriptor.hasJvmStaticAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [104:76] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [104:112] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand.<anonymous>[LocalVariableDescriptor]

'isConst' @ [104:123] ==> public final val PropertyDescriptor.isConst: Boolean[MyPropertyDescriptor]

'descriptor' @ [105:37] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand.<anonymous>[LocalVariableDescriptor]

'name' @ [105:48] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'distinct' @ [109:30] ==> public fun <T> Iterable<Name>.distinct(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'map' @ [110:30] ==> public inline fun <T, R> Iterable<Name>.map(transform: (Name) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> String

'objectFqName' @ [110:36] ==> val objectFqName: FqName? defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[LocalVariableDescriptor]

'child' @ [110:49] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'it' @ [110:55] ==> value-parameter it: Name defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [110:59] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'listOf' @ [115:12] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'renderImportName' @ [115:19] ==> private fun renderImportName(fqName: FqName, isOnDemand: Boolean): String defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [115:36] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertStaticImportOnDemand[ValueParameterDescriptorImpl]

'target' @ [119:9] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[ValueParameterDescriptorImpl]

'target' @ [120:28] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [120:35] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightDeclaration[DeserializedPropertyDescriptor]

'if (target is KtLightMethod && kotlinOrigin is KtProperty)
            kotlinOrigin.nameAsName
        else
            fqName.shortName()' @ [122:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'target' @ [122:32] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [122:59] ==> val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'kotlinOrigin' @ [123:13] ==> val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'nameAsName' @ [123:26] ==> public final val KtProperty.nameAsName: Name?[MyPropertyDescriptor]

'fqName' @ [125:13] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[ValueParameterDescriptorImpl]

'shortName' @ [125:20] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'nameToImport' @ [127:13] ==> val nameToImport: Name? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'kotlinOrigin' @ [128:32] ==> val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'parent' @ [128:46] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (originParent) {
                is KtFile -> { // import of function or property accessor from file facade
                    return listOf(originParent.packageFqName.child(nameToImport).render())
                }

                is KtClassBody -> {
                    val parentClass = originParent.parent as KtClassOrObject
                    if (parentClass is KtObjectDeclaration && parentClass.isCompanion()) {
                        return listOfNotNull(parentClass.getFqName()?.child(nameToImport)?.render())
                    }
                }
            }' @ [129:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'originParent' @ [129:19] ==> val originParent: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'listOf' @ [131:28] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'originParent' @ [131:35] ==> val originParent: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'packageFqName' @ [131:48] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'child' @ [131:62] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'nameToImport' @ [131:68] ==> val nameToImport: Name? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'render' @ [131:82] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'originParent' @ [135:39] ==> val originParent: PsiElement? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'parent' @ [135:52] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentClass' @ [136:25] ==> val parentClass: KtClassOrObject defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'parentClass' @ [136:63] ==> val parentClass: KtClassOrObject defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'isCompanion' @ [136:75] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'listOfNotNull' @ [137:32] ==> public fun <T : Any> listOfNotNull(element: String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'parentClass' @ [137:46] ==> val parentClass: KtClassOrObject defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'getFqName' @ [137:58] ==> @Nullable public open fun getFqName(): FqName? defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'child' @ [137:71] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'nameToImport' @ [137:77] ==> val nameToImport: Name? defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[LocalVariableDescriptor]

'render' @ [137:92] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'listOf' @ [143:12] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'renderImportName' @ [143:19] ==> private fun renderImportName(fqName: FqName, isOnDemand: Boolean): String defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [143:36] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertStaticExplicitImport[ValueParameterDescriptorImpl]

'when (target) {
        is KtLightClassForFacade -> return listOf(target.fqName.parent().render() + ".*")

        is KtLightClass -> {
            if (!isOnDemand) {
                if (isFacadeClassFromLibrary(target)) return emptyList()

                if (isImportedByDefault(target)) return emptyList()
            }
        }
    }' @ [147:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'target' @ [147:11] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'listOf' @ [148:44] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'target' @ [148:51] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'fqName' @ [148:58] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'parent' @ [148:65] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'render' @ [148:74] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'!' @ [151:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnDemand' @ [151:18] ==> value-parameter isOnDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'isFacadeClassFromLibrary' @ [152:21] ==> public fun isFacadeClassFromLibrary(element: PsiElement?): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'target' @ [152:46] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'emptyList' @ [152:62] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isImportedByDefault' @ [154:21] ==> private fun isImportedByDefault(c: KtLightClass): Boolean defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'target' @ [154:41] ==> value-parameter target: PsiElement? defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'emptyList' @ [154:57] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [158:12] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'renderImportName' @ [158:19] ==> private fun renderImportName(fqName: FqName, isOnDemand: Boolean): String defined in org.jetbrains.kotlin.j2k in file importConversion.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [158:36] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'isOnDemand' @ [158:44] ==> value-parameter isOnDemand: Boolean defined in org.jetbrains.kotlin.j2k.convertNonStaticImport[ValueParameterDescriptorImpl]

'if (isOnDemand) fqName.render() + ".*" else fqName.render()' @ [162:11] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isOnDemand' @ [162:15] ==> value-parameter isOnDemand: Boolean defined in org.jetbrains.kotlin.j2k.renderImportName[ValueParameterDescriptorImpl]

'fqName' @ [162:27] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.renderImportName[ValueParameterDescriptorImpl]

'render' @ [162:34] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'fqName' @ [162:55] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.j2k.renderImportName[ValueParameterDescriptorImpl]

'render' @ [162:62] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'JvmPlatform' @ [164:48] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'getDefaultImports' @ [164:60] ==> public open fun getDefaultImports(includeKotlinComparisons: Boolean): List<ImportPath> defined in org.jetbrains.kotlin.resolve.jvm.platform.JvmPlatform[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [166:37] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'supportsFeature' @ [166:45] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedSimpleFunctionDescriptor]

'DefaultImportOfPackageKotlinComparisons' @ [166:77] ==> enum entry DefaultImportOfPackageKotlinComparisons defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'filter' @ [167:3] ==> public inline fun <T> Iterable<ImportPath>.filter(predicate: (ImportPath) -> Boolean): List<ImportPath> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'it' @ [167:12] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.j2k.DEFAULT_IMPORTS_SET.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [167:15] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'map' @ [167:28] ==> public inline fun <T, R> Iterable<ImportPath>.map(transform: (ImportPath) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath
    <R> -> FqName

'it' @ [167:34] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.j2k.DEFAULT_IMPORTS_SET.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [167:37] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'toSet' @ [167:46] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'c' @ [169:52] ==> value-parameter c: KtLightClass defined in org.jetbrains.kotlin.j2k.isImportedByDefault[ValueParameterDescriptorImpl]

'qualifiedName' @ [169:54] ==> public final val KtLightClass.qualifiedName: String?[MyPropertyDescriptor]

'let' @ [169:69] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [169:75] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'it' @ [169:82] ==> value-parameter it: String defined in org.jetbrains.kotlin.j2k.isImportedByDefault.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [169:86] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'DEFAULT_IMPORTS_SET' @ [169:100] ==> private val DEFAULT_IMPORTS_SET: Set<FqName> defined in org.jetbrains.kotlin.j2k in file importConversion.kt[PropertyDescriptorImpl]

