package com.top.effitopia.dto;

import com.top.effitopia.enumeration.InboundStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InboundSearchCond {

    private MemberDTO memberDTO;
    private WarehouseDTO warehouseDTO;
    private ProductDTO productDTO;
    private VendorDTO vendorDTO;
    private LocalDate inboundRequestDate;
    private LocalDate inboundApprovedDate;
    private LocalDate inboundExpectDate;
    private LocalDate inboundCompletedDate;
    private InboundStatus inboundStatus;
}
