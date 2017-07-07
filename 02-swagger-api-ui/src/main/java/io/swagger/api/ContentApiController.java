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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-12T08:55:16.176Z")

@Controller
public class ContentApiController implements ContentApi {



    public ResponseEntity<InlineResponse2002> addMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body5 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> batchAddMaterial(@ApiParam(value = "body" ,required=true ) @RequestBody Body2 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> batchDeleteMaterial(@ApiParam(value = "body" ,required=true ) @RequestBody Body4 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> contentMaterialListAllGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body1 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> deleteMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body7 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2006> generateQrcode(@ApiParam(value = "body体， 用来记录传入的参数" ,required=true ) @RequestBody Body9 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2001> getMaterial( @NotNull @ApiParam(value = "素材ID", required = true) @RequestParam(value = "id", required = true) Long id) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2004> getMaterialGroup( @NotNull @ApiParam(value = "素材分组ID", required = true) @RequestParam(value = "id", required = true) Long id) {
        // do some magic!
        return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> getMaterialGroupList( @NotNull @ApiParam(value = "商户ID", required = true) @RequestParam(value = "sellerId", required = true) Long sellerId) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> getMaterialList(@ApiParam(value = "body" ,required=true ) @RequestBody Body body) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> moveMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body8 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> updateMaterial(@ApiParam(value = "body" ,required=true ) @RequestBody Body3 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> updateMaterialGroup(@ApiParam(value = "body" ,required=true ) @RequestBody Body6 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2007> uploadBase64Image(@ApiParam(value = "body体， 用来记录传入的参数" ,required=true ) @RequestBody Body10 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2005> uploadBatchMaterial(@ApiParam(value = "素材类型，比如MUSIC, IMAGE" ) @RequestPart(value="type", required=false)  String type) {
        // do some magic!
        return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2002> uploadPrivateMaterial() {
        // do some magic!
        return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
    }

}
