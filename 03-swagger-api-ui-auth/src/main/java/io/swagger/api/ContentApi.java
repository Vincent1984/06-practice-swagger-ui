package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.Body10;
import io.swagger.model.Body2;
import io.swagger.model.Body3;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Body6;
import io.swagger.model.Body7;
import io.swagger.model.Body8;
import io.swagger.model.Body9;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse2005;
import io.swagger.model.InlineResponse2006;
import io.swagger.model.InlineResponse2007;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

@Api(value = "content", description = "the content API")
public interface ContentApi {

    @ApiOperation(value = "添加素材分组", notes = "添加素材分组", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_group_add",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> addMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body5 body);


    @ApiOperation(value = "批量添加素材", notes = "批量添加素材", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_batch_add",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> batchAddMaterial(@ApiParam(value = "body" ,required=true ) @RequestBody Body2 body);


    @ApiOperation(value = "批量删除素材", notes = "批量删除素材", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_batch_delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> batchDeleteMaterial(@ApiParam(value = "body" ,required=true ) @RequestBody Body4 body);


    @ApiOperation(value = "查看素材列表", notes = "", response = InlineResponse200.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse200.class) })
    @RequestMapping(value = "/content/material_list_all",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> contentMaterialListAllGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body1 body);


    @ApiOperation(value = "删除素材分组", notes = "删除素材分组", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_group_delete",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> deleteMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body7 body);


    @ApiOperation(value = "根据信息生成二维码图片地址", notes = "根据信息生成二维码图片地址", response = InlineResponse2006.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2006.class) })
    @RequestMapping(value = "/content/qrcode_generate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2006> generateQrcode(@ApiParam(value = "body体， 用来记录传入的参数" ,required=true ) @RequestBody Body9 body);


    @ApiOperation(value = "查看素材", notes = "查看素材", response = InlineResponse2001.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2001.class) })
    @RequestMapping(value = "/content/material_get",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> getMaterial( @NotNull @ApiParam(value = "素材ID", required = true) @RequestParam(value = "id", required = true) Long id);


    @ApiOperation(value = "查看素材分组", notes = "查看素材分组", response = InlineResponse2004.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2004.class) })
    @RequestMapping(value = "/content/material_group_get",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2004> getMaterialGroup( @NotNull @ApiParam(value = "素材分组ID", required = true) @RequestParam(value = "id", required = true) Long id);


    @ApiOperation(value = "查看素材素材分组", notes = "", response = InlineResponse2003.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2003.class) })
    @RequestMapping(value = "/content/material_group_list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2003> getMaterialGroupList( @NotNull @ApiParam(value = "商户ID", required = true) @RequestParam(value = "sellerId", required = true) Long sellerId);


    @ApiOperation(value = "查看素材列表", notes = "", response = InlineResponse200.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse200.class) })
    @RequestMapping(value = "/content/material_list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> getMaterialList(@ApiParam(value = "body" ,required=true ) @RequestBody Body body);


    @ApiOperation(value = "移动素材分组", notes = "移动素材分组", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_group_move",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> moveMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body8 body);


    @ApiOperation(value = "更新素材", notes = "更新素材", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> updateMaterial(@ApiParam(value = "body" ,required=true ) @RequestBody Body3 body);


    @ApiOperation(value = "更新素材分组", notes = "更新素材分组", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/material_group_update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> updateMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body6 body);


    @ApiOperation(value = "上传base64图片返回url", notes = "上传base64图片返回url", response = InlineResponse2007.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2007.class) })
    @RequestMapping(value = "/content/base64_upload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2007> uploadBase64Image(@ApiParam(value = "body体， 用来记录传入的参数" ,required=true ) @RequestBody Body10 body);


    @ApiOperation(value = "批量上传素材", notes = "批量上传素材", response = InlineResponse2005.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2005.class) })
    @RequestMapping(value = "/content/material_batch_upload",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2005> uploadBatchMaterial(@ApiParam(value = "素材类型，比如MUSIC, IMAGE" ) @RequestPart(value="type", required=false)  String type);


    @ApiOperation(value = "隐私图片上传", notes = "隐私图片上传", response = InlineResponse2002.class, tags={ "content", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "正常响应", response = InlineResponse2002.class) })
    @RequestMapping(value = "/content/private_material_upload",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2002> uploadPrivateMaterial();

}
